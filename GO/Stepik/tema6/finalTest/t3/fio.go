package main

import "fmt"

func main() {
	var f, i, o string
	fmt.Scan(&f, &i, &o)
	fmt.Println(f, string(i[0])+"."+string(o[0])+".")
}
