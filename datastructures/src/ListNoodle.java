
public class ListNoodle {
	private int value; 
	private ListNoodle next;
	
	public ListNoodle(int p){
		value = p;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ListNoodle getNext() {
		return next;
	}

	public void setNext(ListNoodle next) {
		this.next = next;
	}
	
}
