package section03.ArrayStack;

public class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == this.stackSize-1);
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!");
		} else {
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		} else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
		} else {
			top--;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!!");
			return 0;
		} else {
			return itemArray[top];
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Array Stack is empty!! \n");
		} else {
			System.out.print("Array Stack >> ");
			
			for(int i=0; i<=top; i++) {
				System.out.print(itemArray[i] + " ");
			}
			
			System.out.println();
			System.out.println();
		}
	}
}
