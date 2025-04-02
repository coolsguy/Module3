package module3;

import java.util.Scanner;

public class WeeklyIncome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Weekly Gross Income: $");
		double income = scanner.nextDouble();
		double firstBracketRate = 0.90;	//The displayed rate is actually the difference between the real rate and 100%
		double firstBracketResult = income * firstBracketRate;
		double secondBracketRate = 0.85; //The displayed rate is actually the difference between the real rate and 100%
		double secondBracketResult = income * secondBracketRate;
		double thirdBracketRate = 0.80; //The displayed rate is actually the difference between the real rate and 100%
		double thirdBracketResult = income * thirdBracketRate;
		double fourthBracketRate = 0.70; //The displayed rate is actually the difference between the real rate and 100%
		double fourthBracketResult = income * fourthBracketRate;
		
		if(income < 500)
		{
		System.out.println("Weekly Net Income: $" + firstBracketResult);
		}
		if(income >= 500 && income < 1500)
		{
		System.out.println("Weekly Net Income: $" + secondBracketResult);
		}
		if(income >= 1500 && income < 2500)
		{
		System.out.println("Weekly Net Income: $" + thirdBracketResult);
		}
		if(income >= 2500)
		{
		System.out.println("Weekly Net Income: $" + fourthBracketResult);
		}
	}

}
