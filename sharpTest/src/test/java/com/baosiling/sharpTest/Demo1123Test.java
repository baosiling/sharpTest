package com.baosiling.sharpTest;

import org.dom4j.io.SAXReader;
import org.junit.Test;

import com.baosiling.sharpTest.model.Animal;
import com.baosiling.sharpTest.model.Cat;
public class Demo1123Test {

	@Test
	public void childClassTest(){
		Cat cat = new Cat();
		cat.setName("catName");
		cat.setHowl("miaomiao");
		cat.setTail("yellowTail");
		cat.setFur("whiteColor");
		
		operateAnimal(cat);
		
		
	}
	
	private void operateAnimal(Animal animal){
		Cat cat = (Cat) animal;
		System.out.println(cat.getFur());
		
		SAXReader reader = new SAXReader();
//		reader.
	}
}
