import java.util.*;

public class Graph {
  String[] vertices;
  String[] edges;
}

public class pageRank {
  
  static final double lambda = 0.15;
  static final double tau = 0.0001;
  
  
  //Graph has (V,E), where V is pages and E is links
  public static Map<String, Double> PageRank(Graph G) {
    String[] pages = G.vertices;
    String[] links = G.edges;
      
    numPages = pages.length();
    
    Map<String, Double> R = new HashMap<String, Double>();
    
    return R;
  }
  
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
