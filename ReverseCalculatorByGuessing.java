import java.util.Scanner;

public class ReverseCalculatorByGuessing {
    public static void main(String[] args) {
        /* N = p * q*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wyszukiwaną liczbę");
        int n=scanner.nextInt();
        System.out.println("Wprowadź liczbę dzięki której wyszukamy dwie liczby rozwiązujące problem (może być jakakolwiek od 1-9)");
        int g=scanner.nextInt();
        int primeNumber=8;
        int r=0;
        for(int i=0;i<11;i++){
            if(g%n==1){
                r=i;
            }
            else{
                g=g*primeNumber;
            }
        }
        /*
        m = multiple
        g^r=m*N+1
        g^r - 1 = m*N
        (g^r/2+1)(g*r/2-1) = m*N
        te liczby mają wspólny mianownik z szukaną liczbą
        8^5+1= 32,769
        8^5-1 = 32,767
        używamy algorytm eclidesa
        * */
        int first = (int) Math.pow(primeNumber, (double) r /2);
        first = first+1;
        int devider = n;
        int q=0;
        while(first>0){
            if(first%devider==0){
                q=devider;
                break;
            }else{
                int modulo = first%devider;
                first=devider;
                devider=modulo;
            }
        }
        int p = n/q;
        System.out.println("Liczby które po przemnożeniu dadzą nam wynik:"+n+" To: "+q+" oraz "+p);
    }
}
