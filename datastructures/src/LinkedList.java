
public class LinkedList {
	ListNoodle first;
	public LinkedList(){
		
	}

	public void add(int number) {
		if (first == null){
			first=new ListNoodle(number);
			
		}
		else{
	
			ListNoodle temp = first;
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			temp.setNext(new ListNoodle(number));
		}
	}public void removeFirst(){
		first = first.getNext();
	}
	public void removeNth(int n){
	if (n==0){first=first.getNext();
	return;
		
	}
	if(n>=size()){
	}
		int position = 0;
		ListNoodle temp = first;
		while (position<n-1){
			
		}
	
	}
	public void remove(int number){
		if (first.getValue() == number){
			first = first.getNext();
		}
			ListNoodle a = first;
			ListNoodle b = first.getNext();
			while(b != null){
				if(b.getValue() == number){
					a.setNext(b.getNext());
					b= b.getNext();
					b=b.getNext();
				}
				if(b!=null)
				b = b.getNext();
			a=a.getNext();
			
		}
	
	}
	public void print() {
		ListNoodle temp = first;
		while(temp.getNext() != null){
		System.out.print(first.getValue()+",");	
		temp = temp.getNext();
		}
		System.out.println("[");
		
		//print out a node
		//ask for the next node
		//repeat 1
	}
	public int size(){
		int size =0;
		ListNoodle temp = first;
		while(temp!=null){
			size++;
			temp=temp.getNext();
		}
		return size;
	}
	}

