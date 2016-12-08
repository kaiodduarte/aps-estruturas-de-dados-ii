package com.tads;

public class Node {
	private String letter;
	private String code;
	private int freq;
	public Node left;
	public Node right;
	public Node next;

	public Node(String letter, int freq){
		this.code = "";
		this.freq = freq;
		this.letter = letter;
		this.left = null;
		this.right = null;
		this.next = null;
	}
	
	public String getLetter() {
		return letter;
	}

	public void setletter(String letter) {
		this.letter = letter;
	}
	
	public void print(){
		System.out.print("{" + letter + ", " + freq + "}");
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
