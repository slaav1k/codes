package problem563

import (
	"fmt"
	"math"
)

func findTilt(root *TreeNode) int {
	var sum int
	var walkTree func(tree *TreeNode) int
	walkTree = func(tree *TreeNode) int {
		if tree == nil {
			return 0
		}

		leftSum := walkTree(tree.Left)
		rightSum := walkTree(tree.Right)
		nodeTilt := int(math.Abs(float64(leftSum - rightSum)))
		sum += nodeTilt

		return leftSum + rightSum + tree.Val
	}
	walkTree(root)

	return sum
}

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func Runner() {
	root := &TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val: 2,
		},
		Right: &TreeNode{
			Val: 3,
		},
	}
	tilt := findTilt(root)
	fmt.Println("tilt:", tilt)

	root = &TreeNode{
		Val: 4,
		Left: &TreeNode{
			Val: 2,
			Left: &TreeNode{
				Val: 3,
			},
			Right: &TreeNode{
				Val: 5,
			},
		},
		Right: &TreeNode{
			Val: 9,
			Right: &TreeNode{
				Val: 7,
			},
		},
	}

	tilt = findTilt(root)
	fmt.Println("tilt:", tilt)
}
