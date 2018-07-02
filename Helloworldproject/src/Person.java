import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	public static void main(String[]args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("入力してください");
	String t = br.readLine();
	System.out.println(t);}
	
	public String name = null;
	public int age = 0;
	public String address = "東京";
	public String phoneNumber = "090-0000-0000";
	public void talk() {
		System.out.println(this.name + "が話す");
	}
	public void live() {
		System.out.println(this.address + "に住んでいるらしい");
	}
	public void walk() {
		System.out.println(this.name + "があるき出した");
	}
	public void run() {
		System.out.println("そして、" + this.name + "が走る");
	}
	
}
