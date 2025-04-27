package problem3392

import "fmt"

func countSubarrays(nums []int) int {
	count := 0
	for i := 3; i <= len(nums); i++ {
		if checkSubarrays(nums[i-3 : i]) {
			count++
		}
	}
	return count
}

func checkSubarrays(nums []int) bool {
	a := nums[0]
	b := nums[1]
	c := nums[2]
	if 2*(a+c) == b {
		return true
	}
	return false
}

func Runner() {
	fmt.Println(countSubarrays([]int{-1, -4, -1, 4}))
	fmt.Println(countSubarrays([]int{1, 2, 1, 4, 1}))
	fmt.Println(countSubarrays([]int{1, 1, 1}))
}
