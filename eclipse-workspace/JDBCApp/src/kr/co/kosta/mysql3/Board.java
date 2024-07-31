package kr.co.kosta.mysql3;

import java.sql.Blob;
import java.util.Date;

/*
	bid			int				primary key	auto_increment,
    btitle		varchar(100)	not null,
    bcontent	longtext		not null,
    bwriter		varchar(50)		not null,
    bdate		datetime		default now(),
    bfilename	varchar(50)		null,
    bfiledata	longblob		null
 */
public class Board {
    private int bid;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
    private String bfilename;
    private Blob bfiledata;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBfilename() {
        return bfilename;
    }

    public void setBfilename(String bfilename) {
        this.bfilename = bfilename;
    }

    public Blob getBfiledata() {
        return bfiledata;
    }

    public void setBfiledata(Blob bfiledata) {
        this.bfiledata = bfiledata;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bid=" + bid +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", bdate=" + bdate +
                ", bfilename='" + bfilename + '\'' +
                ", bfiledata=" + bfiledata +
                '}';
    }
}