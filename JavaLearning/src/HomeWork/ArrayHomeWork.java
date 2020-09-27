package HomeWork;

public class ArrayHomeWork {
	public static void main(String args[]){
		work1();
		work2();
	}
	//work1:输出1-30阶乘的和1!+2!+3!+......+30!;
	public static void work1(){
		double sum1=0;
		for(int j=1;j<=30;j++){
			double sum=1;
			for(int i=1;i<=j;i++){
				sum*=i;
			}
			sum1+=sum;
		}
		System.out.println(sum1);
	}
	//work2：计算整数数组中奇数和偶数的个数
	public static void work2(){
		int[] arr = {1,2,3,4,5,12,14,18,1};
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println("偶数有"+count+"个，奇数有"+(arr.length-count)+"个");
	}
	//work3：将数组{1，2，3，4，0，0，0，5，6，7，8，0，9，0}中的0去掉并生成一个新的数组
}
