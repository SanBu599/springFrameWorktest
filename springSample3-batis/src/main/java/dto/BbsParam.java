package dto;

public class BbsParam {
	
	private String choice;
	private String search;
	private int pageNumber;
	
	
	
	public BbsParam() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BbsParam(String choice, String search) {
		super();
		this.choice = choice;
		this.search = search;
	}



	public String getChoice() {
		return choice;
	}



	public void setChoice(String choice) {
		this.choice = choice;
	}



	public String getSearch() {
		return search;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	public int getPageNumber() {
		return pageNumber;
	}



	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	
	
	
}
