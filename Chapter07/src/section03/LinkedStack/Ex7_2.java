package section03.LinkedStack;

/*
 * 연결 자료구조 방식을 이용하여 구현한 스택 프로그램
 */

public class Ex7_2 {
	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deletedItem = LS.pop();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LS.printStack();
	}
}
