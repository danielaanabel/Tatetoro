package Juego;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


public class TableroVisual {

	private JFrame TaTeToro;
	JButton  [] botones=new JButton[9];
	Jugar jugar;
	boolean ganoAlguien;
//	int cantTurnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroVisual window = new TableroVisual();
					window.TaTeToro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableroVisual() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//codigo negocio
		jugar=new Jugar();
		jugar.elegirTurno();
//		cantTurnos=0;
		ganoAlguien=false;
		
		TaTeToro = new JFrame();
		TaTeToro.setResizable(false);
		TaTeToro.setTitle("Ta-Te-Toro");
		TaTeToro.setIconImage(Toolkit.getDefaultToolkit().getImage(TableroVisual.class.getResource("/Juego/img/icono.jpeg")));
		TaTeToro.getContentPane().setBackground(Color.WHITE);
		TaTeToro.setBounds(100, 100, 465, 426);
		TaTeToro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TaTeToro.getContentPane().setLayout(null);

		JLabel labelTurno = new JLabel("Turno: "+jugar.turnoActual());
		labelTurno.setForeground(Color.WHITE);
		labelTurno.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		labelTurno.setBounds(36, 36, 85, 44);
		TaTeToro.getContentPane().add(labelTurno);

		JLabel labelGanador = new JLabel("");
		labelGanador.setForeground(Color.WHITE);
		labelGanador.setHorizontalAlignment(SwingConstants.CENTER);
		labelGanador.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 22));
		labelGanador.setBounds(245, 330, 148, 23);
		TaTeToro.getContentPane().add(labelGanador);

		JLabel contador = new JLabel("Turnos jugados: "+jugar.turnosJugados());
		contador.setForeground(Color.WHITE);
		contador.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		contador.setBounds(10, 323, 137, 30);
		TaTeToro.getContentPane().add(contador);


		JButton Button_0 = new JButton("");
		Button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_0.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_0.setText("X");
					else
						Button_0.setText("O");
					jugar.ponerFicha(0, 0,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_0.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_0.setBorder(null);
		Button_0.setForeground(Color.BLACK);
		Button_0.setBackground(Color.WHITE);
		Button_0.setBounds(111, 111, 56, 51);
		TaTeToro.getContentPane().add(Button_0);

		JButton Button_1 = new JButton("");
		Button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_1.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_1.setText("X");
					else
						Button_1.setText("O");
					jugar.ponerFicha(0, 1,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_1.setForeground(Color.BLACK);
		Button_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_1.setBorder(null);
		Button_1.setBackground(Color.WHITE);
		Button_1.setBounds(187, 111, 56, 51);
		TaTeToro.getContentPane().add(Button_1);

		JButton Button_2 = new JButton("");
		Button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_2.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_2.setText("X");
					else
						Button_2.setText("O");
					jugar.ponerFicha(0, 2,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();	
					labelTurno.setText("Turno: "+jugar.turnoActual());
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_2.setForeground(Color.BLACK);
		Button_2.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_2.setBorder(null);
		Button_2.setBackground(Color.WHITE);
		Button_2.setBounds(257, 113, 52, 49);
		TaTeToro.getContentPane().add(Button_2);

		JButton Button_3 = new JButton("");
		Button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_3.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_3.setText("X");
					else
						Button_3.setText("O");
					jugar.ponerFicha(1, 0,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
				
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_3.setForeground(Color.BLACK);
		Button_3.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_3.setBorder(null);
		Button_3.setBackground(Color.WHITE);
		Button_3.setBounds(115, 181, 52, 51);
		TaTeToro.getContentPane().add(Button_3);

		JButton Button_4 = new JButton("");
		Button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_4.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_4.setText("X");
					else
						Button_4.setText("O");
					jugar.ponerFicha(1, 1,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_4.setForeground(Color.BLACK);
		Button_4.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_4.setBorder(null);
		Button_4.setBackground(Color.WHITE);
		Button_4.setBounds(187, 183, 52, 49);
		TaTeToro.getContentPane().add(Button_4);

		JButton Button_5 = new JButton("");
		Button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jugar.mostrar();
				if(Button_5.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_5.setText("X");
					else
						Button_5.setText("O");
					jugar.ponerFicha(1, 2,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_5.setForeground(Color.BLACK);
		Button_5.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_5.setBorder(null);
		Button_5.setBackground(Color.WHITE);
		Button_5.setBounds(253, 183, 56, 49);
		TaTeToro.getContentPane().add(Button_5);

		JButton Button_6 = new JButton("");
		Button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_6.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_6.setText("X");
					else
						Button_6.setText("O");
					jugar.ponerFicha(2, 0,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_6.setForeground(Color.BLACK);
		Button_6.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_6.setBorder(null);
		Button_6.setBackground(Color.WHITE);
		Button_6.setBounds(115, 246, 52, 51);
		TaTeToro.getContentPane().add(Button_6);

		JButton Button_7 = new JButton("");
		Button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_7.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_7.setText("X");
					else
						Button_7.setText("O");
					jugar.ponerFicha(2, 1,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_7.setForeground(Color.BLACK);
		Button_7.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_7.setBorder(null);
		Button_7.setBackground(Color.WHITE);
		Button_7.setBounds(187, 243, 52, 51);
		TaTeToro.getContentPane().add(Button_7);

		JButton Button_8 = new JButton("");
		Button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Button_8.getText().equals("") && ganoAlguien!=true) {
					if(jugar.turnoActual()=='X')
						Button_8.setText("X");
					else
						Button_8.setText("O");
					jugar.ponerFicha(2, 2,jugar.turnoActual());
					jugar.mostrar();
					if(jugar.comprobarGanador(jugar.turnoActual())) {
						ganoAlguien=true;
						labelGanador.setText("GANO: "+jugar.turnoActual());
					}
					jugar.ProximoTurno();
					labelTurno.setText("Turno: "+jugar.turnoActual());
					contador.setText("Turnos jugados: "+jugar.turnosJugados());
				}
			}
		});
		Button_8.setForeground(Color.BLACK);
		Button_8.setFont(new Font("Tahoma", Font.PLAIN, 36));
		Button_8.setBorder(null);
		Button_8.setBackground(Color.WHITE);
		Button_8.setBounds(253, 246, 56, 51);
		TaTeToro.getContentPane().add(Button_8);

		botones[0]=Button_0;
		botones[1]=Button_1;
		botones[2]=Button_2;
		botones[3]=Button_3;
		botones[4]=Button_4;
		botones[5]=Button_5;
		botones[6]=Button_6;
		botones[7]=Button_7;
		botones[8]=Button_8;
		

		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 19));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jugar=new Jugar();
				jugar.elegirTurno();
				ganoAlguien=false;
				contador.setText("Turnos jugados: "+jugar.turnosJugados());
				labelTurno.setText("Turno: "+jugar.turnoActual());
				labelGanador.setText("");

				for(int i=0;i<botones.length;i++) {
					botones[i].setText("");
				}		
			}
		});
		btnNewButton.setBounds(317, 47, 111, 33);
		TaTeToro.getContentPane().add(btnNewButton);


		JLabel Tablero = new JLabel("");
		Tablero.setIcon(new ImageIcon(TableroVisual.class.getResource("/Juego/img/tateti.png")));
		Tablero.setBounds(111, 106, 206, 199);//	Tablero.setBounds(111, 106, 219, 203);
		TaTeToro.getContentPane().add(Tablero);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(TableroVisual.class.getResource("/Juego/img/fondo.png")));
		Fondo.setBounds(0, 0, 449, 387);
		TaTeToro.getContentPane().add(Fondo);

	}
}
