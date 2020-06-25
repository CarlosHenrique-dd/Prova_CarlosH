package br.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int n;
	
	do{n = sc.nextInt();
	if(n<0){i++;}		
	else if(n == 0) {sc.close();}
	}while(n>0||n<0);
	System.out.println(i);
	
	}
}