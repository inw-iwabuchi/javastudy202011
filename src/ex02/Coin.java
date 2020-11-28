package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int num = 1000;
		CoinCase coincase = new CoinCase();
		System.out.println("現在ケースには" + num + "円入っています");
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("どの硬貨を入れますか？(500,100,50,10,1) >");
		String in = rd.readLine();
		int a = Integer.parseInt(in);
		System.out.print("何枚入れますか？ >");
		String inn = rd.readLine();
		int b = Integer.parseInt(inn);
		System.out.println(coincase.addCoin(a, b) + "円をケースに入れました");
		coincase.totalVal();
	}

}
