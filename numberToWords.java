public class numberToWords {
    /*Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".*/


    public static void main(String[] args) {

        int a = 123;
        numberToWords(a);

    }
    public static void numberToWords(int number){
        int res = number;
        int digit=0;
        while(number%10!=0){
            System.out.println(number);
            number = number/10;
        }

        switch(number%10){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                break;

        }
    }
}
