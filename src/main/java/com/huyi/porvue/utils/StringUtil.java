package com.huyi.porvue.utils;

import java.io.UnsupportedEncodingException;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.regex.Pattern;
/**
 * 
 * @ClassName: StringUtil 
 * @Description: 字符串工具类
 * @author:huyi
 * @date: 2019年11月10日 下午7:38:12
 */
public class StringUtil {

	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
		public static boolean hasText(String src){
			//str.trim()方法是去掉字符传中的空格
			return src!=null && src.trim().length()>0;
		//TODO 实现代
		}
	
	/**
	 * 
	 * @Title: isBlank 
	 * @Description: 判断是否为空
	 * @param str
	 * @return
	 * @return: boolean
	 * @date: 2019年11月7日下午3:34:21
	 */
	public static boolean isBlank(String str) {
		return (str == null || "".equals(str.trim()));
	}

	/**
	 * 
	 * @Title: isTelphone 
	 * @Description: 判断是否为手机号
	 * @param tel
	 * @return
	 * @return: boolean
	 * @date: 2019年11月7日下午3:39:15
	 */
	public static boolean isTelphone(String tel) {
		return Pattern.matches("^(13[0-9]|14[5|7]|15[0-9]|18[0-9])\\d{8}$", tel);
	}
	
	/**
	 * 
	 * @Title: isEmail 
	 * @Description: 判断是否为邮箱
	 * @param email
	 * @return
	 * @return: boolean
	 * @date: 2019年11月7日下午3:43:35
	 */
	public static boolean isEmail(String email) {
		return Pattern.matches("^^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", email);
	}
	
	/**
	 * 
	 * @Title: isEngils 
	 * @Description: 验证是否为英文
	 * @param str
	 * @return
	 * @return: boolean
	 * @date: 2019年11月7日下午3:46:09
	 */
	public static boolean isEngils(String str) {
		return Pattern.matches("[a-zA-Z]", str);
	}
	
	/**
	 * 
	 * @Title: getRandomStr 
	 * @Description: 获取随机大小写英文字符串
	 * @param n
	 * @return
	 * @return: String
	 * @date: 2019年11月7日下午4:10:05
	 */
	public static String getRandomEnglishStr(int n) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			if (random.nextBoolean()) {
				sb.append((char)('A' + random.nextInt(26)));
			}else {
				sb.append((char)('a' + random.nextInt(26)));
			}
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @Title: getRandomStrAndNumber 
	 * @Description: 获取随机大小写英文和数字字符串
	 * @param n
	 * @return
	 * @return: String
	 * @date: 2019年11月7日下午4:21:45
	 */
	public static String getRandomStr(int n) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			switch (random.nextInt(3)) {
			case 0:
				sb.append((char)('A' + random.nextInt(26)));
				break;
			case 1:
				sb.append((char)('a' + random.nextInt(26)));
				break;
			case 2:
				sb.append(random.nextInt(9));
				break;
			default:
				break;
			}
		}
		return sb.toString();
	}
	/**
	 * 
	 * @Title: getRandomNumber 
	 * @Description: 获取随机数字
	 * @param n
	 * @return
	 * @return: String
	 * @date: 2019年11月16日上午8:51:50
	 */
	public static String getRandomNumber(int n) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			sb.append(random.nextInt(9));
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @Title: GetRandomChinese 
	 * @Description: 获取随机中文字符串
	 * @param n
	 * @return
	 * @return: String
	 * @date: 2019年11月10日下午7:02:35
	 */
	public static String getRandomChinese(int n) {
        int hightPos; //
        int lowPos;
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
        	String str = "";
        	hightPos = (176 + Math.abs(random.nextInt(39)));
        	lowPos = (161 + Math.abs(random.nextInt(93)));
        	
        	byte[] b = new byte[2];
        	b[0] = (Integer.valueOf(hightPos)).byteValue();
        	b[1] = (Integer.valueOf(lowPos)).byteValue();
        	
        	try {
        		str = new String(b, "GBK");
        	} catch (Exception e) {
        		e.printStackTrace();
        		System.out.println("错误");
        	}
			
        	sb.append(str);
		}
//        return str.charAt(0);
        return sb.toString();
	}
	/**
	 * 
	 * @Title: getRandomJianHan 
	 * @Description: 获取随机汉字
	 * @param len
	 * @return
	 * @return: String
	 */
	public static String getRandomJianHan(int len)
    {
        String ret="";
          for(int i=0;i<len;i++){
              String str = null;
              int hightPos, lowPos; // 定义高低位
              Random random = new Random();
              hightPos = (176 + Math.abs(random.nextInt(39))); //获取高位值
              lowPos = (161 + Math.abs(random.nextInt(93))); //获取低位值
              byte[] b = new byte[2];
              b[0] = (new Integer(hightPos).byteValue());
              b[1] = (new Integer(lowPos).byteValue());
              try
              {
                  str = new String(b, "GBk"); //转成中文
              }
              catch (UnsupportedEncodingException ex)
              {
                  ex.printStackTrace();
              }
               ret+=str;
          }
      return ret;
    }
	
	/**
	 * 
	 * @Title: generateChineseName 
	 * @Description: 获取随机姓名
	 * @return
	 * @return: String
	 * @date: 2019年11月16日上午8:38:46
	 */
	public static String generateChineseName() {
		int hightPos; //
		int lowPos;
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		String[] arr = {"赵 ","钱","孙","李","周","吴","郑 ","王","冯","陈","褚","杨","朱","许","何","吕","张","孔","曹","严","华","金","魏"};
		sb.append(arr[random.nextInt(arr.length - 1)]);
		for (int i = 0; i < 2; i++) {
			String str = "";
			hightPos = (176 + Math.abs(random.nextInt(39)));
			lowPos = (161 + Math.abs(random.nextInt(93)));
			
			byte[] b = new byte[2];
			b[0] = (Integer.valueOf(hightPos)).byteValue();
			b[1] = (Integer.valueOf(lowPos)).byteValue();
			
			try {
				str = new String(b, "GBK");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("错误");
			}
			
			sb.append(str);
		}
		
//        return str.charAt(0);
		return sb.toString();
	}
	
	
	

	/**
	 * 
	 * @Title: isNumber 
	 * @Description: 判断是否为数字,包括小数,可选择是否允许负数
	 * @param str
	 * @return
	 * @return: boolean
	 * @date: 2019年11月10日下午7:06:31
	 */
	public static boolean isNumber(String str,boolean allowMiuns){
		if (allowMiuns) {
			return Pattern.matches("^\\-?\\d+(\\.\\d+)?$",str);
		}else {
			return Pattern.matches("^\\d+(\\.\\d+)?$",str);
		}
		
	}
	
	/**
	 * 
	 * @Title: getPlaceholderValue 
	 * @Description: 给定的正则表达式去匹配字符串
	 * @param src
	 * @param regex
	 * @return
	 * @return: String
	 * @date: 2019年11月8日上午9:25:55
	 */
	public static String getPlaceholderValue(String str, String regex){
		Pattern compile = Pattern.compile(regex);
		String string = compile.matcher(str).group();
		return string;
	}
	
	/**
	 * 功能说明：实现判断传入的字符串是否为包含http的url地址
	 */
		
		/**
		 * 验证是否是URL
		 * @param url
		 * @return
		 */
		public static boolean isHttpUrl(String str){
			
			 //转换为小写
	        str = str.toLowerCase();
	        String regex = "^((https|http|ftp|rtsp|mms)?://)"  //https、http、ftp、rtsp、mms
	                + "?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?" //ftp的user@  
	               + "(([0-9]{1,3}\\.){3}[0-9]{1,3}" // IP形式的URL- 例如：199.194.52.184               
	                 + "|" // 允许IP和DOMAIN（域名） 或单域名
	                 + "[0-9a-z]*"  // 或单域名
	                 + "|" // 允许IP和DOMAIN（域名） 或单域名
	                 + "([0-9a-z_!~*'()-]+\\.)*" // 域名- www.  
	                 + "([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\." // 二级域名  
	                + "[a-z]{2,6})" // first level domain- .com or .museum  
	                + "(:[0-9]{1,5})?" // 端口号最大为65535,5位数
	                + "((/?)|" // a slash isn't required if there is no file name  
	                + "(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$";  
	        return  str.matches(regex);	
		}
		
		
		  //随机生成名字
	    public static String getName(){
	        String name = "";
//	        System.out.println(c);
	        for (int i = 0; i <3 ; i++) {
	            char c = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
	            name+=c;
	        }
	        return name;
	    }
	    //随机生成性别
	    public static String getSex(){
	        Random r = new Random();
	        int i = r.nextInt(2);
	        if(i==0){
	            return "男";
	        }else{
	            return "女";
	        }

	    }

	    //随机生成生日
	    public static String getBirthday(){
	        GregorianCalendar gc = new GregorianCalendar();

	        int year = randBetween(1949, 2001);

	        gc.set(gc.YEAR, year);

	        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

	        gc.set(gc.DAY_OF_YEAR, dayOfYear);

	        return gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);
	    }

	    public static int randBetween(int start, int end) {
	        return start + (int)Math.round(Math.random() * (end - start));
	    }
	    //随机生成邮箱
	    public static String getMail(){
	        String [] last = {"@qq.com", "@gmail.com", "@163.com", "@sina.com", "@hotmail.com", "@sohu.com"};
	        StringBuffer sb = new StringBuffer();
	        // 3~20长度，包含3及20
	        int length = 3 + (int) (Math.random() * 9);
	        String word = "";
	        for (int i = 0; i < length; i++) {
	            word += (char) randomChar();
	        }
	        sb.append(word);
	        Random r = new Random();
	        final int j = r.nextInt(6);
	        sb.append(last[j]);
	        return sb.toString();
	    }
	    private static byte randomChar() {
	        // 0<= Math.random()< 1
	        int flag = (int) (Math.random() * 2);// 0小写字母1大写字母
	        byte resultBt;
	        if (flag == 0) {
	            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
	            resultBt = (byte) (65 + bt);
	        } else {
	            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
	            resultBt = (byte) (97 + bt);
	        }
	        return resultBt;
	    }

	    public static int getNum(int start,int end) {
	        return (int)(Math.random()*(end-start+1)+start);
	    }
	    //随机生成电话号码133开头
	    private static String[] telFirst = "133".split(",");
	    public static String getPhone(){
	        int index=getNum(0,telFirst.length-1);
	        String first=telFirst[index];
	        String second=String.valueOf(getNum(1,888)+10000).substring(1);
	        String thrid=String.valueOf(getNum(1,9100)+10000).substring(1);
	        return first+second+thrid;

	    }
		
}




