package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var str string
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	str = scanner.Text()
	for i := 0; i < len(str); i++ {
		if str[i] == ' ' && str[i+1] == ' ' {
			continue
		}
		fmt.Print(string(str[i]))
	}
}
