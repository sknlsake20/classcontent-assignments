package com.src;
@FunctionalInterface
interface Displayable{
	
	Message printMessage(String msg);
}

class Message{
	String str;
	Message(String str){
		this.str=str;
		System.out.println(str);
	}
	
}
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Displayable dp=Message::new;
		
		dp.printMessage("shiva");
		
		
	}

}
