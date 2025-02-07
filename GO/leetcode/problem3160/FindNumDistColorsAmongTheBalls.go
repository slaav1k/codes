package problem3160

import "fmt"

func queryResults(limit int, queries [][]int) []int {
	ballsMap := make(map[int]int)
	colorCount := make(map[int]int)
	result := make([]int, len(queries))

	for i, query := range queries {
		ball := query[0]
		newColor := query[1]
		oldColor, exists := ballsMap[ball]

		if exists {
			colorCount[oldColor]--
			if colorCount[oldColor] == 0 {
				delete(colorCount, oldColor)
			}
		}

		ballsMap[ball] = newColor
		colorCount[newColor]++
		result[i] = len(colorCount)
	}

	return result
}

func Runner() {
	fmt.Println(queryResults(4, [][]int{{1, 4}, {2, 5}, {1, 3}, {3, 4}}))
	fmt.Println(queryResults(4, [][]int{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}}))
}
