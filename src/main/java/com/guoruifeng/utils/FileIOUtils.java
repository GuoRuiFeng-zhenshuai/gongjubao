package com.guoruifeng.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileIOUtils {
	public static String readFile(String title,String fox,String pox) throws IOException{
		
		File files=new File("E:"+File.separator+"Test");
		files.mkdirs();
		File file=new File(files,title+".txt");
		file.createNewFile();
		File f=new File("E:/Te/"+title+".txt");
		FileOutputStream fos=new FileOutputStream(f);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write(fox);
		bw.write(pox);
		bw.close();
		return "ok";
		
	}
}
