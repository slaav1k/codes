package problem1790

import "fmt"

func areAlmostEqual(s1 string, s2 string) bool {
	if len(s1) != len(s2) {
		return false
	}
	
	var diffs []int
	for i := 0; i < len(s1); i++ {
		if s1[i] != s2[i] {
			diffs = append(diffs, i)
			if len(diffs) > 2 {
				return false
			}
		}
	}

	if len(diffs) == 0 {
		return true
	}

	if len(diffs) == 2 {
		i, j := diffs[0], diffs[1]
		return s1[i] == s2[j] && s1[j] == s2[i]
	}

	return false
}

func Runner() {
	fmt.Println(areAlmostEqual("abc", "abc"))
	fmt.Println(areAlmostEqual("bank", "kanb"))
	fmt.Println(areAlmostEqual("attack", "defend"))
	fmt.Println(areAlmostEqual("caa", "aaz"))
}
