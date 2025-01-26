package main

import "fmt"

func main() {
	var n, m float64
	fmt.Scan(&n, &m)
	fmt.Println(sumN(n) + sumN(m))
}

func sumN(n float64) float64 {
	sum := 0
	for i := 1; i <= int(n); i++ {
		sum += i
	}
	return float64(sum) / n
}
