//CYCLE DETECTION in undirected -GRAPHS
//using DFS----------------------------
// import java.util.ArrayList;

// public class GraphPW2 {
//     class Solution {
    
//     public boolean dfs(int s, int p , boolean[] vis , ArrayList<ArrayList<Integer>> adj){
//         vis[s]=true;
        
//         //call dfs on connection of s 
//         for(int i:adj.get(s)){
//             if(vis[i]==false){ //if connection is unvisited , go dfs
//               if(dfs(i,s,vis,adj)==true)
//               return true;  
//         }
//             else if(vis[i]==true && i!=p){   //if visitd and not parent then cycle
//                 return true;//cycle detected
//             }
//         }
//         return false;
//     }
//     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
//       boolean[] vis= new boolean[V];
//       for(int i=0; i<V; i++){
//           if(vis[i]==false){
//             if(dfs(i,-1,vis,adj)==true)
//             return true;
//           }
//       }
//       return false;
//     }
// }
    
// }


//CYCLE DETECTION IN DIRECTED GRAPH==============================================

import java.util.ArrayList;

public class GraphPW2 {
    class Solution {
    public boolean dfs(int x,boolean[] vis ,boolean[] dfsv, ArrayList<ArrayList<Integer>> adj){
        vis[x]=true;
        dfsv[x]=true;
        
        //call dfs on unvisited connection
        for(int i: adj.get(x)){
            //unvisited
            if(vis[i]==false){
                if(dfs(i,vis,dfsv,adj)==true)
                return true;
            }
            //if visited and dfs visited
            else if(dfsv[i]==true)
            return true;
        }
        dfsv[x]=false;
        return false;
    }
   
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfsv = new boolean[V];
        
      for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfs(i,vis,dfsv,adj)==true)
                return true;
            }
        }
        return false;
    }
  }
    
}
