package problem653

import "fmt"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func inOrder(root *TreeNode, nums *[]int) {
	if root == nil {
		return
	}
	inOrder(root.Left, nums)
	*nums = append(*nums, root.Val)
	inOrder(root.Right, nums)
}

func findTarget(root *TreeNode, k int) bool {
	var nums []int
	inOrder(root, &nums)

	left, right := 0, len(nums)-1
	for left < right {
		sum := nums[left] + nums[right]
		if sum == k {
			return true
		} else if sum < k {
			left++
		} else {
			right--
		}
	}
	return false
}

func Runner() {
	root1 := &TreeNode{
		Val: 5,
		Left: &TreeNode{
			Val:   3,
			Left:  &TreeNode{Val: 2},
			Right: &TreeNode{Val: 4},
		},
		Right: &TreeNode{
			Val:   6,
			Right: &TreeNode{Val: 7},
		},
	}
	fmt.Println(findTarget(root1, 9))
}
