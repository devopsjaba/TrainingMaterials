package com.kosta.october.domain;

import java.util.Date;

/*
  `cno` int NOT NULL AUTO_INCREMENT,
  `bno` int NOT NULL COMMENT '게시물 번호',
  `pcno` int DEFAULT NULL COMMENT '대댓글번호',
  `comment` varchar(3000) DEFAULT NULL,
  `commenter` varchar(30) DEFAULT NULL,
  `reg_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `up_date` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cno`) * 
 */
public class CommentDto {
	private Integer cno;
	private Integer bno;
	private Integer pcno;
	private String comment;
	private String commenter;
	private Date reg_date;
	private Date up_date;
	
	public CommentDto() {}

	public CommentDto(Integer bno, Integer pcno, String comment, String commenter) {
		super();
		this.bno = bno;
		this.pcno = pcno;
		this.comment = comment;
		this.commenter = commenter;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public Integer getPcno() {
		return pcno;
	}

	public void setPcno(Integer pcno) {
		this.pcno = pcno;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommenter() {
		return commenter;
	}

	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public Date getUp_date() {
		return up_date;
	}

	public void setUp_date(Date up_date) {
		this.up_date = up_date;
	}

	@Override
	public String toString() {
		return "CommentDto [cno=" + cno + ", bno=" + bno + ", pcno=" + pcno + ", comment=" + comment + ", commenter="
				+ commenter + ", reg_date=" + reg_date + ", up_date=" + up_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bno == null) ? 0 : bno.hashCode());
		result = prime * result + ((cno == null) ? 0 : cno.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((commenter == null) ? 0 : commenter.hashCode());
		result = prime * result + ((pcno == null) ? 0 : pcno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentDto other = (CommentDto) obj;
		if (bno == null) {
			if (other.bno != null)
				return false;
		} else if (!bno.equals(other.bno))
			return false;
		if (cno == null) {
			if (other.cno != null)
				return false;
		} else if (!cno.equals(other.cno))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (commenter == null) {
			if (other.commenter != null)
				return false;
		} else if (!commenter.equals(other.commenter))
			return false;
		if (pcno == null) {
			if (other.pcno != null)
				return false;
		} else if (!pcno.equals(other.pcno))
			return false;
		return true;
	}
	
	
}





