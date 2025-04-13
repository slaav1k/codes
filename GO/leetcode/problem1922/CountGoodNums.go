package problem1922

import "fmt"

const mod = 1e9 + 7

func countGoodNumbers(n int64) int {
	evenCount := (n + 1) / 2
	oddCount := n / 2

	fivePow := fastExp(5, evenCount)
	fourPow := fastExp(4, oddCount)

	return (fivePow * fourPow) % mod
}

func fastExp(base, exponent int64) int {
	res := 1
	b := int(base)
	e := exponent
	b %= mod

	for e > 0 {
		if e%2 == 1 {
			res = (res * b) % mod
		}
		b = (b * b) % mod
		e /= 2
	}

	return res
}

func Runner() {
	fmt.Println(countGoodNumbers(1))
	fmt.Println(countGoodNumbers(4))
	fmt.Println(countGoodNumbers(50))
}
