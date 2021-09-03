package com.src;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner("-");
		
		sj.add("shiva");
		sj.add("kumar");
		sj.add("ss");
		sj.add("kk");
		sj.add("yui");
		sj.add("yon");
		System.out.println(sj);
		
StringJoiner sj1=new StringJoiner(",","{","}");
		
		sj1.add("shiva");
		sj1.add("kumar");
		sj1.add("ss");
		sj1.add("kk");
		sj1.add("yui");
		sj1.add("yon");
		System.out.println(sj1);

	}

}
