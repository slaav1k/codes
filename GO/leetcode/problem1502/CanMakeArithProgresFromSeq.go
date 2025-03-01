package problem1502

import (
	"fmt"
	"sort"
)

func canMakeArithmeticProgression(arr []int) bool {
	sort.Ints(arr)
	diff := arr[1] - arr[0]
	for i := 2; i < len(arr); i++ {
		if arr[i]-arr[i-1] != diff {
			return false
		}
	}
	return true
}

func Runner() {
	fmt.Println(canMakeArithmeticProgression([]int{1, 2, 3})) // true
	fmt.Println(canMakeArithmeticProgression([]int{3, 5, 1})) // true
	fmt.Println(canMakeArithmeticProgression([]int{1, 2, 4})) // false
}
