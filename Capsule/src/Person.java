//カプセル化 : プログラムの隠蔽(必要な情報の取得・登録)
public class Person {
	//カプセル化の準備 ※フィールド変数を定義し、publicをprivateに変更して隠蔽
	private String name = null;
	private int age = 0;
	//コンストラクタ
	public Person (String name, int age) { 
		this.name = name;
		this.age = age;
	}
	
	//カプセル化・nameとageを取得(ゲッター)///////////////////////
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	//カプセル化・nameとageを登録(セッター)///////////////////////
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	/////////////////////////////////
	///ゲッター+セッター=アクセッサー
}
/////Javaのスコープ：自分のプログラムをどこまで共有するか
/////Javaプロジェクト>パッケージ 1・2・3・4・5...>クラスファイル(.javaなど)
/////①デフォルト(何も記入しない場合)は、同じパッケージのプログラムだけ見える
/////②publicなら、すべて見える
/////③privateだと、隣のクラスにも他のパッケージにも見えない
/////④protectedだと、同じパッケージの中と、特別に許されたプログラムは見える
/////覚えておきたいものはpublicとprivate