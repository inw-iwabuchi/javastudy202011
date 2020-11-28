package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaFor2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("数字を入力 >");
		String str = rd.readLine();
		int a = Integer.parseInt(str);

		for (int j = 0; j < a; j++) {

			for (int i = 0; i < a; i++) {
				System.out.print("▲");
			}
			System.out.println();
		}
	}
}
