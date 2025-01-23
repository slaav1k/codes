package main

import "fmt"

func main() {
	var x, res int
	fmt.Scan(&x)
	place := 1
	for x > 0 {
		f := x % 10
		if f != 5 && f != 7 {
			res += f * place
			place *= 10
		}
		x /= 10
	}
	fmt.Println(res)
}
