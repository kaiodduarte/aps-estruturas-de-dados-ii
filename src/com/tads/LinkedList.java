package com.tads;

public class LinkedList {
	private Node first;
	private int size;

	public LinkedList() {
		this.first = null;
		this.size = 0;
	}

	public void destroy() {
		this.first = null;
	}

	public Node getFirst() {
		return first;
	}

	public int getSize() {
		return size;
	}

	public boolean empty() {
		return first == null;
	}

	public boolean search(String letter) {
		if (empty())
			return false;

		Node p = first;

		while (p != null && !letter.equals(p.getLetter())) {
			p = p.next;
		}

		if (p == null)
			return false;

		else
			return true;
	}

	public void insert(Node e) {
		if (empty()) {
			first = e;
			size++;
			return;
		}

		Node prev = null;
		Node p = first;

		while (p != null && p.getFreq() < e.getFreq()) {
			prev = p;
			p = p.next;
		}

		if (prev == null) {
			e.next = first;
			first = e;
		}

		else if (prev != null && p != null) {
			e.next = p;
			prev.next = e;
		}

		else
			prev.next = e;

		size++;
	}

	public void remove() {
		if (empty())
			return;

		first = first.next;

		size--;
	}

	public Node returnMin() {
		if (empty())
			return null;

		if (getSize() > 1) {
			Node prev = first;
			remove();

			Node p = first;
			remove();

			Node min = new Node("", 0);
			min.setFreq(prev.getFreq() + p.getFreq());
			min.setletter(prev.getLetter() + p.getLetter());

			min.left = prev;
			min.right = p;

			insert(min);

			return min;
		}

		return first;
	}

	public String compacted(String a) {
		String x = "", c = "";

		int i;
		Node j;

		for (i = 0; i < a.length(); i++)
			for (j = first; j != null; j = j.next) {
				c = a.charAt(i) + "";
				if (c.equals(j.getLetter()))
					x += j.getCode();
			}

		return x;
	}

	public void getFrequency(String a) {
		int i, j = 0, count = 0;
		boolean x;

		for (i = 0; i < a.length(); i++) {
			count = 0;
			x = false;

			for (j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j))
					if (i <= j)
						count++;
					else
						x = true;

				if (count != 0 && !x && j == a.length() - 1)
					insert(new Node(a.charAt(i) + "", count));
			}
		}
	}
}
