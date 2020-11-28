package day1;

public class JaFor4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int mile = 22;
		int time = 0;
		int sum = 0;

		System.out.println("隊長:");
		System.out.println("出発進行！");
		System.out.println();

		while (sum < 500) {
			time = time + 1;
			sum = sum + mile;

			System.out.println("隊長:");
			System.out.println(time + "時間たったよ");
			System.out.println();
		}
		System.out.println("到着！");
	}
}
