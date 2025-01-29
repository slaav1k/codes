package problem628

import (
	"fmt"
	"sort"
)

func maximumProduct(nums []int) int {
	sort.Ints(nums)
	len := len(nums)
	if nums[0] < 0 && nums[1] < 0 {
		if nums[len-1] < 0 {
			goto label
		}
		if nums[0]*nums[1] > nums[len-2]*nums[len-3] {
			return nums[0] * nums[1] * nums[len-1]
		}
	}
label:
	return nums[len-1] * nums[len-2] * nums[len-3]
}

func Runner() {
	fmt.Println(maximumProduct([]int{1, 2, 3}))
	fmt.Println(maximumProduct([]int{1, 2, 3, 4}))
	fmt.Println(maximumProduct([]int{-1, -2, -3}))
	fmt.Println(maximumProduct([]int{-100, -98, -1, 2, 3, 4}))
	fmt.Println(maximumProduct([]int{-1, -2, -3, -4}))
}
