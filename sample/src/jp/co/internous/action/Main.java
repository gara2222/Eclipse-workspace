package jp.co.internous.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int total=gokei();
		System.out.println(total);
		System.out.println(gokei());
		System.out.println(gokei2(5,3));
		System.out.println(circle(5));
		System.out.println(warizan(8,4));
	}
	
	public static int gokei() {
		return 1+1;
	}
	
	public static int gokei2(int number1, int number2){
	return number1+number2;
	}
	
	public static double circle(int hankei) {
		return hankei*hankei*3.14;	
	}
	
	public static int warizan(int number1, int number2) {
		return number1/number2;
		
	}
	
}