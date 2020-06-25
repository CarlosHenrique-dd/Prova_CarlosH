package br.edu.univas.main;

import java.util.Scanner;

public class Questao_3 {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	if(n%5 == 0){System.out.println(n);}
	else if((n+1)%5==0){System.out.println(n+1);}
	else if((n+2)%5==0){System.out.println(n+2);}
	else if(n%5!=0){System.out.println(n);}
	
	sc.close();
	}
}