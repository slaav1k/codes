package problem594

import "fmt"

func findLHS(nums []int) int {
	counts := make(map[int]int, len(nums))
	for i := 0; i < len(nums); i++ {
		counts[nums[i]]++
	}
	res := 0
	for k, v := range counts {
		if i, ok := counts[k+1]; ok {
			res = max(res, i+v)
		}
	}
	return res
}

func Runner() {
	fmt.Println(findLHS([]int{1, 2, 3, 1}))
	fmt.Println(findLHS([]int{1, 1, 1, 1}))
	fmt.Println(findLHS([]int{1, 3, 2, 2, 5, 2, 3, 7}))
}
