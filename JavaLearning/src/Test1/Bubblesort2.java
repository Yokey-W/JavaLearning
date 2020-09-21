package Test1;
//冒泡排序法
public class Bubblesort2 {
	public void Bubblesort(){
		int array[]={1,3,6,8,9,5,9,0};
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int m=0;m<array.length;m++){
			System.out.print(" "+array[m]);
		}
	}

}
