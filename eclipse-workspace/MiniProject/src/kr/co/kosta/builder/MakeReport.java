package kr.co.kosta.builder;

public interface MakeReport {

	void makeHeader();
	void makeBody();
	void makeFooter();
	String getReport();
}
