import java.util.*;
/*
 * An expandable, array-based implementation of a multiset.
 */
public class ExpandableArrayMultiset<T> extends ArrayMultiset<T> implements Multiset<T> {
	
	
	public ExpandableArrayMultiset(int capacity) {
		super(capacity);
		if(capacity<=0) {
			throw new IllegalArgumentException("Invalid Capacity of " + capacity);
		}
	}
	
	public ExpandableArrayMultiset() {
		super();
	}
	
	@Override
	public boolean add(T element) {
		if (isArrayFull()) {
			expandArray();
		}
		return super.add(element);
	}


	public boolean isFull() {
		return false;
	}


	public void trimToSize() {
		if (this.size() == 0) {
			return;
		}

		setArray = Arrays.copyOf(setArray, this.size());
	}
	
	private boolean isArrayFull() {
		return size()==setArray.length;
	}
	
	private void expandArray() {		
		setArray = Arrays.copyOf(setArray, setArray.length * 2);
		
	}
	

}
