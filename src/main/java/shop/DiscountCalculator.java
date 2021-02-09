package shop;

public class DiscountCalculator {
	
	public static int get(Basket basket, int netPrice) {
		double discount = 0;
		if (basket.getBookQuantity().size() == 2) {
			discount = (double) netPrice - ((double) netPrice * 5 / 100);
		}
		if (basket.getBookQuantity().size() == 3) {
			discount = (double) netPrice - ((double) netPrice * 10 / 100);
		}
		if (basket.getBookQuantity().size() == 1) {
			discount = 0;
		}
		return (int) (discount * 100);
    }
}
