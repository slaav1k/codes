package problem242

import "fmt"

func isAnagram(s string, t string) bool {
	n1 := len(s)
	n2 := len(t)
	if n1 != n2 {
		return false
	}

	var count [26]int

	for i := 0; i < n1; i++ {
		count[s[i]-'a']++
		count[t[i]-'a']--
	}
	for _, v := range count {
		if v != 0 {
			return false
		}
	}
	return true
}

func Runner() {
	fmt.Println(isAnagram("anagram", "nagaram"))
	fmt.Println(isAnagram("rat", "car"))
}
