package domain;

import java.util.*;

public class Sale {
	private List<SaleLineItem> lineItems = new ArrayList<>();
	private boolean isComplete = false;
	private Payment payment;

	public float getBalance()
	{
		return payment.getAmount() - total();
	}

	public void becomeComplete()
	{
		isComplete = true;
	}

	public boolean isComplete() { return isComplete; }

	public void makeLineItem( ProductSpecification spec, int quantity )
	{
		lineItems.add( new SaleLineItem( spec, quantity ) );
	}

	public float total()
	{
		float total = 0;
		for (SaleLineItem item : lineItems) {
			total += item.subtotal();
		}
		return total;
	}

	public void makePayment( float cashTendered )
	{
		payment = new Payment( cashTendered );
	}
}
