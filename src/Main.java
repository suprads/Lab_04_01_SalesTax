public class Main {
    public static void main(String[] args)
    {
        int price = 20;
        double tax = .05;

        double total = price + price * tax;
        System.out.println("The total price of an item that is $" + price + " and has " + tax + "% sales tax is $" + total);

    }
}