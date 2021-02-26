package com.ejhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ejhash.modelo.entidad.Usuario;
import com.ejhash.modelo.persistencia.DaoUsuario;

@SpringBootApplication
public class EjHashApplication {
	
	static Scanner sc;
	static DaoUsuario daoU;
	static boolean continuar;
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(EjHashApplication.class, args);
		
		daoU = context.getBean("daoUsuario", DaoUsuario.class);		
			
		int opcion;
		continuar = true;		
		sc = new Scanner(System.in);
		
		System.out.println("*** INICIO DEL PROGRAMA ***\n");
		
		do {
			
			
			System.out.println("Seleciona una opción:");
			System.out.println("1 - Log In");
			System.out.println("2 - Sign Up");
			System.out.println("3 - Finalizar programa");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				try {
					logearse();
				} catch (NoSuchAlgorithmException e) {					
					e.printStackTrace();
				}
				break;
				
			case 2:
				try {
					registrarse();
				} catch (NoSuchAlgorithmException e) {					
					e.printStackTrace();
				}
				break;
			
			case 3:
				System.out.println("\n*** FIN DEL PROGRAMA ***\n");
				continuar = false;
				break;
				
				
			default:
				System.out.println("Error");
				break;
			}
			
			
		} while (continuar);
		
		sc.close();
		
		
		
	}

	private static void registrarse() throws NoSuchAlgorithmException {
		
		System.out.println("Username: ");
		String username = sc.nextLine();
		
		System.out.println("Password: ");
		String password = sc.nextLine();
		
		
		byte[] pw = password.getBytes();		
		
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		
		md.update(pw);	
		
		byte[] resumenHash = md.digest();
		String passwordDB = new String(resumenHash);				
		
		String passwordDBHex = javax.xml.bind.DatatypeConverter.printHexBinary(resumenHash);		
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre(username);
		usuario1.setPassword(passwordDBHex);	
		
		daoU.save(usuario1);
		
		System.out.println("\nUsuario registrado con exito!\n");
		
		
	}

	private static void logearse() throws NoSuchAlgorithmException {
		
		
		System.out.println("Username: ");
		String username = sc.nextLine();
		
		System.out.println("Password: ");
		String password = sc.nextLine();
		
		byte[] pw = password.getBytes();		
		
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		
		md.update(pw);	
		
		byte[] resumenHash = md.digest();
		String passwordDB = new String(resumenHash);				
		
		String passwordDBHex = javax.xml.bind.DatatypeConverter.printHexBinary(resumenHash);		
		
		
		Usuario usuarioDB = daoU.findByUsernameAndPassword(username, passwordDBHex);
		
		if (usuarioDB != null) {
			System.out.println("\nBienvenido\n");
			continuar = false;
			
		} else {
			System.out.println("\nEl usuario introducido no exite en la Base de Datos\n");
		}
		
		
		
				
		
	}

}
