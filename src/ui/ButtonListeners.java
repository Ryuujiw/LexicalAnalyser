package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonListeners implements ActionListener {
	
	private JButton btn_save, btn_exit, btn_upload, btn_analyzeLexical, btn_analyzeSyntax, btn_cancel;
	private JTextField txt_fileName;
	private JTextArea txt_outputLexical, txt_outputSyntax;
	private JFileChooser fileChooser;
	private File sourceCode;

	public ButtonListeners(JButton btn_upload, 
						   JButton btn_analyzeLexical,
						   JButton btn_analyzeSyntax,
						   JButton btn_save, 
						   JButton btn_exit, 
						   JButton btn_cancel,
						   JTextField txt_fileName,
						   JTextArea txt_outputLexical,
						   JTextArea txt_outputSyntax){
		
		this.btn_upload = btn_upload;
		this.btn_analyzeLexical = btn_analyzeLexical;
		this.btn_analyzeSyntax = btn_analyzeSyntax;
		this.btn_exit = btn_exit;
		this.btn_save = btn_save;
		this.btn_cancel = btn_cancel;
		
		this.txt_fileName = txt_fileName;
		this.txt_outputLexical = txt_outputLexical;
		this.txt_outputSyntax = txt_outputSyntax;
		
		btn_upload.addActionListener(this);
		btn_analyzeLexical.addActionListener(this);
		btn_analyzeSyntax.addActionListener(this);
		btn_exit.addActionListener(this);
		btn_save.addActionListener(this);
		btn_cancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj == btn_upload){
			
			JButton open = new JButton();
			
			fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Select source code");
			
			if(fileChooser.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
				
				sourceCode = fileChooser.getSelectedFile();
				txt_fileName.setText(sourceCode.getName()); 
			}
		}
		
		else if(obj == btn_analyzeLexical){
			//assignment 2
		}
		
		else if(obj == btn_analyzeSyntax){
			//assignment2
		}
		
		else if(obj == btn_save){
			//assignment 2
			String output = ""; //txt_outputLexical/Syntax.getText(); //get output from txt_output
			fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Save as..");
			
			int userSelection = fileChooser.showSaveDialog(null);
			
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    File fileToSave = fileChooser.getSelectedFile();
			    try {
					FileWriter fw = new FileWriter(fileToSave + ".txt");
					fw.write(output);
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
			}
			
		}
		
		else if(obj == btn_exit){
			System.exit(0);
		}
		
		else if(obj == btn_cancel){
			sourceCode = null;
			txt_fileName.setText("");
		}
		
	}
}
