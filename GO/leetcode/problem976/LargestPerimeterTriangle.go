package problem976

import (
	"fmt"
	"sort"
)

func largestPerimeter(nums []int) int {
	sort.Ints(nums)
	n := len(nums)
	for i := n - 3; i >= 0; i-- {
		if nums[i+2] < nums[i+1]+nums[i] {
			return nums[i] + nums[i+1] + nums[i+2]
		}
	}
	return 0
}

func Runner() {
	fmt.Println(largestPerimeter([]int{2, 1, 2}))
	fmt.Println(largestPerimeter([]int{1, 2, 1, 10}))
}
