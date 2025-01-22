package main

import "fmt"

func main() {
	var x, a, b, c int
	fmt.Scan(&x)
	a = x / 100
	b = x / 10 % 10
	c = x % 10
	if a < b && b < c {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
