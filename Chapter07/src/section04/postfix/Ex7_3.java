package section04.postfix;

/*
 * 연결 자료구조 방식을 이용하여 구현한 스택 프로그램
 */

public class Ex7_3 {
	public static void main(String[] args) {
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		
		System.out.println("중위표기식 : " + exp);
		
		if(opt.testPair(exp)) {
			System.out.println("괄호 맞음!");
		} else {
			System.out.println("괄호 틀림!!!");
		}
		
		System.out.print("\n후위표기식 : ");
		postfix = opt.toPostfix(exp);
		System.out.print(postfix);			// 35*62/-ㅁㅁㅁ 출력됨...
	}
}
