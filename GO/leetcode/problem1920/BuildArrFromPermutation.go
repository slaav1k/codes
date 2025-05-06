package problem1920

import "fmt"

func buildArray(nums []int) []int {
	res := make([]int, len(nums))
	for i := 0; i < len(nums); i++ {
		res[i] = nums[nums[i]]
	}
	return res
}

func Runner() {
	fmt.Println(buildArray([]int{0, 2, 1, 5, 3, 4}))
	fmt.Println(buildArray([]int{5, 0, 1, 2, 3, 4}))
}
