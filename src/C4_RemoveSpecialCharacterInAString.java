public class C4_RemoveSpecialCharacterInAString {
    public static void main(String[] args) {
        String str="@$^%&^&*&**&  javafadhdjfkfln  #$%#^&#&***";


        String str1=str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(str1);


    }
}
