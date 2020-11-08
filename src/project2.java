import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// 7.5 打印不同的数
		System.out.print("Enter 10 numbers: ");
		Scanner input = new Scanner(System.in);
		int [] num =new int [10];
		int [] number=new int [10];
		int n,i,j;
		for(i=0;i<10;i++) {
			num[i]=input.nextInt();
		}
		//如果后面的数等于前面的数,就把后面的赋值为0
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(num[i]==num[j])
				{
					num[j]=0;
				}
			}
		}
		for(i=0,j=0;i<num.length;i++)
		{
			if(num[i]!=0)
			{
				number[j]=num[i];
				j++;
			}
		}
		for(i=0;i<j;i++) {
			System.out.print(number[i]+" ");
		}
	}
}
