package dateliu;
import java.io.*;
public class data1 {
       public static void main(String args[]) {
    	   try {
    		   FileOutputStream out=new FileOutputStream("myFile,dat");
    		   out.write('H');
    		   out.write(69);
    		   out.write(76);
    		   out.write('L');
    		   out.write('O');
    		   out.write('!');
    		   out.close();
    	   }catch(FileNotFoundException e) {
    		   System.out.println("Error:Cannot open file for writting.");
    	   }catch(IOException e) {
    		   System.out.println("Error:Cannot write to File.");
    	   }
       }
}