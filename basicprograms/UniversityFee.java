public class UniversityFee {
    public static void main(String[] args){
        int fee = 125000;
        int discount_Percent = 10;

        double discount_Amount = (125000/100)*10;

        double finalAmount = fee - discount_Amount;

        System.out.println("The discount amount is INR " + discount_Amount);
        System.out.println("The final amount is INR " + finalAmount);
    }
}
