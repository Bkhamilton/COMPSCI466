import java.util.*;

//Ignore this. If I can, I will take a graph class from the internet
public class Graph {
  String[] vertices;
  ArrayList edges = new ArrayList();
}

public class pageRank {
  
  static final double lambda = 0.15;
  static final double tau = 0.0001;
  
  
  //Graph has (V,E), where V is pages and E is links
  public static Map<String, Double> PageRank(Graph G) {
    
    //Unsure about type for these. pages is fine, links might need to be an arraylist of arraylists
    String[] pages = G.vertices;
    ArrayList links = G.edges;
    
    numPages = pages.length();
    Map<String, Double> I = new HashMap<String, Double>();
    Map<String, Double> R = new HashMap<String, Double>();
    
    //Add each page in P to I
    for (String key : pages) {
      I.put(key, 1.0/numPages)
    }   
    
    //Need to codify "R has not converged"
    while (R has not converged) {
      //Add each page in P to R
      for (String key : pages) {
        R.put(key, lambda/G.size())
      }
      
      List<String> Q = new ArrayList<String>();
      //Fill Q with (p,q) pairs from G.Edges
      for (String p : pages) {
        Q.add(G.get(p))
      }
      for (String p : pages) {
        if (Q.size() == 0) {
          //for all q in Q
          for (String q : Q) {
            R.put(q, R.get(q) + (1-lambda) * I.get(p)/Q.size())
          }
        } else {
          //for all q in P
          for (String q : pages) {
            R.put(q, R.get(q) + (1-lambda) * I.get(p)/G.size())
          }
        }      
      }
      I = R;
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
        //DO STUFF TO s
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Hello");
    //First needs to call load(Mega File)
    //Second needs to run pageRank on all pages in file.
  }
}
