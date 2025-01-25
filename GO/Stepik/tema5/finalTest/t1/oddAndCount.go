package main

import "fmt"

func main() {
	var n, k, a int
	fmt.Scan(&n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a)
		if a%2 == 0 {
			fmt.Print(a, " ")
			k++
		}
	}
	fmt.Println()
	fmt.Println(k)
}
