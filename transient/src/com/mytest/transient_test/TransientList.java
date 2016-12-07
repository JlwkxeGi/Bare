package com.mytest.transient_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TransientList {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		File file = new File("test");
		
		if(!file.exists()){
			file.createNewFile();
		}
		
		List list = new ArrayList();
		
		list.add(new Transient());
		
		Transient[] transients = new Transient[]{new Transient()};
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
		outputStream.writeObject(transients);
		outputStream.close();
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
		Object object = inputStream.readObject();
		inputStream.close();
		System.out.println(object);
	}
}
