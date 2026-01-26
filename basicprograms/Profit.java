public class Profit {
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = 191 - 129;

        double profitPercent = (profit*100)/costPrice;

        System.out.println("The cost price is INR " + costPrice + "\nThe selling price is INR " + sellingPrice + "\nThe profit is INR " + profit + "\nThe profit percent is " + profitPercent);
    }
}
