
public class Test {

	public static void main(String[] args) {
		//コンストラクタ1 () 全て個別に指定する
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		//コンストラクタ2 (name,age)  名前と年齢を指定する
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		//コンストラクタ3 (name) 名前のみ、年齢は固定(0)
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		//コンストラクタ4 (age) 年齢のみ、名前は固定(名前無し)
		Person Null = new Person(25);
		System.out.println(Null.name);
		System.out.println(Null.age);
		//コンストラクタ5 (age,name) 年齢と名前を指定する
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}
