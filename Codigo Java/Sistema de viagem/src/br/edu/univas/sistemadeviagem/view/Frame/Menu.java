package br.edu.univas.sistemadeviagem.view.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.edu.univas.sistemadeviagem.view.Util.Frame;

public class Menu extends Frame {

	private static final long serialVersionUID = 5420709425090343561L;
	
	private JPanel contentPane = null;
	JMenuBar barra;
	JSeparator separator;
	JMenu planilhasMenu,cadMenu, relatoriosMenu, ajudaMenu, sairMenu;
	JMenuItem cadUsuarios, cadMotoristas, cadVeiculos, cadViagem, relatorioQuantM, relatorioQuantU, relatorioQuantV, relatorioQuantVA, manual;
	JMenu relatoriosUsuarios, relatoriosMotorista, relatoriosVeiculos, relatoriosViagem;
	JMenuItem fechar;
	
	public Menu() {
		this.setSize(700, 507);
		this.setTitle("Sistema de Viagem");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setResizable(false);
		addComponents();
	}
	
	public void addComponents() {
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());		
		contentPane.setBackground(Color.LIGHT_GRAY);
		this.setContentPane(contentPane);
				
		barra = new JMenuBar();
		setJMenuBar(barra);
		
		//Menu de planilhas
		planilhasMenu = new JMenu("Planilhas");
		barra.add(planilhasMenu);
		
		//Menu de cadastro
		cadMenu = new JMenu("Cadastro");
		barra.add(cadMenu);
		
		cadMotoristas = new JMenuItem("Motoristas");
		cadMenu.add(cadMotoristas);			
				
		cadUsuarios = new JMenuItem("Usuários");
		cadMenu.add(cadUsuarios);
			
		cadVeiculos = new JMenuItem("Veículos"); 
		cadMenu.add(cadVeiculos);
		
		cadViagem = new JMenuItem("Viagens");
		cadMenu.add(cadViagem);
		
		//Menu de relatórios
		relatoriosMenu = new JMenu("Relatórios");
		barra.add(relatoriosMenu);
		
		relatoriosMotorista = new JMenu("Motorista");
		relatoriosMenu.add(relatoriosMotorista);
		
		relatoriosUsuarios = new JMenu("Usuários");
		relatoriosMenu.add(relatoriosUsuarios);
		
		relatoriosVeiculos = new JMenu("Veículos");
		relatoriosMenu.add(relatoriosVeiculos);
		
		relatoriosViagem = new JMenu("Viagens");
		relatoriosMenu.add(relatoriosViagem);
		
		//Menu de Ajuda
		ajudaMenu = new JMenu("Ajuda");
		barra.add(ajudaMenu);
		
		manual = new JMenuItem("Manual do Sistema");
		ajudaMenu.add(manual);
		
		//Menu Sair		
		sairMenu = new JMenu("Sair");
		barra.add(sairMenu);
		
		fechar = new JMenuItem("Fechar (alt + F4)");
		fechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fecharButton();				
			}
		});
		sairMenu.add(fechar);
		
		//Relatorios de Quantidades
		relatorioQuantM = new JMenuItem("Motoristas Cadastrados");
		relatoriosMotorista.add(relatorioQuantM);
		
		relatorioQuantU = new JMenuItem("Usuários Cadastrados");
		relatoriosUsuarios.add(relatorioQuantU);
		
		relatorioQuantV = new JMenuItem("Veículos Cadastrados");
		relatoriosVeiculos.add(relatorioQuantV);
		
		relatorioQuantVA = new JMenuItem("Viagens Cadastrados");
		relatoriosViagem.add(relatorioQuantVA);
		
	}
	
	public void fecharButton(){
		System.exit(0);
	}
	
	public static void main(String[] args){
		Frame.setlookAndFeel(Frame.ACRYL);
		Menu tela = new Menu();
		tela.setVisible(true);
	}

}
