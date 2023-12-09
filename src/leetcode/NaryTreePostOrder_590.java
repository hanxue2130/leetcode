package leetcode;

import java.util.LinkedList;
import java.util.List;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class NaryTreePostOrder_590 {
    public static void main(String[] args) {

    }

    public static List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root !=null){
            stack.add(root);
            while(!stack.isEmpty()) {
                Node node = stack.pollLast();
                output.addFirst(node.val);
                for (Node ele : node.children) {
                    stack.add(ele);
                }
            }
        }
        return output;
    }
}
