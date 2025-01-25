package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var s1, s2 string
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	s1 = scanner.Text()
	scanner.Scan()
	s2 = scanner.Text()
	
	if s1[0] == s2[len(s2)-1] {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
