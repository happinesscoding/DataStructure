/*
 * 2007년, 2008년 분기별 판매량 선형 리스트 프로그램
 */

package section02;

public class Ex5_2 {
	public static void main(String[] args) {
		int sale[][] = new int[][]{ {63, 84, 140, 130}, {157, 209, 251, 312} };
		
		for(int i=0; i<sale.length; i++) {
			for(int j=0; j<sale[i].length; j++) {
				System.out.printf("%d/4분기 : sale[%d][%d] = %d %n", j+1, i, j, sale[i][j]);
			}
			System.out.println();
		}
	}
}
