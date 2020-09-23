package Juego;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableroVisual {

	private JFrame frmTateti;
	private char turno;
	JLabel  [] etiquetasJLabel=new JLabel[9];
	Jugar jugar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroVisual window = new TableroVisual();
					window.frmTateti.setVisible(true);
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
		turno=jugar.elegirTurno();


		frmTateti = new JFrame();
		frmTateti.getContentPane().setBackground(Color.WHITE);
		frmTateti.setTitle("Ta-Te_Toro");
		frmTateti.setBounds(100, 100, 482, 415);
		frmTateti.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTateti.getContentPane().setLayout(null);


		JLabel labelTurno = new JLabel("turno: "+turno);
		labelTurno.setBounds(39, 52, 85, 44);
		frmTateti.getContentPane().add(labelTurno);
		
		JLabel labelGanador = new JLabel("");
		labelGanador.setBounds(168, 316, 148, 23);
		frmTateti.getContentPane().add(labelGanador);

		JLabel label1 = new JLabel("");
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label1.getText().equals("")) {
					if(turno=='X')
						label1.setText("X");
					else
						label1.setText("O");
					jugar.ponerFicha(0, 0,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
						
					}
						
			}

		});

		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label1.setBounds(141, 76, 56, 59);
		frmTateti.getContentPane().add(label1);

		JLabel label2 = new JLabel("");
		label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label2.getText().equals("")) {
					if(turno=='X')
						label2.setText("X");
					else
						label2.setText("O");
					jugar.ponerFicha(0, 1,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
					
					}
					
				

			}
		});
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label2.setBounds(207, 76, 56, 59);
		frmTateti.getContentPane().add(label2);

		JLabel label3 = new JLabel("");
		label3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label3.getText().equals("")) {
					if(turno=='X')
						label3.setText("X");
					else
						label3.setText("O");
					jugar.ponerFicha(0, 2,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);	
					labelTurno.setText(" Turno: "+turno);
					turno=jugar.ProximoTurno(turno);
					}
				
				
			}
		});
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label3.setBounds(277, 76, 56, 59);
		frmTateti.getContentPane().add(label3);

		JLabel label4 = new JLabel("");
		label4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label4.getText().equals("")) {
					if(turno=='X')
						label4.setText("X");
					else
						label4.setText("O");
					jugar.ponerFicha(1, 0,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
					}
					
			}
		});
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label4.setBounds(141, 146, 56, 51);
		frmTateti.getContentPane().add(label4);

		JLabel label5 = new JLabel("");
		label5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label5.getText().equals("")) {
					if(turno=='X')
						label5.setText("X");
					else
						label5.setText("O");
					jugar.ponerFicha(1, 1,turno);
					jugar.mostrar();
					turno=jugar.ProximoTurno(turno);
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					labelTurno.setText(" Turno: "+turno);
					}
					
			}
		});
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label5.setBounds(207, 146, 56, 51);
		frmTateti.getContentPane().add(label5);

		JLabel label6 = new JLabel("");
		label6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jugar.mostrar();
				if(label6.getText().equals("")) {
					if(turno=='X')
						label6.setText("X");
					else
						label6.setText("O");
					jugar.ponerFicha(1, 2,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
					}
					
			}
		});
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label6.setBounds(273, 146, 56, 51);
		frmTateti.getContentPane().add(label6);

		JLabel label7 = new JLabel("");
		label7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label7.getText().equals("")) {
					if(turno=='X')
						label7.setText("X");
					else
						label7.setText("O");
					jugar.ponerFicha(2, 0,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
					}
					
			}
		});
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label7.setBounds(141, 208, 56, 51);
		frmTateti.getContentPane().add(label7);

		JLabel label8 = new JLabel("");
		label8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label8.getText().equals("")) {
					if(turno=='X')
						label8.setText("X");
					else
						label8.setText("O");
					jugar.ponerFicha(2, 1,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
					}
					
			}
		});
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label8.setBounds(207, 208, 56, 51);
		frmTateti.getContentPane().add(label8);

		JLabel label9 = new JLabel("");
		label9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(label9.getText().equals("")) {
					if(turno=='X')
						label9.setText("X");
					else
						label9.setText("O");
					jugar.ponerFicha(2, 2,turno);
					jugar.mostrar();
					if(jugar.comprobarGanador(turno))
						labelGanador.setText("GANO: "+turno);
					turno=jugar.ProximoTurno(turno);
					labelTurno.setText(" Turno: "+turno);
					
					}
				
			}
		});
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label9.setBounds(277, 208, 56, 51);
		frmTateti.getContentPane().add(label9);

		JLabel contenedorTablero = new JLabel("");
		contenedorTablero.setBounds(134, 60, 228, 225);
		frmTateti.getContentPane().add(contenedorTablero);
		contenedorTablero.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\Progra 3 workspace\\tateti.png"));

		
		etiquetasJLabel[0]=label1;
		etiquetasJLabel[1]=label2;
		etiquetasJLabel[2]=label3;
		etiquetasJLabel[3]=label4;
		etiquetasJLabel[4]=label5;
		etiquetasJLabel[5]=label6;
		etiquetasJLabel[6]=label7;
		etiquetasJLabel[7]=label8;
		etiquetasJLabel[8]=label9;
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jugar=new Jugar();
				turno=jugar.elegirTurno();
				labelTurno.setText("Turno: "+turno);
				labelGanador.setText("");
				for(int i=0;i<etiquetasJLabel.length;i++) {
					etiquetasJLabel[i].setText("");
				}
				
			}
		});
		btnNewButton.setBounds(335, 52, 89, 23);
		frmTateti.getContentPane().add(btnNewButton);
		
	}
	
}
