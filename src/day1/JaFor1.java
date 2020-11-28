package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaFor1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("数字を入力 >");
		String str = reader.readLine();
		int a = Integer.parseInt(str);

		for(int i= a;i<11;i++) {
			System.out.println(i);
		}
	}

}
