package day08.work;
//定义一个二维数组，查找这个数组中最大值，并输出下标
public class twoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4,8},{5,9,8,5,4,7},{2,99,66,1,0}};
		getMax(arr);
	}

	private static void getMax(int[][]array) {
		int max = array[0][0];
		String index = null;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(max<array[i][j]) {
					max =array[i][j];
					index = i+","+j;
				}
			}
			
		}
		System.out.println("最大值是"+max+"下标"+index);
		
	}
	
}
