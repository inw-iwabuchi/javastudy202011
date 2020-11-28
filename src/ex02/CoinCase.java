package ex02;

public class CoinCase {

	/** 500円の枚数 */
	private int coin500;

	/** 100円の枚数 */
	private int coin100;

	/** 50円の枚数 */
	private int coin50;

	/** 5円の枚数 */
	private int coin5;

	/** 1円の枚数 */
	private int coin1;

	public int getCoin500() {
		return coin500;
	}

	public void setCoin500(int coin500) {
		this.coin500 = coin500;
	}

	public int getCoin100() {
		return coin100;
	}

	public void setCoin100(int coin100) {
		this.coin100 = coin100;
	}

	public int getCoin50() {
		return coin50;
	}

	public void setCoin50(int coin50) {
		this.coin50 = coin50;
	}

	public int getCoin5() {
		return coin5;
	}

	public void setCoin5(int coin5) {
		this.coin5 = coin5;
	}

	public int getCoin1() {
		return coin1;
	}

	public void setCoin1(int coin1) {
		this.coin1 = coin1;
	}

	public void totalVal() {
		int sum = 0;
		sum = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin5 * 5) + coin1;
		System.out.println(sum);
	}


	public int addCoin(int kind, int number) {

		if (kind == 500) {
			coin500 = number;
		} else if (kind == 100) {
			coin100 = number;
		} else if (kind == 50) {
			coin50 = number;
		} else if (kind == 5) {
			coin5 = number;
		} else {
			coin1 = number;
		}

		int sum = 0;
		sum = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin5 * 5) + coin1;
		return sum;
	}

}
