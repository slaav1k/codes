package problem1768

import (
	"fmt"
)

func mergeAlternately(word1 string, word2 string) string {
	i := 0
	j := 0
	n1 := len(word1)
	n2 := len(word2)
	res := make([]byte, 0, n1+n2)
	for i < n1 || j < n2 {
		if i < n1 {
			res = append(res, word1[i])
			i++
		}
		if j < n2 {
			res = append(res, word2[j])
			j++
		}
	}
	return string(res)
}

func Runner() {
	fmt.Println(mergeAlternately("abc", "pqr"))
	fmt.Println(mergeAlternately("ab", "pqrs"))
	fmt.Println(mergeAlternately("abcd", "pq"))
}
