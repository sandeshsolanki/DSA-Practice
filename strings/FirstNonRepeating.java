package strings;

public class FirstNonRepeating {
    public static void firstNonRepeating(String str){
        char result = ' ';
        boolean found = false;
        for (int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            boolean isDuplicate = false;

            for (int j=0; j<str.length(); j++){
                if (i != j && current == str.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                result = current;
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("First Non-repeating char : " + result);

        }
        else {
            System.out.println("No repeating char exist");
        }
    }
    public static void main(String[] args) {

        String str = "sandesh";
        String string = "sandeaa";

        firstNonRepeating(str);
        firstNonRepeating(string);

    }
}
