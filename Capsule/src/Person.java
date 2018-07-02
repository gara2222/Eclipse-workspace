
public class Person {
	//カプセル化の準備 ※publicをprivateに変更
	private String name = null;
	private int age = 0;
	
	//カプセル化///////////////////////
	public String getName() {
		return this.name;	
	
	}
	public void setName(String name, int age) {
		this.name = "太郎";
		this.age = 0;
	}
	/////////////////////////////////
}
