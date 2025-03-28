package problem762

import (
	"fmt"
	"math"
	"strconv"
)

func countPrimeSetBits(left int, right int) int {
	k := 0
	for i := left; i <= right; i++ {
		if isPrime(countOnes(i)) {
			k++
		}
	}
	return k
}

func isPrime(num int) bool {
	if num < 2 {
		return false
	}
	for i := 2; i <= int(math.Sqrt(float64(num))); i++ {
		if num%i == 0 {
			return false
		}
	}
	return true
}

func countOnes(num int) int {
	count := 0
	s := strconv.FormatInt(int64(num), 2)
	for i := 0; i < len(s); i++ {
		if s[i] == '1' {
			count++
		}
	}
	return count
}

func Runner() {
	fmt.Println(countPrimeSetBits(6, 10))
	fmt.Println(countPrimeSetBits(10, 15))
}
