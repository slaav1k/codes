package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	for i := 0; i < n; i++ {
		if arr[i]%3 == 0 {
			fmt.Print(arr[i], " ")
		}
	}

}
