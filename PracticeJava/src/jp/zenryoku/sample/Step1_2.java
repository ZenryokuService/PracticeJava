package jp.zenryoku.sample;

/**
 * Step1-2
 * 変数の扱い方のサンプルソース
 * @author ZenryokuService
 */
public class Step1_2 {
	/**
	 * メインメソッド：変数の扱い方のサンプル
	 * 
	 * 【変数の種類】
	 * int型 
	 * @param args
	 */
	public static void main(String[] args) {
		// 変数宣言
		int num1;
		// 変数に値０を再セット、以前の値は削除される
		num1 = 0;

		/* 変数の初期化
		 * 変数の宣言時に、値を代入する
		 * 変数 = 値（代入）
		 */
		int num2 = 10;

		// 1.足し算
		num1 = num1 + num2 + 2;

		// 2.引き算
		num1 = num1 * (num1 - num2);

		// 3.掛け算
		num1 = num1 * 3;

		// 4.割り算
		num1 = num1 / 2;
		// 計算結果を表示
		System.out.println("計算結果" + num1);
	}
}
