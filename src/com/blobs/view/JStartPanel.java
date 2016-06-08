//package com.blobs.view;
//
//import java.awt.BorderLayout;
//import java.awt.Component;
//import java.awt.Dimension;
//import java.io.File;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import javax.swing.JEditorPane;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.media.CannotRealizeException;
//import javax.media.Manager;
//import javax.media.NoPlayerException;
//import javax.media.Player;
//
//public class JStartPanel extends JPanel {
//
//	public static void main(String[] args) {
//		new JStartPanel();
//	}
//
//	public JStartPanel() {
//		super();
//
//
//		Player mediaPlayer = null;
//		try {
//			mediaPlayer = Manager.createRealizedPlayer(new File("vid" + File.separator + "prequel4.mov").toURI().toURL());
//		} catch (NoPlayerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (CannotRealizeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Component video = mediaPlayer.getVisualComponent();
//		Component controls = mediaPlayer.getControlPanelComponent();
//		JFrame f = new JFrame("Test HTML");
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.getContentPane().add(video);
//		mediaPlayer.start();
//		f.setSize(900, 700);
//		f.setVisible(true);
//	}
//}
