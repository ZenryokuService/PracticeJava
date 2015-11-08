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

	/**
	 * 問3のサンプルソース
	 * このメソッドを書き換えずに
	 * 「edcba」と表示させてください
	 */
	public void mondai3() {
		// char型の配列
		char[] ch = {'a', 'b', 'c', 'd', 'e'};
		char[] result = sortChar(ch);

		System.out.println("答え："
				+ result[0] + result[1] + result[2] + result[3] + result[4]);
	}

	/**
	 * 問3の配列をソートするメソッド
	 * ここのソースをjp.zenryoku.sample以下に
	 * コピーして作成してください
	 * @param ch
	 * @return char[] ソートを完了した配列
	 */
	private char[] sortChar(char[] ch) {
		
		return ch;
	}

	/**
	 * 問4：メソッドhenshuを書き換えて
	 *     答えに40を表示してください
	 */
	public void mondai4() {
		// int型の配列
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int kekka = 0;
		// 配列の編集処理
		nums = henshu(nums);
		/*
		 * 繰り返しのFOR文
		 * 配列を０番目から最後まで繰り返し処理を行う
		 */
		for(int i=0; i < nums.length; i++) {
			kekka += nums[i];
		}
		System.out.println("答え：" + kekka);
	}
	/**
	 * 問4の配列を編集するメソッド
	 * ここのソースをjp.zenryoku.sample以下に
	 * コピーして作成してください
	 */
	private int[] henshu(int[] nums) {
		return nums;
	}
}
