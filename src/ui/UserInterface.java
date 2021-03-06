package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserInterface {
	
	private JButton btn_save, btn_exit, btn_upload, btn_analyzeLexical, btn_analyzeSyntax, btn_cancel;
	private JTextField txt_fileName;
	private JTextArea txt_outputLexical, txt_outputSyntax;
	private JScrollPane scroll_outputLexical, scroll_outputSyntax;

	public UserInterface(){
		JFrame frame = initialize();
		northPanelCreator(frame);
		centerPanelCreator(frame);
		southPanelCreator(frame);
		ButtonListeners btnListeners = new ButtonListeners(btn_upload, btn_analyzeLexical, btn_analyzeSyntax, btn_save, btn_exit, btn_cancel, txt_fileName, txt_outputLexical, txt_outputSyntax);
	}
	
	public JFrame initialize(){
		JFrame frame = new JFrame("Compiler Construction TK3163 Assignment");
		frame.setLayout(new BorderLayout());
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		return frame;
	}
	
	public void northPanelCreator(JFrame frame){
		JPanel northPanel = new JPanel();
		
		JLabel lbl_title = new JLabel("<html><div style='text-align: center;'>Lexical Analyzer <br />A program that takes source code and sorts its tokens into keywords, identifiers, literals and other types.</div></html>");
		lbl_title.setPreferredSize(new Dimension(600, 100));
		lbl_title.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		northPanel.add(lbl_title);
		
		frame.add(northPanel, BorderLayout.NORTH);
	}

	public void centerPanelCreator(JFrame frame){
		JPanel centerPanel = new JPanel();
		JPanel outputPanel = new JPanel();
		
		JLabel lbl_step1 = new JLabel("Step 1. ");
		JLabel lbl_step2 = new JLabel("Step 2. ");
		JLabel lbl_upload = new JLabel("Upload your file here:");
		
		btn_upload = new JButton("Upload");
		btn_analyzeLexical = new JButton("Lexical Analysis");
		btn_analyzeSyntax = new JButton("Syntax Analysis");
		btn_cancel = new JButton("Cancel");
		
		txt_fileName = new JTextField(40);
		txt_fileName.setEditable(false);
		
		txt_outputLexical = new JTextArea(20,32);
		txt_outputLexical.setEditable(false);
		txt_outputLexical.setText("  Lexical Analysis");
		
		txt_outputSyntax = new JTextArea(20,32);
		txt_outputSyntax.setEditable(false);
		txt_outputSyntax.setText("  Syntax Analyis");
		
		scroll_outputLexical = new JScrollPane(txt_outputLexical);
		scroll_outputLexical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		scroll_outputSyntax = new JScrollPane(txt_outputSyntax);
		scroll_outputSyntax.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		centerPanel.add(lbl_step1);
		centerPanel.add(lbl_upload);
		centerPanel.add(txt_fileName);
		centerPanel.add(btn_upload);
		centerPanel.add(btn_cancel);
		centerPanel.add(lbl_step2);
		centerPanel.add(btn_analyzeLexical);
		centerPanel.add(btn_analyzeSyntax);
		outputPanel.add(scroll_outputLexical);
		outputPanel.add(scroll_outputSyntax);

		centerPanel.add(outputPanel);
		
		frame.add(centerPanel, BorderLayout.CENTER);
	}
	
	public void southPanelCreator(JFrame frame){
		JPanel southPanel = new JPanel();
		
		btn_save = new JButton("Save As");
		btn_exit = new JButton("Exit");

		southPanel.add(btn_save);
		southPanel.add(btn_exit);
		
		frame.add(southPanel, BorderLayout.SOUTH);
	}
}
