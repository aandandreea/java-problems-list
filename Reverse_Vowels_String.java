/*345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

*/

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int st = 0;
        int dr = arr.length - 1;
        while(st < dr){
            char ch1 = Character.toLowerCase(arr[st]);
            char ch2 = Character.toLowerCase(arr[dr]);
            if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u'){
                st++;
            } else if(ch2 != 'a' && ch2 != 'e' && ch2 != 'i' && ch2 != 'o' && ch2 != 'u'){
                dr--;
        } else {
            char temp = arr[st];
            arr[st] = arr[dr];
            arr[dr] = temp;
            st++;
            dr--;
        }
       
    }
     return new String(arr);
}
}
