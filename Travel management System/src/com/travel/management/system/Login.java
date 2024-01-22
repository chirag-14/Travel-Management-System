package com.travel.management.system;                                    

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Login extends JFrame implements ActionListener{                             
	
	JButton login,SignUp,password;
	JLabel  lblusername,lblpassword,text;
	JTextField tfusername,tfpassword;
	
 Login(){
	    setSize(900,400);
	    setLocation(350,200);
	    setLayout(null);
	    
	    getContentPane().setBackground(Color.white);
	    
	    JPanel p1 = new JPanel();
	    p1.setBackground(new Color(131,193,233));
	    p1.setBounds(0,0,400,400);
	    add(p1);
	    
	    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
	    Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
	    ImageIcon i3 = new ImageIcon(i2);
	    JLabel image = new JLabel(i3);
	    image.setBounds(100,120,200,200);
	    p1.setLayout(null);
	    p1.add(image);
	    
	    JPanel p2 = new JPanel();
	    p2.setLayout(null);
	    p2.setBounds(400,30,450,300);
	    add(p2);
	    
	    lblusername = new JLabel("Username");
	    lblusername.setBounds(60,20,100,30);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
	    p2.add(lblusername);
	    
	    tfusername = new JTextField();
	    tfusername.setBounds(60,60,300,30);
	    tfusername.setBorder(BorderFactory.createEmptyBorder());
	    p2.add(tfusername);
	    
	    
	    lblpassword = new JLabel("Password");
	    lblpassword.setBounds(60,100,100,30);
	    lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
	    p2.add(lblpassword);
	    
	    tfpassword = new JTextField();
	    tfpassword.setBounds(60,140,300,30);
	    tfpassword.setBorder(BorderFactory.createEmptyBorder());
	    p2.add(tfpassword);
	    
	    login = new JButton("Login");
	    login.setBounds(60,200,130,30);
	    login.setBackground(new Color(133,193,233));
	    login.setForeground(Color.white);
	    login.setBorder(new LineBorder(new Color(133,193,233)));
	    login.addActionListener(this);
	    p2.add(login);
	    
	    
	    SignUp = new JButton("SignUp");
	    SignUp.setBounds(230,200,130,30);
	    SignUp.setBackground(new Color(133,193,233));
	    SignUp.setForeground(Color.white);
	    SignUp.setBorder(new LineBorder(new Color(133,193,233)));
	    SignUp.addActionListener(this);
	    p2.add(SignUp);
	    
	    
	    password = new JButton("Forgot Password");
	    password.setBounds(130,250,130,30);
	    password.setBackground(new Color(133,193,233));
	    password.setForeground(Color.white);
	    password.setBorder(new LineBorder(new Color(133,193,233)));
	    password.addActionListener(this);
	    p2.add(password);
	    
	    JLabel text = new JLabel("Trouble in login...");
	    text.setBounds(300,250,150,20);
	    text.setForeground(Color.RED);
	    p2.add(text);
	    
	   
	    
	    setVisible(true);
	    
	}
 
    @Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== login) {
			try {
				String username = tfusername.getText();
				String password = tfpassword.getText();
				
				String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
				Conn c = new Conn();
			    ResultSet rs = 	c.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Loading(username);
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect username or password");
					}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(ae.getSource()== SignUp) {
			setVisible(false);
			new Signup();
		}else {
			setVisible(false);
			new ForgetPassword();
		}
    }


	public static void main(String[] args) {
		Login l = new Login();
	}
}

