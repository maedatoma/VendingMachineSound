// 自動販売機の見た目を生成
var svg_Size = 640;

d3.select("#vending")			// ID名resultの要素を指定
	.append("svg")				// svg要素を追加
	.attr("width", svg_Size )	// svg要素の横幅を指定
	.attr("height", svg_Size )	// svg要素の縦幅を指定
	.append("rect")				// 四角形（矩形）を追加。
								// 以後のメソッドは、この四角形（矩形）に対しての設定になる
		.attr("x", 60)					// x座標を指定
		.attr("y", 30)					// y座標を指定
		.attr("width", svg_Size - 120)	// 横幅を指定
		.attr("height", svg_Size - 60)	// 縦幅を指定
		.attr("stroke", "#000000")		// 黒色にする
		.attr("fill", "orange")			// 塗りは橙色にする
		.attr("stroke-width", 2)		// 線幅を指定