package problem674

import "fmt"

func findLengthOfLCIS(nums []int) int {
	longest := 1
	tmp := 1
	for i := 0; i < len(nums)-1; i++ {
		if nums[i] < nums[i+1] {
			tmp++
		} else {
			longest = max(longest, tmp)
			tmp = 1
		}
	}
	return longest
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func Runner() {
	fmt.Println(findLengthOfLCIS([]int{2, 2, 2, 2, 2}))
	fmt.Println(findLengthOfLCIS([]int{1, 3, 5, 4, 7}))
}
