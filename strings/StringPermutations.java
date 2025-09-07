package strings;

public class StringPermutations {

    // Function to print all permutations
    public static void permute(String str, String ans) {
        // base case: when string is empty
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // pick each character one by one
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // remaining string after removing ch
            String ros = str.substring(0, i) + str.substring(i + 1);

            // recursive call
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + " are:");
        permute(str, "");

        String string = "abc";
        System.out.println("permutations of" + string + "are:");
        permute(string,"");
    }
}

