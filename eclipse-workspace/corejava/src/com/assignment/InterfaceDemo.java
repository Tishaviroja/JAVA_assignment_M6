package com.assignment;


	
	interface PaymentGateway 
	{
	    void processPayment(double amount);
	    void refundPayment(double amount);
	}

	class PayPalGateway implements PaymentGateway
	{
	    public void processPayment(double amount)
	    {
	        System.out.println("Processing payment of $" + amount + " through PayPal...");
	    }

	    public void refundPayment(double amount)
	    {
	        System.out.println("Refunding payment of $" + amount + " through PayPal...");
	    }
	}

	class StripeGateway implements PaymentGateway 
	{
	    @Override
	    public void processPayment(double amount)
	    {
	        System.out.println("Processing payment of $" + amount + " through Stripe...");
	    }

	    @Override
	    public void refundPayment(double amount)
	    {
	        System.out.println("Refunding payment of $" + amount + " through Stripe...");
	    }
	}
	public class InterfaceDemo
	{
		public static void main(String[] args)
		{
			PaymentGateway paypal = (PaymentGateway) new PayPalGateway();
	        PaymentGateway stripe = new StripeGateway();

	        paypal.processPayment(150.00); 
	        paypal.refundPayment(50.00);  

	        stripe.processPayment(200.00); 
	        stripe.refundPayment(30.00);
		}
	}


