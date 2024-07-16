// Leetcode Question Reference: 
// 1. https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

import java.util.*;

class Node{
    int data;
    Node left, right;

    Node(int data){
        data = data;
        left = right = null;
    }
}

class HeightOfTree{
    Node root;
    int maxDepth(Node node){
        if(node == null){
            return 0;
        }

        else{
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if(lDepth > rDepth){
                return 1 + lDepth;
            }
            else{
                return 1 + rDepth;
            }
        }
    }
    

    // Driver code
    public static void main(String[] args){
        HeightOfTree tree = new HeightOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);

        System.out.println("Height of a given tree is:"+ tree.maxDepth(tree.root));
       
        System.out.println(" ");
      
    }
}