import java.util.ArrayList;
public class ArrayQueue implements Queue{
	ArrayList<Object> aQueue = new ArrayList<Object>();

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		aQueue.add(object);
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if(aQueue.isEmpty()) {
			return null;
		}
		else {
			return aQueue.get(0);
		}
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if(aQueue.isEmpty()) {
			return null;
		}
		else {
			return aQueue.remove(0);
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return aQueue.size();
	}

}
