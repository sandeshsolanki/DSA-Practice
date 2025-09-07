package strings;

public class DuplicateInString {
    public static void removeDuplicateFromString(String str){
        String result = " ";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean found = false;

            for (int j=0; j<result.length(); j++){
                if (ch==str.charAt(j)){
                    found = true;
                    break;
                }
            }

            if (!found){
                result += ch;
            }

        }

        System.out.println("original String : " + str);
        System.out.println("after removing duplicate : " + result);
    }
    public static void main(String[] args) {

        String str = "saandesh";
        removeDuplicateFromString(str);

        String string = "aaaaaaa";
        removeDuplicateFromString(string);
    }
}
