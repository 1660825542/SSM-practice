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
    //		���⣺
    //		�١�����mapʵ�֣��������б������key -value ֵ��  
    //		�ڡ�properties�в��Ƿ��ͽṹ�����ǹ̶�����ֵ��������String�ַ���
    //		��Properties�����д��һ��Ԫ�أ���ֵ�ԣ�  map.put(key,value);
    		pro.setProperty("a", "AAAA");
	    	pro.setProperty("b", "BBBB");
	    	pro.setProperty("c", "CCCCC");
//		��properties����л�ȡָ��key��valueֵ     map.get("a")  
//		String value=pro.getProperty("a");
//		System.out.println(value);

//		Enumeration:ö�������͵���������һ�£���Iterator�������������Ǳ������Ǽ��Ͽ�ܣ�Ϊ�˷������������Ԫ�ض����ڵ�
//		keys:��properties�е�����key���أ�������һ��ö����Enumeration
	    	Enumeration<Object> enums=pro.keys();

//		����ö������ʵ���Ͼ��Ǳ�����Properties������key
	    	while(enums.hasMoreElements()){
		    			Object key=enums.nextElement();
		    			System.out.println(key+"::::"+pro.getProperty(key.toString()));
	}

		System.out.println("--------------------------------------------");
		
		try {
//			load������jdk��װ��һ�����������Խ�ָ�������ļ��е�������ֵ��һ����ע�뵽Properties������
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
//				key.getBytes("ISO-8859-1")--->��key����ַ�����ISO-8859-1���뷽ʽȥ���벢��������ֽ����鷽ʽ����
//				new String(key.getBytes("ISO-8859-1"),"UTF-8");��ָ��byte���ݲ�����ʲô���뷽ʽҲ�����Ƿ������룬������Щ���ݰ���UTF-8��ʽȥ���±���
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