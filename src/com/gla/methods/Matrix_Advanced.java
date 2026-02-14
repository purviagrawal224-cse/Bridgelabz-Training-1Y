import java.util.Scanner;
public class Matrix_Advanced {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=sc.nextInt();
        display(m);
        display(transpose(m));
        if(r==2&&c==2) display(inverse2x2(m));
        else if(r==3&&c==3) display(inverse3x3(m));
        sc.close();
    }
    static int[][] transpose(int[][] a){
        int[][] t=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) t[j][i]=a[i][j];
        return t;
    }
    static double[][] inverse2x2(int[][] a){
        double det=a[0][0]*a[1][1]-a[0][1]*a[1][0];
        if(det==0) return null;
        return new double[][]{{a[1][1]/det,-a[0][1]/det},{-a[1][0]/det,a[0][0]/det}};
    }
    static double[][] inverse3x3(int[][] a){
        double det=a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]) -a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]) +a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        if(det==0) return null;
        double[][] inv=new double[3][3];
        inv[0][0]=(a[1][1]*a[2][2]-a[1][2]*a[2][1])/det;
        inv[0][1]=(a[0][2]*a[2][1]-a[0][1]*a[2][2])/det;
        inv[0][2]=(a[0][1]*a[1][2]-a[0][2]*a[1][1])/det;
        inv[1][0]=(a[1][2]*a[2][0]-a[1][0]*a[2][2])/det;
        inv[1][1]=(a[0][0]*a[2][2]-a[0][2]*a[2][0])/det;
        inv[1][2]=(a[0][2]*a[1][0]-a[0][0]*a[1][2])/det;
        inv[2][0]=(a[1][0]*a[2][1]-a[1][1]*a[2][0])/det;
        inv[2][1]=(a[0][1]*a[2][0]-a[0][0]*a[2][1])/det;
        inv[2][2]=(a[0][0]*a[1][1]-a[0][1]*a[1][0])/det;
        return inv;
    }
    static void display(int[][] a){
        for(int[] r:a){for(int v:r) System.out.print(v+"\t");System.out.println();}
    }
    static void display(double[][] a){
        if(a==null){System.out.println("No inverse"); return;}
        for(double[] r:a){for(double v:r) System.out.printf("%.2f\t",v);System.out.println();}
    }
}
