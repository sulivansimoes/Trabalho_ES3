package br.edu.univas.sistemadeviagem.view.Util;

import java.awt.Toolkit;
//Rafaela

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Frame extends JFrame{
	
	//Themes JTattoo				   
		public final static String MCWING = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
		public final static String SMART = "com.jtattoo.plaf.smart.SmartLookAndFeel";
		public final static String AERO = "com.jtattoo.plaf.aero.AeroLookAndFeel";
		public final static String ACRYL = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
		public final static String NOIRE = "com.jtattoo.plaf.noire.NoireLookAndFeel";
		public final static String FAST = "com.jtattoo.plaf.fast.FastLookAndFeel";						   
		public final static String BERNSTEIN = "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";
		public final static String GRAPHITE = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
		public final static String HIFI = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
		public final static String LUNA = "com.jtattoo.plaf.luna.LunaLookAndFeel";
		public final static String MINT = "com.jtattoo.plaf.mint.MintLookAndFeel";
		public final static String TEXTURE = "com.jtattoo.plaf.texture.TextureLookAndFeel";
		//Themes Sun
		public final static String WINDOWS = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		//Tema seaglass
		public final static String SEAGLASS = "com.seaglasslookandfeel.SeaGlassLookAndFeel";
		
		public Frame(){
			this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("")));
		}
		
		public final static void setlookAndFeel(String look){
		     try {
		    	 UIManager.setLookAndFeel(look);		//Passando o look and feel ex: com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		     } catch (Exception e) {
		    	 JOptionPane.showMessageDialog(null,"Contate suporte técnico! Erro no look and Feel\n"+e);
		    	 System.exit(0);
		     }
		}

}
