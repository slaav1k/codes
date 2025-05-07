package problem3341

import "fmt"

func minTimeToReach(moveTime [][]int) int {
	m := len(moveTime)
	n := len(moveTime[0])
	dp := make([][]int, m)
	for i := 0; i < m; i++ {
		dp[i] = make([]int, n)
	}
	adj := [][]int{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}
	move := [][]int{{0, 0, 0}}
	for len(move) > 0 {
		next := [][]int{}
		for _, i := range move {
			if dp[i[0]][i[1]] > 0 && i[2] > dp[i[0]][i[1]] {
				continue
			}
			for _, j := range adj {
				r := i[0] + j[0]
				c := i[1] + j[1]
				if r < 0 || r >= m || c < 0 || c >= n {
					continue
				}
				time := max(i[2], moveTime[r][c]) + 1
				if dp[r][c] == 0 || time < dp[r][c] {
					dp[r][c] = time
					next = append(next, []int{r, c, time})
				}
			}
		}
		move = next
	}
	return dp[m-1][n-1]
}

func Runner() {
	fmt.Println(minTimeToReach([][]int{{0, 4}, {4, 4}}))
	fmt.Println(minTimeToReach([][]int{{0, 0, 0}, {0, 0, 0}}))
	fmt.Println(minTimeToReach([][]int{{0, 1}, {1, 2}}))
}
