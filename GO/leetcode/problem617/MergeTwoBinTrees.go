package problem617

import "fmt"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func mergeTrees(root1 *TreeNode, root2 *TreeNode) *TreeNode {
	if root1 == nil {
		return root2
	}
	if root2 == nil {
		return root1
	}
	root := &TreeNode{Val: root1.Val + root2.Val}
	root.Left = mergeTrees(root1.Left, root2.Left)
	root.Right = mergeTrees(root1.Right, root2.Right)
	return root
}

func treeToSlice(root *TreeNode) []interface{} {
	if root == nil {
		return nil
	}
	queue := []*TreeNode{root}
	result := []interface{}{}

	for len(queue) > 0 {
		node := queue[0]
		queue = queue[1:]
		if node == nil {
			result = append(result, nil)
			continue
		}
		result = append(result, node.Val)
		queue = append(queue, node.Left, node.Right)
	}

	for len(result) > 0 && result[len(result)-1] == nil {
		result = result[:len(result)-1]
	}
	return result
}

func Runner() {
	// Дерево root1: [1,3,2,5]
	root1 := &TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val:  3,
			Left: &TreeNode{Val: 5},
		},
		Right: &TreeNode{Val: 2},
	}

	// Дерево root2: [2,1,3,null,4,null,7]
	root2 := &TreeNode{
		Val: 2,
		Left: &TreeNode{
			Val:   1,
			Right: &TreeNode{Val: 4},
		},
		Right: &TreeNode{
			Val:   3,
			Right: &TreeNode{Val: 7},
		},
	}

	merged := mergeTrees(root1, root2)

	fmt.Println(treeToSlice(merged))
}
