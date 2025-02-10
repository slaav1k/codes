package problem3174

import (
	"fmt"
	"unicode"
)

func clearDigits(s string) string {
	runes := []rune(s)

	for {
		digitIndex := -1
		for i, ch := range runes {
			if unicode.IsDigit(ch) {
				digitIndex = i
				break
			}
		}

		if digitIndex == -1 {
			break
		}

		removeIndex := -1
		for i := digitIndex - 1; i >= 0; i-- {
			if !unicode.IsDigit(runes[i]) {
				removeIndex = i
				break
			}
		}

		if removeIndex != -1 {
			runes = append(runes[:removeIndex], runes[removeIndex+1:]...)
			digitIndex--
		}
		runes = append(runes[:digitIndex], runes[digitIndex+1:]...)
	}

	return string(runes)
}

func Runner() {
	fmt.Println(clearDigits("abc"))
	fmt.Println(clearDigits("cb34"))
	fmt.Println(clearDigits("a1b2c3"))
	fmt.Println(clearDigits("a1bc2d3"))
}
