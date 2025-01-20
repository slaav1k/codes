package main

import (
	"fmt"
	"math"
)

func main() {
	var a, b, c float64
	fmt.Scan(&a, &b)
	c = math.Sqrt(a*a + b*b)
	fmt.Println(c + a + b)
}
