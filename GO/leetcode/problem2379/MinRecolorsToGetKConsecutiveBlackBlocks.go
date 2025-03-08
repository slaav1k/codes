package problem2379

import "fmt"

func minimumRecolors(blocks string, k int) int {
	w, b := 0, 0
	n := len(blocks)
	mn := k
	for i := 0; i < k; i++ {
		if blocks[i] == 'W' {
			w++
		} else if blocks[i] == 'B' {
			b++
		}
	}
	if b == k {
		return 0
	} else {
		mn = w
	}
	for i := k; i < n; i++ {
		if blocks[i-k] == 'W' {
			w--
		} else if blocks[i-k] == 'B' {
			b--
		}
		if blocks[i] == 'W' {
			w++
		} else if blocks[i] == 'B' {
			b++
		}
		mn = min(mn, w)
	}
	return mn
}

func Runner() {
	fmt.Println(minimumRecolors("WBBWWBBWBW", 7))
	fmt.Println(minimumRecolors("WBWBBBW", 2))
}
