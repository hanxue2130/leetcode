package leetcode;

import leetcode.classCategory.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class naryTree_590 {
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

    //Recursive solution seems to be better
    //the only thing I am not sure is the order

    public List<Integer> postorder1(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        postorder(root, res);
        return res;
    }

    private void postorder(Node node, List<Integer> res) {
        for (Node c : node.children) {
            postorder(c, res);
        }
        res.add(node.val);
    }
}
