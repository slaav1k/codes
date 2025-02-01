package problem3151

import "fmt"

func isOdd(num int) bool {
	return num%2 == 0
}

func isArraySpecial(nums []int) bool {
	if nums == nil || len(nums) == 0 {
		return false
	}
	if len(nums) == 1 {
		return true
	}
	i := 0
	for i < len(nums)-1 {
		if isOdd(nums[i]) && isOdd(nums[i+1]) || !isOdd(nums[i]) && !isOdd(nums[i+1]) {
			return false
		}
		i++
	}
	return true
}

func Runner() {
	fmt.Println(isArraySpecial([]int{1}))
	fmt.Println(isArraySpecial([]int{2, 1, 4}))
	fmt.Println(isArraySpecial([]int{4, 3, 1, 6}))
}
