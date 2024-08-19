class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String st : strs){
            int[] count = new int[26];

            for(char ch : st.toCharArray()){
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);
            if(!res.containsKey(key)){
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(st);
        }
        return new ArrayList<>(res.values());
        
    }
}
