package kosta.ridonbox.model.dto;

public class MovieScreenDTO {
	private int movieNo;		//pk
	private String title;		//����
	private String titleEnglish;//��������
	private String director;	//����
	private String actor;		//���
	private String releasedate;	//������
	private String imgPath;			//�̹������
	private int grade;				//����
	private int state;				//��ȭ ����(���� 1, ������ 0)
	private String screenNum; //�󿵹�ȣ
	private String theaterName; //�󿵰��̸�
	private String screenDate; //�󿵳�¥ �� �ð�
	private int revTotal; //�ѿ��ż�
	
	public MovieScreenDTO() {
	}

	public MovieScreenDTO(int movieNo, String title, String titleEnglish, String director, String actor,
			String releasedate, String imgPath, int grade, int state, String screenNum,
			String theaterName, String screenDate, int revTotal) {
		super();
		this.movieNo = movieNo;
		this.title = title;
		this.titleEnglish = titleEnglish;
		this.director = director;
		this.actor = actor;
		this.releasedate = releasedate;
		this.imgPath = imgPath;
		this.grade = grade;
		this.state = state;
		this.screenNum = screenNum;
		this.theaterName = theaterName;
		this.screenDate = screenDate;
		this.revTotal = revTotal;
	}

	public int getMovieNo() {
		return movieNo;
	}

	public void setMovieNo(int movieNo) {
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

	public String getScreenNum() {
		return screenNum;
	}

	public void setScreenNum(String screenNum) {
		this.screenNum = screenNum;
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
