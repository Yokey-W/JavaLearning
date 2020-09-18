package Test1;
public class Bubblesort {
	public static void main(String args[]){
		Bubblesort2 sort = new Bubblesort2(); 
		int array[] = {9,7,8,1};
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]<array[j]){
					int temp=0;
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int m=0;m<array.length;m++){
			System.out.print(" "+array[m]);
		}
		sort.Bubblesort();
	}

}
