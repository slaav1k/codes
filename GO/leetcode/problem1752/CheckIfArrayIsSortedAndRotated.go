package problem1752

import "fmt"

func check(nums []int) bool {
	k := 0
	N := len(nums)
	for i := 0; i < N; i++ {
		if nums[i] > nums[(i+1)%N] {
			k++
		}
	}
	return k <= 1
}

func Runner() {
	fmt.Println(check([]int{1, 2, 3, 4, 5}))
	fmt.Println(check([]int{3, 4, 5, 1, 2}))
	fmt.Println(check([]int{2, 1, 3, 4}))
	fmt.Println(check([]int{1, 2, 3}))
}
