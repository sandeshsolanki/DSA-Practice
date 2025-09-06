package strings;

public class VowelConsonentCount {
    public static void countConsonantVowel(String str){
        str = str.toLowerCase();
        int vowel =0;
        int consonant = 0;

        for (int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
               vowel++;
           }
           else {
               consonant++;
           }
        }
        System.out.println("vowel : " + vowel);
        System.out.println("consonant : "+ consonant);
    }
    public static void main(String[] args) {

        countConsonantVowel("sandesh");
        countConsonantVowel("education");
    }
}
