package kosta.ridonbox.model.dto;

public class MovieDTO {
	private String movieNo;		//pk
	private String title;		//제목
	private String titleEnglish;//영어제목
	private String director;	//감독
	private String actor;		//배우
	private String releasedate;	//개봉일
	private String imgPath;			//이미지경로
	private int grade;				//평점
	private int state;				//영화 상태(상영중 1, 상영종료 0)
	
	public MovieDTO() {
	}
	public MovieDTO(String movieNo, String title, String titleEnglish, String director, String actor, String releasedate,
			String imgPath, int grade, int state) {
		this.movieNo = movieNo;
		this.title = title;
		this.titleEnglish = titleEnglish;
		this.director = director;
		this.actor = actor;
		this.releasedate = releasedate;
		this.imgPath = imgPath;
		this.grade = grade;
		this.state = state;
	}
	public String getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(String movieNo) {
		this.movieNo = movieNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleEnglish() {
		return titleEnglish;
	}
	public void setTitleEnglish(String titleEnglish) {
		this.titleEnglish = titleEnglish;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	
	
}
