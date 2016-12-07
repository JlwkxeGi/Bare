package com.mytest.transient_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TransientTest {
	
	@Test
	public void test() throws IOException, ClassNotFoundException{
		
		
		File file = new File("test");
		
		if(!file.exists()){
			file.createNewFile();
		}
		
		Transient transient1 = new Transient();
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
		outputStream.writeObject(transient1);
		outputStream.close();
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
		Object object = inputStream.readObject();
		inputStream.close();
		System.out.println(object);
		
	}
}
