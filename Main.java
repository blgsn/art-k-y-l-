
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int year,divideYear;
		Scanner input=new Scanner(System.in);
		System.out.print("Yıl giriniz:");
		year=input.nextInt();
		divideYear=year/100;
		if (year%100==0) {
			 if (divideYear % 4==0 )  {
				System.out.println(  year + " yılı bir artık yıldır!");
		}
			 else {
				 System.out.println(  year + " yılı bir artık yıl değildir!");
			 }
			}
		else  { 
			if (year % 4 == 0) {
			System.out.println(  year + " yılı bir artık yıldır!");}
			else {
			System.out.println(  year + " yılı bir artık yıl değildir!");
		}
		}
	}}