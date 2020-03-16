package com.huyi.porvue.utils;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Random;
/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author:huyi
 * @date: 2019年11月8日 下午2:04:32
 */
public class RandomUtil {

	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		
		Random ran = new Random();
		//bound范围的意思
		//括号里填什么就是控制在什么范围之内 
		int i = ran.nextInt(max-min+1)+min;
		
		return i;
	}
	//返回数组中的随机一个数
	public static int returnOne(int [] arr){
		int random = RandomUtil.random(0, arr.length-1);
		return arr[random];
	}
	public static void main(String[] args) {
		
		
		//list type = service.gettype();
		//[{id:1,name:运营部},.....,{id:11,name:财务部}]
		//获取list中的所有id，转成数组，调用工具类传进数组
		int arr [] = {1,2,3,4,5};
		int returnOne = returnOne(arr);
		System.out.println(returnOne);
		
	}
	
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int [] subRandom (int min, int max, int subs){
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		//当集合长度不满足你需要的5个随机数，就去重并放到set集合中
		while(set.size()!=subs){
			set.add(RandomUtil.random(min, max));
		}
		
		
		//相当于数组下标
		int j = 0;
		
		//循环将集合中的值放进数组中，并返回数组
		//声明数组长度  subs=5，arr就需要五个数，  返回的数据里边也就需要返回包含5个数的数组
		int[] arr = new int[subs];
		for (int i : set) {
			arr[j++]=i;
		//	arr[0]=1;
		//  arr[1]=19
		//	arr[2]=4
		}	
		
		
		return arr;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLMNBVCXZ";
		return str.charAt(random(0, str.length()-1));
		
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	//相当于页面的验证码
	public static String randomString(int length){
		String str = "";
		for (int i = 0; i <length; i++) {
			str+=randomCharacter();
		}
		
		return str;
	}

	public static Boolean isNum(String str){
		
		String s="^[0-9]+(\\.[0-9]+)?$";
		return str.matches(s);
	}
	//传入两个数字，返回百分比
	public static String getbfb(Integer number1,Integer number2) {
		//创建数值格式化对象
		NumberFormat numberFormat = NumberFormat.getInstance();
		//设置小数点后几位
		numberFormat.setMaximumFractionDigits(0);		
		//计算
		String format = numberFormat.format((float)number1/(float)number2*100);
		
		
		return format;
	}
	
	/**
	 * 
	 * @Title: getRandomNum 
	 * @Description: 生成一个随机数
	 * @return
	 * @return: int
	 */
	public static int getRandomNum() {

		int random=(int)(Math.random()*10+1);
		return random;
	}
	
	/**
	 * 
	 * @Title: getRandomNum 
	 * @Description: 生成n位随机数字
	 * @param n:代表生成数字的位数
	 * @return
	 * @return: String
	 */
	public static String getRandomNum(int n) {
		
		String str="";
		//循环生成一个数字，再用字符串把他们拼接在一起
		for (int i = 0; i < n; i++) {
			int random=(int)(Math.random()*10);
			str += random;
		}
		
		return str;
	}
}
