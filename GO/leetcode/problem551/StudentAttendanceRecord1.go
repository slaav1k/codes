package problem551

import "fmt"

func CheckRecord(s string) bool {
	countA := 0
	countL := 0
	for i := 0; i < len(s); i++ {
		if s[i] == 'A' {
			countA++
		}
		if countA >= 2 {
			return false
		}

		if s[i] == 'L' {
			countL++
			if countL >= 3 {
				return false
			}
		} else {
			countL = 0
		}
	}
	return true
}

func Runner() {
	tests := []string{
		"PPALLP",
		"PPALLL",
		"PPAAAA",
		"PPALLA",
		"PPALLPLL",
	}

	for _, test := range tests {
		fmt.Printf("Record: %s, Eligible: %v\n", test, CheckRecord(test))
	}
}
