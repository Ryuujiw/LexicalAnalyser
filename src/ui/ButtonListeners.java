package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class ButtonListeners implements ActionListener {
	
	private JButton btn_save, btn_exit, btn_upload, btn_analyze;
	private JTextField txt_fileName;
	private JFileChooser fileChooser;
	private File sourceCode;

	public ButtonListeners(JButton btn_upload, JButton btn_analyze, JButton btn_save, JButton btn_exit, JTextField txt_fileName){
		this.btn_upload = btn_upload;
		this.btn_analyze = btn_analyze;
		this.btn_exit = btn_exit;
		this.btn_save = btn_save;
		
		this.txt_fileName = txt_fileName;
		
		btn_upload.addActionListener(this);
		btn_analyze.addActionListener(this);
		btn_exit.addActionListener(this);
		btn_save.addActionListener(this);
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
		
		else if(obj == btn_analyze){
			//assignment 2
		}
		
		else if(obj == btn_save){
			//assignment 2
		}
		
		else if(obj == btn_exit){
			System.exit(0);
		}
		
	}
}
