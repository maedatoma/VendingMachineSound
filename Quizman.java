class QuizMan{
	// data
	int num_Answer = 11;	// 正解の数値

	// method
	// 入力した内容を持ってきて、正解かどうかを判定する
	public boolean judge( int get_Answer ){
		// 正解かどうかを判定する
		if( get_Answer == num_Answer ){
			return true;
		} else {
			return false;
		}
	}
}