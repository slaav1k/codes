package main

import (
	"fmt"
	"math"
)

func main() {
	var a, b, c float64
	fmt.Scan(&a, &b, &c)

	discriminant := b*b - 4*a*c

	if discriminant > 0 {
		x1 := (-b - math.Sqrt(discriminant)) / (2 * a)
		x2 := (-b + math.Sqrt(discriminant)) / (2 * a)
		if x1 > x2 {
			x1, x2 = x2, x1
		}
		fmt.Println(x1)
		fmt.Println(x2)
	} else if discriminant == 0 {
		x := -b / (2 * a)
		fmt.Println(x)
	}
}
