package bfsproblem;
 
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Solution {
 
   public static void main(String[] args) {
      // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        // mapsize 입력
        int size = sc.nextInt();
        
        // map 입력
        int[][] map = new int[size][size];
        Vertex[][] vertex = new Vertex[size][size]; 
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                // vertex 정의
                vertex[i][j]=new Vertex();
                vertex[i][j].x=i;    
                vertex[i][j].y=j;
            
            }
        }
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){        
                // map 생성
                map[i][j]=sc.nextInt();
                // 0인 경우 길이 없고, 1인 경우 길이 있다.
            }
        }
        
        //BFS를 위한 큐 생성
        Queue<Vertex> queue = new LinkedList<Vertex>();
        
        // Vertex 시작점 정의하기
        vertex[0][0].dist = 1;
        
        // 큐에 삽입
        queue.add(vertex[0][0]);
                      
        while(!queue.isEmpty()){
            // 큐에 vertex가 없으면 종료
            if(queue.peek()==null){ 
                System.out.println("더이상 길이 없습니다.");
                break;
            }
            
            // Vertex에서 위치 가져오기
            int x = queue.peek().x;
            int y = queue.peek().y;
            int dist = queue.peek().dist;
            
            // 도착점에 도착하면 종료
            if(x==size-1 && y==size-1){
                System.out.println("도착점입니다.");
                System.out.println("거리: "+dist);
                break;
            }
            
            // 방문 Vertex의 경우 넘어간다.
            if(queue.peek().visited==true){
                queue.poll();
                continue;
            }
            // 방문하지 않았다면, 방문처리 한 뒤 연산을 수행한다.
            else{
                queue.peek().visited=true;
            }
            
            // 위쪽 탐색
            if(x!=0 && map[x-1][y]==1){
                vertex[x-1][y].dist = dist+1;
                queue.add(vertex[x-1][y]);
              }
            
            // 아래쪽 탐색
            if(x!=size-1 && map[x+1][y]==1){
                vertex[x+1][y].dist = dist+1;
                queue.add(vertex[x+1][y]);
            }
            // 좌측 탐색
            if(y!=0 && map[x][y-1]==1){
                vertex[x][y-1].dist = dist+1;
                queue.add(vertex[x][y-1]);
            }
            
            // 우측 탐색
            if(y!=size-1 && map[x][y+1]==1){
                vertex[x][y+1].dist = dist+1;
                queue.add(vertex[x][y+1]);
            }
            
            // 탐색 후 큐에서 제거 함
            queue.poll();
        }
        
   }     
   
}
 
class Vertex{
   //초기 인덱스 
    int x=-1; int y=-1;
    //연결 Vertex
    LinkedList<Vertex> linkedList=new LinkedList<Vertex>();
    int dist=-1;
     
    boolean visited=false;
     
    }
