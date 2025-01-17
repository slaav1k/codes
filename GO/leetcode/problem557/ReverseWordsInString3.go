package problem557

import (
	"fmt"
	"strings"
)

func reverseWords(s string) string {
	arr := strings.Split(s, " ")
	res := strings.Builder{}
	for i := 0; i < len(arr); i++ {
		for j := len(arr[i]) - 1; j >= 0; j-- {
			res.WriteByte(arr[i][j])
		}
		if i != len(arr)-1 {
			res.WriteByte(' ')
		}

	}
	return res.String()
}

func Runner() {
	fmt.Println(reverseWords("Let's take LeetCode contest"))
	fmt.Println(reverseWords("Mr Ding"))

}
