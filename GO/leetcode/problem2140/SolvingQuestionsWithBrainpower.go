package problem2140

import "fmt"

func mostPoints(questions [][]int) int64 {
	n := len(questions)
	dp := make([]int64, n+1)

	for i := n - 1; i >= 0; i-- {
		points := int64(questions[i][0])
		skip := questions[i][1]

		nextIndex := i + skip + 1
		if nextIndex < n {
			points += dp[nextIndex]
		}
		dp[i] = max(dp[i+1], points)
	}
	return dp[0]
}

func max(a, b int64) int64 {
	if a > b {
		return a
	}
	return b
}

func Runner() {
	questions := [][]int{
		{3, 2}, {4, 3}, {4, 4}, {2, 5},
	}
	fmt.Println(mostPoints(questions))
}
