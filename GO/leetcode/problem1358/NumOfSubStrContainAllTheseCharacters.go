package problem1358

import "fmt"

func numberOfSubstrings(s string) int {
	count := map[byte]int{'a': 0, 'b': 0, 'c': 0}
	left, result := 0, 0

	for right := 0; right < len(s); right++ {
		count[s[right]]++

		for count['a'] > 0 && count['b'] > 0 && count['c'] > 0 {
			result += len(s) - right
			count[s[left]]--
			left++
		}
	}

	return result
}

func Runner() {
	fmt.Println(numberOfSubstrings("abcabc"))
	fmt.Println(numberOfSubstrings("aaacb"))
	fmt.Println(numberOfSubstrings("abc"))
}
