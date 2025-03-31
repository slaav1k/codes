package problem589

import "fmt"

type Node struct {
	Val      int
	Children []*Node
}

func preorder(root *Node) []int {
	result := []int{}
	if root == nil {
		return result
	}

	var helper func(*Node)
	helper = func(node *Node) {
		if node == nil {
			return
		}
		result = append(result, node.Val)
		for _, child := range node.Children {
			helper(child)
		}
	}

	helper(root)
	return result
}

func Runner() {
	root1 := &Node{
		Val: 1,
		Children: []*Node{
			{Val: 3, Children: []*Node{
				{Val: 5},
				{Val: 6},
			}},
			{Val: 2},
			{Val: 4},
		},
	}
	fmt.Println(preorder(root1))

	root2 := &Node{
		Val: 1,
		Children: []*Node{
			{Val: 2},
			{Val: 3, Children: []*Node{
				{Val: 6},
				{Val: 7, Children: []*Node{
					{Val: 11, Children: []*Node{
						{Val: 14},
					}},
				}},
			}},
			{Val: 4, Children: []*Node{
				{Val: 8, Children: []*Node{
					{Val: 12},
				}},
			}},
			{Val: 5, Children: []*Node{
				{Val: 9, Children: []*Node{
					{Val: 13},
				}},
				{Val: 10},
			}},
		},
	}
	fmt.Println(preorder(root2))
}
