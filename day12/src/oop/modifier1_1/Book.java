package oop.modifier1_1;

public class Book {

	//멤버필드(변수)
	//외부에서 접근이 불가능하도록 잠금(private) 처리
	private String title; 
	private String author;
	private int price; 
	private int page;
	
	//변수가 잠기면 외부에서는 직접 접근할 수 있는 방법이 없다
	//-설정을 위한 setter 메소드, 확인을 위한 getter 메소드를 설정해야 한다
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price>=0) {
		this.price = price;
		}
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page>0) {
		this.page = page;
		}
	}
	
	void data (String title,String author,int price,int page) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);;
		this.setPage(page);
	}

	void information() {
		System.out.println("<도서 정보>");
		System.out.println("이름 : "+getTitle());
		System.out.println("저자 : "+getAuthor());
		System.out.println("가격 : "+getPrice()+"원");
		System.out.println("페이지 : "+getPage());
	}
}

