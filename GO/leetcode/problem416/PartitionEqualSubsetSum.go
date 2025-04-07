package problem416

import "fmt"

func canPartition(nums []int) bool {
	total := 0
	for _, v := range nums {
		total += v
	}

	if total%2 != 0 {
		return false
	}

	target := total / 2
	dp := make([]bool, target+1)
	dp[0] = true

	for _, v := range nums {
		for j := target; j >= v; j-- {
			if dp[j-v] {
				dp[j] = true
			}
		}
	}
	return dp[target]

}

func Runner() {
	fmt.Println(canPartition([]int{1, 5, 11, 5}))
	fmt.Println(canPartition([]int{1, 2, 3, 5}))
}
