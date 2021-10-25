package com.wordsfrequency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wordfrequency {
	
	
	//Method to count frequency of each word in the given Text File.
	public Map<String,Integer> wordcount(String File_name,Map<String,Integer> map) throws IOException {
		
		BufferedReader buffer=new BufferedReader(new FileReader(File_name),8000);
        String line;
        while( (line=buffer.readLine())!=null) {
        	if(line.trim().equals(""))
        		continue;
        	else {
        		String[] str=line.split(" ");
        		for(String word:str) {
        			if(word.trim().equals(""))
        				continue;
        			else {
        				while(word.endsWith(",")||word.endsWith("!")||word.endsWith(".")||word.endsWith("\"")||word.endsWith("'")) {
        					word= word.substring(0, word.length()-1);
        					}
        				while(word.startsWith("'")||word.startsWith("\"")){
        					word= word.substring(1);
        					}
        				if(map.containsKey(word)) {
        					map.put(word, map.get(word)+1);
        					}
        				else {
        					map.put(word,1);
        					}
        				}
        			}
        		}
        	}
        buffer.close();
        return map;
        }
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<String,Integer>();
		System.out.println("Enter the Valid File Name");
		String File_name=scan.nextLine();
		System.out.println("*****************************");
		Wordfrequency wf=new Wordfrequency();
		System.out.println(wf.wordcount(File_name,map));
		
		scan.close();
		}	
	}
