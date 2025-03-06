package problem709

func toLowerCase(s string) string {
	n := len(s)
	res := []byte(s)
	for i := 0; i < n; i++ {
		if res[i] >= 'A' && res[i] <= 'Z' {
			res[i] = res[i] + ('a' - 'A')
		}
	}
	return string(res)
}
