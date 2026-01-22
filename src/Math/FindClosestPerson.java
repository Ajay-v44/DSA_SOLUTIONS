package Math;


public class FindClosestPerson {
    public static int findClosest(int x, int y, int z) {
//        Absolute removes -ve value ensures result is always +ve
        int d1=Math.abs(x-z);
        int d2=Math.abs(y-z);
        if(d1<d2) return 1;
        if(d2<d1) return 2;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findClosest(2,7,4));
    }
}
