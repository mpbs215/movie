package kosta.ridonbox.model.dto;

public class ScreenDTO {
	
	private String screenNum;
	private String movieNum;
	private String theaterName;
	private String screenDate;
	private int revTotal;
	
	public ScreenDTO() {}
	
	public ScreenDTO(String screenNum, String movieNum, String theaterName, String screenDate, int revTotal) {
		super();
		this.screenNum = screenNum;
		this.movieNum = movieNum;
		this.theaterName = theaterName;
		this.screenDate = screenDate;
		this.revTotal = revTotal;
	}
	public String getScreenNum() {
		return screenNum;
	}
	public void setScreenNum(String screenNum) {
		this.screenNum = screenNum;
	}
	public String getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(String movieNum) {
		this.movieNum = movieNum;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getScreenDate() {
		return screenDate;
	}
	public void setScreenDate(String screenDate) {
		this.screenDate = screenDate;
	}
	public int getRevTotal() {
		return revTotal;
	}
	public void setRevTotal(int revTotal) {
		this.revTotal = revTotal;
	}
}
