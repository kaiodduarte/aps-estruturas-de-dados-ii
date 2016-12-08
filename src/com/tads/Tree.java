package com.tads;

public class Tree {
	public Node root;

	public Tree() {
		this.root = null;
	}

	public void prefixPrint(Node n) {
		if (n != null) {
			n.print();
			prefixPrint(n.left);
			prefixPrint(n.right);
		}
	}

	public void generateCode(Node n) {
		if (n != null) {
			if (n.left != null) {
				n.left.setCode(n.getCode() + "0");
				generateCode(n.left);
			}

			if (n.right != null) {
				n.right.setCode(n.getCode() + "1");
				generateCode(n.right);
			}
		}
	}

	public boolean isLeaf(Node n) {
		return n.left == null && n.right == null;
	}

	public void search(Node n, String a, String[] c) {
		if (n != null) {
			if (a.equalsIgnoreCase(n.getLetter()))
				c[0] += n.getCode();

			search(n.left, a, c);
			search(n.right, a, c);
		}
	}
}
