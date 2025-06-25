class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val answer = IntArray(n) { 1 }

        var prefixProduct = 1
        for(i in 0 until n){
            answer[i] = prefixProduct
            prefixProduct *= nums[i]
        }
        var suffixProduct = 1
        for(i in n-1 downTo 0){
            answer[i] *= suffixProduct
            suffixProduct *= nums[i]
        }
        return answer
    }
}