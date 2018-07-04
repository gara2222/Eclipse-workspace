
public class Capsule {
	public static void main(String[] args) {
		Person taro = new Person("太郎",20); //インスタンス化
		System.out.println(taro.getName()); //privateの場合、Personクラス内のgetNameをつけること(taro.name → taro.getName())
		System.out.println(taro.getAge()); //privateの場合、Personクラス内のgetAgeをつけること(taro.age → taro.getAge())
		
		//setNameを使う
		taro.setName("花子");
		System.out.println(taro.getName());
	}
}