package Juego;

import java.util.Random;

public class Jugar {
	char [][] tablero;
	private char turno;
	private int cantTurnos;
	
	
	public Jugar(){
		tablero=new char[3][3];//tablero vacio
		cantTurnos=0;
	}
	
	public void elegirTurno() {//quien juega primero
		Random random=new Random();
		int numRandom=random.nextInt(2);
		if(numRandom==0)
			turno='O';
		else 
			turno='X';
//		return numRandom==0?'O':'X'; 
	}
	
	void ProximoTurno(){
		if (turno=='X')
			turno='O';
//			return 'O';
		else
			turno='X';
//			return 'X';	
	}
	
	char turnoActual() {
		return turno;
	}
	
	int turnosJugados(){
		return cantTurnos;
	}
	
	public void ponerFicha(int f, int c,char turno) {
		tablero[f][c]=turno;
		cantTurnos++;
	}
	
	boolean comprobarGanador(char turno){
		boolean a,b,c,d,e,f,g,h,i,j,k,l;
		a=tablero[0][0]==turno && tablero[0][1]==turno && tablero[0][2]==turno;//horizontales
		b=tablero[1][0]==turno && tablero[1][1]==turno && tablero[1][2]==turno;//
		c=tablero[2][0]==turno && tablero[2][1]==turno && tablero[2][2]==turno;//
		d=tablero[0][0]==turno && tablero[1][0]==turno && tablero[2][0]==turno;//verticales
		e=tablero[0][1]==turno && tablero[1][1]==turno && tablero[2][1]==turno;//
		f=tablero[0][2]==turno && tablero[1][2]==turno && tablero[2][2]==turno;//
		g=tablero[0][0]==turno && tablero[1][1]==turno && tablero[2][2]==turno;//diagonales
		h=tablero[0][2]==turno && tablero[1][1]==turno && tablero[2][0]==turno;//
		i=tablero[0][1]==turno && tablero[1][2]==turno && tablero[2][0]==turno;//otras
		j=tablero[0][1]==turno && tablero[1][0]==turno && tablero[2][2]==turno;
		k=tablero[0][2]==turno && tablero[1][0]==turno && tablero[2][1]==turno;
		l=tablero[0][0]==turno && tablero[1][2]==turno && tablero[2][1]==turno;
		
		return a||b||c||d||e||f||g||h||i||j||k||l;
	}
	
	void mostrar(){
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(tablero[i][j]);
				if (j<2){
					System.out.print("|");
				}
			}System.out.println();
		}System.out.println();
	}
	

}
