package com.travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class About extends JFrame implements ActionListener{
	About(){
		setBounds(600,200,500,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		
		JLabel l1 = new JLabel("ABOUT");
		l1.setBounds(200,10,100,40);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(l1);
		
		String s = "ABOUT Projects           \n"
				+ "\r\n"
				+ "The objective of the Travel and Tourism Management Systemproject is to develop a system that automates the processes and activities of a travel and the purpose is to design a system using which one can perform all operations related to traveling\r\n"
				+ "\r\n"
				+ "This application will help in accessing the information related to the travel to the particular destination with great ease. The users can track the information related to their tours with great ease through this application. The travel agency information can also be obtained through this application\r\n"
				+ "\r\n"
				+ "Advantages of Project\r\n"
				+ "\r\n"
				+ "Gives accurate information\r\n"
				+ "\r\n"
				+ "Simplifies the manual work It\r\n"
				+ "\r\n"
				+ "Minimizes the documentation related work Provides up to date information\r\n"
				+ "\r\n"
				+ "Friendly Environment by providing warning messages.\r\n"
				+ "\r\n"
				+ "Traveler's details can be provided booking confirmation notification";
		
		
		TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
		area.setEditable(false);
		area.setBounds(20,100,450,300);
		add(area);
		
		JButton back =new JButton("Back");
		back.setBounds(200,420,100,25);
		back.addActionListener(this);
		add(back);
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		  
		setVisible(false);
		
	}

	public static void main(String[] args) {
	    new About();

	}

	

}




