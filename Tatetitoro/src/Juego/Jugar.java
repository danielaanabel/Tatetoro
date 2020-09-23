package Juego;

import java.util.Random;

public class Jugar {
	char [][] tablero;
	
	
	public Jugar(){
		tablero=new char[3][3];//tablero con valores null(0)
	}//
	
	public char elegirTurno() {//quien juega primero
		Random random=new Random();
		int numRandom=random.nextInt(2);
		return numRandom==0?'O':'X'; 
	}
	
	char ProximoTurno(char t){
		if (t=='X')
			return 'O';
		else
			return 'X';	
	}
	
	
	public void ponerFicha(int f, int c,char turno) {
		tablero[f][c]=turno;
	}
	
	boolean comprobarGanador(char w){
		boolean a,b,c,d,e,f,g,h;
		a=tablero[0][0]==w && tablero[0][1]==w && tablero[0][2]==w;//horizontales
		b=tablero[1][0]==w && tablero[1][1]==w && tablero[1][2]==w;
		c=tablero[2][0]==w && tablero[2][1]==w && tablero[2][2]==w;
		d=tablero[0][0]==w && tablero[1][0]==w && tablero[2][0]==w;//verticales
		e=tablero[0][1]==w && tablero[1][1]==w && tablero[2][1]==w;
		f=tablero[0][2]==w && tablero[1][2]==w && tablero[2][2]==w;
		g=tablero[0][0]==w && tablero[1][1]==w && tablero[2][2]==w;//diagonales
		h=tablero[0][2]==w && tablero[1][1]==w && tablero[2][0]==w;
		
		return a||b||c||d||e||f||g||h;
	}
	
	boolean terminado(){
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if (tablero[i][j]=='*')
					return false;
			}
		}
		return true;
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
