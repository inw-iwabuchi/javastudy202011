package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java11 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("国語の点数を入力");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String str = rd.readLine();
		int a = Integer.parseInt(str);
		if (a >= 80) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}