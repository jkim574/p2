import java.io.*;

public class Filetest {
    public static void main(String[] args) {

	String fileName = "Train1.txt";
	String line = null;

	try {
	    FileReader filereader = new FileReader(fileName);

	    BufferedReader bf = new BufferedReader(filereader);

	    while  ((line = bf.readLine()) != null) {
		String[] words = line.split(",");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
	    }

	    bf.close();
	} catch (IOException e) {

	}


    }
}
