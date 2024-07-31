package kr.co.kosta.member;

/*
	id			varchar(10)	not null,
    pass		varchar(10) not null,
    name		varchar(30) not null,
    regidate	date	default (current_date) not null, * 
 */
public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String regidate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegidate() {
		return regidate;
	}
	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}
	
	
}
