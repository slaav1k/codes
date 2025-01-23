package main

import "fmt"

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	f := 1
	for i := a; i <= b; i++ {
		f *= i
	}
	fmt.Println(f)
}
