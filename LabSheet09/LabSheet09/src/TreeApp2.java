
public class TreeApp2 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree4()");
		System.out.println("-------------------------------");
		
		BinaryTree tree4 = new BinaryTree();
		tree4.createTree4();
		tree4.printTree(tree4.getRoot(), 0);
		
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("-------------------------------");
		
		BinaryTree tree5 = new BinaryTree();
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from createTree6()");
		System.out.println("-------------------------------");
		
		BinaryTree tree6 = new BinaryTree();
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(), 0);
		
		BinaryTree tree4_4 = new BinaryTree();
		System.out.println("-------------------------------");
		tree4_4.createTree4();
		tree4_4.printTree(tree4.getRoot(), 0);
		System.out.println("-------------------------------");
		tree4_4.delete(11);
		tree4_4.printTree(tree4.getRoot(), 0);
		
	}
}