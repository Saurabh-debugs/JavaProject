package com.student.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup_01 extends JFrame implements ActionListener {

	JTextField tf;
	JPasswordField t1, t2;
	JButton b1, b2;
	JLabel l1, l2, l3, l4;

	Signup_01() {

		l1 = new JLabel("Signup Form");
		l1.setFont(new Font("System", Font.BOLD, 35));

		l2 = new JLabel("Enter UserName:");
		l2.setFont(new Font("System", Font.BOLD, 22));

		l3 = new JLabel("Enter Passward :");
		l3.setFont(new Font("System", Font.BOLD, 22));

		l4 = new JLabel("Re-Enter Passward:");
		l4.setFont(new Font("System", Font.BOLD, 22));

		tf = new JTextField();
		tf.setFont(new Font("Raleway", Font.BOLD, 22));

		t1 = new JPasswordField();
		t1.setFont(new Font("Raleway", Font.BOLD, 22));

		t2 = new JPasswordField();
		t2.setFont(new Font("Raleway", Font.BOLD, 22));

		b1 = new JButton("SAVE");
		b1.setFont(new Font("System", Font.BOLD, 18));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		b2 = new JButton("EXIT");
		b2.setFont(new Font("System", Font.BOLD, 18));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b2.addActionListener(this);

		setLayout(null);

		l1.setBounds(220, 130, 800, 60);
		add(l1);

		l2.setBounds(100, 240, 190, 40);
		add(l2);

		l3.setBounds(100, 300, 190, 40);
		add(l3);

		l4.setBounds(100, 360, 230, 40);
		add(l4);

		tf.setBounds(360, 240, 360, 40);
		add(tf);

		t1.setBounds(360, 300, 360, 40);
		add(t1);

		t2.setBounds(360, 360, 360, 40);
		add(t2);

		b1.setBounds(220, 460, 160, 50);
		add(b1);

		b2.setBounds(400, 460, 160, 50);
		add(b2);

		getContentPane().setBackground(Color.PINK);

		setSize(800, 800);
		setLocation(500, 90);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		try {
			String a = tf.getText();
			String b = t1.getText();
			String c = t2.getText();

			if (ae.getSource() == b1) {
				if (tf.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Please Enter Correct Username");

				}
				if (t1.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Enter correct Passward");
				}
				if (t2.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Re-Enter correct Passward");
				}

				else {
					if (t1.getText().equals(t2.getText())) {

						Conn_01 c1 = new Conn_01();
						String q1 = "insert into valid values('" + a + "','" + b + "')";

						c1.s.executeUpdate(q1);
						JOptionPane.showMessageDialog(null, "Account Created successfully");

						new Welcome().setVisible(true);
						setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "ERROR 404)");
					}
				}
			} else if (ae.getSource() == b2) {
				System.exit(0);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error: " + e);
		}

	}

	public static void main(String[] args) {
		new Signup_01().setVisible(true);
	}
}
