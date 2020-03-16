package com.huyi.porvue.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流的工具类
 * @author:huyi
 * @date: 2019年11月8日 上午9:21:14
 */
public class StreamUtil {

	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... autoCloseables){
		//判断可变参数是否有值，如果有值就循环关闭流
		if(null!=autoCloseables && autoCloseables.length>0){
			for (AutoCloseable autoCloseable : autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		
		String str= "";
		
		byte[] b = new byte[1024];
		int x= 0;
		try {
			while((x=src.read(b))!=-1){
				str+= new String(b, 0, x, "utf-8");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关流
			closeAll(src);
		}
		
		return str;
	}
	
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/

	public static String readTextFile(File textFile){
		
		try {
			return readTextFile(new FileInputStream(textFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	/**
	 * @Title: readFile
	 * @Description: 读取文件内容
	 * @param file
	 * @param charset
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readFile(File file, String charset) throws IOException {
		// 创建输出流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
		// 定义缓冲对象
		StringBuffer sb = new StringBuffer();
		// 定义读取每行的结果
		String content = null;
		// 循环读取
		while ((content = br.readLine()) != null) {
			// 加入缓冲对象
			sb.append(content);
		}
		// 关闭流
		br.close();
		// 返回结果
		return sb.toString();

	}
}
