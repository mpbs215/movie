package kosta.ridonbox.model.dto;

public class ScreenDTO {
	
	private String screen_num;
	private String movie_num;
	private String theater_name;
	private String screen_date;
	private int screen_time;
	private int rev_total;
	
	public ScreenDTO() {}

	public ScreenDTO(String screen_num, String movie_num, String theater_name, String screen_date, int screen_time,
			int rev_total) {
		super();
		this.screen_num = screen_num;
		this.movie_num = movie_num;
		this.theater_name = theater_name;
		this.screen_date = screen_date;
		this.screen_time = screen_time;
		this.rev_total = rev_total;
	}

	public String getScreen_num() {
		return screen_num;
	}

	public void setScreen_num(String screen_num) {
		this.screen_num = screen_num;
	}

	public String getMovie_num() {
		return movie_num;
	}

	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;
	}

	public String getTheater_name() {
		return theater_name;
	}

	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}

	public String getScreen_date() {
		return screen_date;
	}

	public void setScreen_date(String screen_date) {
		this.screen_date = screen_date;
	}

	public int getScreen_time() {
		return screen_time;
	}

	public void setScreen_time(int screen_time) {
		this.screen_time = screen_time;
	}

	public int getRev_total() {
		return rev_total;
	}

	public void setRev_total(int rev_total) {
		this.rev_total = rev_total;
	}
	
	
}
