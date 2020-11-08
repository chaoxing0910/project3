import java.util.Arrays;
import java.util.Scanner;

public class project8 {

	public static void main(String[] args) {
		// 7.31合并两个有序列表
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter list1 size and contents:");
	    int[] list1 = new int[scanner.nextInt()];
	    for (int i = 0; i < list1.length; i++) {
	        list1[i] = scanner.nextInt();
	    }
	    System.out.print("Enter list2 size and contents:");
	    int[] list2 = new int[scanner.nextInt()];
	    for (int i = 0; i < list2.length; i++) {
	        list2[i] = scanner.nextInt();
	    }
	    System.out.println("list1 is " + Arrays.toString(list1));
	    System.out.println("list2 is " + Arrays.toString(list2));
	    System.out.print("The merged list is " + Arrays.toString(merge(list1, list2)));
	}

	private static int[] merge(int[] list1, int[] list2) {
	    int[] newList = new int[list1.length + list2.length];
	    System.arraycopy(list1, 0, newList, 0, list1.length);
	    System.arraycopy(list2, 0, newList, list1.length, list2.length);
	    Arrays.sort(newList);
	    return newList;
	}
}
