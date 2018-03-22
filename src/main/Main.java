package main;

import javax.swing.SwingUtilities;

import ui.UserInterface;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new UserInterface();
			}
		}); //initiates the UI. 	
	}
}
