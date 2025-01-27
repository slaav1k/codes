package problem645

import (
	"fmt"
)

func findErrorNums(nums []int) []int {
	n := len(nums)
	result := make([]int, 2)
	count := make([]int, n+1)

	for _, num := range nums {
		count[num]++
	}

	for i := 1; i <= n; i++ {
		if count[i] == 2 {
			result[0] = i
		} else if count[i] == 0 {
			result[1] = i
		}
	}

	return result
}

func Runner() {
	fmt.Println(findErrorNums([]int{1, 2, 2, 4}))
	fmt.Println(findErrorNums([]int{1, 1}))
	fmt.Println(findErrorNums([]int{3, 2, 2}))
}
