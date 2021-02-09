package shop;

public class DiscountCalculator {
	
	public static int get(Basket basket, int netPrice) {
		double discount = 0;
		if (basket.getBook().size() == 2) {
			discount = (double) netPrice - ((double) netPrice * 5 / 100);
		}
		if (basket.getBook().size() == 3) {
			discount = (double) netPrice - ((double) netPrice * 10 / 100);
		}
		return (int) (discount * 100);
    }
}
