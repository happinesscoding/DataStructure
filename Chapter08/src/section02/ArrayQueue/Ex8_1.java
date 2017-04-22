package section02.ArrayQueue;

/*
 * 순차 자료구조 방식으로 구현한 선형 큐 프로그램
 */

public class Ex8_1 {
	public static void main(String[] args) {
		int queueSize = 3;
		char deletedItem;
		ArrayQueue Q = new ArrayQueue(queueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		Q.printQueue();

		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		Q.printQueue();
	}
}
