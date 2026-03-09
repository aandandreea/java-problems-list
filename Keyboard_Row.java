/*500. Keyboard Row

Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
*/

class Solution {
    public Set<Character> toSet(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        return set;
    }
    public String[] findWords(String[] words) {
        Set<Character> set1 = toSet("qwertyuiop");
        Set<Character> set2 = toSet("asdfghjkl");
        Set<Character> set3 = toSet("zxcvbnm");
        List<String> result = new ArrayList<>();
        for(String str: words) {
            Set<Character> currentWordChars = toSet(str.toLowerCase());

            if(set1.containsAll(currentWordChars) || set2.containsAll(currentWordChars) || set3.containsAll(currentWordChars)) {
                result.add(str);
            }

        }
        String[] rezultat = result.toArray(new String[0]);
        
    
        return rezultat;
    }

}
