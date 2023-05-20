import java.util.Scanner;

public class SumOfTwoStringsEqualThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first word");
        String first = scanner.nextLine();
        System.out.println("Type in the second word");
        String second =  scanner.nextLine();
        System.out.println("Type in the third word");
        String result = scanner.nextLine();
        boolean firstPart=false;
        boolean secondPart=false;
        char[] firstWordsArray = new char[first.length()];
        char[] secondWordsArray = new char[second.length()];
        for(int i=0;i<=first.length()-1;i++){
            firstWordsArray[i]=result.charAt(i);
        }
        for(int i=0;i<=second.length()-1;i++){
            secondWordsArray[i] = result.charAt(firstWordsArray.length+i);
        }
        int left=0;
        int right=0;
        for(int i=0;i<=firstWordsArray.length-1;i++){
            for(int ii=0;ii<first.length();ii++){
                if(first.charAt(i)==firstWordsArray[ii]){
                    left++;
                    ii=first.length();
                }
            }
        }
        for(int i=0;i<=secondWordsArray.length-1;i++){
            for(int ii=0;ii<second.length();ii++){
                if(second.charAt(i)==secondWordsArray[ii]){
                    right++;
                    ii=second.length();
                }
            }
        }
        if((left+right)==result.length()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
