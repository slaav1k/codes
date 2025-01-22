package main

import "fmt"

func main() {
	var d1, d2, d3 int
	fmt.Scan(&d1, &d2, &d3)

	mn := min(
		d1+d2+d3,
		d1+d3+d3+d1,
		d1+d1+d2+d2,
		d2+d3+d3+d2,
	)
	fmt.Println(mn)
}
