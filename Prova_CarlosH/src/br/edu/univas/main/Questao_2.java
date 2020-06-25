package br.edu.univas.main;

import java.util.Scanner;

public class Questao_2 {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	int s=0,n=0,su=0,sud=0,ce=0,no=0,nor=0;int nu =0,ni=0;
	
	for(int i = 0;i<100;i++) {
		System.out.println("“Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?”");
		System.out.println("1 para SIM ou 2 para NAO.");
		nu = sc.nextInt();
		
		if(nu == 1){s++;}
		if(nu == 2) {n++;}
		
		System.out.println("Qual região do Brasil você mora?");
		System.out.println("1.SUL 2.SUDESTE 3. CENTRO-OESTE 4.NORTE 5.NORDESTE");
		ni = sc.nextInt();
		if(ni==1){su++;}
		if(ni==2){sud++;}
		if(ni==3){ce++;}
		if(ni==4){no++;}
		if(ni==5){nor++;}
	}
	System.out.println(s+" sim");
	System.out.println(n+" nao");
	System.out.println(su+" sul");
	System.out.println(sud+" sud");
	System.out.println(ce+" centro-oeste");
	System.out.println(no+" norte");
	System.out.println(nor+" nordeste");
	sc.close();
	
	}
}