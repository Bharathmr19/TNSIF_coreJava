package com.tnsif.inheritance.multilevel;

public class Notepad {
	
	protected String content;
	
	public Notepad() {
		this.content="";
		
	}
	
	public void write(String content) {
		this.content += content;
	}
	
	public String displayContent() {
		return content;
	}

	
}
