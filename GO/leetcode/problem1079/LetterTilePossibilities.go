package problem1079

import (
	"fmt"
	"sort"
)

func numTilePossibilities(tiles string) int {
	used := make([]bool, len(tiles))
	res := make(map[string]bool)

	tileSlice := []rune(tiles)
	sort.Slice(tileSlice, func(i, j int) bool { return tileSlice[i] < tileSlice[j] })

	var backtrack func(path []rune)
	backtrack = func(path []rune) {
		if len(path) > 0 {
			res[string(path)] = true
		}
		for i := 0; i < len(tileSlice); i++ {
			if used[i] || (i > 0 && tileSlice[i] == tileSlice[i-1] && !used[i-1]) {
				continue
			}
			used[i] = true
			backtrack(append(path, tileSlice[i]))
			used[i] = false
		}
	}

	backtrack([]rune{})
	return len(res)
}

func Runner() {
	fmt.Println(numTilePossibilities("AAB"))
	fmt.Println(numTilePossibilities("AAABBC"))
	fmt.Println(numTilePossibilities("V"))
}
