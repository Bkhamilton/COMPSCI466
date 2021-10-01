import java.util.*;

public class Graph {
  String[] vertices;
  ArrayList edges = new ArrayList();
}

public class pageRank {
  
  static final double lambda = 0.15;
  static final double tau = 0.0001;
  
  
  //Graph has (V,E), where V is pages and E is links
  public static Map<String, Double> PageRank(Graph G) {
    String[] pages = G.vertices;
    ArrayList links = G.edges;
    
    numPages = pages.length();
    Map<String, Double> I = new HashMap<String, Double>();
    Map<String, Double> R = new HashMap<String, Double>();
    
    //For each key in G...
    //I.put(key, 1.0/G.size())
    for (page in pages) {
      I.put(page, 1.0/numPages)
    }   
    
    while (R has not converged) {
      
      for (key in G) {
        R.put(key, lambda/G.size())
      }
      
      List<String> Q = new ArrayList<String>()
      for (p in pages) {
        Q.add(G.get(p))
      }
      for (p in pages) {
        if (Q.size() == 0) {
          for (all q in Q) {
            R.put(q, R.get(q) + (1-lambda) * I.get(p)/Q.size())
          }
        } else {
          for (all q in P) {
            R.put(q, R.get(q) + (1-lambda) * I.get(p)/G.size())
          }
        }      
      }

      
    }
    
    
    return R;
  }
  
  //Func to read .gz files. Taken from lecture
  public void load(String inFile) {
    try {
      BufferedReader br = new BufferedReader(
        new InputStreamReader(
          new GZIPInputStream(
            new FileInputStream(inFile)),
          "UTF-8"));
      String s;
      while((s = br.readLine()) != null) {
        //DO STUFF
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
