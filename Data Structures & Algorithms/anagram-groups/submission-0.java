class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);               // sort letters
            String key = new String(chars);   // key for anagrams

            // add word to the correct list
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}