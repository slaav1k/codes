package problem763

import "fmt"

func partitionLabels(s string) []int {
	lastIndex := make(map[rune]int)
	for i := 0; i < len(s); i++ {
		lastIndex[rune(s[i])] = i
	}

	var res []int
	start := 0
	end := 0
	for i := 0; i < len(s); i++ {
		end = max(end, lastIndex[rune(s[i])])

		if i == end {
			res = append(res, end-start+1)
			start = i + 1
		}
	}
	return res
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func Runner() {
	fmt.Println(partitionLabels("ababcbacadefegdehijhklij"))
	fmt.Println(partitionLabels("eccbbbbdec"))
}
