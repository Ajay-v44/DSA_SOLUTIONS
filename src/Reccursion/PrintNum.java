package Reccursion;

public class PrintNum {
    public static void printNum(int num,char op,int max){
        if(op=='+'){
            if(num<=max){
                System.out.println(num);
                printNum(num+1,op,max);
            }
        }else if(op=='-'){
            if(max>num){
                System.out.println(max);
                printNum(num,op,max-1);
            }else {
                System.out.println(num);
            }
        }
    }

    public static int sumToN(int n,int limit,int sum){
        if(n<=limit){
            n=n+1;
            sum=sum+sumToN(n,limit,sum+1);
        }
        return sum;
    }

    public static  int factorial(int num){
        if(num<=1){
            return  1;
        }
        return num*factorial(num-1);
    }
    public static int fibonacciSeries(int i,int limit,int num1,int num2){
        if(i==limit){
            return num1+num2;
        }
        int sum=num1+num2;
        System.out.printf("%d , ",sum);
        return fibonacciSeries(++i,limit,num2,sum);

    }
    public static int sumOfArrayElements(int [] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return arr[i]+sumOfArrayElements(arr,++i);
    }
    public static void main(String[] args) {
        printNum(1,'+',10);
        System.out.println("============================");
        printNum(1,'-',10);
        System.out.println("===========================");
        System.out.println(sumToN(1,5,0));
        System.out.println("=============================");
        System.out.println(factorial(5));
        System.out.println("=============================");
        System.out.print(0 +","+1+",");
        System.out.println(fibonacciSeries(1,5,0,1));
        int[] arr={1,1,1,1,1};
        System.out.println(sumOfArrayElements(arr,0));

    }
}
