package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var s string
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	s = scanner.Text()
	for i := len(s) - 1; i >= 0; i-- {
		fmt.Print(string(s[i]))
	}
}
