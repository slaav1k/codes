package main

import "fmt"

func main() {
	var m int
	fmt.Scan(&m)
	fmt.Println(m, "мин - это", m/60, "час", m%60, "минут.")

}
