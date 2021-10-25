package com.numberlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.io.Files;

public class NumbersListStream 
{
	public static void main( String[] args ) throws IOException
	{
		Path path = Paths.get(System.getProperty("user.dir")).resolve("numbers.txt");
		BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
		String filename=path.toString();
		System.out.println("filename:"+filename);
		String extension = Files.getFileExtension(filename);
		System.out.println(extension);
		List<Integer> NumberStore = new ArrayList<>();
		String line = reader.readLine();
		if(extension.equals("txt")) {




			while ((line=reader.readLine()) != null) {
				NumberStore.add(Integer.parseInt(line));
				line = reader.readLine();
			}


			ListSortingMethod(NumberStore).forEach(System.out::println);
		}
		else if(extension.equals("csv")) {
			while((line=reader.readLine()) != null) {
				String[] number=line.split(",");
				for(String num:number) {
					NumberStore.add((Integer.parseInt(num)));
				}


			}
			ListSortingMethod(NumberStore).forEach(System.out::println);



		}
	}

	static List<Integer> ListSortingMethod(List<Integer> NumberStore){
		List<Integer> SortedList = NumberStore.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		return SortedList.stream().distinct().collect(Collectors.toList());

	}
}
