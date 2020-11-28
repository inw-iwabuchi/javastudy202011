package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jalf2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("英語の手数を入力");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String eng = reader.readLine();
		int a = Integer.parseInt(eng);

		System.out.println("数学の点数を入力");
		String ma = reader.readLine();
		int b = Integer.parseInt(ma);

		if (a == 100 && b == 100) {
			System.out.println("満点です");
		} else if (a >= 80 && b >= 80) {
			System.out.println("よくできました");
		} else if (a >= 80 || b >= 80) {
			System.out.println("もう少し頑張ろう");
		} else {
			System.out.println("再試験は明日です");
		}
	}
}
