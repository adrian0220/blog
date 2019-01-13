package bfs;

import java.util.*;

public class Soultion {

	public static int size;
	public static int map[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// 입력 변수
		System.out.println("Size를 입력하시오:");
		size = sc.nextInt();
		
		map = new int [size][size];
		
		int a, b;
		System.out.println("간선을 입력하시오(종료 -1, -1):");
		while (true){
			a=sc.nextInt();
			b=sc.nextInt();
			if(a == -1 && b == -1) break;
			map[a][b]=1;
		}
		
		Bfs bfs = new Bfs(0,size,map);
		System.out.println("이동 순서");
		bfs.BfsAction();
	
	}

}

class Bfs{
	
	int start;
	int size;
	public static int[] token;
	public static int[][] map;
	
	Bfs(int a, int b, int[][] map){
		start = a;
		size = b;
		Bfs.map = map;
	}
	
	public void BfsAction(){

		// 방문 여부 저장
		token = new int[size];
		// start 정점 방문 표시
		token[start] = 1;
		// 큐 생성
		Queue<Integer> queue = new LinkedList<Integer>();
		// 시작 점 큐 입력
		queue.add(start);
		System.out.println(start);
		
		// Bfs 탐색 
		while(!queue.isEmpty()){
			// 큐에서 값 뺴오기
			int temp = queue.poll();
			// 0~size 탐색
			for(int i = 0; i<size ;i++){
				// 길이 존재하고 방문하지 않았다면
				if(map[temp][i]==1 && token[i]==0){
					// 큐에 추가
					queue.add(i);
					// 이동
					System.out.println(i);
					token[temp]=1;
				}
			}
		}
		
	}
	
}
