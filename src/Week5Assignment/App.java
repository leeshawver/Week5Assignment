package Week5Assignment;

public class App {

	public static void main(String[] args) {
		AsteriskLogger asterLog = new AsteriskLogger();
		asterLog.Log("我喜欢吃冰淇淋");
		asterLog.Error("对不起你的编程坏了");

		SpacedLogger spacedLog = new SpacedLogger();
		spacedLog.Log("Hello");
		spacedLog.Error("Hello");
		
	}

}
