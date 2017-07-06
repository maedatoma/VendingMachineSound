public class Main{
	public static void main(String[] args) {
		// Interface インスタンスの生成
		InterfaceMan ifm = new InterfaceMan();

		// Quizman インスタンスの実行
		QuizMan qm = new QuizMan();

		// メソッドを実行
			// メッセージを出力させて、回答を保存させる
			ifm.show_Msg_Input();

			// 回答を受け取って、結果を判定する
			int get_Answer = ifm.get_User_Answer();

			// 正解の場合、 InterFaceMan に正解を表示
			if( qm.judge( get_Answer ) ){
				ifm.show_Msg_Ok();

			// そうでない場合
			} else {
				ifm.show_Msg_No();
			}
	}
}