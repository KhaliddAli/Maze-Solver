package com.myproject;

import java.util.ArrayList;

public class DFS {
    public static boolean searchpath(int[][] maze , int x, int y, ArrayList<Integer> path){
        // if(x<0 || x>maze.length-1 || y<0 || y>maze[0].length){
        //     return false;
        // }
        if(maze[y][x] == 2){
            return false;
        }
        if(maze[y][x]==9){
            path.add(y);
            path.add(x);
            return true;
        }

        if(maze[y][x]==0){
           maze[y][x] = 2;
           int dx =-1;
           int dy =0;
           if(searchpath(maze, x+dx, y+dy, path)){
            path.add(x);
            path.add(y);
            return true;
           } 
           dx = 1;
           dy =0;
           if(searchpath(maze, x+dx, y+dy, path)){
            path.add(x);
            path.add(y);
            return true;
           } 
           dx = 0;
           dy = -1;
           if(searchpath(maze, x+dx, y+dy, path)){
            path.add(x);
            path.add(y);
            return true;
           } 
           dx = 0;
           dy =1;
           if(searchpath(maze, x+dx, y+dy, path)){
            path.add(x);
            path.add(y);
            return true;
           } 
        }
        return false;
    }
}
