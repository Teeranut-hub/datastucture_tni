
public class BSTApp1 {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);

		System.out.println();
		System.out.println("Minimum node is " + tree.findMinimum());

		System.out.println();
		System.out.println("Maximum node is " + tree.findMaximum(tree.getRoot()));
		
		System.out.println();
		int delNode = 7;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent is " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
	}
}
