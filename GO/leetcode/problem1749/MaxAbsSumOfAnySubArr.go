package problem1749

import "fmt"

func maxAbsoluteSum(nums []int) int {
	minPrefixSum, maxPrefixSum := 0, 0
	prefixSum := 0
	for i := 0; i < len(nums); i++ {
		prefixSum += nums[i]
		if prefixSum > maxPrefixSum {
			maxPrefixSum = prefixSum
		}
		if prefixSum < minPrefixSum {
			minPrefixSum = prefixSum
		}
	}
	return maxPrefixSum - minPrefixSum
}

func Runner() {
	fmt.Println(maxAbsoluteSum([]int{1, -3, 2, 3, -4}))
	fmt.Println(maxAbsoluteSum([]int{2, -5, 1, -4, 3, -2}))
}
