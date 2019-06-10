package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import Morethread.Main;

public class Text {
		private static Map<String, User> users=new HashMap<String, User>();
		
		static{
			Properties pro =new Properties();
			try {
				pro.load(new FileInputStream(new File("C:/phone.properties")));
				pro.save(new FileOutputStream(new File("C:/phone.properties")), "");
			
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
			Enumeration<Object> keys=pro.keys();
			while(keys.hasMoreElements())
			{
				String s=(String)keys.nextElement();
				try {
					String k=new String(s.getBytes("ISO-8859-1"),"UTF-8");
					String v=pro.getProperty(k);
					System.out.println(k+"------"+v);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				
				
			}
		}
		public static void main(String[] args) {
			//new Text();
			
			String s="123456789";
			String [] f=s.split("3");
			System.out.println(Arrays.toString(f));
		}
}
