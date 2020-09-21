package Test1;
//二维数组的遍历
public class ArrayTest {
	public void TwoArray(){
		int array[][] = new int[3][5];
		array[0][0]=1;
		array[0][1]=1;
		array[2][4]=1;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}

}
