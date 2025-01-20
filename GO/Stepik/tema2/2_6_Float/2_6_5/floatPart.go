package main

import "fmt"

func main() {
	var x float64
	fmt.Scan(&x)
	x_int := float64(int(x))
	fmt.Println(x - x_int)

}
