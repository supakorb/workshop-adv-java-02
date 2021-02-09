package shop;

public class PriceCalculator {
	
	public static int get(Basket basket) {
        return basket.getBook().stream().mapToInt(b -> b.getPrice()).sum();
    }
}
