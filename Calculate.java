.*;

class Fibonacci {
    Scanner sc = new Scanner(System.in);

    void fibo() {
        int n1 = 0, n2 = 1, n3, i, count;

        System.out.print("How long Fibonacci series you want to print? Enter Count: ");
        count = sc.nextInt();
       System.out.print(n1+" "+n2);
        for (i = 2; i < count; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3 + " ");
        }
 System.out.println("\n");
    }

}

class Prime {
    Scanner sc = new Scanner(System.in);

    void prim() {
        int i, num, f = 0;

        System.out.print("\nInput the number to check if it's prime or not: ");
        num = sc.nextInt();

        if (num == 0 || num == 1)
            System.out.println("\nInput value is Not a Prime number");
        else {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print("\nInput number " + num + " is not a Prime number\n");
                    f = 1;
                    break;
                }
            }
 if (f == 0)
            System.out.print("\nInput value is a Prime number = " + num+"\n");
        }
    }
}

class Factorial {
    Scanner sc = new Scanner(System.in);
    void fact() {
        int num, i, f = 1;
        System.out.print("\nInput the number that you want the factorial of: ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            f = f * i;
        }
        System.out.print("\nFactorial of " + num + " = " + f);
       System.out.println("\n");
    }
}

class Palindrome {
    Scanner sc = new Scanner(System.in);
    void palin() {
        int sum = 0, num, r, temp;
        System.out.print("\nTo check if a number is Palindrome or not, input a number: ");
        num = sc.nextInt();
        temp = num;
        while (num != 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum)
            System.out.print("\nInput Number(" + temp + ") is a Palindrome number ");
        else
            System.out.println("\nInput Number(" + temp + ") is not a Palindrome number ");
    }
}

class Calculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------------------------------------------------------- ");
            System.out.println("1. To find the Fibonacci Series [Press 1] ");
            System.out.println("2. To check if a number is Prime or not. [Press 2] ");
            System.out.println("3. To find the Factorial of a number. [Press 3] ");
            System.out.println("4. To check if the input number is Palindrome or not [Press 4] ");
            System.out.println("5. For Repeating a Loop [Press 5] ");
            System.out.println("0. For Exit from the program [Press 0] ");
            System.out.println("----------------------------------------------------------------------------------------- ");
            System.out.print("Input the number: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Fibonacci obj1 = new Fibonacci();
                    obj1.fibo();
                    break;

                case 2:
                    Prime primeObj = new Prime();
                    primeObj.prim();
                    break;

                case 3:
                    Factorial factObj = new Factorial();
                    factObj.fact();
                    break;

                case 4:
                    Palindrome palindromeObj = new Palindrome();
                    palindromeObj.palin();
                    break;

                case 5:
                    int repeat =1;
                    do {
                        System.out.println("\n----------------------------------------------------------------------------------------- ");
                        System.out.println("1. To find the Fibonacci Series [Press 1] ");
                        System.out.println("2. To check if a number is Prime or not. [Press 2] ");
                        System.out.println("3. To find the Factorial of a number. [Press 3] ");
                        System.out.println("4. To check if the input number is Palindrome or not [Press 4] ");
                        System.out.println("5. For Repeating a Loop [Press 5] ");
                        System.out.println("0. For Exit from the program [Press 0] ");
                        System.out.println("----------------------------------------------------------------------------------------- ");
                        System.out.print("Input the number: ");
                        choice = sc.nextInt();
                        System.out.println("This is loop iteration " + repeat);
                        System.out.print("Do you want to repeat the loop? (1 for yes, 0 for no): ");
                        repeat = sc.nextInt();
                    } while (repeat == 1);
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 0);
    }
}
