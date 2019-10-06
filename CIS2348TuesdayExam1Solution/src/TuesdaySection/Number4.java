package TuesdaySection;
/**
 * The question asks to write a java program that calculates the total sale
 * of Bob and Alice's order from Einstein Bros Bagels. It also wants an
 * itemized printout of the receipt.
 * */

public class Number4 {
    public static void main(String agrs[]){
        /* Initialize variables */
        double costOfAvocadoToast = 4.25;
        double costOfEggSandwich = 4.75;
        double costOfCoffee = 1.75;
        double costOfMocha = 3.25;
        double salesTax = 0.03; //sales tax is 3%

        /* Bob's order - Avocado toast & coffee*/
        double bobOrder = costOfAvocadoToast + costOfCoffee;

        /* Alice's order - Egg sandwich & large mocha */
        double aliceOrder = costOfEggSandwich + costOfMocha;

        /* Add two orders together */
        double totalOrderNoTax = bobOrder + aliceOrder;

        /* Calculate total sale with tax */
        double totalWithTax = (totalOrderNoTax * salesTax) + totalOrderNoTax;

        /* Print out receipt to user */
        System.out.println("Einstein Bros Bagel Sales Receipt: ");
        System.out.println("-------------------------------------");

        /* This prints out an itemized list of Alice & Bob's orders */
        System.out.println("Avocado Toast: $" + costOfAvocadoToast);
        System.out.println("Regular Coffee: $" + costOfCoffee);
        System.out.println("Egg Sandwich: $" + costOfEggSandwich);
        System.out.println("Large Mocha: $" + costOfMocha);
        System.out.println("--------------------------------------");

        /* This prints out the subtotal of Alice & Bob's orders and the sales tax*/
        System.out.println("Subtotal: $" + totalOrderNoTax);
        System.out.println("Sales Tax: $" + (totalOrderNoTax * salesTax));
        System.out.println("--------------------------------------");

        /* This prints outs the total sale of their order */
        System.out.println("Total sale: $" + totalWithTax);
    }

}
