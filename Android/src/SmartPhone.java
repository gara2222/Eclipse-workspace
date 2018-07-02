
public class SmartPhone extends Mp3Player{
	public void call() {
		System.out.println("CALL");
	}
	public void mail() {
		System.out.println("MAIL");
	}
	public void photo() {
		System.out.println("PHOTO");
	}
	public void internet() {
		System.out.println("INTERNET");
	}

	//////OverRides
	public void play() {
		System.out.println("PLAY HI-RES");
	}
	public void stop() {
		System.out.println("STOP HI-RES");
	}
	public void next() {
		System.out.println("NEXT HI-RES");
	}
	public void back() {
		System.out.println("BACK HI-RES");
	}
}

