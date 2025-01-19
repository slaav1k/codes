package main

import "fmt"

func main() {
	var a, b, n int
	fmt.Scan(&a, &b, &n)
	b += a * 100
	cost := b * n
	a = cost / 100
	b = cost % 100
	fmt.Println(a, b)
}
