package com.student.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login_01 extends JFrame implements ActionListener {
	

	JLabel l1, l2, l3;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;

	Login_01() {

		l1 = new JLabel("Login Form");
		l1.setFont(new Font("Osward", Font.BOLD, 35));

		l2 = new JLabel("Username");
		l2.setFont(new Font("Osward", Font.BOLD, 35));

		l3 = new JLabel("Passward");
		l3.setFont(new Font("Osward", Font.BOLD, 35));

		tf = new JTextField(15);
		pf = new JPasswordField(15);

		b1 = new JButton("SIGN IN");
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.BLACK);

		b2 = new JButton("SIGN UP");
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.BLACK);
		
		setLayout(null);
		
		l1.setBounds(280,50,450,200);
        add(l1);
        
        l2.setBounds(125,150,375,200);
        add(l2);
        
        tf.setBounds(350,235,230,30);
        add(tf);
        
        l3.setBounds(125,225,375,200);
        add(l3);
        
        tf.setFont(new Font("Arial", Font.BOLD, 14));
       
        
        pf.setFont(new Font("Arial", Font.BOLD, 14));
        pf.setBounds(350,310,230,30);
        add(pf);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,400,100,30);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);

		getContentPane().setBackground(Color.PINK);

		setSize(750, 600);
		setLocation(350, 60);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ef) {
		
		try {
			Conn_01 c1 = new Conn_01();
			String a = tf.getText();
			String b = pf.getText();
			String q  = "select * from valid where lid = '"+a+"' and pass = '"+b+"'";
			ResultSet rs = c1.s.executeQuery(q);
			
			 if(ef.getSource()==b1){
	                if(rs.next()){
	                    new Welcome().setVisible(true);
	                    setVisible(false);
	                
	                }else{
	                	JOptionPane.showMessageDialog(null, "Incorrect User Name or Password");
	                }
	                    
			 }
			 else if(ef.getSource()==b2){
	                new Signup_01().setVisible(true);
	                setVisible(false);
			 }
		} catch (Exception e) {
			e.printStackTrace();
            System.out.println("error: "+e);
		}

	}

	public static void main(String[] args) {

		new Login_01().setVisible(true);
	}


}