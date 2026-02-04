public class Volume_Of_Earth {
    public static void main(String[] args) {
        double radius_Km = 6378;
        double pi = Math.PI;

        double volume = (4.0 / 3.0) * pi * Math.pow(radius_Km, 3);

        double r = radius_Km * 0.621371;

        double Vm = (4.0 / 3.0) * pi * Math.pow(r, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volume+" and cubic miles is " + Vm);
    }
}
