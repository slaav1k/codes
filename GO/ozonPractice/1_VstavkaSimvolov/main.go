package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var in *bufio.Reader
	var out *bufio.Writer
	in = bufio.NewReader(os.Stdin)
	out = bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var n int
	fmt.Fscan(in, &n)

	for i := 0; i < n; i++ {
		var s string
		fmt.Fscan(in, &s)
		if isValid(s) {
			fmt.Fprintln(out, "YES")
		} else {
			fmt.Fprintln(out, "NO")
		}
	}
}

func isValid(s string) bool {
	if len(s) == 1 {
		return true
	}
	first := s[0]
	last := s[len(s)-1]
	if first != last {
		return false
	}
	for i := 1; i < len(s)-1; i++ {
		if s[i] != first {
			if s[i-1] != first || s[i+1] != first {
				return false
			}
		}
	}
	return true
}
