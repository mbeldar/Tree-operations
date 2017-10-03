package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node x6 = new Node(5,null,null);
        Node x5 = new Node(4,null,null);
        Node x4 = new Node(3,x5,null);
        Node x3 = new Node(2,x6,null);
        Node x2 = new Node(1,x3,x4);
        Node x1 = new Node(0,x2,null);

        preOrder(x1);
        postOrder(x1);
        inOrder(x1);
        int x = height(x1);
        System.out.println(x);
    }


   static void preOrder(Node root) {

        System.out.print(root.data + " ");

        if(root.left != null)
            preOrder(root.left);

        if(root.right != null)
            preOrder(root.right);

    }
    static  void postOrder(Node root) {
        if(root.left != null)
            postOrder(root.left);

        if(root.right != null)
            postOrder(root.right);
        System.out.print(root.data + " ");
    }
    static void inOrder(Node root) {
        if(root.left != null)
            inOrder(root.left);

        System.out.print(root.data + " ");

        if(root.right != null)
            inOrder(root.right);

    }

    static int height(Node node){
        int h = 0;
        int h1 = 0;
        int h2 = 0;

        if(node.left==null&&node.right==null)
            return h;
        if(node.left!=null)
            h1 = 1 + height(node.left);

        if(node.right!=null)
            h2 = 1 + height(node.right);

        return h1>h2? h1 : h2;

    }

}
class Node {
    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    int data;
    Node left;
    Node right;
}

