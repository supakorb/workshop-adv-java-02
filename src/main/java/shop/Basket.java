package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {

	private List<Book> books = new ArrayList<>();
	private Map<String, Integer> bookQuantity = new HashMap<>();
	private int netPrice;
	private int discountPrice;

	public void addBook(Book book) {
		books.add(book);
		
		if (bookQuantity.containsKey(book.getName())) {
			int qty = bookQuantity.get(book.getName()).intValue();
			bookQuantity.put(book.getName(), Integer.valueOf(qty + 1));
		} else {
			bookQuantity.put(book.getName(), Integer.valueOf(1));
		}
	}
	
	public List<Book> getBook() {
		return books;
	}

	public Map<String, Integer> getBookQuantity() {
		return bookQuantity;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
}
