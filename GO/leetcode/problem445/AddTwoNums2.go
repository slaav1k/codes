package problem445

import (
	"fmt"
)

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {
	var prev *ListNode
	cur := head
	for cur != nil {
		next := cur.Next
		cur.Next = prev
		prev = cur
		cur = next
	}
	return prev
}

func addTwoNum(l1 *ListNode, l2 *ListNode) *ListNode {
	var result = &ListNode{}
	head := result
	carry := 0

	for l1 != nil || l2 != nil || carry > 0 {
		sum := carry
		if l1 != nil {
			sum += l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			sum += l2.Val
			l2 = l2.Next
		}
		carry = sum / 10
		result.Next = &ListNode{Val: sum % 10}
		result = result.Next
	}
	return head.Next
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	l1R := reverseList(l1)
	l2R := reverseList(l2)
	l3 := addTwoNum(l1R, l2R)
	return reverseList(l3)
}

func createList(nums []int) *ListNode {
	if len(nums) == 0 {
		return nil
	}
	head := &ListNode{Val: nums[0]}
	cur := head
	for _, num := range nums[1:] {
		cur.Next = &ListNode{Val: num}
		cur = cur.Next
	}
	return head
}

func printList(head *ListNode) {
	for head != nil {
		fmt.Print(head.Val)
		if head.Next != nil {
			fmt.Print(" -> ")
		}
		head = head.Next
	}
	fmt.Println()
}

func Runner() {
	l1 := createList([]int{7, 2, 4, 3})
	l2 := createList([]int{5, 6, 4})
	fmt.Print("Input:  ")
	printList(l1)
	printList(l2)

	result := addTwoNumbers(l1, l2)

	fmt.Print("Output: ")
	printList(result)
}
