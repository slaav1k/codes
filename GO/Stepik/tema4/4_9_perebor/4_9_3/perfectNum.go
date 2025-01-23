package main

import "fmt"

func sumOfDivisors(n int) int {
	sum := 1
	for i := 2; i*i <= n; i++ {
		if n%i == 0 {
			sum += i
			if i != n/i {
				sum += n / i
			}
		}
	}
	return sum
}

func main() {
	count := 0
	n := 2
	for count < 3 {
		if sumOfDivisors(n) == n {
			if count > 0 {
				fmt.Print(",")
			}
			fmt.Print(n)
			count++
		}
		n++
	}
}
