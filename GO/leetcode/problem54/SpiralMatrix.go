package problem54

import "fmt"

func spiralOrder(matrix [][]int) []int {
	if len(matrix) == 0 || len(matrix[0]) == 0 {
		return []int{}
	}

	res := make([]int, 0)
	top, bottom, left, right := 0, len(matrix)-1, 0, len(matrix[0])-1

	for {
		for i := left; i <= right; i++ {
			res = append(res, matrix[top][i])
		}
		top++
		if top > bottom {
			break
		}

		for i := top; i <= bottom; i++ {
			res = append(res, matrix[i][right])
		}
		right--
		if left > right {
			break
		}
		for i := right; i >= left; i-- {
			res = append(res, matrix[bottom][i])
		}
		bottom--
		if top > bottom {
			break
		}

		for i := bottom; i >= top; i-- {
			res = append(res, matrix[i][left])
		}
		left++
		if left > right {
			break
		}
	}
	return res
}

func Runner() {
	fmt.Println(spiralOrder([][]int{[]int{1, 2, 3}, []int{4, 5, 6}, []int{7, 8, 9}}))
	fmt.Println(spiralOrder([][]int{[]int{1, 2, 3, 4}, []int{5, 6, 7, 8}, []int{9, 10, 11, 12}}))
}
