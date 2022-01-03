//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> map = new HashMap<>();
        for(String currString : string_list){
            char[] currStringCharArray = currString.toCharArray();
            Arrays.sort(currStringCharArray);
            // String currStringSorted = currStringCharArray.toString();
            String currStringSorted = new String(currStringCharArray);
            if(!map.containsKey(currStringSorted)){
                List<String> list = new ArrayList<>();
                list.add(currString);
                map.put(currStringSorted, list);
            } else{
                List<String> list = map.get(currStringSorted);
                list.add(currString);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String currString : map.keySet()){
            List<String> list = map.get(currString);
            ans.add(list);
        }
        return ans;
    }
}
