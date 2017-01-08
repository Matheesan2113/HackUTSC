/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragulan
 */
public class Main {
    private  static Driver instance = Driver.getInstance();
    public static void main (String args[]){
        
        instance.createTable();
    }
}
