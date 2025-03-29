package problem559

type Node struct {
	Val      int
	Children []*Node
}

func maxDepth(root *Node) int {
	if root == nil {
		return 0
	}
	m := 0
	for _, child := range root.Children {
		m = max(m, maxDepth(child))
	}
	return m + 1
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func Runner() {
	// Пример: root = [1,null,3,2,4,null,5,6]
	root := &Node{Val: 1, Children: []*Node{
		{Val: 3, Children: []*Node{
			{Val: 5},
			{Val: 6},
		}},
		{Val: 2},
		{Val: 4},
	}}

	depth := maxDepth(root)
	println("Максимальная глубина дерева:", depth) // Ожидаемый результат: 3
}
