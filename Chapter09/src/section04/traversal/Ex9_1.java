package section04.traversal;

/*
 * 이진트리의 순회 프로그램
 */

public class Ex9_1 {
	public static void main(String[] args) {
		LinkedTree T = new LinkedTree();
		
		TreeNode n7 = T.makeBT(null, 'D', null);
		TreeNode n6 = T.makeBT(null, 'C', null);
		TreeNode n5 = T.makeBT(null, 'B', null);
		TreeNode n4 = T.makeBT(null, 'A', null);
		TreeNode n3 = T.makeBT(n6, '/', n7);
		TreeNode n2 = T.makeBT(n4, '*', n5);
		TreeNode n1 = T.makeBT(n2, '-', n3);
		
		System.out.print("Preorder : ");
		T.preorder(n1);
		
		System.out.print("\nInorder : ");
		T.inorder(n1);
		
		System.out.print("\nPostorder : ");
		T.postorder(n1);
	}
}
