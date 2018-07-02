
public class HelloWorld {

	public static void main(String[] args) {

		//HELLO WORLD
		System.out.println("Hello World!");
		
		//文字列型はString
		String name = "林";
		System.out.println(name);
	
		//文字列以外はエラーになるため、""で囲む
		String tel = "080-6537-9000";
		System.out.println(tel);
		
		//char文字型はシングルクォーテーション
		char char1 ='A';
		System.out.println(char1);
		
		//int整数はそのまま
		int num1 =12345;
		System.out.println(num1);
		
		//boolean論理値型は、真偽値を格納する
		boolean boo =true;
		System.out.println(boo);
		
		//String文字列型はシングルクォーテーション
		String str1 ="HELLO WORLD";
		System.out.println(str1);
		
		//floatは整数の前に(float)を定義する
		float a2 = (float)5 / 2;
		System.out.println(a2);
		
		//if文 or = ||, and = &&
		int iff = 10;
		if(iff < 20) {
			System.out.println("A");
		}else{
			System.out.println("B");
		}
		
		//Switch文
		int swt = 1;
		switch(swt) {
		case 0:
			System.out.println("0に等しい");
			break;
		case 1:
			System.out.println("1に等しい");
			break;
		default:
			System.out.println("error!!");
		}
		//配列 
		String[] namelist1 = {"田中","高橋","斉藤"};
		System.out.println(namelist1[0]);		
	
		char[] c = {'x','y','z'};
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		//配列の名前を更新して表示
		String[] station1 = {"大宮", "与野", "浦和"};
		station1[1]="さいたま新都心";
		System.out.println(station1[1]);
		
		//多次元配列
		String[][] Pref1 =
			{
					{"東京","新宿"},
					{"神奈川","横浜"},
					{"埼玉","さいたま"}
			};
		
		System.out.println(Pref1[2][1]);
		
		//for文 for(初期値;条件式;増減式){処理内容}
		for(int i1 = 1; i1 <= 10; i1++) {
			System.out.println(i1);
			System.out.println();
		}
		
		//for文 nずつ増加 += nずつ減少 -=
		int n = 1;
		for(int i2 = 1; i2 <=3; i2+=n) {
			System.out.println(i2);
		}
		
		//条件演算子(三項演算子)  条件式 ? 式1 : 式2
		int joen = 10;
		String kekka1 = joen >= 0 ? "プラス" : "マイナス";
			System.out.println(kekka1);
		int guki = 2;	
		//2で割って余剰が0なら偶数、1あれば奇数
		String kekka2 = guki % 2 == 0 ? "偶数" : "奇数";
			System.out.println(kekka2);
		//上記を応用して☆と★を交互に表示する
		for(int hosi=0; hosi<=5; hosi++) {
			String star = hosi % 2 == 0 ? "☆" : "★";
			System.out.println(star);
		}
		
		//while文によるループ
		int wh1 = 0;
		while (wh1 <= 10) {
			System.out.println(wh1);
			wh1++;
		}
		
		//while文 3ずつ減る
		int wh2 = 10;
		while (wh2 >= 1) {
			System.out.println(wh2);
			wh2-=3;
		}
		
		//do while文 初期値; do{処理内容; 増減式;} while(条件式);
		//必ず一度は実行させたい処理がある場合に使用する
		int dow1 = 0;
		do {
			System.out.println(dow1);
			dow1++;
		} while (dow1 < 10);
		
	//BYE
	}
}
