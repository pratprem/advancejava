import java.util.ArrayList;

public class ChatRoom{
	ArrayList<String> messages;
	String[][]users = {{"prat", "moreland"}};
	
	public ChatRoom(){
		messages = new ArrayList <String>();
	}
	public int addLine(String line){
		messages.add(line);
		return messages.size();
		
	}
	public String getConversation(int begin){
		String conversation="";
		for(int i = begin ; i<messages.size(); i++){
			conversation += messages.get(i) + "\n";
		}
		return conversation;
	}
	public boolean authenticate(String username, String password){
		for(int i=0;i< users.length;i++){
			if(users)
		}
	}
}