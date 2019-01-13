import java.util.*;

class Node{
	// 데이터 선언
	private int data;
	private Node left;
	private Node right;
	
	// Constructor
	public Node(int data){
		this.setData(data);
		setRight(null);
		setLeft(null);
	}
	
	// getter, setter
	public int getData() {return data;}
	public void setData(int data) {this.data = data;}
	public Node getLeft() {return left;}
	public void setLeft(Node left) {this.left = left;}
	public Node getRight() {return right;}
	public void setRight(Node right) {this.right = right;}
}

public class Solution {

	public static Node root; 
	
	public static void insert(int data){
		Node node = new Node(data);
		
		if(root == null){
			root = node;
			return;
		}
		
		Node current = root;
		Node temp = current;
		while(true){
			if(current.getData()>data){
				current = current.getLeft();
				if(current == null){
					temp.setLeft(node);
					return;
				}
				temp = current;
			}
			else if(current.getData()<data){
				current = current.getRight();
				if(current == null){
					temp.setRight(node);
					return;
				}
				temp = current;
			}
			else{
				System.out.println("중복된 값입니다.");
				return;
			}
		}
		
	}
	
	public static void preorder(Node node){
		
		if (node == null){
			return;
		}
		
		System.out.println(node.getData());
		
		preorder(node.getLeft());
		preorder(node.getRight());
		
	}
	
	public static void inorder(Node node){
		
		if (node == null){
			return;
		}
		
		inorder(node.getLeft());
		
		System.out.println(node.getData());
		
		inorder(node.getRight());
		
	}
	
	public static void postorder(Node node){
		
		if (node == null){
			return;
		}
		
		postorder(node.getLeft());
		
		postorder(node.getRight());

		System.out.println(node.getData());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이터 입력
		insert(12);
		insert(8);
		insert(25);
		insert(1);
		insert(11);
		insert(19);
		insert(27);
		
		System.out.println("Preorder");
		preorder(root);
		
		System.out.println("Inorder");
		inorder(root);
		
		System.out.println("Postorder");
		postorder(root);
				
	}
	
	
}
