/*
 * 1팀과 2팀의 2007년, 2008년 분기별 판매량 선형 리스트 프로그램
 */

package section02;

public class Ex5_3 {
	public static void main(String[] args) {
		int sale[][][] = new int[][][] {
			{	
				{63, 84, 140, 130},
				{157, 209, 251, 312}
			}, {
				{59, 80, 130, 135},
				{149, 187, 239, 310}
			}
		};
		
		for(int i=0; i<sale.length; i++) {
			System.out.printf("<< %d 팀 >> %n", i+1);
			
			for(int j=0; j<sale[i].length; j++) {
				for(int k=0; k<sale[i][j].length; k++) {
					System.out.printf("%d/4분기 : sale[%d][%d][%d] = %d %n", k+1, i, j, k, sale[i][j][k]);
				}
				System.out.println("----------------------------");
			}
			System.out.println();
		}
	}
}
