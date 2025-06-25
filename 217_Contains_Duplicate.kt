class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
       val seen = HashSet<Int>() 
       for(num in nums) {
        if(seen.contains(num)){
            return true
        }
        seen.add(num)
       }
       return false
    }
}