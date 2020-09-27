package Test1;
//递归
public class Recursive {
	public void recusivtTest(){
		System.out.println("递归的结构是："+sum(100));
	}
	public int sum(int i){
		if(i==1){
			return 1;
		}else{
			return i+sum(i-1);
		}
	}
}

