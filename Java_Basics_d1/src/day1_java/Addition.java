package day1_java;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER THE NUMBER'S : ");
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        sc.nextLine();
		        System.out.println("ENTER THE NAME : ");
		        String name=sc.nextLine();
		        int c=a+b;
		        System.out.println("ADDITION OF NUMBER'S is "+c+" "+"THE NAME IS :"+name);
			}
}