import java.io.*;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String f = sc.nextLine();
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}