

public class Human {
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.address);
		System.out.println(taro.phoneNumber);
		taro.talk();
		taro.live();
		taro.walk();
		taro.run();
	}


}
