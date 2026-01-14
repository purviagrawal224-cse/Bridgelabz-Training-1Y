package Level_1;

public class UniversityFeeUser {
    public static void main(String[] args) {
        int fee = 125000;
        int discount_Percent = 10;
        int discount = (fee * discount_Percent) / 100;
        int final_Fee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + final_Fee);
    }
}
