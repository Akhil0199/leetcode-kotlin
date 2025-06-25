class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = mutableMapOf<Int, Int>()
        for(num in nums){
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }
        val bucket = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        for((num,freq) in frequencyMap){
            bucket[freq].add(num)
        }
        val result = mutableListOf<Int>()
        for(i in bucket.size-1 downTo 0){
            if(bucket[i].isNotEmpty()){
                for(num in bucket[i]){
                    result.add(num)
                    if(result.size == k) return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}