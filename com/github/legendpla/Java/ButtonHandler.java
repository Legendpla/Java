package com.github.legendpla.Java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}


public static void main(String[] args)
{
	JacobPanel displayPanel = new JacobPanel();
	JButton okButton = new JButton("Ok");
	ButtonHandler listener = new ButtonHandler();
	okButton.addActionListener(listener);
	
	JPanel content = new JPanel();
	content.setLayout(new BorderLayout());
	content.add(displayPanel, BorderLayout.CENTER);
	content.add(okButton, BorderLayout.SOUTH);
	
	JFrame window = new JFrame("GUI Test");
	window.setContentPane(content);
	window.setSize(250, 100);
	window.setLocation(100, 100);
	window.setVisible(true);
}
}