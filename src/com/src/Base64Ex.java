package com.src;

import java.util.Base64;

public class Base64Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base64.Encoder en= Base64.getEncoder();
		
		byte b[]= {97,100,104,106};
		
		byte bencode[]=en.encode(b);
		
		for(byte x: bencode)
		{
			System.out.println(x);
		}
		
		Base64.Decoder de=Base64.getDecoder();
		byte by[]=de.decode(bencode);
		System.out.println("------------------------------");
		for(byte x:by)
		{
			System.out.println(x);
		}
		

	}

}
