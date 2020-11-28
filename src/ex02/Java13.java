package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java13 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("数字を入力");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String str = rd.readLine();
		int a = Integer.parseInt(str);
		for(int i = a;i<11;i++) {
			System.out.println(i);
		}
	}

}
