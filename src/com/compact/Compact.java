package com.compact;

import com.tads.*;

public class Compact {
	private String before;
	private String after;

	public String getBefore() {
		return before;
	}

	public String getAfter() {
		return after;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	private void getResult() {
		LinkedList list = new LinkedList();
		list.getFrequency(getBefore());

		while (list.getSize() > 1)
			list.returnMin();

		Tree tree = new Tree();
		tree.root = list.getFirst();
		list.destroy();
		tree.generateCode(tree.root);

		String[] x = { "" };

		for (int i = 0; i < getBefore().length(); i++)
			tree.search(tree.root, getBefore().charAt(i) + "", x);

		setAfter(x[0]);
	}

	public void UI(String a) {
		setBefore(a);
		getResult();
	}
}
