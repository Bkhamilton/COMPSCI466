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
    SArraylist links = G.edges;
    
    numPages = pages.length();
    Map<String, Double> I = new HashMap<String, Double>();
    Map<String, Double> R = new HashMap<String, Double>();
    
    //For each key in G...
    //I.put(key, 1.0/G.size())
    
    //While not converged...
    
    
    return R;
  }
  
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
