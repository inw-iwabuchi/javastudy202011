package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		List<Integer> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		int result = 0;
		do {
			System.out.print("整数:");
			String str = reader.readLine();
			a = Integer.parseInt(str);
			list.add(a);
		} while (a != 0);
		System.out.print("入力した整数:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			result += list.get(i);
		}
		System.out.println("合計値:" + result);
	}
}
