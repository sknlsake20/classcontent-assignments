package com.src;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJs {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		
		
		ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
		
		se.eval(new FileReader("sample.js"));
		
	}
}
