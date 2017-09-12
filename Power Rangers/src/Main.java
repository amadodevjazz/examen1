import java.util.Scanner;
public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Monstruo[] PilaMonstruos = new Monstruo[5];
    	for(int i = 0; i < PilaMonstruos.length; i++)
    	{
    		String nombre;
    		String elemento;
    		String edad;
    		String color;
    		System.out.println("Write the name :v");
    		nombre = sc.nextLine();
    		System.out.println("Elemen");
    		elemento = sc.nextLine();
    		System.out.println("What's the monster Age? :v");
    		edad = sc.nextLine();
    		System.out.println("Color?");
    		color = sc.nextLine();
    		PilaMonstruos[i].SetAtributos(nombre, elemento, edad, color);
    	}
    	
    	System.out.println("Write the monster's name you wanna show");
    	int MonstruoMostrar;
    	MonstruoMostrar = sc.nextInt();
    	System.out.println(PilaMonstruos[MonstruoMostrar].Show()); 
	}
}
