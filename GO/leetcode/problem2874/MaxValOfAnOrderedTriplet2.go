package problem2874

import "fmt"

func maximumTripletValue(nums []int) int64 {
	n := len(nums)
	if n < 3 {
		return 0
	}

	maxVal := 0
	maxLeft := nums[0]
	maxDiff := 0

	for k := 2; k < n; k++ {
		if maxLeft-nums[k-1] > maxDiff {
			maxDiff = maxLeft - nums[k-1]
		}
		if nums[k-1] > maxLeft {
			maxLeft = nums[k-1]
		}
		current := maxDiff * nums[k]
		if current > maxVal {
			maxVal = current
		}
	}

	if maxVal < 0 {
		return 0
	}
	return int64(maxVal)
}

func Runner() {
	fmt.Println(maximumTripletValue([]int{12, 6, 1, 2, 7}))
	fmt.Println(maximumTripletValue([]int{1, 10, 3, 4, 19}))
	fmt.Println(maximumTripletValue([]int{1, 2, 3}))
}
