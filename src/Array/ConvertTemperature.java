package Array;

import java.util.Arrays;

public class ConvertTemperature {
    public static double[] convertTemperature(double celsius) {
        final double con=273.15;
        double[] temperature=new double[2];
        temperature[0]=celsius+con;
        temperature[1]=celsius*1.80+32;
        return temperature;
    }

    static void main() {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }
}
