import java.util.ArrayList;
public class ArrayStack implements Stack{

	ArrayList<Object> aStack = new ArrayList<Object>();
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(aStack.isEmpty()) {
			return null;
		}
		else {
			return aStack.get(aStack.size() - 1);
		}
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(aStack.isEmpty()) {
			return null;
		}
		else {
			return aStack.remove(aStack.size() - 1);
		}
	}

	@Override
	public void push(Object object) {
		// TODO Auto-generated method stub
		aStack.add(object);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return aStack.size();
	}

}
