package main

import "fmt"

func main() {
	var n, k, kt int
	fmt.Scan(&n)
	a := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	for i := 0; i < n; i++ {
		kt = 0
		for j := 0; j < n; j++ {
			if i != j && a[i] == a[j] {
				kt++
			}
		}
		if kt > 0 {
			k++
		}
	}
	fmt.Println(k)
}
