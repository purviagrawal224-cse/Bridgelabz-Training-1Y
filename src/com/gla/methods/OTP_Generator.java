public class OTP_Generator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for(int i = 0; i < 10; i++) otpArray[i] = generateOTP();
        for(int otp : otpArray) System.out.println(otp);
        System.out.println("All OTPs Unique : " + areUnique(otpArray));
    }
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean areUnique(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) return false;
            }
        }
        return true;
    }
}
