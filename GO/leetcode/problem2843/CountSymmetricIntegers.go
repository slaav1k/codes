package problem2843

import "fmt"

func countSymmetricIntegers(low int, high int) int {
	res := 0
	for num := low; num <= high; num++ {
		if num < 100 {
			if num%11 == 0 {
				res += 1
			}
		} else if num >= 1000 && num <= 9999 {
			l := num/1000 + (num%1000)/100
			r := num%10 + (num%100)/10
			if l == r {
				res += 1
			}
		}
	}
	return res
}

func Runner() {
	fmt.Println(countSymmetricIntegers(1, 100))
	fmt.Println(countSymmetricIntegers(1200, 1230))
}
