package main

import "fmt"

func main() {
	var a, b rune
	fmt.Scanf("%c\n%c", &a, &b)

	if a > b {
		a, b = b, a
	}

	for i := a; i <= b; i++ {
		fmt.Printf("%c ", i)
	}
}
