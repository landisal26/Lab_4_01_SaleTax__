public class Main {
    public static void main(String[] args)
    {

        double itemPrice = 100.74;
        double tax = ((0.05 * itemPrice)+itemPrice);

        System.out.println("The Price of the items is " +itemPrice);
        System.out.println("Price of Items with Tax is : " +tax);

    }
}