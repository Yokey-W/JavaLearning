package Test1;
//String比较
public class StringCompare {
	String str1="hello";
	String str4="HELLO";
	String str2=new String("hello");
	String str3=str2;
	public void result(){
		boolean result1 = compare1(str1,str2);
		boolean result2 = compare1(str2,str3);
		boolean result3 = compare2(str1,str2);
		boolean result4 = compare3(str1,str4);
		System.out.println("第一次比对的结果是："+result1);
		System.out.println("第二次比对的结果是："+result2);
		System.out.println("第三次比对的结果是："+result3);
		System.out.println("第四次比对的结果是："+result4);
	}
	public boolean compare1(String str1,String str2){//使用“==”进行比较
		if(str1==str2){
			return true;
		}else{
			return false;
		}
	}
	public boolean compare2(String str1,String str2){//使用“.equals”进行比较
		if(str1.equals(str2)){
			return true;
		}else{
			return false;
		}
	}
	public boolean compare3(String str1,String str2){//使用“.equalsIgnore”进行比较
		if(str1.equalsIgnoreCase(str2)){
			return true;
		}else{
			return false;
		}
	}
}
