class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numMap = HashMap<Int, Int>()

        for(i in nums.indices){
            val currentNum = nums[i]
            val complement = target - currentNum
            if(numMap.containsKey(complement)){
                return intArrayOf(numMap[complement]!!, i)
            }
            numMap[currentNum] = i
        }
        return intArrayOf()
    }
}