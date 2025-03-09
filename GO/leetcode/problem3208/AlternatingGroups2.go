package problem3208

import "fmt"

func numberOfAlternatingGroups(colors []int, k int) int {
	l, r, res := 0, 0, 0
	n := len(colors)

	for l < n {
		r++
		if colors[r%n] == colors[(r-1)%n] {
			l = r
		} else if r-l+1 == k {
			res++
			l++
		}
	}
	return res
}

func Runner() {
	fmt.Println(numberOfAlternatingGroups([]int{0, 1, 0, 1, 0}, 3))
	fmt.Println(numberOfAlternatingGroups([]int{0, 1, 0, 0, 1, 0, 1}, 6))
	fmt.Println(numberOfAlternatingGroups([]int{1, 1, 0, 1}, 4))
}
