package main

import "fmt"

func main() {
	var n, a int
	fmt.Scan(&n)
	sum := 0
	for i := 0; i < n; i++ {
		fmt.Scan(&a)
		if a%2 == 0 && a%3 != 0 {
			sum += a
		}
	}
	fmt.Println(sum)
}
