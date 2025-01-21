package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	a := n / 100000
	b := (n / 10000) % 10
	c := (n / 1000) % 10
	d := (n / 100) % 10
	e := (n / 10) % 10
	f := n % 10
	if a+b+c == d+e+f {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
