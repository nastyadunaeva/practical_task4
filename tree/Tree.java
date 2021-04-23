package tree;

public class Tree {
	/*
	 * Класс, реализующий узел дерева
	 */
	static class Node {
		public int key;
		public Node rightNode;
		public Node leftNode;
		public int height;
		public Node(int key) {
			this.key = key;
		}
		/*
		 * Метод возвращает высоту узла
		 */
		public void Height() {
	        height = 0;
	        if (leftNode != null) {
	            leftNode.Height();
	            height = Math.max(height, leftNode.height + 1);
	        }
	        if (rightNode != null) {
	            rightNode.Height();
	            height = Math.max(height, rightNode.height + 1);
	        }
	    }
	}
	private Node root;
	/*
	 * Вставка узла в дерево
	 */
	public Node getRoot() {
		return root;
	}
	public void insert(int key) {
		if (root == null) {
	        root = new Node(key);
	        return;
	    }
	    Node node = root;
	    while (true) {
	        if (key < node.key) {
	            if (node.leftNode == null) {
	                node.leftNode = new Node(key);
	                return;
	            } else {
	                node = node.leftNode;
	            }
	        } else if (key > node.key) {
	            if (node.rightNode == null) {
	                node.rightNode = new Node(key);
	                return;
	            } else {
	                node = node.rightNode;
	            }
	        } else {
	            return;
	        }
	    }
	}
	/*
	 * Вывод элементов, прямой обход
	 */
	public void directPrint(Node node) {
		if (node != null) {
			System.out.print(node.key+" ");
			this.directPrint(node.leftNode);
			this.directPrint(node.rightNode);
		}
	}
	/*
	 * Вывод элементов, обратный обход
	 */
	public void reversePrint(Node node) {
		if (node != null) {
			this.reversePrint(node.leftNode);
			this.reversePrint(node.rightNode);
			System.out.print(node.key+" ");
		}
	}
	/*
	 * Вывод элементов, центрированный обход
	 */
	public void centerPrint(Node node) {
		if (node != null) {
			this.centerPrint(node.leftNode);
			System.out.print(node.key+" ");
			this.centerPrint(node.rightNode);
		}
	}
}
