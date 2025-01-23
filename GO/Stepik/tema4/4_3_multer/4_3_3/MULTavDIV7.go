package main

import "fmt"

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	f := 1
	for i := a; i <= b; i++ {
		if i%10 == 7 {
			f *= i
		} else if i == 7 || i == -7 {
			f *= i
		}

	}
	fmt.Println(f)
}
