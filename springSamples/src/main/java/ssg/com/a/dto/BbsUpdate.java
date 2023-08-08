package ssg.com.a.dto;

import java.io.Serializable;

public class BbsUpdate implements Serializable{

	private int seq;
	private String title;
	private String content;
	
	public BbsUpdate() {
	}

	public BbsUpdate(int seq, String title, String content) {
		super();
		this.seq = seq;
		this.title = title;
		this.content = content;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}