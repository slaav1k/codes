package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([][]int, n)
	for i := 0; i < n; i++ {
		arr[i] = make([]int, n)
		for j := 0; j < n; j++ {
			if n-i-1 > j {
				arr[i][j] = 0
			} else if n-i-1 == j {
				arr[i][j] = 1
			} else {
				arr[i][j] = 2
			}
			fmt.Print(arr[i][j], " ")
		}
		fmt.Println()
	}
}
