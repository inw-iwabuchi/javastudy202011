package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Java22 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		boolean flg = true;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		while (flg) {
			System.out.print("整数:");
			String str = rd.readLine();
			int a = Integer.parseInt(str);
			list.add(a);
			sum = sum + a;
			if (a == 0) {
				flg = false;
				System.out.print("入力した整数:");
				for(int num:list) {
					System.out.print(num + " ");
				}
				System.out.println();
				System.out.print("合計値:" + sum);
			}
		}
	}
}
