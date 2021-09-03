package com.src;

import java.util.Base64;

public class StringBase64ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base64.Encoder en=Base64.getEncoder();
		
		String str="my own thing";
		
		String str1=en.encodeToString(str.getBytes());
		System.out.println(str);
		System.out.println(str1);
		
		Base64.Decoder de=Base64.getDecoder();
		
		String str3=new String(de.decode(str1));
		System.out.println(str3);

	}

}
