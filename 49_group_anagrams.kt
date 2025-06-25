class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if(strs.isEmpty()){
            return emptyList()
        }

        val anagramGroups = mutableMapOf<String, MutableList<String>>()

        for(str in strs){
            val charStr = str.toCharArray()
            charStr.sort()
            val sortStr = String(charStr)

            val currentGroup = anagramGroups.getOrPut(sortStr) { mutableListOf() }.add(str)
        }
        return anagramGroups.values.toList()
    }
}