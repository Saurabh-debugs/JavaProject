package com.student.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Welcome extends JFrame implements ActionListener {

	JLabel l1;

	Welcome() {

		l1 = new JLabel("Welcome");
		l1.setFont(new Font("System", Font.BOLD, 35));
		setLayout(null);

		l1.setBounds(220, 130, 800, 60);
		add(l1);
		getContentPane().setBackground(Color.PINK);

		setSize(600, 600);
		setLocation(500, 90);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

	}

	public static void main(String[] args) {
		new Welcome().setVisible(true);
	}

}