public class University_Fee {
    public static void main(String[] args){
        int fee = 125000;
        int discount_Percent = 10;

        double discount_Amount = (125000/100)*discount_Percent;

        double finalAmount = fee - discount_Amount;

        System.out.println("The discount amount is INR " + discount_Amount+" and the final discounted fee is INR " + finalAmount);
    }
}
