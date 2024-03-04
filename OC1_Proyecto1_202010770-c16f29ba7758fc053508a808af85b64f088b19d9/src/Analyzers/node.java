/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyzers;

import java.util.ArrayList;
import Analyzers.type.Types;

/**
 *
 * @author Luisi
 */
public class node {
    String data;
    String type;
    node left;
    node right;
    boolean leaf = false;
    int counter = 0;
    ArrayList<Integer> list_of_first = new ArrayList<>();
    ArrayList<Integer> list_of_last = new ArrayList<>();
    

    public node(String data, String type) {
        this.data = data;
        this.type = type;
    }
    
    public void postOrderTraversal(node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            // Aquí puedes realizar las operaciones que desees con el nodo actual
            System.out.println("Data: " + root.data);
        }
    }
    
        public void preOrderTraversal(node root) {
        if (root != null) {
            // Aquí puedes realizar las operaciones que desees con el nodo actual
            System.out.println("Data: " + root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    
    
}
