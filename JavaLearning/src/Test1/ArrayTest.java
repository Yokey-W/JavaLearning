package Test1;

public class ArrayTest {
	//二维数组的遍历
	public void twoArray(){
		int array[][] = new int[3][5];
		array[0][0]=1;
		array[0][1]=1;
		array[2][4]=1;
		System.out.println("数组遍历的结果是：");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
    //数组的复制
	public void copyArray(){
		int arr1[] = {1,2,3,4,5,6,7,8};
		int arr2[] = {10,11,12,13,14,15};
		copy1(arr1,1,arr2,1,5);
		print(arr2);
		System.arraycopy(arr1,1,arr2,1,5);//使用java的数组复制方法
		print(arr2);
	}
	//copy1(源数组名称、源数组开始点、目标数组名称、目标数组开始点、复制长度)
	public int[] copy1(int[] arrfrom,int arrfromstart,int[] arrto,int arrtostart,int length){
		for(int i=0;i<length;i++){
			arrto[arrtostart]=arrfrom[arrfromstart];
			arrtostart++;
			arrfromstart++;
		}
		return arrto;
	}
	public void print(int[] arg){
		System.out.print("数组复制的结果是：");
		for(int i=0;i<arg.length;i++){
			System.out.print(" "+arg[i]);
		}
		System.out.println();
	}
	//Java对数组新特性：可变参数和foreach
	public void changeArray(){
		changeArr(1);
		changeArr(1,2);
		changeArr(1,2,3);
	}
	public void changeArr(int... arg){
		System.out.print("可变参数数组：");
		for(int i=0;i<arg.length;i++){
			System.out.print(" "+arg[i]);
		}
		System.out.println();
		System.out.print("foreach可变参数数组：");
		for(int x:arg){
			System.out.print(" "+x);
		}
		System.out.println();
	}
}
