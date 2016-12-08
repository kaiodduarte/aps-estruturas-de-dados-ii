package com.tads;

public class Node {
	private String letra;
	private String code;
	private int freq;
	public Node left;
	public Node right;
	public Node next;

	public Node(String letra, int freq){
		this.code = "";
		this.freq = freq;
		this.letra = letra;
		this.left = null;
		this.right = null;
		this.next = null;
	}
	
	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public void print(){
		System.out.print("{" + letra + ", " + freq + "}");
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
