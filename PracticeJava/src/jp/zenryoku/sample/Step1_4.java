package jp.zenryoku.sample;

/**
 * Step1-4:Stringクラスの扱い<br/>
 * クラス型（オブジェクト型）の変数の扱い、メソッドの扱いの練習
 * @see http://takunoji.hatenablog.com/entry/2015/11/05/184839
 * @author ZenryokuService
 */
public class Step1_4 {
	/**
	 * Step1-4のサンプルソース<br/>
	 * 変数flgには true/false のどちらかが入ります<br/>
	 * 下のソースではどちらの値がはいるでしょうか？<br/>
	 * サンプルを起動してみてください<br/>
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("***** String *****");
		// String型の宣言
		String moji = "これは文字列";
		// String.charAt→引数の位置にあるchar型を返却します
		System.out.println("No:" + moji.charAt(4));
		boolean flg = moji.equals("これは数値です");
		System.out.println("boolean = " + flg);

		/***********************
		 * IF分の書き方          *
		 * *********************/
		System.out.println("***** if文の使い方 *****");
		if(flg) {
			// flgの値がtrueのとき
			System.out.println("flg = true");
		} else {
			// flgの値がfalseのとき
			System.out.println("flg = flase");
		}
		if (moji.charAt(2) == 'は') {
			// mojiの２番目が'は’のときは「あたり」を表示
			System.out.println("あたり");
		} else if(moji.charAt(2) == 'れ') {
			// 同様に「れ」のとき
			System.out.println("おしい");
		} else {
			// 上記以外の時
			System.out.println("はずれ");
		}
		/*
		 * switchぶんでは、beak;をいれないと次のcase文も通ってしまう
		 */
		System.out.println("***** switch文の使い方 *****");
		switch(moji.charAt(1)) {
		case 'こ':
			System.out.println("「こ」のとき");
			break;
		case 'れ':
			System.out.println("「れ」のとき");
			break;
		case 'は':// beak;がない
			System.out.println("「は」のとき");
		default:
			System.out.println("その他");
		}
	}
 }
