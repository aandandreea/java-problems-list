/*Given a string, find the length of the longest substring without repeating characters.*/

    int length = 0;

    HashSet<Character> set = new HashSet<>();
    char[] arr = s.toCharArray();
    int left = 0;
    for(int right = 0; right < arr.length; right++){
        if(set.contains(arr[right])){
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
        } else {
            set.add(arr[right]);
        }
        length = Math.max(length,right - left + 1);
    }
        return length;
