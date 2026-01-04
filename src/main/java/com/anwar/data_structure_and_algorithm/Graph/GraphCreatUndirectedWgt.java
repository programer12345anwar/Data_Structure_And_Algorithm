package com.anwar.data_structure_and_algorithm.Graph;

import java.util.ArrayList;

public class GraphCreatUndirectedWgt {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s ,int d, int w){
            src=s;
            dest=d;
            wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        int size=graph.length;
        for(int i=0;i<size;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void main(String[] args) {
        int V=4;//vertices in the graph
        ArrayList<Edge> graph[]=new ArrayList[4];
        createGraph(graph);
        //print 2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.src +"->" +e.dest +"->" +e.wt +" ");
        }
    }
}
