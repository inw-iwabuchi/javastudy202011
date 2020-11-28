package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaFor3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("隊長:");
		System.out.println("サバ缶を５０個以上袋に詰めてください");

		int sum = 0;
		for (int i = 3; i > 0; i--) {
			System.out.println("隊長:");
			System.out.println("あと" + i + "回！");
			System.out.print("袋に何個入れますか？ >");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			int a = Integer.parseInt(str);
			sum = sum + a;
		}
		if (sum> 50) {
			System.out.println("隊長:");
			System.out.println("OK!さあこれで探索ができるぞ！");
		} else {
			System.out.println("隊長:");
			System.out.println("いや、足りてないから...");
		}
	}

}
