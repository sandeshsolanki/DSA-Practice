package strings;

public class SwapStringWithoutTemp {
    public static void swap(String str1, String str2){


        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
    }
    public static void main(String[] args){
      String  str1 = "sandesh";
      String  str2 = "solanki";
        swap(str1,str2);
    }
}
