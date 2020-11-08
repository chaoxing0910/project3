import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {
		// 7.17 对学生排序
		    Scanner scanner = new Scanner(System.in);
		 
		    int num;
		    System.out.print("请输入学生的个数：");
		    num = scanner.nextInt();
		 
		    String[] name = new String[num];
		    double[] result = new double[num];
		    for (int i = 0; i < num; i++) {
		        System.out.print("请输入第" + (i + 1) + "学生的姓名：");
		        name[i] = scanner.next();
		        System.out.print("请输入第" + (i + 1) + "学生的成绩：");
		        result[i] = scanner.nextDouble();
		    }
		 
		    listSort(result, name, num);
		}
		//排序
		private static void listSort(double[] result, String[] name, int num) {
		    double tmpResult;
		    String tmpName;
		    for (int i = 0; i < num; i++) {
		        for (int j = i; j < num; j++) {
		            if (result[i] < result[j]) {
		                tmpResult = result[j];
		                result[j] = result[i];
		                result[i] = tmpResult;
		 
		                tmpName = name[j];
		                name[j] = name[i];
		                name[i] = tmpName;
		            }
		        }
		    }
		    for (int i = 0; i < num; i++) {
		        System.out.printf("%s %.2f\n", name[i], result[i]);
		    }
		}
}