package problem1672

func maximumWealth(accounts [][]int) int {
	mx := 0
	sm := 0
	for _, account := range accounts {
		sm = 0
		for i := 0; i < len(account); i++ {
			sm += account[i]
		}
		if sm > mx {
			mx = sm
		}
	}
	return mx
}
