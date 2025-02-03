package problem3105

import "fmt"

func longestMonotonicSubarray(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	k_mx := 1
	k_tmp := 1
	high := 0

	for i := 0; i < len(nums)-1; i++ {
		if nums[i] < nums[i+1] {
			if high == 1 {
				k_tmp++
			} else {
				k_tmp = 2
				high = 1
			}
		} else if nums[i] > nums[i+1] {
			if high == 2 {
				k_tmp++
			} else {
				k_tmp = 2
				high = 2
			}
		} else {
			k_tmp = 1
			high = 0
		}
		k_mx = max(k_mx, k_tmp)
	}
	return k_mx
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func Runner() {
	fmt.Println(longestMonotonicSubarray([]int{1, 4, 3, 3, 2})) // 2
	fmt.Println(longestMonotonicSubarray([]int{3, 3, 3, 3}))    // 1
	fmt.Println(longestMonotonicSubarray([]int{3, 2, 1}))       // 3
	fmt.Println(longestMonotonicSubarray([]int{1, 2, 3, 4, 5})) // 5
	fmt.Println(longestMonotonicSubarray([]int{5, 4, 3, 2, 1})) // 5
}
