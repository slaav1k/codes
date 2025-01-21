package problem575

import "fmt"

func distributeCandies(candyType []int) int {
	set := make(map[int]struct{})
	for _, candyType := range candyType {
		set[candyType] = struct{}{}
	}
	n := len(candyType) / 2
	if len(set) < n {
		return len(set)
	}
	return n
}

func Runner() {
	fmt.Println(distributeCandies([]int{1, 1, 2, 2, 3, 3}))
	fmt.Println(distributeCandies([]int{1, 1, 2, 3}))
	fmt.Println(distributeCandies([]int{6, 6, 6, 6}))
}
