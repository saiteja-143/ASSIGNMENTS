package com.wordsfrequencyTest;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

import com.wordsfrequency.Wordfrequency;

public class TestWordFrequrncy {
	Scanner scan=new Scanner(System.in);
	Wordfrequency wf=new Wordfrequency();
	File file=new File("Test2.txt");
	
	@Test
	public void readFromFileTest() throws IOException{
		

		assertEquals(true,file.canRead());
		assertEquals(true,file.exists());
	}
	@Test
	public void wordCountTest() throws IOException
	{
		Map<String,Integer> Inputmap=new HashMap<String, Integer>();
		Map<String,Integer> Outputmap=new HashMap<String,Integer>();
		Inputmap.put("a",6);
		Inputmap.put("been",1);
		Inputmap.put("Catholic",6);
		Inputmap.put("or",1);
		Inputmap.put("father",2);
		Inputmap.put("was", 6);
		Inputmap.put("had", 1);
		Inputmap.put("Nory", 1);
		Inputmap.put("mother", 3);
		Inputmap.put("his", 1);
		Inputmap.put("her", 3);
		Inputmap.put("and", 2);
		Inputmap.put("because", 3);
		Inputmap.put("Nory's", 1);
		String file_name=file.toString();
		//System.out.println(file);
		assertEquals(Inputmap,wf.wordcount(file_name, Outputmap));
	}

}
