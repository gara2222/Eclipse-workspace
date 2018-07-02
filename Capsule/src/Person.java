
public class Person {
	//カプセル化の準備 ※publicをprivateに変更
	private String name = null;
	private int age = 0;
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//カプセル化///////////////////////
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	/////////////////////////////////
}
