package problem3272

import (
	"fmt"
	"strconv"
)

func isPalindrome(s string) bool {
	for i := 0; i < len(s)/2; i++ {
		if s[i] != s[len(s)-1-i] {
			return false
		}
	}
	return true
}

func generatePalindromes(n int) []int {
	var res []int
	half := (n + 1) / 2
	start := 1
	if n == 1 {
		start = 0
	}
	end := 1
	for i := 0; i < half; i++ {
		end *= 10
	}

	for i := start; i < end; i++ {
		s := strconv.Itoa(i)
		rev := ""
		if n%2 == 0 {
			for j := len(s) - 1; j >= 0; j-- {
				rev += string(s[j])
			}
		} else {
			for j := len(s) - 2; j >= 0; j-- {
				rev += string(s[j])
			}
		}
		full := s + rev
		num, _ := strconv.Atoi(full)
		res = append(res, num)
	}
	return res
}

func countGoodIntegers(n int, k int) int {
	palindromes := generatePalindromes(n)
	count := 0
	for _, p := range palindromes {
		if p%k == 0 {
			count++
		}
	}
	return count
}

func Runner() {
	fmt.Println(countGoodIntegers(3, 5))
	fmt.Println(countGoodIntegers(1, 4))
	fmt.Println(countGoodIntegers(5, 6))
}
