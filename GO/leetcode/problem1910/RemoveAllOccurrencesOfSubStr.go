package problem1910

import (
	"fmt"
	"strings"
)

func removeOccurrences(s string, part string) string {
	for {
		s2 := strings.Replace(s, part, "", 1)
		if s2 == s {
			return s
		}
		s = s2
	}
}

func Runner() {
	fmt.Println(removeOccurrences("daabcbaabcbc", "abc"))
	fmt.Println(removeOccurrences("axxxxyyyyb", "xy"))
}
