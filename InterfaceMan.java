class InterfaceMan{
	// data
	String msg1 = "数値を入力してください >";
	String msg2 = "正解";
	String msg3 = "不正解";
	int num_User;	// 入力した数値

	// method
	// 入力を促す処理
	public void show_Msg_Input(){
		// 入力を促す
		System.out.println( msg1 );

		// 数値を入力する
		num_User = new java.util.Scanner(System.in).nextInt();
	}

	// 入力した回答を返す処理
	public int get_User_Answer(){
		return num_User;
	}

	// 正解を出力する処理
	public void show_Msg_Ok(){
		System.out.println( msg2 );
	}

	// 不正解を出力する処理
	public void show_Msg_No(){
		System.out.println( msg3 );
	}
}