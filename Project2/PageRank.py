#Ben Hamilton
#Project 2

#Graph G has vertices, V, and edges, E
#vertices = Pages, edges = Links

def pageRank(G):
  pages = G.vertices
  links = G.edges
  
  numPages = pages.length()
  #I,R = PageRank estimate
  
