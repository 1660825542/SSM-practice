package com.rock.ssm.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName		:com.rock.ssm.entities 	Message.java
 * TODO			:
 * Copyright	:Copyright (c) 2015-2016 All Rights Reserved. Company: 01skill-soft.com Inc.
 * @author: 	:����
 * @Date		:2019��4��28��:����10:23:51
 * @version 	:1.0
 * 
 *           Modification History: Date			Author 		Version 	Description
 *           ----------------------------------------------------------------------
 *           					   2019��4��28�� 	���� 			1.0 		1.0 Version
 * 
 */
public class Message {
//	��ǰ����Ĵ��������������� ����ǰ�����ɹ��ģ�ʧ�ܣ�
	private String info;
//	Լ����ǰ�����ɹ����
//	1���ɹ�
//	-1��ʧ��
	private int code;
//	���ڴ�����List�������ݵ�
	private Map<String,Object> dbinfo=new HashMap<>();
	
	public static Message success(){
		Message msg=new Message();
		msg.setCode(1);
		msg.setInfo("��ϲ�㣬��ǰ������ɹ�");
		return msg;
	}
	public static Message fail(){
		Message msg=new Message();
		msg.setCode(-1);
		msg.setInfo("��Ǹ�㣬��ǰ������ʧ��");
		return msg;
	}
	public Message add(String key ,Object value){
		this.getDbinfo().put(key, value);
		return this;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Map<String, Object> getDbinfo() {
		return dbinfo;
	}

	public void setDbinfo(Map<String, Object> dbinfo) {
		this.dbinfo = dbinfo;
	}
	
	@Override
	public String toString() {
		return "Message [info=" + info + ", code=" + code + ", dbinfo=" + dbinfo + "]";
	}
	
	
	
}
