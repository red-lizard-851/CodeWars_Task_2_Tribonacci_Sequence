// https://www.codewars.com/kata/556deca17c58da83c00002db

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {
        double[] output = new double[n];
        switch (s.length) {
            case 0: return s;
            default: {
                switch (n) {
                    case 0: return output;
                    case 1: output[0] = s[0]; return output;
                    case 2: output[0] = s[0]; output[1] = s[1]; return output;
                    default: {
                        int i = 0;
                        for (double number : s) {
                            output[i] = number;
                            i = i + 1;
                        }
                        for (int k = 3; k < output.length; k++) {
                            output[k] = output[k - 3] + output[k - 2] + output[k - 1];
                        }
                        return output;
                    }
                }
            }
        }
    }
}

