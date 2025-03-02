package problem896

import "fmt"

func isMonotonic(nums []int) bool {
	n := len(nums)
	if n <= 2 {
		return true
	}
	f := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] < nums[i+1] {
			if f == 0 {
				f = 1
			} else if f == -1 {
				return false
			}
		}
		if nums[i] > nums[i+1] {
			if f == 0 {
				f = -1
			} else if f == 1 {
				return false
			}
		}
	}
	return true
}

func Runner() {
	fmt.Println(isMonotonic([]int{1, 2, 3, 4, 5}))
}
