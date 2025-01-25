package main

import "fmt"

func main() {
	var n, k int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
		if arr[i]%3 == 0 && arr[i]%10 == 7 {
			k++
		}
	}
	for i := 0; i < n; i++ {
		if arr[i]%3 == 0 && arr[i]%10 == 7 {
			arr[i] = k
		}
		fmt.Print(arr[i], " ")
	}
}
