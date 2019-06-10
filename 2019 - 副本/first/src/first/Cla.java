package first;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cla{
   public static void main(String argv[]){
	   Cla m=new Cla( );
       System.out.println(m.amethod());
   }
   public int amethod(){
      try{
         FileInputStream file=new FileInputStream("Hello.txt");
      }
      catch(FileNotFoundException e){
          System.out.print("No such file found");
          return -1;
      }
      catch(IOException e){
         System.out.print("Doing finally");
      }
      return 0;
   }
}