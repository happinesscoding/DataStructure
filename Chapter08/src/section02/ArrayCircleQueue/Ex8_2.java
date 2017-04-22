package section02.ArrayCircleQueue;

/*
 * 순차 자료구조 방식으로 구현한 원형 큐 프로그램
 */

public class Ex8_2 {
	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
		}
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.printQueue();
		
		cQ.enQueue('D');
		cQ.printQueue();
		
		cQ.enQueue('E');
		cQ.printQueue();
	}
}
