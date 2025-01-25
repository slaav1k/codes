package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var s string
	scan := bufio.NewScanner(os.Stdin)
	scan.Scan()
	s = scan.Text()
	k := 0
	for el := range s {
		if string(s[el]) == " " {
			k++
		}
	}
	fmt.Println(k + 1)
}
