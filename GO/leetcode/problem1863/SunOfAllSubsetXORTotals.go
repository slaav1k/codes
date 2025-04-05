package problem1863

import "fmt"

func subsetXORSum(nums []int) int {
	sum := 0
	for _, num := range nums {
		sum |= num
	}
	return sum << (len(nums) - 1)
}

func Runner() {
	fmt.Println(subsetXORSum([]int{1, 3}))
	fmt.Println(subsetXORSum([]int{5, 1, 6}))
	fmt.Println(subsetXORSum([]int{3, 4, 5, 6, 7, 8}))
}
