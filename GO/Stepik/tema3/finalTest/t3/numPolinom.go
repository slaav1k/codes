package main

import "fmt"

func main() {
	var x, a, b, c, d int
	fmt.Scan(&x)
	a = x / 1000
	b = x / 100 % 10
	c = x / 10 % 10
	d = x % 10
	if a == d && b == c {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
