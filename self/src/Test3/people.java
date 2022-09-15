package Test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class people {
	HashSet<String> Mexico = new HashSet<String>();
	HashSet<String> Cuba = new HashSet<String>();
	HashSet<String> Jaminie = new HashSet<String>();

	public people(String file) throws FileNotFoundException {// text can be reading as a string type file?
		Scanner input = new Scanner(new File(file));// File need to use import
	}

}
