import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.LinkedHashMap;

public class Calculator {
	Stack<Integer> myStack = new Stack<>();
	private Map<String, Integer> Variables = new LinkedHashMap<>();

	public void loadConstant(int i) {
		myStack.push(i);
	}

	public void add() {
		int Val1 = myStack.pop();
		int Val2 = myStack.pop();
		myStack.push(Val2+Val1);
		
	}

	public void subtract() {
		int Val1 = myStack.peek();
		myStack.pop();
		int Val2 = myStack.peek();
		myStack.pop();
		myStack.push(Val2-Val1);
		
	}

	public void multiply() {
		int Val1 = myStack.peek();
		myStack.pop();
		int Val2 = myStack.peek();
		myStack.pop();
		myStack.push(Val2*Val1);
		
	}

	public void divide() {
		int Val1 = myStack.peek();
		myStack.pop();
		int Val2 = myStack.peek();
		myStack.pop();
		myStack.push(Val2/Val1);
		
	}

	public void total() {
		int total = 0;
		int size = myStack.size();
		for (int i = 0; i<size; i++) {
			total += myStack.pop();
		}
		myStack.push(total);
	}
	
	public String toString() {
		String returnString="[";
		for (int i: myStack) {
			returnString += i + " ";
		}
		returnString = returnString.trim();
		returnString += "].";
		return returnString;
	}
}
