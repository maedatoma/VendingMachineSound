public class Main{
	public static void main(String[] args) {
		// Interface インスタンスの生成
		InterfaceMan ifm = new InterfaceMan();

		// Quizman インスタンスの実行
		Quizman qm = new Quizman();

		// メソッドを実行
		ifm.start();
		qm.answer();
	}
}