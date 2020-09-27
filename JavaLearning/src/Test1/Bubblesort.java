package Test1;
//冒泡排序法
public class Bubblesort {
	/**
	 * @param args
	 * author wzy
	 */
	public  void bubbleSort1(){
		
		int array[] = {9,7,8,1};
		int temp=0;
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]<array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.print("冒泡排序的结果是：");
		for(int m=0;m<array.length;m++){
			System.out.print(" "+array[m]);
		}
		System.out.println();
	}

}
