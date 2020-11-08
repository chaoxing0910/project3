import java.util.Scanner;

public class project4 {

	public static void main(String[] args) {
		//7.18冒泡排序
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入十个数：");
	    double[] list = new double[10];
	    for (int i = 0; i < 10; i++) {
	        list[i] = scanner.nextDouble();
	    }
	    arraySort(list);
	    System.out.print("排序后数组为：");
		for(int i=0;i<10;i++) {
			System.out.print(list[i]+" ");
		}
	}
	 
	private static double[] arraySort(double[] list) {
	    double tmp;
	    for (int i = 0; i < list.length - 1; i++) {
	        for (int j = 0; j < list.length - 1 - i; j++) {
	            if (list[j] > list[j + 1]) {
	                tmp = list[j + 1];
	                list[j + 1] = list[j];
	                list[j] = tmp;
	            }
	        }
	    }
	    return list;
	}

}
