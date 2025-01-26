package main

import "fmt"

func main() {
	var n, k int
	fmt.Scan(&n, &k)

	factN := factorial(n)
	factK := factorial(k)
	nSubtractK := n - k
	factNSubtractK := factorial(nSubtractK) // можно factorial(n - k), и тогда строчка выше не нужна

	fmt.Println(factN / (factK * factNSubtractK))
}

func factorial(number int) int {
	fact := 1
	for i := 1; i <= number; i++ {
		fact = fact * i
	}
	return fact
}
