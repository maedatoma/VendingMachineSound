# VendingMachineSound

音声再生をするアプリ(自動販売機UI)

## 開発環境
	- electron
		- HTML/CSS
			- UI には CSV を使用
		- JavaScript

## branch の命名ルール
	- ユーザ名_YYYYMMDD_X
		- ユーザ名: SlackでのID
		- YYYYMMDD: 日付
			- 例: 2017年6月23日なら「20170623」
		- X: 連番( 最初は 1 )
			- その日の間に複数更新したい場合、連番に 1 を足していく

		- 上記に基づいた例↓
			- sato_20170623_1

## どのようなものか
	- UIは自動販売機を模したもの
	- ボタンをクリックすると音声が流れる