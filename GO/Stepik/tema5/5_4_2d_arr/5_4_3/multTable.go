package main

import "fmt"

func main() {
	var n, m int
	fmt.Scan(&n, &m)
	arr := make([][]int, n)
	for i := 0; i < n; i++ {
		arr[i] = make([]int, m)
		for j := 0; j < m; j++ {
			arr[i][j] = (i + 1) * (j + 1)
			fmt.Print(arr[i][j], " ")
		}
		fmt.Println()
	}
}
