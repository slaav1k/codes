package problem598

import "fmt"

func maxCount(m int, n int, ops [][]int) int {
	if len(ops) == 0 {
		return m * n
	}

	minRow, minCol := m, n
	for _, op := range ops {
		if op[0] < minRow {
			minRow = op[0]
		}
		if op[1] < minCol {
			minCol = op[1]
		}
	}
	return minRow * minCol
}

func Runner() {
	fmt.Println(maxCount(3, 3, [][]int{{2, 2}, {3, 3}}))
	fmt.Println(maxCount(3, 3, [][]int{}))
	fmt.Println(maxCount(40000, 40000, [][]int{}))
}
