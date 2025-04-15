package problem766

import "fmt"

func isToeplitzMatrix(matrix [][]int) bool {
	for i := 1; i < len(matrix); i++ {
		for j := 1; j < len(matrix[i]); j++ {
			if matrix[i][j] != matrix[i-1][j-1] {
				return false
			}
		}
	}
	return true
}

func Runner() {
	fmt.Println(isToeplitzMatrix([][]int{[]int{1, 2, 3, 4}, []int{5, 1, 2, 3}, []int{9, 5, 1, 2}}))
	fmt.Println(isToeplitzMatrix([][]int{[]int{1, 2}, []int{2, 2}}))
}
