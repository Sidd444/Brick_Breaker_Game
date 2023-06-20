/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siddartha
 */
package Default;



import javax.swing.JFrame;
public class Main {
    
     public static void main(String[] args) {
	        JFrame obj = new JFrame();
	        Gameplay gameplay = new Gameplay();
	        obj.setBounds(10,10,700,600);
	        obj.setTitle("BrickBreaker");
	        obj.setResizable(false);
	        obj.setVisible(true);
	        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        obj.add(gameplay);
	    }
}
