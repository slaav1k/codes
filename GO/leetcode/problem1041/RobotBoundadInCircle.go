package problem1041

import "fmt"

func isRobotBounded(instructions string) bool {
	x, y, direct := 0, 0, 0
	n := len(instructions)
	for i := 0; i < n; i++ {
		if string(instructions[i]) == "R" {
			direct = (direct + 1) % 4
		} else if string(instructions[i]) == "L" {
			direct = (direct + 3) % 4
		} else {
			switch direct {
			case 0:
				y++
			case 1:
				x++
			case 2:
				y--
			case 3:
				x--
			}
		}
	}
	return x == 0 && y == 0 || direct != 0
}

func Runner() {
	fmt.Println(isRobotBounded("GGLLGG"))
	fmt.Println(isRobotBounded("GG"))
	fmt.Println(isRobotBounded("GL"))
	fmt.Println(isRobotBounded("GLRLLGLL"))
}
