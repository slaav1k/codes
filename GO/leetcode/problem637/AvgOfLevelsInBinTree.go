package problem637

import "fmt"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func averageOfLevels(root *TreeNode) []float64 {
	if root == nil {
		return []float64{}
	}

	result := []float64{}
	queue := []*TreeNode{root}
	for len(queue) > 0 {
		n := len(queue)
		sum := float64(0)
		for i := 0; i < n; i++ {
			node := queue[0]
			queue = queue[1:]
			sum += float64(node.Val)
			if node.Left != nil {
				queue = append(queue, node.Left)
			}
			if node.Right != nil {
				queue = append(queue, node.Right)
			}
		}
		result = append(result, sum/float64(n))
	}
	return result
}

func Runner() {
	root1 := &TreeNode{
		Val: 3,
		Left: &TreeNode{
			Val: 9,
		},
		Right: &TreeNode{
			Val:   20,
			Left:  &TreeNode{Val: 15},
			Right: &TreeNode{Val: 7},
		},
	}
	fmt.Println(averageOfLevels(root1))
}
