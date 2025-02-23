package problem028

import (
	"fmt"
)

func strStr(haystack string, needle string) int {
	j := 0
	for i := 0; i < len(haystack); {
		if haystack[i] == needle[j] {
			if j == len(needle)-1 {
				return i - (len(needle) - 1)
			}
			j++
		} else {
			i -= j
			j = 0
		}
		i++
	}
	return -1
}

func Runner() {
	fmt.Println(strStr("mississippi", "issip"))
	fmt.Println(strStr("sadbutsad", "sad"))
	fmt.Println(strStr("leetcode", "leeto"))
}
