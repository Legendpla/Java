package com.github.legendpla.Java;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JacobPanel extends JPanel
{	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Jacob Panel", 20, 30);
	}
}