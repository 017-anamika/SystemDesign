/*   2. Open-Close Principle 
Software entities (classes, modules, functions) should be:
Open for extension → You can add new functionality when requirements change.
Closed for modification → You should not modify existing, tested code to add that functionality.

EXAMPLE:
A payment system in an app:
If you only supported Credit Card payments and later you need UPI, Wallet, or PayPal →
You should not edit the ShoppingCart class.
You just add new payment classes (UpiPayment, WalletPayment, etc.) that follow the same interface.
*/


interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class ShoppingCart {
    private Payment payment;

    ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    void checkout(double amount) {
        payment.pay(amount);
    }
}

public class OCP {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment());
        cart1.checkout(500);

        ShoppingCart cart2 = new ShoppingCart(new UpiPayment());
        cart2.checkout(300);
    }
}


