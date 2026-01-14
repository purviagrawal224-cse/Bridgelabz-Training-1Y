public class Profit_percentage {
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = 191 - 129;

        double profitPercent = (profit*100)/costPrice;

        System.out.println("The cost price is INR " + costPrice + "\n The selling price is INR " + sellingPrice + "\n The profit is INR " + profit + "\n The profit percent is " + profitPercent);
    }
}
