package section03.ArrayStack;

/*
 * 순차 자료구조 방식을 이용하여 구현한 스택 프로그램
 */

public class Ex7_1 {
	public static void main(String[] args) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		S.printStack();
		
		S.push('C');
		S.printStack();
		
		deletedItem = S.pop();
		if(deletedItem != 0) {
			System.out.println("delete Item : " + deletedItem);
		}
		S.printStack();
	}
}
