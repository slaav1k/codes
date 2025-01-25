package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	imn := 0
	imx := 0
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
		if arr[i] < arr[imn] {
			imn = i
		}
		if arr[i] >= arr[imx] {
			imx = i
		}
	}
	arr[imn], arr[imx] = arr[imx], arr[imn]
	for i := 0; i < n; i++ {
		fmt.Printf("%d ", arr[i])
	}
}
