package problem3396

import "fmt"

func minimumOperations(nums []int) int {
	if len(nums) == 3 {
		return 0
	}
	if isUnique(nums) {
		return 0
	}
	k := 0
	for !isUnique(nums) {
		if len(nums) > 3 {
			nums = nums[3:]
		} else {
			nums = nums[:0]
		}
		k++
		if isUnique(nums) {
			return k
		}
	}
	return k
}

func isUnique(nums []int) bool {
	if len(nums) == 0 {
		return true
	}
	set := make(map[int]struct{})
	for _, n := range nums {
		set[n] = struct{}{}
	}
	return len(set) == len(nums)
}

func Runner() {
	fmt.Println(minimumOperations([]int{1, 2, 3, 4, 2, 3, 3, 5, 7}))
	fmt.Println(minimumOperations([]int{4, 5, 6, 4, 4}))
	fmt.Println(minimumOperations([]int{6, 7, 8, 9}))
	fmt.Println(minimumOperations([]int{5, 5}))
}
