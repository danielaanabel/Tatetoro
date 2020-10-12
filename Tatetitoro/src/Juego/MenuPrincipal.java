
package Juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MenuPrincipal {

	private JFrame pantallaInicial;
	private JTextField jugadorX;
	private JTextField jugadorO;
	private JLabel aviso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.pantallaInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pantallaInicial = new JFrame();
		pantallaInicial.setTitle("Ta-Te-Toro");
		pantallaInicial.setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/Juego/img/icono.jpeg")));
		pantallaInicial.setResizable(false);
		pantallaInicial.setBounds(100, 100, 465, 426);
		pantallaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantallaInicial.getContentPane().setLayout(null);
		pantallaInicial.setLocationRelativeTo(null);


		JLabel jugador1 = new JLabel("jugador X :");
		jugador1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		jugador1.setForeground(Color.WHITE);
		jugador1.setBounds(62, 67, 108, 33);
		pantallaInicial.getContentPane().add(jugador1);

		JLabel jugador2 = new JLabel("jugador O :");
		jugador2.setForeground(Color.WHITE);
		jugador2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		jugador2.setBounds(62, 132, 105, 33);
		pantallaInicial.getContentPane().add(jugador2);

		jugadorX = new JTextField();
		jugadorX.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					verificarInicio();
			}
		});
		jugadorX.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		jugadorX.setForeground(Color.BLACK);
		jugadorX.setBounds(171, 67, 215, 32);
		pantallaInicial.getContentPane().add(jugadorX);
		jugadorX.setColumns(10);

		jugadorO = new JTextField();
		jugadorO.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					verificarInicio();
			}
		});
		jugadorO.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		jugadorO.setForeground(Color.BLACK);
		jugadorO.setColumns(10);
		jugadorO.setBounds(171, 132, 215, 32);
		pantallaInicial.getContentPane().add(jugadorO);

		aviso = new JLabel("");
		aviso.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		aviso.setForeground(Color.WHITE);
		aviso.setBounds(34, 332, 385, 32);
		pantallaInicial.getContentPane().add(aviso);

		JButton botonInicio = new JButton("Iniciar Juego");
		botonInicio.setFocusPainted(false);
		botonInicio.setBackground(Color.PINK);
		botonInicio.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 19));
		botonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verificarInicio();
			}
		});
		botonInicio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					verificarInicio();
			}
		});
		botonInicio.setBounds(142, 273, 167, 33);
		pantallaInicial.getContentPane().add(botonInicio);

		JLabel fondo = new JLabel("");
		ImageIcon imagenFondo=new ImageIcon(MenuPrincipal.class.getResource("/Juego/img/fondo.png"));
		fondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(449, 387, Image.SCALE_SMOOTH)));
		fondo.setBounds(0, 0, 449, 387);
		pantallaInicial.getContentPane().add(fondo);
	}
	public void verificarInicio() {
		if((jugadorX.getText().length()<2 || jugadorX.getText().length()>12) || 
				(jugadorO.getText().length()<2 || jugadorO.getText().length()>12)) {
			aviso.setText("¡Debe ingresar nombres entre 2 y 12 letras!");
			}
		else {	
			pantallaInicial.setVisible(false);
			try {
				TableroVisual tablero=new TableroVisual(jugadorX.getText(),jugadorO.getText());
				tablero.getTaTeToro().setVisible(true);
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}	
	}

	public JFrame getPantallaInicial() {
		return pantallaInicial;
	}
}
