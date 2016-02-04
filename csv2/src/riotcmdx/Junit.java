package riotcmdx;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class Junit {
	@Test
	public void test_input() throws FileNotFoundException
	{
		 String csvFile;
		CsvReader csvread=new CsvReader();
		
		 csvFile = "/Users/xujing/Documents/workspace/CsvJena/src/JenaExample/AirPassengers.csv";
		csvread.read(csvFile);
	}

}
