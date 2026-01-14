package Level_1;

public class VolumeEarth {
    public static void main(String[] args) {
        double radius_Km = 6378;
        double volume_Km3 = (4.0 / 3.0) * Math.PI * Math.pow(radius_Km, 3);
        double radius_Miles = radius_Km * 0.621371;
        double volume_Miles3 = (4.0 / 3.0) * Math.PI * Math.pow(radius_Miles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volume_Km3);
        System.out.println("The volume of earth in cubic miles is " + volume_Miles3);
    }
}
