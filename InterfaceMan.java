class InterfaceMan{
	// data
	String msg1 = "数を入力してください >";
	String msg2 = "が入力されました";
	int num;

	// method
	public void start(){
		// 入力を促す
		System.out.println( msg1 );
		num = new java.util.Scanner(System.in).nextInt();

		// 入力内容を表示
		System.out.println( num + msg2 );
	}
}