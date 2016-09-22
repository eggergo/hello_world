import java.util.Scanner;
import java.text.DecimalFormat;
public class zhenyeshouqizhuang {
	public static void main(String[] args){
		System.out.println("welcome to zhenyeshouqizhuang");
		Scanner s1=new Scanner(System.in);
		System.out.println("please input the total money, use yuan as unit");
		double money=s1.nextDouble();
		Scanner s2=new Scanner(System.in);
		System.out.println("please input the total redbag number");
		int num=s2.nextInt();
		DecimalFormat df=new DecimalFormat("#####0.00");//stay %.2f
		int i;
		money-=num*0.01;//to make sure each redbag has at least 0.01 yuan
		for(i=num;i>1;i--){
			double a1=Math.random()*money;//to make a random
			money-=a1;
			System.out.println("the "+ (num-i+1)+" redbag's money is "+df.format(a1+0.01)+" yuan");
		}
		System.out.println("the last redbag's money is "+df.format(money+0.01)+ "yuan");//the left money
	}
}
