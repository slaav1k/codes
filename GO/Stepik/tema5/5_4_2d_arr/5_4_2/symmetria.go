package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([][]int, n)
	for i := 0; i < n; i++ {
		arr[i] = make([]int, n)
		for j := 0; j < n; j++ {
			fmt.Scan(&arr[i][j])
		}
	}
	f := "YES"
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if arr[i][j] != arr[j][i] {
				f = "NO"
				goto label
			}
		}
	}
label:
	fmt.Println(f)
}
