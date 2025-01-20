package main

import "fmt"

func main() {
	var x int
	fmt.Scan(&x)
	x = x % 1000 / 100
	fmt.Println(x)
}
