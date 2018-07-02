//class 処理をプログラミングする
//public class Mp3Player {
//	public void play() {
//		System.out.println("PLAY");
//	}
//	public void stop() {
//		System.out.println("STOP");
//	}
//	public void next() {
//		System.out.println("NEXT");
//	}
//	public void back() {
//		System.out.println("BACK");
//	}	
//}

//interface ルールをプログラミングする
public interface Mp3Player{
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
}