package com.travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class ForgetPassword extends JFrame implements ActionListener {
	
	JLabel lblusername,lblname,lblquestion,lblans,lblpassword;
	JTextField tfusername,tfname,tfquestion,tfans,tfpassword;
	JButton search,retrieve,back;
	
	private static final int SCALE_DEFAULT = 0;
	ForgetPassword(){
		
		setBounds(350,200,850,380);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200,200, SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(850,70,200,200);
		
		
	    JPanel p1 = new JPanel();
	    p1.setLayout(null);
	    p1.setBounds(30,30,500,280);
	    add(p1);
	    
	    lblusername = new JLabel("username");
	    lblusername.setBounds(40,20,100,25);
	    lblusername.setFont(new Font("tahoma",Font.BOLD,14));
	    p1.add(lblusername);
	    
	    tfusername = new JTextField();
	    tfusername.setBounds(220,20,150,25);
	    tfusername.setBorder(BorderFactory.createEmptyBorder());
	    p1.add(tfusername);
	    
	    search = new JButton("search");
	    search.setBackground(Color.GRAY);
	    search.setForeground(Color.WHITE);
	    search.setBounds(380,20,100,25);
	    search.addActionListener(this);
	    p1.add(search);
	    
	    lblname = new JLabel("NAME");
	    lblname.setBounds(40,60,100,25);
	    lblname.setFont(new Font("tahoma",Font.BOLD,14));
	    p1.add(lblname);
	    
	    tfname = new JTextField();
	    tfname.setBounds(220,60,150,25);
	    tfname.setBorder(BorderFactory.createEmptyBorder());
	    p1.add(tfname);
	    
	    lblquestion = new JLabel("Security Question");
	    lblquestion.setBounds(40,100,150,25);
	    lblquestion.setFont(new Font("tahoma",Font.BOLD,14));
	    p1.add(lblquestion);
	    
	    tfquestion = new JTextField();
	    tfquestion.setBounds(220,100,150,25);
	    tfquestion.setBorder(BorderFactory.createEmptyBorder());
	    p1.add(tfquestion);
	    
	    lblans = new JLabel("Answer");
	    lblans.setBounds(40,140,150,25);
	    lblans.setFont(new Font("tahoma",Font.BOLD,14));
	    p1.add(lblans);
	    
	    tfans = new JTextField();
	    tfans.setBounds(220,140,150,25);
	    tfans.setBorder(BorderFactory.createEmptyBorder());
	    p1.add(tfans);
	    
	    
	    retrieve = new JButton("Retrieve");
	    retrieve.setBackground(Color.GRAY);
	    retrieve.setForeground(Color.WHITE);
	    retrieve.setBounds(380,140,100,25);
	    retrieve.addActionListener(this);
	    p1.add(retrieve);
	    
	    lblpassword = new JLabel("Password");
	    lblpassword.setBounds(40,180,150,25);
	    lblpassword.setFont(new Font("tahoma",Font.BOLD,14));
	    p1.add(lblpassword);
	    
	    tfpassword = new JTextField();
	    tfpassword.setBounds(220,180,150,25);
	    tfpassword.setBorder(BorderFactory.createEmptyBorder());
	    p1.add(tfpassword);
	    
	    back = new JButton("Back");
	    back.setBackground(Color.GRAY);
	    back.setForeground(Color.WHITE);
	    back.setBounds(150,230,100,25);
	    back.addActionListener(this);
	    p1.add(back);
	    
	    
	    // setVisible(false);
	    //new Login();
	    setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== search) {
			try {
				String query = "select * from account where username = '"+tfusername.getText()+"'";
				Conn c = new Conn();
				
				ResultSet rs = c.s.executeQuery(query);
				while(rs.next()) {
					tfname.setText(rs.getString("name"));
					tfquestion.setText(rs.getString("security"));}
				}catch(Exception e) {
				e.printStackTrace();
			}
			} else if(ae.getSource() == retrieve) {
				try {
					String query ="select * from account where ans = '"+tfans.getText()+"' AND username = '"+tfusername.getText()+"'";
					Conn c = new Conn();
					ResultSet rs = c.s.executeQuery(query);
					while(rs.next()) {
						tfpassword.setText(rs.getString("password"));
						
					}
					}catch(Exception e) {
					e.printStackTrace();
				}
			
		}else {
			setVisible(false);
			new Login();
			
		}
	}
	
        public static void main(String[] args) {
	    new ForgetPassword();
}
		
			
		
}
