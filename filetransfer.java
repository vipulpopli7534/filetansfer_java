package asignment9;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.InputMismatchException;

public class filetransfer {
		public static void main(String[] args) throws IOException {
	   File file=new File("C:\\Users\\Vips\\Desktop\\source.txt");
	   FileReader in = null;
	   FileWriter out=new FileWriter("C:\\Users\\Vips\\Desktop\\destination.txt");
	   try {
		   in=new FileReader(file);
		   int ch;
		 
		   while((ch=in.read())!=-1) {
			   System.out.print((char)ch);
			   out.write((char)ch);
		  
		   }
		   
		   out.close();
	   }catch(InputMismatchException e) {
		   System.out.println("Wrong Input");
	   }finally{
		   if(in!=null)
		   in.close();
	   }
		}

	}
