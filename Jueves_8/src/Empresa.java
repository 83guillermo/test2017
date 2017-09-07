import java.util.Scanner;

public class Empresa {
	static void productos(){
		
		int[] vector= new int[100];
		for(int i=0; i<100; i++){
			vector[i]=i;
			System.out.println(vector[i]);
		}
		
		/*
		int[] vector1={1,2,3,4};
		vector1[0]=1;
		vector1[1]=2;
		vector1[2]=3;
		vector1[3]=4;
		int[] vector2 = new int[4];
		vector2=vector1;
		vector2[1]=666;
		System.out.println("v1:"+vector1[1]);
		System.out.println("v2:"+vector2[1]);
		
	
		
		for (int i=0; i<20; i++){
			
			int id=0;
			id=i;
			System.out.println("ingrese nombre de producto :");
			Scanner nombre = new Scanner(System.in);
			String n = nombre.nextLine();
			
			Scanner numero = new Scanner(System.in);
			System.out.println("ingrese precio  :");
			double precio= Integer.parseInt(numero.nextLine());
			
			precio = precio*1.3;
			
			System.out.println(" id:"+id+" tu producto es "+n+" y su precio para la venta : "+precio+"$");
			precio =0;
		}
		*/
	}

}
