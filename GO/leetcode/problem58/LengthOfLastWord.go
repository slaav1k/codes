package problem58

func lengthOfLastWord(s string) int {
	n := len(s)
	count := 0

	for i := n - 1; i >= 0; i-- {
		if count == 0 && s[i] == ' ' {
			count = 0
			continue
		}
		if s[i] == ' ' {
			break
		}
		count++
	}
	return count
}
