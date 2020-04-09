package com.wangting.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jws.Oneway;

import org.junit.Test;



import com.guoruifeng.utils.DateUtils;
import com.guoruifeng.utils.FileIOUtils;
import com.guoruifeng.utils.FileUtils;
import com.guoruifeng.utils.StreamUtils;

public class TestUtil {

	@Test
	public void test() throws IOException {
	
		
	FileUtils.String("D:/a.txt", "D:/aaaaaaa/cc.txt");
	FileUtils.readFile("D:/a.txt");
		
	}
	@Test
	public void testEom(){
		Date  eom = DateUtils.getEOM(new Date());

		SimpleDateFormat date=new SimpleDateFormat();
		String format = date.format(eom);
		System.out.println(format);
		
	}

	@Test
	public void testFile(){
		Date  eom = DateUtils.getBOM(new Date());

		SimpleDateFormat date=new SimpleDateFormat();
		String format = date.format(eom);
		System.out.println(format);
		
	}
}
