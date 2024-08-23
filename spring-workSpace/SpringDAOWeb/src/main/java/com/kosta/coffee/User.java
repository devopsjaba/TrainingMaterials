package com.kosta.coffee;

import java.util.Date;
import java.util.Objects;

/*
-- springbasic.`user` definition

CREATE TABLE `user` (
  `id` varchar(30) COLLATE utf8mb3_bin NOT NULL,
  `pwd` varchar(50) COLLATE utf8mb3_bin DEFAULT NULL,
  `name` varchar(30) COLLATE utf8mb3_bin DEFAULT NULL,
  `email` varchar(30) COLLATE utf8mb3_bin DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `sns` varchar(30) COLLATE utf8mb3_bin DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin; * 
 */
public class User {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date birth;
	private String sns;
	private Date reg_date;
	
	public User() {}
	public User(String id, String pwd, String name, String email, Date birth, String sns, Date reg_date) {
		//super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.birth = birth;
		this.sns = sns;
		this.reg_date = reg_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getSns() {
		return sns;
	}
	public void setSns(String sns) {
		this.sns = sns;
	}
	
	
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", birth=" + birth + ", sns="
				+ sns + ", reg_date=" + reg_date + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(birth, email, id, name, pwd, sns);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (sns == null) {
			if (other.sns != null)
				return false;
		} else if (!sns.equals(other.sns))
			return false;
		return true;
	}

	

	
	
	
	
	
}







