import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// 7.3 �������ֳ��ִ���
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int [] time =new int [101];
		while(true) {
			int n=input.nextInt();
			if(n==0) //������Ϊ0ʱֹͣ����
				break;
			time[n]+=1;
		}
		for(int i=1;i<=100;i++) {
			if(time[i]>1) //ȡ�������ڴ���1����
				System.out.println(i+" occurs "+time[i]+" times");
			else if(time[i]==1) 
				System.out.println(i+" occurs "+time[i]+" time");
		}
	}

}
