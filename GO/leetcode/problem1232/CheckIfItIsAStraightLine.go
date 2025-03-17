package problem1232

import "fmt"

func checkStraightLine(coordinates [][]int) bool {
	if len(coordinates) < 3 {
		return true
	}

	n := len(coordinates) - 1

	x0, y0 := coordinates[0][0], coordinates[0][1]
	xn, yn := coordinates[n][0], coordinates[n][1]

	for i := 1; i < n; i++ {
		xi, yi := coordinates[i][0], coordinates[i][1]
		if (yi-y0)*(xn-x0) != (yn-y0)*(xi-x0) {
			return false
		}
	}
	return true
}

func Runner() {
	fmt.Println(checkStraightLine([][]int{[]int{1, 2}, []int{2, 3}, []int{3, 4}, []int{4, 5}, []int{5, 6}, []int{6, 7}}))
	fmt.Println(checkStraightLine([][]int{[]int{1, 1}, []int{2, 2}, []int{3, 4}, []int{4, 5}, []int{5, 6}, []int{7, 7}}))
}
