package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java15 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		System.out.println("隊長");
		System.out.println("サバ缶を50個以上袋に詰めてください。");
		System.out.println();
		for (int i = 3; i > 0; i--) {
			System.out.println("隊長");
			System.out.println("あと" + i + "回！");
			System.out.println();
			System.out.print("袋に何個入れますか？＞");
			System.out.println();
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			String str = rd.readLine();
			int a = Integer.parseInt(str);
			sum = sum + a;
		}
		if (sum > 50) {
			System.out.println("隊長");
			System.out.println("OK!これで探検ができるぞ");
		} else {
			System.out.println("隊長");
			System.out.println("足りてないから...");
		}

	}
}
