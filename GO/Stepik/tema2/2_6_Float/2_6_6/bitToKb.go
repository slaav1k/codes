package main

import (
	"fmt"
	"math"
)

func main() {
	var x float64
	fmt.Scan(&x)
	fmt.Println(x / math.Pow(2, 13))
}
