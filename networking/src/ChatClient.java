
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


import javax.swing.JOptionPane;

/**
 * Trivial client for the date server.
 */
public class ChatClient {
	BufferedReader input;
	PrintWriter output;
	int line = 0;
	public ChatClient(){
		String serverAddress = JOptionPane.showInputDialog(
				"Enter IP Address of a machine that is\n" +
				"running the date service on port 9090:");
		Socket s;
		try {
			s = new Socket(serverAddress, 9090);
			input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			output = new PrintWriter(s.getOutputStream(),true);
		} catch (UnknownHostException e) {
			System.out.println("Couldn't find the host.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Got an IO exception");

		}
	}

	public void submit(String text){
		output.println("message:" + text);
	}
	public String getUpdate(int l){
		output.println("line"+1);
		try {
			String in = input.readLine();
			while (in==null){
				in = input.readLine();
			}
			String[] parts =in.split(":");
			return parts[1];


		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}


	public boolean login(String username,String password){
		output.println("authenticate:" +username+"@"+password);
		try {
			String in = input.readLine();
			while (in==null){
				in = input.readLine();
			}
			String[] parts =in.split(":");
			if(parts[1].equals("true")){
				return true;
			}else{
				return false;
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}