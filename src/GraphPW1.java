//GRAPH TRAVERSAL===>>>DFS AND BFS

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

//public class GraphPW1 {

    //DFS graph traversal========================================================================

    //by recursion
    //only function is here. Solved on gfg
        
        //public class Solution{
        // ArrayList<Integer> ans=new ArrayList<>();
        
        // public void dfs(int s, boolean[] vis, ArrayList<ArrayList<Integer>> adj){ //s =source
             
        //     //mark vertex as visited
        //     vis[s]=true;
        //     //add vertex to ans list
        //     ans.add(s);
        
        //     //call dfs on connection of vertex
        //     for(int i: adj.get(s)){
        //         if((vis[i])==false)
        //         dfs(i,vis,adj);    //call dfs on unvisited connection
        //     }
            
        // }
     
        // public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //  boolean[] vis = new boolean[V];
        //  dfs(0,vis,adj);
        //  return ans;
         
        // }
        //}


//BFS TRAVERSAL============================================================================
//BY QUEUE AND NO RECURSION-----

//   class Solution {
   
//     public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
//       //VIS,QUEUE,ANS LIST=>CREATE
//       //CREATE A QUEUE
//       //ADD SOURCE(0) TO QUEUE
//       //REMOVE VETEX FROM QUEUE
//       //IF UNVISITED
//       //1->MARK VIS->TRUE
//       //2->ADD TO ANS LIST
//       //ADD CONNECTION OF VETEX TO QUEUE
      
      
//       boolean vis[] = new boolean[V];
//       ArrayList<Integer> ans = new ArrayList<>();
//       Queue<Integer> q = new LinkedList();
      
//       q.add(0);
      
//       while(!q.isEmpty()){
//           int x = q.remove();
          
//           if(vis[x]==false){
              
//               vis[x]=true;
//               ans.add(x);
              
//               //add connection to queue
//               for(int i: adj.get(x)){
//                   q.add(i);
//               }
//           }
//       }
//       return ans;
      
//     }
// }

//}

