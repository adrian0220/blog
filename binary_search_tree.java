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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void insert(int data){
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
	
	public void delete(int data){
		if(root==null){
			System.out.println("삭제할 노드가 없습니다.");
			return;
		}
		
		Node parent = root;
		Node current = root;
		
		// parent의 좌,우측을 나타내는 변수
		boolean isLeft = false;
		
		// 삭제 하려는 노드 찾기
		while(current.getData()!=data){
			parent = current;
			if(current == null){
				System.out.println("노드를 찾을 수 없습니다.");
				return;
			}
			else if(current.getData()<data){
				isLeft = false;
				current = current.getRight();
			}
			else if(current.getData()>data){
				isLeft = true;
				current = current.getLeft();
			}
		}
		
		// Case1 : 자식 노드가 없는 경우
		if(current.getLeft()==null && current.getRight()==null){
			// 삭제하려는 노드가 root인 경우
			if(current == root) root = null;
			
			if(isLeft){
				parent.setLeft(null);
				
			}
			else{
				parent.setRight(null);
			}
		}
		
		// Case2: 자식 노드가 1개 인 경우
		else if(current.getLeft()==null){	// 오른쪽 서브트리가 존재
			if(current==root){	// 삭제하려는 노드가 root인 경우(parent가 존재하지 않는 경우)
				root = current.getRight();
			}
			if(isLeft){
				parent.setLeft(current.getRight());
			}
			else{
				parent.setRight(current.getRight());
			}
			
		}
		else if(current.getRight()==null){	// 왼쪽 서브트리가 존재
			if(current==root){	// 삭제하려는 노드가 root인 경우(parent가 존재하지 않는 경우)
				root = current.getLeft();
			}
			if(isLeft){
				parent.setLeft(current.getLeft());
			}else{
				parent.setRight(current.getLeft());
			}
		}
		
		// Case3: 자식 노드가 2개인 경우 (왼쪽 서브트리 선택)
		else if(current.getLeft()!=null && current.getRight()!=null){
			if(current==root){	// 삭제하려는 노드가 root인 경우(parent가 존재하지 않는 경우)
				root = current.getLeft();
			}
			if(isLeft){
				parent.setLeft(current.getLeft());
			}
			else{
				parent.setRight(current.getRight());
			}
		}
	}

}
