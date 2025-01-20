package main

import "fmt"

func main() {
	var n, a, b, c int
	fmt.Scan(&n)
	c = n % 10 * 100
	b = n % 100 / 10 * 10
	a = n / 100
	fmt.Println(a + b + c)
}
