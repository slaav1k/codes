package problem459

import (
	"fmt"
	"strings"
)

func repeatedSubstringPattern(s string) bool {
	n := len(s)
	for i := 1; i <= n/2; i++ {
		if n%i == 0 && strings.Repeat(string(s[:i]), n/i) == s {
			return true
		}
	}
	return false
}

func Runner() {
	fmt.Println(repeatedSubstringPattern("abba"))
	fmt.Println(repeatedSubstringPattern("aba"))
	fmt.Println(repeatedSubstringPattern("abab"))
	fmt.Println(repeatedSubstringPattern("abcabcabcabc"))
}
