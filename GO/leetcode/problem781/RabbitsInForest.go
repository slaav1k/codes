package problem781

import "fmt"

func numRabbits(answers []int) int {
	groups_by_answers := make(map[int]int)
	for _, answer := range answers {
		groups_by_answers[answer]++
	}
	total := 0
	for answer, count := range groups_by_answers {
		group_size := answer + 1
		groups := (count + group_size - 1) / group_size
		total += groups * group_size
	}
	return total
}

func Runner() {
	fmt.Println(numRabbits([]int{1, 1, 2}))
	fmt.Println(numRabbits([]int{10, 10, 10, 10}))
}
