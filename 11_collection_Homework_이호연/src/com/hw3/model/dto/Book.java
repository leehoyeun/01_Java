package com.hw3.model.dto;

public class Book {
	private String title;//제목
	private String writer;//저자
	private int prize;//가격
	private String publisher;//출판사
	private int bookNum;//책번호
	
	public Book() {}

	public Book(String title, String writer, int prize, String publisher, int bookNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.prize = prize;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	@Override
	public String toString() {
		return bookNum + "[도서 제목: " + title + ", 도서 저자=" + writer + ", 도서 가격 =" + prize + ", 출판사 =" + publisher
				+ ", 도서 번호=" + bookNum + "]";
	}

	
	
	
}
