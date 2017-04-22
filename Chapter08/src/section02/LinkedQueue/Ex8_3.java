package section02.LinkedQueue;

/*
 * 연결 자료구조 방식을 이용하여 구현한 연결 큐 프로그램
 */

public class Ex8_3 {
	public static void main(String[] args) {
		char deletedItem;
		LinkedQueue LQ = new LinkedQueue();
		
		LQ.enQueue('A');
		LQ.printQueue();
		
		LQ.enQueue('B');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LQ.printQueue();
		
		LQ.enQueue('C');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		LQ.printQueue();
	}
}
