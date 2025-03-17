package problem2206

import "fmt"

func divideArray(nums []int) bool {
	map_list := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		map_list[nums[i]] = map_list[nums[i]] + 1
	}
	for _, v := range map_list {
		if v%2 != 0 {
			return false
		}
	}
	return true
}

func Runner() {
	fmt.Println(divideArray([]int{3, 2, 3, 2, 2, 2}))
	fmt.Println(divideArray([]int{1, 2, 3, 4}))
}
