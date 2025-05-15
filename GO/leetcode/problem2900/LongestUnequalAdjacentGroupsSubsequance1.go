package problem2900

import (
	"fmt"
)

func getLongestSubsequence(words []string, groups []int) []string {
	var ans []string
	n := len(words)
	for i := 0; i < n; i++ {
		if i == 0 || groups[i] != groups[i-1] {
			ans = append(ans, words[i])
		}
	}
	return ans
}

func Runner() {
	words1 := []string{"e", "a", "b"}
	groups1 := []int{0, 0, 1}
	fmt.Println(getLongestSubsequence(words1, groups1))

	words2 := []string{"a", "b", "c", "d"}
	groups2 := []int{1, 0, 1, 1}
	fmt.Println(getLongestSubsequence(words2, groups2))

	words3 := []string{"x", "y", "z"}
	groups3 := []int{1, 1, 1}
	fmt.Println(getLongestSubsequence(words3, groups3))

	words4 := []string{"a", "b", "c", "d", "e"}
	groups4 := []int{0, 1, 0, 1, 0}
	fmt.Println(getLongestSubsequence(words4, groups4))
}
