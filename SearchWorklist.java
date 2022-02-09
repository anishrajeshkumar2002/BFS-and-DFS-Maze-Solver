/*
 * Class to implement SearchWorklist as a Stack and a Queue.
 * You can use any built-in Java collections for this class.
 */
import java.util.ArrayList;
class StackWorklist implements SearchWorklist {
	ArrayList<Square> stack;
	StackWorklist(){
		this.stack = new ArrayList<>();
	}
	public void add(Square c) {
		this.stack.add(0, c);
	}
	public Square remove() {
	    Square toReturn = this.stack.get(0);
	    this.stack.remove(0);
	    return toReturn;
	}
	public boolean isEmpty() {
		if(this.stack.size() == 0) {
			return true;
		}
		return false;
	}
	/**
	public int size() {
	    return this.stack.size();
	  }
	public Square get(int i) {
		return this.get(i);
	}
  */
}

class QueueWorklist implements SearchWorklist {
	ArrayList<Square> queue;
	QueueWorklist(){
		this.queue = new ArrayList<>();
	}
	public void add(Square c) {
		this.queue.add(this.queue.size(), c);
	}
	public Square remove() {
		Square toReturn = this.queue.get(0);
	    this.queue.remove(0);
	    return toReturn;
	}
	public boolean isEmpty() {
		if(this.queue.size() == 0) {
			return true;
		}
		return false;
	}
	/**
	public int size() {
	    return this.queue.size();
	  }
	public Square get(int i) {
		return this.queue.get(i);
	}
	*/

}

public interface SearchWorklist {
	void add(Square c);
	Square remove();
	boolean isEmpty();
	//int size(); // remove later, you must
	//Square get(int i);// remove later you must
}
