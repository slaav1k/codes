package problem682

import (
	"fmt"
	"strconv"
)

func calPoints(operations []string) int {
	f := []int{}
	for i := 0; i < len(operations); i++ {
		switch operations[i] {
		case "C":
			f = f[:len(f)-1]
		case "D":
			f = append(f, f[len(f)-1]*2)
		case "+":
			f = append(f, f[len(f)-1]+f[len(f)-2])
		default:
			n, _ := strconv.Atoi(operations[i])
			f = append(f, n)
		}
	}
	sum := 0
	for _, n := range f {
		sum += n
	}
	return sum
}

func Runner() {
	fmt.Println(calPoints([]string{"5", "2", "C", "D", "+"}))
	fmt.Println(calPoints([]string{"5", "-2", "4", "C", "D", "9", "+", "+"}))
	fmt.Println(calPoints([]string{"1", "C"}))
}
