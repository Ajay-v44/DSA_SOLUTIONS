package UdemyJavaSpringBoot;

public class Loop {
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for(int i=1;i<=5;i++)
            System.out.printf("%d ",i);
        // TODO: Print numbers 1 to 5 using while loop
        int i=1;
        System.out.print("\nWhile Loop: ");
        while(i<6){
            System.out.printf("%d ",i);
            i++;
        }
        // TODO: Print numbers 1 to 5 using do-while loop
        i=1;
        System.out.print("\nDo-While Loop: ");
        do{
            System.out.printf("%d ",i);
            i++;
        }while(i<5);

    }
}
