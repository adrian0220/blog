import java.util.*;

public class Solution {

	public static ArrayList<Integer> mapping[];
	public static int answer;
	public static int[] Nmatching;
	public static int[] Mmatching;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Input
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		mapping = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++){
			int size = sc.nextInt();
			mapping[i] = new ArrayList<Integer>();
			
			for(int j=0; j<size; j++){
				int tmp = sc.nextInt();
				mapping[i].add(tmp);
				
			}
		}
		
		// algo
		answer = 0;
		Nmatching = new int[N+1];
		Mmatching = new int[M+1];
		visited = new boolean[N+1];
		for(int i=1; i<=N; i++){
			if(matching(i)) answer++;
		}
		
		// output
		System.out.println(answer);
		
	}

	public static boolean matching(int i) {

		visited[i] = true;
		
		for(int k=0;k<mapping[i].size();k++){
			int j = mapping[i].get(k);
			if(Mmatching[j]==0||!visited[Mmatching[j]]&&matching(Mmatching[j]))  {
				Nmatching[i] = j;
				Mmatching[j] = i;
				return true;
			}
			
		}
		
		return false;
	}

}
