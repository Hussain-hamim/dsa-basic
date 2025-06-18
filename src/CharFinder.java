import java.util.HashMap;
import java.util.Map;

public class CharFinder {

    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (var ch : str.toCharArray()) {
//            if (map.containsKey(ch)) {
//                var count = map.get(ch);
//                map.put(ch, count);
//            } else
//                map.put(ch, 1);

            // this below line same as above
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
            //Loops through each character in the string
            //For each character:
            //Checks if it exists in the map
            //Gets current count (or 0 if new character)
            //Increments count by 1 and stores in map
        }

        for (var ch : str.toCharArray())
            if (map.get(ch) == 1)
                return ch;
        //Loops through string again (to maintain order)
        //For each character:
        //Checks if its count in the map is 1
        //Returns immediately when first such character is found

        return Character.MIN_VALUE;
    }
}
