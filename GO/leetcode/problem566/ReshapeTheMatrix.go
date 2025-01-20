package problem566

import "fmt"

func matrixReshape(mat [][]int, r int, c int) [][]int {
	n := len(mat)
	m := len(mat[0])
	if n*m != r*c {
		return mat
	}
	arr := make([][]int, r)
	for i := 0; i < r; i++ {
		arr[i] = make([]int, c)
	}
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			l := i*m + j
			arr[l/c][l%c] = mat[i][j]
		}
	}
	return arr
}

func Runner() {
	fmt.Println(matrixReshape([][]int{{1, 2}, {3, 4}}, 1, 4))
}
