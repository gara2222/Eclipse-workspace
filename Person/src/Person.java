//Testクラスのコンストラクタ(窓口)
public class Person {
	//フィールド変数
	public String name = null;
	public int age = 0;
	
	//コンストラクタ1 (デフォルトコンストラクタ)
	public Person() {}
	
	//コンストラクタ2 (文字列 名前, 整数 年齢)
	public Person(String name, int age) {
		this.name = name;	//変数フィールドのnameに上記したnameを代入
		this.age = age;		//変数フィールドのageに上記したageを代入
	}
		
	//コンストラクタ3
	public Person(String name) {
		this.name = name;
		this.age = 0;
	}
	
	//コンストラクタ4
	public Person(int age) {
		this.name = "名前無し";
		this.age = age;
	}
	
	//コンストラクタ5
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
}

//※コンストラクタを多重定義することをオーバーロードという
