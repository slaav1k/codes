package problem657

import "fmt"

func judgeCircle(moves string) bool {
	x := 0
	y := 0
	for i := 0; i < len(moves); i++ {
		switch moves[i] {
		case 'R':
			x += 1
		case 'L':
			x -= 1
		case 'U':
			y += 1
		case 'D':
			y -= 1
		}
	}
	return x == 0 && y == 0
}

func Runner() {
	fmt.Println(judgeCircle("UD"))
	fmt.Println(judgeCircle("LL"))
}
