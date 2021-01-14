package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
	
	public static final int PUERTO = 2021;
	public static final String IP_SERVER = "localhost";
	
	public static void main(String[] args) {
		System.out.println("        APLICACIÓN CLIENTE");
		System.out.println("-----------------------------------");		
		
		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;

		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);

		Scanner sc = new Scanner(System.in);
		try {
			socketCliente = new Socket();
			socketCliente.connect(direccionServidor);
			System.out.println("Conexion establecida... a " + IP_SERVER + " por el puerto "
					+ PUERTO);
			
			entrada = new InputStreamReader(socketCliente.getInputStream());
			salida = new PrintStream(socketCliente.getOutputStream());
			
			
			System.out.println("CLIENTE: Introduzca dos números, y el codigo de operación que desea realizar:");
			System.out.println("1 para sumar");
			System.out.println("2 para restar");
			System.out.println("3 para multiplicar");
			System.out.println("4 para dividir");
			
			String numero1 = sc.nextLine();
			String numero2 = sc.nextLine();
			String codOp = sc.nextLine();
			String operacion= numero1 + "-" + numero2 + "-" + codOp;
			salida.println(operacion);
			
			
			BufferedReader bf = new BufferedReader(entrada);
			String resultado = bf.readLine();			
			System.out.println("CLIENTE: " + resultado);
			
		} catch (Exception e) {
			System.err.println("Error: " + e);
			e.printStackTrace();
		}finally {		
			try {
				salida.close();
				entrada.close();
				socketCliente.close();
				sc.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}
