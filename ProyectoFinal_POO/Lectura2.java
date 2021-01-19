import java.io.*;
import java.util.*;
import java.math.*;
import javax.swing.*;

		/*
		/* Diccionario de Datos
		/*
		/*
		==========================================================================================================================================
		Variable................. Tipo de Datos...............Uso de la Variable
		==========================================================================================================================================
		str........................static String.............. Variable que recibira el valor de todos los métodos
		bandera....................static boolean............. Condición del while para el try catch
		i..........................static int................. Variable usada en métodos originales de cetys.Lectura
		longitud...................static int................. Variable usada en métodos originales de cetys.Lectura
		==========================================================================================================================================
		Metodo readLong_C()
		==========================================================================================================================================
		x..........................Long...................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Double.................... Valor minimo de Long.
		max........................Double.................... Valor maximo de Long.
		mensaje....................String.................... Mensaje a mostrar en caso de error de formato.
		mensaje2...................String.................... Mensaje a mostrar en caso de error de rango.
		==========================================================================================================================================
		Metodo readLong_J()
		==========================================================================================================================================
		x..........................Long...................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Double.................... Valor minimo de Long.
		max........................Double.................... Valor maximo de Long.
		==========================================================================================================================================
		Metodo readShort_C()
		==========================================================================================================================================
		x..........................Short..................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Short..................... Valor minimo de Short.
		max........................Short..................... Valor maximo de Short.
		mensaje....................String.................... Mensaje a mostrar en caso de error de formato.
		mensaje2...................String.................... Mensaje a mostrar en caso de error de rango.
		==========================================================================================================================================
		Metodo readShort_J()
		==========================================================================================================================================
		x..........................Short..................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Short..................... Valor minimo de Short.
		max........................Short..................... Valor maximo de Short.
		==========================================================================================================================================
		Metodo readDouble_C()
		==========================================================================================================================================
		x..........................Double.................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Double..................... Valor minimo de Double.
		max........................Double.................... Valor maximo de Duble.
		mensaje....................String.................... Mensaje a mostrar en caso de error de formato.
		mensaje2...................String.................... Mensaje a mostrar en caso de error de rango.
		==========================================================================================================================================
		Metodo readDouble_J()
		==========================================================================================================================================
		x..........................Double.................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Double.................... Valor minimo de Double.
		max........................Double.................... Valor maximo de Duble.
		==========================================================================================================================================
		Metodo readFloat_C()
		==========================================================================================================================================
		x..........................Float..................... Guarda el dato que inserta el usuario y lo regresa.
		min........................ouble..................... Valor minimo de Float.
		max........................Double.................... Valor maximo de Float.
		mensaje....................String.................... Mensaje a mostrar en caso de error de formato.
		mensaje2...................String.................... Mensaje a mostrar en caso de error de rango.
		==========================================================================================================================================
		Metodo readFloat_J()
		==========================================================================================================================================
		x..........................Float..................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Double.................... Valor minimo de Float.
		max........................Double.................... Valor maximo de Float.
		==========================================================================================================================================
		Metodo readInt_C()
		==========================================================================================================================================
		x..........................Int....................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Int....................... Valor minimo de Int.
		max........................Int....................... Valor maximo de Int.
		mensaje....................String.................... Mensaje a mostrar en caso de error de formato.
		mensaje2...................String.................... Mensaje a mostrar en caso de error de rango.
		==========================================================================================================================================
		Metodo readInt_J()
		==========================================================================================================================================
		x..........................Int....................... Guarda el dato que inserta el usuario y lo regresa.
		min........................Int.................... Valor minimo de Int.
		max........................Int.................... Valor maximo de Int.

*/

public class Lectura2 {
	// static DataInputStream input = new DataInputStream(System.in);
	static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
	static String str;
	static int i,longitud;
	static boolean bandera;

//........................MÉTODOS ORIGINALES...............................

//readInt()
	public static int readInt() throws IOException {
		String mensaje="\n(Cetys) ERROR:  Entero incorrecto.  Intente otra vez: ";
		bandera=true;
		while ( bandera ) {
  		    str= input.readLine();
  		    longitud = str.length();
  		    if ( longitud == 0 )
			    {
  		        	bandera=true;
  		         	System.out.print(mensaje);
  		         	continue;
				}
  		    if ( str.charAt(0) == '-' )
				i=1;
			else
			    i=0;
			if ( longitud == i )
			    {
				   	bandera=true;
				   	System.out.print(mensaje);
				   	continue;
				}
			bandera = false;
  		    for ( ; i<longitud; i++ )
  		         if ( (str.charAt(i) < '0') || ( str.charAt(i)> '9' ) )
  		         {
  		         	bandera=true;
  		         	System.out.print(mensaje);
  		         	break;
				}
		}
		i = Integer.valueOf(str).intValue();
		return i;
	}

//readFloat()
	public static float readFloat()throws IOException {
		float x;
		boolean punto;
		String mensaje="\n(Cetys) ERROR:  Flotante incorrecto.  Intente otra vez: ";
		bandera=true;
		while ( bandera ) {
		    str= input.readLine();
		    longitud = str.length();
			if ( longitud == 0 )
			    {
  		        	bandera=true;
		  	       	System.out.print(mensaje);
  		         	continue;
				}
		    if ( (str.charAt(0) == '-') || (str.charAt(0) == '+') )
				i=1;
			else
			    i=0;
			if ( longitud == i )
			    {
				   	bandera=true;
		  	       	System.out.print(mensaje);
				   	continue;
				}

		    bandera = false;
		    punto=true;
		  	for ( ; i<longitud; i++ )
		  	     if ( (str.charAt(i) < '0') || ( str.charAt(i)> '9' ) )
		  	     {
					 if ( (str.charAt(i) == '.') && ( punto ) )
						 punto=false;
					 else
					 {
		  	       	     bandera=true;
		  	       	     System.out.print(mensaje);
		  	       	     break;
					 }
				 }
		}
		x = Float.valueOf(str).floatValue();
		return x;
	}

//readString()
	public static String readString() throws IOException {
		str = input.readLine();
		return str;
	}

//readChar()
	public static char readChar() throws IOException {
		char x;
		str = input.readLine();
		if (str.length() == 0 )
		    x = '\n';
		else
		x = str.charAt(0);
		return x;
	}

//readDouble()
	public static double readDouble() throws IOException {
        double x = -9999;
        boolean  bandera = true;
        String mensaje="\n(Cetys) ERROR:  Doble incorrecto.  Intente otra vez: ";
        while (bandera)
        {
            try
            {
                str = input.readLine();
                str = str.trim();
                x = Double.parseDouble(str);
                bandera = false;
            }
            catch (NumberFormatException e)
            {
				System.out.print(mensaje);
            }
        }
        return x;
	}

//readLong()
	public static long readLong() throws IOException {
	        long x = -9999;
	        boolean  bandera = true;
	        String mensaje="\n(Cetys) ERROR:  Long incorrecto.  Intente otra vez: ";
	        while (bandera)
	        {
	            try
	            {
	                str = input.readLine();
	                str = str.trim();
	                x = Long.parseLong(str);
	                bandera = false;
	            }
	            catch (NumberFormatException e)
	            {
					System.out.print(mensaje);
	            }
	        }
	        return x;
	}

//readShort()
	public static short readShort() throws IOException {
		        short x = -9999;
		        boolean  bandera = true;
		        String mensaje="\n(Cetys) ERROR:  Short incorrecto.  Intente otra vez: ";
		        while (bandera)
		        {
		            try
		            {
		                str = input.readLine();
		                str = str.trim();
		                x = Short.parseShort(str);
		                bandera = false;
		            }
		            catch (NumberFormatException e)
		            {
						System.out.print(mensaje);
		            }
		        }
		        return x;
	}


//........................MÉTODOS CONSOLA...............................

//readInt_C()
	public static int readInt_C()throws IOException {

		int x = 0, max = 2147483647, min = -2147483648;
		boolean  bandera = true;
		String mensaje = "\nERROR DE FORMATO. Entero incorrecto, contiene caracteres inválidos, intenta de nuevo: ", mensaje2 = "\nERROR DE RANGO. Rango de entero excedido, intenta de nuevo: ";

		while (bandera) //ciclo para el try catch
		{
			try //verifica que no se haya introducido algún caracter no válido
			{
		   		str = input.readLine(); //Pide el valor
				str = str.trim();
				x = Integer.parseInt(str);

				while( x < min || x > max ) //While que verifica si el valor introducido está en el rango
				{
					System.out.print(mensaje2); //Indica que está fuera del rango
					str = input.readLine(); //Vuelve a pedir el valor
					str = str.trim();
					x = Integer.parseInt(str);
				}

				bandera = false;
			}
			catch (NumberFormatException e)
			{
				System.out.print(mensaje); //Indica que se introdujo un entero incorrectamente
			}
		}

		x = Integer.valueOf(str).intValue(); //Al validar el valor introducido, a x se le asigna ese valor
	return x;
	}

//readFloat_C()
	public static float readFloat_C()throws IOException {

		float x = 0;
		double max = 3.4*Math.pow(10,38), min = -3.4*Math.pow(10,38);
		bandera = true;
		String mensaje = "\nERROR DE FORMATO. Flotante incorrecto, contiene caracteres inválidos, intenta de nuevo: ", mensaje2 = "\nERROR DE RANGO. Rango de flotante excedido, intenta de nuevo: ";

		while(bandera) //ciclo para el try catch
		{
			try //verifica que no se haya introducido algun caracter no valido
			{
				str = input.readLine(); //Pide el valor
				str = str.trim();
				x = Float.parseFloat(str);

				while( x < min || x > max )  //While que verifica si el valor introducido esta en el rango
				{
					System.out.println(mensaje2); //Indica que esta fuera del rango
					str = input.readLine(); //Vuelve a pedir el valor
					str = str.trim();
					x = Float.parseFloat(str);
				}

				bandera = false;
			}
			catch(NumberFormatException e)
			{
				System.out.println(mensaje); //Indica que se introdujo un flotante incorrectamente
			}
		}
		x = Float.valueOf(str).floatValue(); //Al validar el valor introducido, a x se le asigna ese valor
	return x;
	}

//readString_C()
	public static String readString_C() throws IOException {
		str = input.readLine();
	return str;
	}


//readDouble_C()
	public static double readDouble_C() throws IOException {

		double x, max = 1.7*Math.pow(10,308), min = -1.7*Math.pow(10,308);
		bandera = true;
		String mensaje = "\nERROR DE FORMATO. Doble incorrecto, contiene caracteres invalidos, intenta de nuevo: ", mensaje2 = "\nERROR DE RANGO. Rango de doble excedido, intenta de nuevo: ";

		while (bandera) //ciclo para el try catch
		{
			try //verifica que no se haya introducido algun caracter no valido
			{
		   		str = input.readLine(); //Pide el valor
				str = str.trim();
				x = Double.parseDouble(str);

				while( x < min || x > max ) //While que verifica si el valor introducido esta en el rango
				{
					System.out.print(mensaje2); //Indica que esta fuera del rango
					str = input.readLine(); //Vuelve a pedir el valor
					str = str.trim();
					x = Double.parseDouble(str);
				}

				bandera = false;
			}
			catch (NumberFormatException e)
			{
				System.out.print(mensaje); //Indica que se introdujo un doble incorrectamente
			}
		}

		x=Double.valueOf(str).doubleValue(); //Al validar el valor introducido, a x se le asigna ese valor
	    return x;
	}

//readLong_C()
	public static long readLong_C() throws IOException {

		long x = 0;
		double min = -9.223372036854775808*Math.pow(10,18), max = 9.223372036854775807*Math.pow(10,18);
		bandera = true;
		String mensaje = "\nERROR DE FORMATO. Long incorrecto, contiene caracteres invalidos, intenta de nuevo: ", mensaje2 = "\nERROR DE RANGO. Rango de long excedido, intenta de nuevo: ";

		while(bandera)//Ciclo para pedir numero Long hasta que sea correcto
		{
			try
			{
				str = input.readLine();//Lo pide como String
				str = str.trim();//Quita espacios
				x = Long.parseLong(str);//Lo convierte a tipo Long

				while( x < min || x > max )//Rango de Long: -9223372036854775808 a 9223372036854775807
				{
					System.out.print(mensaje2);
					str = input.readLine();//Lo pide como String
					str = str.trim();//Quita espacios
					x = Long.parseLong(str);//Lo convierte a tipo Long
				}

				bandera=false;//Si no hay excepciones, aqui sale del ciclo
			}
			catch(NumberFormatException e)//Si no se pudo convertir el String a Long, se produce una excepcion
			{
				System.out.print(mensaje);
			}
		}
		x=Long.valueOf(str).longValue(); //Al validar el valor introducido, a x se le asigna ese valor
	return x;
	}

//readShort_C()
	public static short readShort_C() throws IOException {

		short x=0, min=-32768, max=32767;
		bandera = true;
		String mensaje = "\nERROR DE FORMATO. Short incorrecto, contiene caracteres invalidos, intenta de nuevo: ", mensaje2 = "\nERROR DE RANGO. Rango de short excedido, intenta de nuevo: ";

		while(bandera)
		{
			try
			{
				str = input.readLine();
				str = str.trim();
				x = Short.parseShort(str);
				while(x<min||x>max)//Rango de Short: -32768 a 32767
				{
					System.out.print(mensaje2);
					str = input.readLine();
					str = str.trim();
					x = Short.parseShort(str);
				}
				bandera=false;//Si no hay excepciones, aqui sale del ciclo
			}
			catch(NumberFormatException e)//Si no se pudo convertir el String a Short, se produce una excepcion
			{
				System.out.print(mensaje);
			}
		}
		x=Short.valueOf(str).shortValue(); //Al validar el valor introducido, a x se le asigna ese valor
	return x;
	}


//........................MÉTODOS JOptionPane...............................

//readInt_J()
public static int readInt_J()throws IOException {

		int x = 0, max = 2147483647, min = -2147483648;
		bandera = true;

		while (bandera) //ciclo para el try catch
		{
			try //verifica que no se haya introducido algún caracter no válido
			{
		   		str = JOptionPane.showInputDialog(null, "Inserte un número Int", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE); //Pide el valor
				str = str.trim();
				x = Integer.parseInt(str);

				while( x < min || x > max ) //While que verifica si el valor introducido está en el rango
				{
					JOptionPane.showMessageDialog(null, "El número está fuera del rango de Int. Ingrese un número de nuevo. \nError: ", "Fuera del rango", JOptionPane.ERROR_MESSAGE); //Indica que está fuera del rango
					str = JOptionPane.showInputDialog(null, "Inserte un número Int", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE); //Vuelve a pedir el valor
					str = str.trim();
					x = Integer.parseInt(str);
				}

				bandera = false;
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "La respuesta no es válida para Int. Ingrese un número de nuevo. \nError: "+e, "Ha ocurrido una excepción", JOptionPane.ERROR_MESSAGE); //Indica que se introdujo un entero incorrectamente
			}
		}

		x = Integer.valueOf(str).intValue(); //Al validar el valor introducido, a x se le asigna ese valor
	return x;
	}

//readFloat_J()
	public static float readFloat_J() throws IOException //Método para leer numeros tipo flotante con JOption a prueba de usuarios
	{
		float x;
		double max=3.4*Math.pow(10,38),min=-3.4*Math.pow(10,38);
		bandera=true;

		while(bandera) //ciclo para el try catch
		{
			try //verifica que no se haya introducido algun caracter no valido
			{
				str = JOptionPane.showInputDialog(null, "Inserte un número Float", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE); //Pide el valor
				str = str.trim();
				x = Float.parseFloat(str);

				while( x < min || x > max ) //While que verifica si el valor introducido esta en el rango
				{
					JOptionPane.showMessageDialog(null, "El número está fuera del rango de Float. Ingrese un número de nuevo. \nError: ", "Fuera del rango", JOptionPane.ERROR_MESSAGE);
			   		str = JOptionPane.showInputDialog(null, "Inserte un número Float", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE);
					str = str.trim();
					x = Float.parseFloat(str);
				}

				bandera = false;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "La respuesta no es válida para Float. Ingrese un número de nuevo. \nError: "+e, "Ha ocurrido una excepción", JOptionPane.ERROR_MESSAGE); //Indica que se introdujo un flotante incorrectamente
			}
		}
			x = Float.valueOf(str).floatValue(); //Al validar el valor introducido, a x se le asigna ese valor
		return x;
	}

//readString_J()
	public static String readString_J() throws IOException {
		str = JOptionPane.showInputDialog(null, "Inserte un String", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE); //Pide el valor
	return str;
	}


//readDouble_J()
	public static double readDouble_J() throws IOException {

		double x = 0, max = 1.7*Math.pow(10,308), min = -1.7*Math.pow(10,308);
		bandera = true;

		while (bandera) //ciclo para el try catch
		{
			try //verifica que no se haya introducido algun caracter no valido
	   	{
			str = JOptionPane.showInputDialog(null, "Inserte un número Double", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE); //Pide el valor
			str = str.trim();
			x = Double.parseDouble(str);

			while( x < min || x > max ) ///While que verifica si el valor introducido esta en el rango
			{
				JOptionPane.showMessageDialog(null, "El número esta fuera del rango de Double. Ingrese un número de nuevo. \nError: ", "Fuera del rango", JOptionPane.ERROR_MESSAGE); //Indica que esta fuera del rango
				str = JOptionPane.showInputDialog(null, "Inserte un número Double", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE); //Vuelve a pedir el valor
				str = str.trim();
				x = Double.parseDouble(str);
			}

			bandera = false;
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "La respuesta no es válida para Double. Ingrese un número de nuevo. \nError: "+e, "Ha ocurrido una excepción", JOptionPane.ERROR_MESSAGE); //Indica que se introdujo un doble incorrectamente
		}
	}
		x = Double.valueOf(str).doubleValue(); //Al validar el valor introducido, a x se le asigna ese valor
	return x;
	}

//readLong_J()
	public static long readLong_J() throws IOException {
		long x=0;
		double min=-9.223372036854775808*Math.pow(10,18), max=9.223372036854775807*Math.pow(10,18);
		bandera = true;

		while(bandera)//Ciclo para pedir numero Long hasta que sea correcto
		{
			try
			{
				x = Long.parseLong(JOptionPane.showInputDialog(null, "Inserte un numero Long", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE));//Lo convierte a tipo Long
				while(x<min||x>max)//Rango de Long: -9223372036854775808 a 9223372036854775807
				{
					JOptionPane.showMessageDialog(null, "El numero esta fuera del rango de Long. Ingrese un numero de nuevo. \nError: ", "Fuera del rango", JOptionPane.ERROR_MESSAGE);
					x = Long.parseLong(JOptionPane.showInputDialog(null, "Inserte un numero Long", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE));
				}
				bandera=false;//Si no hay excepciones, aqui sale del ciclo
			}
			catch(NumberFormatException nfe)//Si el dato String en JOption no pasa a convertirse en Long, se produce una excepcion
			{
				JOptionPane.showMessageDialog(null, "La respuesta no es valida para Long. Ingrese un numero de nuevo. \nError: "+ nfe, "Ha ocurrido una excepcion", JOptionPane.ERROR_MESSAGE);
			}
		}
			x = Long.valueOf(str).longValue(); //Al validar el valor introducido, a x se le asigna ese valor
		return x;
	}

//readShort_J()
	public static short readShort_J() throws IOException {

		short x=0, min=-32768, max=32767;
		bandera = true;

		while(bandera)
		{
			try
			{
				x = Short.parseShort(JOptionPane.showInputDialog(null, "Inserte un numero Short", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE));
				while(x<min||x>max)//Rango de Short: -32768 a 32767
				{
					JOptionPane.showMessageDialog(null, "El numero esta fuera del rango de Short. Ingrese un numero de nuevo. \nError: ", "Fuera del rango", JOptionPane.ERROR_MESSAGE);
					x = Short.parseShort(JOptionPane.showInputDialog(null, "Inserte un numero Short", "Captura por JOptionPane", JOptionPane.QUESTION_MESSAGE));
				}
				bandera=false;//Si no hay excepciones, aqui sale del ciclo while
			}
			catch(NumberFormatException nfe)//Si el dato String en JOption no pasa a convertirse en Short, se produce una excepcion
			{
				JOptionPane.showMessageDialog(null, "La respuesta no es valida para Short. Ingrese un numero de nuevo. \nError: "+ nfe, "Ha ocurrido una excepcion", JOptionPane.ERROR_MESSAGE);
			}
		}
			x = Short.valueOf(str).shortValue(); //Al validar el valor introducido, a x se le asigna ese valor
		return x;
	}

}//fin class
