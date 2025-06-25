class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if( s.length != t.length ){
            return false
        }
        val charCount = mutableMapOf<Char, Int>()

        for(char in s){
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }

        for(char in t){
            val count = charCount.getOrDefault(char, 0) - 1
            if(count < 0 ){
                return false
            }
            charCount[char] = count
        }
        return true
    }
}