package section04.postfixOpt;

/*
 * 후위 표기 수식의 연산 프로그램
 */

public class Ex7_4 {
	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.println("후위표기식 : " + exp);
		result = opt.evalPostfix(exp);
		System.out.println("\n연산결과 : " + result);
	}
}
