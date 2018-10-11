import java.util.ArrayList;
 
public class DepthFirstSearch {
 
    
    private static void dfs_rec(ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v){
         visited[v] = true;
         System.out.print(v + " ");
         for(int w : adjLists.get(v)){
            if(!visited[w]){
                dfs_rec(adjLists, visited, w);
            }
        }
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adjLists, int s){
         int n = adjLists.size();
         boolean[] visited = new boolean[n];
         dfs_rec(adjLists, visited, s);
    }
 
    
    public static void main(String[] args) {
         
		 long start;
         long end;
		 
		 start = System.currentTimeMillis();
 
         ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
         final int n = 7;
            
         for(int v=0; v<n; v++){
            adjLists.add(new ArrayList<Integer>());
        }
         
         //Vertex ke 0
         adjLists.get(0).add(1);
         adjLists.get(0).add(2);
         adjLists.get(0).add(3);
         
		 //Vertex ke 1
         adjLists.get(1).add(5);
         adjLists.get(1).add(6);
         
		 //Vertex ke 2
         adjLists.get(2).add(4);
      
		 //Vertex ke 3
         adjLists.get(3).add(2);
         adjLists.get(3).add(4);
  
		 //Vertex ke 4
         adjLists.get(4).add(1);
 
         
		 //Vertex ke 5
         adjLists.get(6).add(4);
         

         dfs(adjLists, 0);
		 
		 
		 
		 end = System.currentTimeMillis();
         System.out.println("\nWaktu yang diperlukan selama proses adalah " + ((end - start) / 1000.0) + " detik");
 
    }
 
}