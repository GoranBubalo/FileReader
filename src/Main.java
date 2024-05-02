import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		
		//FileReader class = > allows us to read the content of a file as a stream of characters, One by one read() 
		// read() returns an int value which contains the byte value
		//when read() returns -1, there is no more data to read 
		
		try {
			FileReader reader = new FileReader("Art.txt");
			int data = reader.read();
			
			//While loop
			
			while ( data !=1) {
				System.out.print((char)data);
				data =  reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			//Additional  exception, add's extra security 
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
