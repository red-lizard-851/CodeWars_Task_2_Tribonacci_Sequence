import java.util.Arrays;

public class Launcher {

    public static void main(String... args) {
        double[] check1 =  new double [] {1,1,1};
        double[] check2 =  new double [] {0,0,1};
        double[] check3 =  new double [] {0,1,1};
        int length = 10;
        System.out.println(Arrays.toString(Xbonacci.tribonacci(check1, length))); //1,1,1,3,5,9,17,31,57,105
        System.out.println(Arrays.toString(Xbonacci.tribonacci(check2, length))); //0,0,1,1,2,4,7,13,24,44
        System.out.println(Arrays.toString(Xbonacci.tribonacci(check3, length))); //0,1,1,2,4,7,13,24,44,81
    }
}
