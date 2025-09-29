package UdemyJavaSpringBoot;

public class ForEach {
    public static void main(String[] args) {
        int[] arr={45, 22, 89, 16, 90, 33};
        int small=arr[0];int large=arr[0];
        for(int num:arr){
            if(num>large)
                large=num;
            if(num<small)
                small=num;
        }
        System.out.printf("Smallest: %d \n Largest: %d",small,large);
    }
}
