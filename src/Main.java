import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  
        int M = sc.nextInt();  
        int K = sc.nextInt();  

      
        List<List<Integer>> adj = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

   
        Map<Integer, Map<Integer, Set<Integer>>> BT = new HashMap<>();
        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            BT.computeIfAbsent(a, x -> new HashMap<>())
                       .computeIfAbsent(b, x -> new HashSet<>())
                       .add(c);
        }

      
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {1, -1, 1});


        Map<Integer, Map<Integer, Integer>> VTD = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> parent = new HashMap<>();

        VTD.computeIfAbsent(1, x -> new HashMap<>()).put(-1, 1);

        boolean found = false;
        int finalCity = -1, prevCity = -1;

        while (!q.isEmpty()) {
            int[] front = q.poll();
            int current = front[0];import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  
        int M = sc.nextInt();  
        int K = sc.nextInt();  

      
        List<List<Integer>> adj = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

   
        Map<Integer, Map<Integer, Set<Integer>>> BT = new HashMap<>();
        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            BT.computeIfAbsent(a, x -> new HashMap<>())
                       .computeIfAbsent(b, x -> new HashSet<>())
                       .add(c);
        }

      
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {1, -1, 1});


        Map<Integer, Map<Integer, Integer>> VTD = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> parent = new HashMap<>();

        VTD.computeIfAbsent(1, x -> new HashMap<>()).put(-1, 1);

        boolean found = false;
        int finalCity = -1, prevCity = -1;

        while (!q.isEmpty()) {
            int[] front = q.poll();
            int current = front[0];
            int prev = front[1];
            int dist = front[2];

            if (current == N) {
                found = true;
                finalCity = current;
                prevCity = prev;
                break;
            }

            for (int neighbor : adj.get(current)) {
               
                if (prev != -1 && BT.containsKey(prev) &&
                    BT.get(prev).containsKey(current) &&
                    BT.get(prev).get(current).contains(neighbor)) {
                    continue;
                }

                if (!VTD.containsKey(neighbor) || !VTD.get(neighbor).containsKey(current) || VTD.get(neighbor).get(current) > dist + 1) {
                    VTD.computeIfAbsent(neighbor, x -> new HashMap<>()).put(current, dist + 1);
                    parent.computeIfAbsent(neighbor, x -> new HashMap<>()).put(current, prev);
                    q.offer(new int[] {neighbor, current, dist + 1});
                }
            }
        }

        if (!found) {
            System.out.println(-1);
            return;
        }

      
        List<Integer> path = new ArrayList<>();
        int current = finalCity;
        int prev = prevCity;
        while (current != 1) {
            path.add(current);
            int temp = current;
            current = prev;
            prev = parent.get(temp).get(prev);
        }
        path.add(1);
        Collections.reverse(path);

        System.out.println(path.size());
        for (int city : path) {
            System.out.print(city + " ");
        }
        System.out.println();
    }
}
            int prev = front[1];
            int dist = front[2];

            if (current == N) {
                found = true;
                finalCity = current;
                prevCity = prev;
                break;
            }

            for (int neighbor : adj.get(current)) {
               
                if (prev != -1 && BT.containsKey(prev) &&
                    BT.get(prev).containsKey(current) &&
                    BT.get(prev).get(current).contains(neighbor)) {
                    continue;
                }

                if (!VTD.containsKey(neighbor) || !VTD.get(neighbor).containsKey(current) || VTD.get(neighbor).get(current) > dist + 1) {
                    VTD.computeIfAbsent(neighbor, x -> new HashMap<>()).put(current, dist + 1);
                    parent.computeIfAbsent(neighbor, x -> new HashMap<>()).put(current, prev);
                    q.offer(new int[] {neighbor, current, dist + 1});
                }
            }
        }

        if (!found) {
            System.out.println(-1);
            return;
        }

      
        List<Integer> path = new ArrayList<>();
        int current = finalCity;
        int prev = prevCity;
        while (current != 1) {
            path.add(current);
            int temp = current;
            current = prev;
            prev = parent.get(temp).get(prev);
        }
        path.add(1);
        Collections.reverse(path);

        System.out.println(path.size());
        for (int city : path) {
            System.out.print(city + " ");
        }
        System.out.println();
    }
}
