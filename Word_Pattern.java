/*
290. Word Pattern

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.*/

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap <Character,String> mapP = new HashMap<>();
        HashMap <String,Character> mapS = new HashMap<>();
        String word[] = s.split(" ");

        if(pattern.length() != word.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String cuvant = word[i];
            if(mapP.containsKey(ch) && !mapP.get(ch).equals(cuvant)){
                return false;
            } else if(mapS.containsKey(cuvant) && mapS.get(cuvant) != ch){
                return false;
            }
            mapP.put(ch,cuvant);
            mapS.put(cuvant,ch);
        }

        return true;
    }
}
