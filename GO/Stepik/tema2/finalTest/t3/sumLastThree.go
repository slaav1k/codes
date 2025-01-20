package main

import "fmt"

func main() {
	var x int
	fmt.Scan(&x)
	x = x % 1000
	var a, b, c int
	c = x % 10
	b = x % 100 / 10
	a = x / 100
	fmt.Println(a + b + c)
}
