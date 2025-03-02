package problem2570

func mergeArrays(nums1 [][]int, nums2 [][]int) [][]int {
	i, j := 0, 0
	n, m := len(nums1), len(nums2)
	res := [][]int{}

	for i < n && j < m {
		if nums1[i][0] == nums2[j][0] {
			res = append(res, []int{nums1[i][0], nums1[i][1] + nums2[j][1]})
			i++
			j++
		} else if nums1[i][0] < nums2[j][0] {
			res = append(res, nums1[i])
			i++
		} else {
			res = append(res, nums2[j])
			j++
		}
	}

	for i < n {
		res = append(res, nums1[i])
		i++
	}
	for j < m {
		res = append(res, nums2[j])
		j++
	}

	return res
}
