/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        Node left = head;
        Node right = findTail(head);
        while(left.data!=right.data && left.data<=right.data){
            int sum = left.data + right.data;
            if(sum == target){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left.data);
                temp.add(right.data);
                res.add(temp);
                left = left.next;
                right = right.prev;
            }
            else if(sum<target){
                left = left.next;
            }
            else{
                right = right.prev;
            }
        }
        return res;
        
    }
    public static Node findTail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }
}
