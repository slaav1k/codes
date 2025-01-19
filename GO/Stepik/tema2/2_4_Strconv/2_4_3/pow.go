package main

import (
	"fmt"
	"math"
)

func main() {
	var x int
	fmt.Scan(&x)
	x = int(math.Pow(float64(x), 2))
	fmt.Println(x * x * x)

}
