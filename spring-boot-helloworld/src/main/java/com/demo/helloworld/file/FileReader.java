package com.demo.helloworld.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.util.ClassUtils;

public class FileReader {

	public static String getread() throws IOException {
		InputStream inputStream = ClassUtils.class.getClassLoader().getResourceAsStream("read.txt");
		BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
		String string = null;
		StringBuffer buffer = new StringBuffer();
		while ((string = bf.readLine()) != null) {
			buffer.append(string);
		}
		return buffer.toString();
	}
}
