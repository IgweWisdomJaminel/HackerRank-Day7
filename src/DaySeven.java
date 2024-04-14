import java.util.Scanner;

public class DaySeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a= new int[n];


     for(int i=0; i<a.length; i++) {
      a[i]=sc.nextInt();



     }
        for(int j=a.length-1;j>=0;j--){
            System.out.println(a[j]);
        }










    }
}
