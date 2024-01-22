package com.travel.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Dashboard  extends JFrame implements ActionListener{
	
	String username;
	JButton addpersonalDetails,viewPersonalDetails,updatePersonalDetails,CheckPackages,BookPackages,viewPackages,
	viewhotels,destinations,bookhotels,viewbookedhotels,Payments,Calculators,notepad,about;
	Dashboard(String username){
		
		this.username = username;
		//setBounds(0,0,1600,1000);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1600,65);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
		Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
		ImageIcon i3 =   new ImageIcon(i2);
		JLabel icon = new JLabel(i3);
		icon.setBounds(5,0,70,70);
		p1.add(icon);
		
		JLabel heading = new JLabel("DashBoard");
		heading.setBounds(80,10,300,40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(heading);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,65,300,900);
		add(p2);
		
	    addpersonalDetails = new JButton("Add Personal Details");
		addpersonalDetails.setBounds(0,0,300,50);
		addpersonalDetails.setBackground(new Color(0,0,102));
		addpersonalDetails.setForeground(Color.WHITE);
		addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		addpersonalDetails.setMargin(new Insets(0,0,0,85));
		addpersonalDetails.addActionListener(this);
		p2.add(addpersonalDetails);
		
		
	    updatePersonalDetails = new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,50,300,50);
		updatePersonalDetails.setBackground(new Color(0,0,102));
		updatePersonalDetails.setForeground(Color.WHITE);
		updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		updatePersonalDetails.setMargin(new Insets(0,0,0,60));
		updatePersonalDetails.addActionListener(this);
		p2.add(updatePersonalDetails);
		
		
		viewPersonalDetails = new JButton("View Details");
		viewPersonalDetails.setBounds(0,100,300,50);
		viewPersonalDetails.setBackground(new Color(0,0,102));
		viewPersonalDetails.setForeground(Color.WHITE);
		viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPersonalDetails.setMargin(new Insets(0,0,0,160));
		viewPersonalDetails.addActionListener(this);
		p2.add(viewPersonalDetails);
		
		JButton deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,150,300,50);
		deletePersonalDetails.setBackground(new Color(0,0,102));
		deletePersonalDetails.setForeground(Color.WHITE);
		deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
		deletePersonalDetails.setMargin(new Insets(0,0,0,65));
		p2.add(deletePersonalDetails);
		
		CheckPackages = new JButton("Check Packages");
		CheckPackages.setBounds(0,200,300,50);
		CheckPackages.setBackground(new Color(0,0,102));
		CheckPackages.setForeground(Color.WHITE);
		CheckPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		CheckPackages.setMargin(new Insets(0,0,0,135));
		CheckPackages.addActionListener(this);
		p2.add(CheckPackages);
		
		BookPackages = new JButton("Book Package");
		BookPackages.setBounds(0,250,300,50);
		BookPackages.setBackground(new Color(0,0,102));
		BookPackages.setForeground(Color.WHITE);
		BookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		BookPackages.setMargin(new Insets(0,0,0,140));
		BookPackages.addActionListener(this);
		p2.add(BookPackages);
		
		viewPackages = new JButton("View Package");
		viewPackages.setBounds(0,300,300,50);
		viewPackages.setBackground(new Color(0,0,102));
		viewPackages.setForeground(Color.WHITE);
		viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewPackages.addActionListener(this);
		viewPackages.setMargin(new Insets(0,0,0,140));
		p2.add(viewPackages);
		
		viewhotels = new JButton("View Hotels");
		viewhotels.setBounds(0,350,300,50);
		viewhotels.setBackground(new Color(0,0,102));
		viewhotels.setForeground(Color.WHITE);
		viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewhotels.setMargin(new Insets(0,0,0,155));
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
		
		bookhotels = new JButton("Book Hotels");
		bookhotels.setBounds(0,400,300,50);
		bookhotels.setBackground(new Color(0,0,102));
		bookhotels.setForeground(Color.WHITE);
		bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookhotels.setMargin(new Insets(0,0,0,155));
		bookhotels.addActionListener(this);
		p2.add(bookhotels);
		
		viewbookedhotels = new JButton("View Booked Hotels");
		viewbookedhotels.setBounds(0,450,300,50);
		viewbookedhotels.setBackground(new Color(0,0,102));
		viewbookedhotels.setForeground(Color.WHITE);
		viewbookedhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewbookedhotels.setMargin(new Insets(0,0,0,85));
		viewbookedhotels.addActionListener(this);
		p2.add(viewbookedhotels);
		
		destinations = new JButton("Destinations");
		destinations.setBounds(0,500,300,50);
		destinations.setBackground(new Color(0,0,102));
		destinations.setForeground(Color.WHITE);
		destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
		destinations.setMargin(new Insets(0,0,0,150));
		destinations.addActionListener(this);
		p2.add(destinations);
		
		Payments = new JButton("Payments");
		Payments.setBounds(0,550,300,50);
		Payments.setBackground(new Color(0,0,102));
		Payments.setForeground(Color.WHITE);
		Payments.setFont(new Font("Tahoma",Font.PLAIN,20));
		Payments.setMargin(new Insets(0,0,0,178));
		Payments.addActionListener(this);
		p2.add(Payments);
		
		Calculators = new JButton("Calculators");
		Calculators.setBounds(0,600,300,50);
		Calculators.setBackground(new Color(0,0,102));
		Calculators.setForeground(Color.WHITE);
		Calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
		Calculators.setMargin(new Insets(0,0,0,165));
		Calculators.addActionListener(this);
		p2.add(Calculators);

		notepad = new JButton("Notepad");
		notepad.setBounds(0,650,300,50);
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
		notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
		notepad.setMargin(new Insets(0,0,0,180));
		notepad.addActionListener(this);
		p2.add(notepad);
		
		about = new JButton("About");
		about.setBounds(0,700,300,30);
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Tahoma",Font.PLAIN,20));
		about.setMargin(new Insets(0,0,0,200));
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel image = new JLabel(i6);
		image.setBounds(0,0,1650,1000);
		add(image);
		
		
		JLabel text = new JLabel("Travel and Tourism Management System");
		text.setBounds(400,70,1200,70);
		text.setForeground(Color.WHITE);
	    text.setFont(new Font("Raleway",Font.BOLD,55));
	    image.add(text);
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == addpersonalDetails) {
			new AddCustomers(username);
		}else if(ae.getSource() == viewPersonalDetails) {
			new ViewCustomers(username);
		}else if (ae.getSource() == updatePersonalDetails) {
			new UpdateCustomers(username);
		}else if (ae.getSource() == CheckPackages) {
			new CheckPackages();
		}else if (ae.getSource() == BookPackages) {
			new BookPackages(username);
		}else if (ae.getSource() == viewPackages) {
			new ViewPackage(username);
		}else if (ae.getSource() == viewhotels) {
			new CheckHotels();
		}else if (ae.getSource() == destinations) {
			new Destination(username);
		}else if (ae.getSource() == bookhotels) {
			new BookHotels(username);
		}else if (ae.getSource() == viewbookedhotels) {
			new ViewBookedHotel(username);
		}else if (ae.getSource() == Payments) {
			new Payments();
		}else if (ae.getSource() == Calculators) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ae.getSource() == notepad) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
				}catch(Exception e){
				e.printStackTrace();
			}
		}else if(ae.getSource() == about) {
			new About();
		}
		
	}

	 public static void main(String[] args) {
		new Dashboard(" ");
	}

}
