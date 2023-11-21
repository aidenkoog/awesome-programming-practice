package io.github.aidenkoog.androidpractice.problem_solving.study

class CodingKotlin {
    fun twoSum(nums: IntArray, target: Int): Boolean {

        // 일단 정렬, 빅오 n
        nums.sort()

        var l = 0
        var r = 0

        while (l < r) {
            if (nums[l] + nums[r] > target) {
                r -= l
            } else if (nums[l] + nums[r] < target) {
                l += 1
            } else if (nums[l] + nums[r] == target) {
                return true
            }
        }
        return false
    }
}