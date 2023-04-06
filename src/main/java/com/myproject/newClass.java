package com.myproject;

import java.util.*;

import javax.swing.*;

import java.awt.*;

public class newClass extends JFrame{
    
    private int maze[][] = 
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,1,1,1,1,1,0,0,0,0,0,1},
        {1,0,0,1,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    public ArrayList<Integer> path = new ArrayList<Integer>();

    //constructor
    public newClass(){
        setTitle("Maze Solver");
        setSize(640, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DFS.searchpath(maze, 1, 1, path);
        System.out.println(path);
    }
    @Override
    public void paint(Graphics g) {
        g.translate(320, 100);
        setLocationRelativeTo(null);
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                Color color = Color.WHITE;
                switch(maze[i][j]){
                    case 1 : color = Color.BLACK; break;
                    case 9 : color = Color.RED; break;
                }
                g.setColor(color);
                g.fillRect(50*j, 50*i, 40, 40);


            }
        }
        for(int i=0;i<path.size();i+=2){
            int x = path.get(i);
            int y = path.get(i+1);

           g.setColor(Color.ORANGE); 
           g.fillRect(50*x, 50*y, 40, 40);
        }
    }
    public static void main(String[] args) {
        newClass view = new newClass();
        view.setVisible(true);
    }
}
