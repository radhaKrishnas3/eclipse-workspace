package udemy_java;

public class Arr2 {

	public static void main(String[] args) {
		int[][] myArr = new int[2][3];
		myArr[0][0]=1;
		myArr[0][1]=2;
		myArr[0][2]=3;
		myArr[1][0]=4;
		myArr[1][1]=5;
		myArr[1][2]=6;
		//System.out.println(myArr[0].length);
		
		for(int i=0; i<myArr.length; i++) {
			for(int j=0; j<myArr[i].length; j++) {
				System.out.print(myArr[i][j]+"\t");
			}
		}
	}

}
