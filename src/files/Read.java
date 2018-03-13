package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String filename = "C:\\Users\\tony\\Desktop\\SDET University\\Workspaces\\files\\filetoread.txt";
		
		File file = new File(filename);
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + filename);
			e.printStackTrace();
		}

		//String text = br.readLine();
	
	}

}
