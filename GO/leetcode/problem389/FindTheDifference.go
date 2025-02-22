package problem389

import "fmt"

func findTheDifference(s string, t string) byte {
	n1, n2 := len(s), len(t)
	if n1 == 0 && n2 == 1 {
		return t[0]
	}
	var res byte
	k := 0
	for k < n1 {
		res ^= t[k] ^ s[k]
		k++
	}
	return res ^ t[n2-1]
}

func Runner() {
	fmt.Println(findTheDifference("abcd", "abcde"))
	fmt.Println(findTheDifference("", "y"))
}
