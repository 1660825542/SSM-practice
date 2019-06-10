package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class W {
    private static Map<String,User> users=new HashMap<String,User>();
    static{
    		Properties pro=new Properties();
    //		特殊：
    //		①、基于map实现，所以其中保存的是key -value 值对  
    //		②、properties中不是泛型结构，而是固定名和值都必须是String字符串
    //		向Properties集合中存放一个元素（名值对）  map.put(key,value);
    		pro.setProperty("a", "AAAA");
	    	pro.setProperty("b", "BBBB");
	    	pro.setProperty("c", "CCCCC");
//		从properties结合中获取指定key的value值     map.get("a")  
//		String value=pro.getProperty("a");
//		System.out.println(value);

//		Enumeration:枚举器，和迭代器功能一致，，Iterator：迭代器，他们本身都不是集合框架，为了方便遍历集合中元素而存在的
//		keys:将properties中的所有key返回，并创建一个枚举器Enumeration
	    	Enumeration<Object> enums=pro.keys();

//		遍历枚举器，实际上就是遍历了Properties中所有key
	    	while(enums.hasMoreElements()){
		    			Object key=enums.nextElement();
		    			System.out.println(key+"::::"+pro.getProperty(key.toString()));
	}

		System.out.println("--------------------------------------------");
		
		try {
//			load方法是jdk封装的一个方法，可以将指定属性文件中的所有名值对一次性注入到Properties集合中
			pro.load(new FileInputStream(new File("C:/phone.properties")));
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			}

		Enumeration<Object> keys=pro.keys();
		
		while(keys.hasMoreElements()){
			String key=keys.nextElement().toString();
			try {
//				key.getBytes("ISO-8859-1")--->将key这个字符串以ISO-8859-1编码方式去编码并将结果以字节数组方式返回
//				new String(key.getBytes("ISO-8859-1"),"UTF-8");将指定byte内容不管是什么编码方式也不管是否是乱码，都将这些内容按照UTF-8方式去重新编码
				String keyStr=new String(key.getBytes("ISO-8859-1"),"UTF-8");
				
				String valueStr=pro.getProperty(key);
				User user=new User(keyStr,valueStr);
				users.put(keyStr, user);		
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Set<String> keys=W.users.keySet();
		for(String key:keys){
			System.out.println(key+"\t"+W.users.get(key));
		}
}
}