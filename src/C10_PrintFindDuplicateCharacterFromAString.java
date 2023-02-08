import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C10_PrintFindDuplicateCharacterFromAString {
    public static void main(String[] args) {
        String str = "javajavajavatu";
        findDuplicate(str);
    }




    public static void findDuplicate(String input) {
        char[] ch = input.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (char eachchar : ch) {
            if (hm.get(eachchar) == null) {
                hm.put(eachchar, 1);
            } else {
                hm.put(eachchar, hm.get(eachchar) + 1);
            }
            // System.out.println("key: " + eachchar + " :value: " + hm.get(eachchar));
        }

        Set<Map.Entry<Character,Integer>> entryset=hm.entrySet();
        for(Map.Entry<Character,Integer> entry:entryset)
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate character and their occurances are: "+entry);
            }

            }
        }
}

