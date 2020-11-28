package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java12 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("英語の点数を入力");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String eng = rd.readLine();
		int a = Integer.parseInt(eng);
		System.out.print("数学の点数を入力");
		String mat = rd.readLine();
		int b = Integer.parseInt(mat);
		if (a == 100 && b == 100) {
			System.out.println("満点です");
		} else if (a >= 80 && b >= 80) {
			System.out.println("良く出来ました");
		} else if (a >= 80 || b >= 80) {
			System.out.println("もう少し頑張ろう");
		} else {
			System.out.println("再試験は明日です");
		}

	}

}
