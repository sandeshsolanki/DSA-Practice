package strings;

public class Palindrome {
    public static boolean stringPalindromeOrNot(String str){
        for (int i=0; i<=str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "sandesh";
        System.out.println("string is palindrome true or false "+ stringPalindromeOrNot(str));

        String string = "madam";
        System.out.println("string is palindrome true or false "+ stringPalindromeOrNot(string));


    }
}
