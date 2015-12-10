package com.baosiling.sharpTest;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class ExceptionTest {
	public static void main(String[] args){
		
		try{
			int a = 1/0;
		}catch(Exception e){
//			Writer w = new StringWriter();
//		    e.printStackTrace(new PrintWriter(w));
//		    System.out.println(w.toString());
			e.printStackTrace();
		}
	}
}
