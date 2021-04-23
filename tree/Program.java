package tree;

public class Program {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(4);
		tree.insert(10);
		tree.insert(2);
		tree.insert(6);
		tree.insert(3);
		tree.insert(20);
		tree.insert(30);
		tree.insert(1);
		/*
		 * Считаем высоту корня и выводим
		 */
		tree.getRoot().Height();
		System.out.println("Height: " + tree.getRoot().height);
		
		/*
		 * Выполняем прямой обход дерева
		 */
		System.out.print("Direct: ");
		tree.directPrint(tree.getRoot());
		System.out.println();
		
		/*
		 * Выполняем обратный обход дерева
		 */
		System.out.print("Reverse: ");
		tree.reversePrint(tree.getRoot());
		System.out.println();
		
		/*
		 * Выполняем центрированный обход дерева
		 */
		System.out.print("Center: ");
		tree.centerPrint(tree.getRoot());
		System.out.println();
	}
}
