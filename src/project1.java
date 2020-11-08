import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// 7.3 计算数字出现次数
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int [] time =new int [101];
		while(true) {
			int n=input.nextInt();
			if(n==0) //当输入为0时停止输入
				break;
			time[n]+=1;
		}
		for(int i=1;i<=100;i++) {
			if(time[i]>1) //取出数组内大于1的数
				System.out.println(i+" occurs "+time[i]+" times");
			else if(time[i]==1) 
				System.out.println(i+" occurs "+time[i]+" time");
		}
	}

}
