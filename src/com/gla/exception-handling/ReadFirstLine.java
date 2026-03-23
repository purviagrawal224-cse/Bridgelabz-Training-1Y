import java.io.*;
public class ReadFirstLine {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String s = br.readLine();
            System.out.println(s);
        }
        catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}