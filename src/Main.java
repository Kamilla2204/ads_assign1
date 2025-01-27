import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // Loop that displays menu of tasks
        while (!exit) {
            System.out.println("-------------------------------------");
            System.out.println("Problem 1");
            System.out.println("Problem 2");
            System.out.println("Problem 3");
            System.out.println("Problem 4");
            System.out.println("Problem 5");
            System.out.println("Problem 6");
            System.out.println("Problem 7");
            System.out.println("Problem 8");
            System.out.println("Problem 9");
            System.out.println("Problem 10");
            System.out.println("0. Finish");
            System.out.println("-------------------------------------");
            System.out.println("Enter problem number: ");
            int option = sc.nextInt();

            // This part of code checks users input, if  input is 0 it will finish the process
            if (option == 0){
                System.out.println("Finished");
                break;
            }

            long startTime = System.currentTimeMillis();
            switch (option){
                case 1:
                    Problem1();
                    break;
                case 2:
                    Problem2();
                    break;
                case 3:
                    Problem3();
                    break;
                case 4:
                    Problem4();
                    break;
                case 5:
                    Problem5();
                    break;
                case 6:
                    Problem6();
                    break;
                case 7:
                    Problem7();
                    break;
                case 8:
                    Problem8();
                    break;
                case 9:
                    Problem9();
                    break;
                case 10:
                    Problem10();
                    break;
                default:
                    System.out.println("Choose between 1 - 10!");
                    break;

            }

            double endTime = System.currentTimeMillis();
            double duration = (endTime - startTime) / 1000000;
            System.out.println("Time taken: " + duration + " milliseconds");
        }
    }

    public static void Problem1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMin(arr);
    }


    public static void Problem2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers for array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        averageOfArr(n, arr);
    }

    public static void Problem3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for task:");
        int n = sc.nextInt();

        isPrime(n);
    }

    public static void Problem4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factorial number!");
        int n = sc.nextInt();

        System.out.println("Result: " + factorial(n));
    }

    public  static void Problem5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n-th fibonacci number:");
        int n = sc.nextInt();
        System.out.println("Result: " + fibonacci(n));
    }

    public static void Problem6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter power:");
        int n = sc.nextInt();
        System.out.println("Result: " + toPower(a,n));
    }

    public static void Problem7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter digits for array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseOrder(arr, 0, arr.length - 1);

        System.out.println("Result: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }

    public static void Problem8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Result: " + isDigit(s));
    }

    public static void Problem9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int k = sc.nextInt();
        System.out.println("Result: " + binomialCoef(n, k));
    }

    public static void Problem10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        System.out.println("Result: " + GCD(a,b));
    }

    /**
     * This code calculating GCD of two numbers recursively.
     */
    private static int GCD(int a, int b){
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    /**
     * Calculating binomial coefficient.
     * Formula n! / (k! * (n - k)!).
      n Total number.
      k The number of items to choose.
     */
    private static int binomialCoef(int n, int k){
        if (k == 0 || n == k)
            return 1;

        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    /**
     * This code will check String for only digits recursively.
     */
    private static String isDigit(String str){
        if(str.length() == 0)
            return "Yes";

        if (Character.isDigit(str.charAt(0)))
            return isDigit(str.substring(1));
        else
            return "No";
    }

    /**
     * This code reverse the given array, swaps start and end.

     */
    private static void reverseOrder(int[] arr, int start, int end){
        if (start >= end)
            return;

        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        reverseOrder(arr, start + 1, end - 1);
    }

    /**
     * Calculates the power of a number recursively.

     */
    private static int toPower(int a, int n){
        if(n == 0)
            return 1;
        else
            return a * toPower(a, n - 1);
    }

    /**
     * This code calculates nth Fibonacci number.

     */
    private static int fibonacci(int n){
        if (n <= 1 )
            return n; // F0 = 0 and F1 = 1 base case
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Calculates the factorial of a given number.

     */
    private static int factorial(int n){
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    /**
     * This code checks if a number is a prime.

     */
    private static void isPrime(int n){
        if(n % 2 == 0){
            System.out.println(n + " Composite");
        }
        else {
            System.out.println(n + " Prime");
        }
    }

    /**
     * This code calculates the average of elements in the array.

     */
    private static void averageOfArr(int n, int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / n;
        System.out.println("Result: " + average);
    }

    /**
     * This block of code about searching minimum digit in the array.

     **/
    private static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Result: " + min);
    }
}