package com.kosta.september.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class PageResolverTest {

	@Test
	public void test() {
		PageResolver pr = new PageResolver(250, 1);
		pr.print();
		System.out.println("pr = " + pr);
		System.out.println();
		
		assertTrue(pr.getBeginPage() == 1);
		assertTrue(pr.getEndPage() == 10);
	}
	
	@Test
	public void test2() {
		PageResolver pr = new PageResolver(250, 11);
		pr.print();
		System.out.println("pr = " + pr);
		System.out.println();
		
		assertTrue(pr.getBeginPage() == 11);
		assertTrue(pr.getEndPage() == 20);
	}	
	
	
	@Test
	public void test3() {
		PageResolver pr = new PageResolver(255, 25);
		pr.print();
		System.out.println("pr = " + pr);
		System.out.println();
		
		assertTrue(pr.getBeginPage() == 21);
		assertTrue(pr.getEndPage() == 26);
	}	

	@Test
	public void test4() {
		PageResolver pr = new PageResolver(255, 10);
		pr.print();
		System.out.println("pr = " + pr);
		System.out.println();
		
		assertTrue(pr.getBeginPage() ==1);
		assertTrue(pr.getEndPage() == 10);
	}	
	
}
