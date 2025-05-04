package problem1128

func numEquivDominoPairs(dominoes [][]int) int {
	count := 0
	freq := make(map[int]int)

	for _, d := range dominoes {
		a, b := d[0], d[1]
		if a > b {
			a, b = b, a
		}
		key := a*10 + b

		count += freq[key]
		freq[key]++
	}

	return count
}
