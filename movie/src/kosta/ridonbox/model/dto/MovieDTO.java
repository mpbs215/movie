package kosta.ridonbox.model.dto;

public class MovieDTO {

	private String movie_num;		//pk
	private String movie_title;		//����
	private String movie_etitle;//��������
	private String movie_dir;	//����
	private String movie_act;		//���
	private String movie_date;	//������
	private int movie_rat;				//����
	private String movie_path;			//�̹������
	private String movie_youtube;		//��Ʃ����
	private int movie_state;				//��ȭ ����(���� 1, ������ 0)
	
	public MovieDTO() {
	}

	public MovieDTO(String movie_num, String movie_title, String movie_etitle, String movie_dir, String movie_act,
			String movie_date, int movie_rat, String movie_path, String movie_youtube, int movie_state) {
		super();
		this.movie_num = movie_num;
		this.movie_title = movie_title;
		this.movie_etitle = movie_etitle;
		this.movie_dir = movie_dir;
		this.movie_act = movie_act;
		this.movie_date = movie_date;
		this.movie_rat = movie_rat;
		this.movie_path = movie_path;
		this.movie_youtube = movie_youtube;
		this.movie_state = movie_state;
	}

	public String getMovie_num() {
		return movie_num;
	}


	public void setMovie_num(String movie_num) {
		this.movie_num = movie_num;

	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public String getMovie_etitle() {
		return movie_etitle;
	}

	public void setMovie_etitle(String movie_etitle) {
		this.movie_etitle = movie_etitle;
	}

	public String getMovie_dir() {
		return movie_dir;
	}

	public void setMovie_dir(String movie_dir) {
		this.movie_dir = movie_dir;
	}

	public String getMovie_act() {
		return movie_act;
	}

	public void setMovie_act(String movie_act) {
		this.movie_act = movie_act;
	}

	public String getMovie_date() {
		return movie_date;
	}

	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}

	public int getMovie_rat() {
		return movie_rat;
	}

	public void setMovie_rat(int movie_rat) {
		this.movie_rat = movie_rat;
	}

	public String getMovie_path() {
		return movie_path;
	}

	public void setMovie_path(String movie_path) {
		this.movie_path = movie_path;
	}

	public String getMovie_youtube() {
		return movie_youtube;
	}

	public void setMovie_youtube(String movie_youtube) {
		this.movie_youtube = movie_youtube;
	}

	public int getMovie_state() {
		return movie_state;
	}

	public void setMovie_state(int movie_state) {
		this.movie_state = movie_state;
	}
	
	
	
	
	
}