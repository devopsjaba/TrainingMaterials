package com.kosta.october.domain;

import static java.util.Objects.requireNonNullElse;

import org.springframework.web.util.UriComponentsBuilder;

import static java.lang.Math.*;

public class SearchItem {
	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int MIN_PAGE_SIZE = 5;
	public static final int MAX_PAGE_SIZE = 50;
	
	private int page = 1;					// 현재 페이지 
	private int pageSize = DEFAULT_PAGE_SIZE;	// 한 페이지당 게시물 건수 
	private String option = "";
	private String keyword = "";
	//private Integer offset;
	
	public SearchItem() {}

	public SearchItem(Integer page, Integer pageSize) {
		//super();
		this(page, pageSize, "", "");
	}

	public SearchItem(Integer page, Integer pageSize, String option, String keyword) {
		//super();
		this.page = page;
		this.pageSize = pageSize;
		this.option = option;
		this.keyword = keyword;
	}
	
	// 페이지 지정해주지 않은 경우
	public String getQueryString() {
		return getQueryString(page);
	}
	
	// 페이지 지정해 주는 경우 
	// ?page=10&pageSize=10&option=A&keyword=title
	public String getQueryString(Integer page) {
		return UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("pageSize", pageSize)
				.queryParam("option", option)
				.queryParam("keyword", keyword)
				.build().toString();
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = requireNonNullElse(pageSize, DEFAULT_PAGE_SIZE);
		//   MIN_PAGE_SIZE <=  pageSize <= MAX_PAGE_SIZE
		this.pageSize = max(MIN_PAGE_SIZE, min(this.pageSize, MAX_PAGE_SIZE));
	}

	public Integer getOffset() {
		int result = (page-1) * pageSize;
		if(result < 0) result = 0;
		return result;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "SearchItem [page=" + page + ", pageSize=" + pageSize + ", option=" + option + ", keyword=" + keyword
				+ "]";
	}
	
	
	
	
	
}
