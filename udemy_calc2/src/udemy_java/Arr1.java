package udemy_java;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		String srr[] = new String[12];
		System.out.println(arr.length);
		System.out.println(srr.length);
		System.out.println(arr);

		arr[0] = 10;
		arr[1] = 4;
		arr[3] = 5;
		arr[4] = 8;
		arr[2] = (int) (Math.random()*100);
		for(int ar: arr) {
			System.out.println(ar);
		}
	}

}
/*
 * 
 * final keyword can be defines with variable- constant method- cannot override
 * class - cannot be inherited
 * 
 * 
 */