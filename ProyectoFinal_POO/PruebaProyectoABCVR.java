import java.io.*;

/*
/* Diccionario de Datos
/*
===================================================================================================
Variable................. Tipo de Datos............... Uso de la Variable
===================================================================================================
Nombre................... String...................... Nombre de un alumno del array.
Paterno.................. String...................... Apellido paterno de un alumno del array.
Materno.................. String...................... Apellido materno de un alumno del array.
Carrera.................. String...................... Carrera cursada por un alumno del array.
Materia.................. String...................... Materia cursada por un alumno del array.
Matricula................ Int   ...................... Matricula de un alumno del array.
Semestre................. Int   ...................... Semestre cursado por un alumno del array.
op....................... Int   ...................... Opción del menú del switch case principal.
i........................ Int   ...................... Contador de for / Para localizar las posiciones.
j........................ Int   ...................... Contador para la cantidad de datos registrados de cada arreglo.
k........................ Int   ...................... Contador para el método de la burbuja.
c........................ Int   ...................... Contador para validar salida.
buscar................... Int   ...................... Variable para llamar a una matrícula.
e........................ Int   ...................... Toma el valor de posición de una matrícula.
op1...................... Int   ...................... Opción del menú del switch case para cambios en atributos.
op2...................... Int   ...................... Opción del menú del switch case de reportes.
op3...................... Int   ...................... Opción del menú del switch case de carreras y materias.
op4...................... Int   ...................... Opción del menú del switch case de ordenamiento por matrículas y nombres.
auxarrayMatricula........ int[]....................... Array auxiliar donde se guardan las matrículas de los alumnos registrados que coinciden con la materia o carrera buscada para el reporte
auxarrayNombre........... String[].................... Array auxiliar donde se guardan los nombres de los alumnos registrados que coinciden con la materia o carrera buscada para el reporte
auxarrayPaterno.......... String[].................... Array auxiliar donde se guardan los apellidos paternos de los alumnos registrados que coinciden con la materia o carrera buscada para el reporte
auxarrayMaterno.......... String[].................... Array auxiliar donde se guardan los apellidos maternos de los alumnos registrados que coinciden con la materia o carrera buscada para el reporte
auxarrayCarrera.......... String[].................... Array auxiliar donde se guardan las carreras de los alumnos registrados que coinciden con la materia o carrera buscada para el reporte
auxarrayMateria.......... String[].................... Array auxiliar donde se guardan las materias de los alumnos registrados que coinciden con la materia o carrera buscada para el reporte
comparar................. boolean..................... Variable para comparar la entrada del atributo con los catálogos.
Estudiantes.............. ProyectoABCV................ Objeto tipo ProyectoABCV
arrayMatricula........... int[]....................... Array donde se guardan las matrículas de los alumnos registrados
arrayNombre.............. String[].................... Array donde se guardan los nombres de los alumnos registrados
arrayPaterno............. String...................... Array donde se guardan los apellidos paternos de los alumnos registrados
arrayMaterno............. String...................... Array donde se guardan los apellidos maternos de los alumnos registrados
arraySemestre............ int[]....................... Array del semestre cursado por los alumnos registrados.
arrayCarrera............. String[].................... Array de las carreras cursadas por los alumnos registrados.
arrayMateria............. Sting[]..................... Array de las materias cursadas por los alumnos registrados.
arrayCatalogoCarreras.... String[].................... Array donde se registran las cuatro carreras disponibles.
arrayCatalogoMaterias.... String[].................... Array donde se registran las cuatro materias disponibles.

*/

public class PruebaProyectoABCVR
{

    public static void main(String[] args)  throws IOException
    {
		String Nombre, Paterno, Materno, Carrera, Materia;
		int Matricula = 0, Semestre = 0, op = 0, i = 0, j = 0, c = 0, buscar = 0, e = -1, op1 = 0, op2 = 0, op3 = 0, op4 = 0, k = 0;
		boolean comparar;

		ProyectoABCV Estudiantes;
		Estudiantes = new ProyectoABCV();

		int arrayMatricula[] = new int [15];
		String arrayNombre[] = new String [15];
		String arrayPaterno[] = new String [15];
		String arrayMaterno[] = new String [15];
		int arraySemestre[] = new int [15];
		String arrayCarrera[] = new String [15];
		String arrayMateria[] = new String [15];

		int auxarrayMatricula[] = new int [16];
		String auxarrayNombre[] = new String [16];
		String auxarrayPaterno[] = new String [16];
		String auxarrayMaterno[] = new String [16];
		String auxarrayCarrera[] = new String [16];
		String auxarrayMateria[] = new String [16];

		String arrayCatalogoCarreras[] = new String [4];
		String arrayCatalogoMaterias[] = new String [4];

		while(op!=6)
		{
			System.out.print("\n\n---------- Proyecto ABCVR ---------- \n");
			System.out.print("Altas ........................... 1 \n");
			System.out.print("Bajas ........................... 2 \n");
			System.out.print("Cambios ......................... 3 \n");
			System.out.print("Visualización ................... 4 \n");
			System.out.print("Reportes ........................ 5 \n");
			System.out.print("Salir ........................... 6 \n");
			System.out.print("Elige una opción:                 ");
			op = Lectura2.readInt_C();

			//menú de casos, decidir entre altas, bajas, cambios, visualización y salir
			switch(op)
			{

				case 1:
					//verifica que no se hayan dado de alta más de 15 estudiantes
					if (j < 15)
					{
						//Solo pregunta antes de registrar el primer alumno por el catálogo de materias y carreras
						if( j == 0 )
						{
							System.out.print("\n Antes de iniciar con las altas, ingrese las CUATRO posibles carreras a elegir. \n");
							System.out.print("\n Carrera #1: ");
							arrayCatalogoCarreras[0] = Lectura2.readString_C();
							System.out.print("\n Carrera #2: ");
							arrayCatalogoCarreras[1] = Lectura2.readString_C();
							System.out.print("\n Carrera #3: ");
							arrayCatalogoCarreras[2] = Lectura2.readString_C();
							System.out.print("\n Carrera #4: ");
							arrayCatalogoCarreras[3] = Lectura2.readString_C();

							System.out.print("\n Ahora ingrese las CUATRO posibles materias a elegir. \n");
							System.out.print("\n Materia #1: ");
							arrayCatalogoMaterias[0] = Lectura2.readString_C();
							System.out.print("\n Materia #2: ");
							arrayCatalogoMaterias[1] = Lectura2.readString_C();
							System.out.print("\n Materia #3: ");
							arrayCatalogoMaterias[2] = Lectura2.readString_C();
							System.out.print("\n Materia #4: ");
							arrayCatalogoMaterias[3] = Lectura2.readString_C();
						}

						//Valida que no se repitan matrículas
						do{

							System.out.print("\n\n Ingresa la matrícula del estudiante #"+(j+1)+": ");
							Matricula = Lectura2.readInt_C();

							for ( i = 0 ; i < 15 ; i++ )
							{
								if ( Matricula == arrayMatricula[i] )
								{
									System.out.print("\n\n MATRICULA REPETIDA. Ingresa la matrícula de nuevo.");
									i = 14;
								}
								else
								{
									i = 14;
									c++;
								}
							}

							if( c > 0 )
							{
								break;
							}

						}while(true);

						c = 0;

						System.out.print("\n Ingresa el nombre del estudiante #"+(j+1)+": ");
						Nombre = Lectura2.readString_C();

						System.out.print("\n Ingresa el apellido paterno del estudiante #"+(j+1)+": ");
						Paterno = Lectura2.readString_C();

						System.out.print("\n Ingresa el apellido materno del estudiante #"+(j+1)+": ");
						Materno = Lectura2.readString_C();

						//Valida que el semestre esté entre 1 y 8 y que sea un número
						do
						{
							System.out.print("\n Ingresa el semestre del estudiante #"+(j+1)+": ");
							Semestre = Lectura2.readInt_C();

							if ( Semestre < 1  |  Semestre > 8 )
							{
								System.out.print("\nSEMESTRE FUERA DE RANGO. Ingresa el semestre de nuevo: ");
							}
							else
							{
								break;
							}
						}while(true);

						//Valida que la carrera esté en el catálogo
						do
						{
							System.out.print("\n Ingresa la carrera del estudiante #"+(j+1)+": ");
							Carrera = Lectura2.readString_C();

							for( i = 0 ; i <4 ; i++ )
							{
								comparar = Carrera.equals(arrayCatalogoCarreras[i]);
								if( comparar == true )
								{
									c++;
								}
							}

							if( c < 1 )
							{
								System.out.print("\n CARRERA FUERA DE CATALOGO. Ingresa la carrera de nuevo.");
							}
							else
							{
								c = 0;
								break;
							}
						}while(true);

						//Valida que la materia esté en el catálogo
						do
						{
							System.out.print("\n Ingresa la materia del estudiante #"+(j+1)+": ");
							Materia = Lectura2.readString_C();

							for( i = 0 ; i <4 ; i++ )
							{
								comparar = Materia.equals(arrayCatalogoMaterias[i]);
								if( comparar == true )
								{
									c++;
								}
							}

							if( c < 1 )
							{
								System.out.print("\n MATERIA FUERA DE CATALOGO. Ingresa la materia de nuevo: ");
							}
							else
							{
								c = 0;
								break;
							}
						}while(true);

						//Guardar todos los datos del estudiante en los métodos del objeto
						Estudiantes.leerMatricula(Matricula);
						Estudiantes.leerNombre(Nombre);
						Estudiantes.leerPaterno(Paterno);
						Estudiantes.leerMaterno(Materno);
						Estudiantes.leerSemestre(Semestre);
						Estudiantes.leerCarrera(Carrera);
						Estudiantes.leerMateria(Materia);

						//Llenar los arreglos con los datos ya validados
						arrayMatricula[j] = Estudiantes.imprimirMatricula();
						arrayNombre[j] = Estudiantes.imprimirNombre();
						arrayPaterno[j] = Estudiantes.imprimirPaterno();
						arrayMaterno[j] = Estudiantes.imprimirMaterno();
						arraySemestre[j] = Estudiantes.imprimirSemestre();
						arrayCarrera[j] = Estudiantes.imprimirCarrera();
						arrayMateria[j] = Estudiantes.imprimirMateria();

						//Contador de estudiantes dados de alta
						j++;

						System.out.println();
						System.out.println();
					}
					else
					{
						System.out.println("\nSISTEMA LLENO. Ya hay 15 alumnos registrados.");
					}

				break;


				case 2:
					do
					{
					//se lee la matrícula a buscar
					System.out.println("\nIngrese la matrícula a dar de baja: ");
					buscar = Lectura2.readInt_C();

					for( i = 0; i < j; i++ )
					{
						//si la matrícula buscada es igual a una del arreglo, se guarda la posición del arreglo en e
						if( buscar == arrayMatricula[i] )
						{
							e = i;
						}
					}

					//si e toma el valor de una posición del arreglo, los valores de esa posición en adelante se van a recorrer
					if( e >= 0 )
					{
						for ( i = e; i < 14; i++ )
						{
							arrayMatricula[i] = arrayMatricula[i+1];
							arraySemestre[i] = arraySemestre[i+1];
							arrayNombre[i] = arrayNombre[i+1];
							arrayPaterno[i] = arrayPaterno[i+1];
							arrayMaterno[i] = arrayMaterno[i+1];
							arrayMateria[i] = arrayMateria[i+1];
							arrayCarrera[i] = arrayCarrera[i+1];
						}
						//los valores de la última posición del arreglo se igualan a 0 o null
						arrayMatricula[14] = 0;
						arraySemestre[14] = 0;
						arrayNombre[14] = null;
						arrayPaterno[14] = null;
						arrayMaterno[14] = null;
						arrayMateria[14] = null;
						arrayCarrera[14] = null;

						System.out.println("\nEl alumno ya no se encuentra registrado.\n");
						e = 0;
						break;
					}
					else
					{
						System.out.println("\nNo se ha encontrado la matrícula en el sistema. Vuelva a intentarlo.\n");
					}
				}while(true);

				//se resta un valor de j, es decir, los alumnos registrados
				j--;

				break;


				case 3:
					do
					{
						//se lee la matrícula a buscar
						System.out.println("\nIngrese la matrícula de los datos que desea modificar: ");
						buscar = Lectura2.readInt_C();

						for( i = 0; i < j; i++ )
						{
							//si se encuentra la matrícula en el arreglo, e toma su posición
							if( buscar == arrayMatricula[i] )
							{
								e = i;
							}
						}

						//si se lee una posición, elige el cambio a realizar
						if( e >= 0 )
						{
							System.out.print("Nombre .................... 1 \n");
							System.out.print("Apellido Paterno .......... 2 \n");
							System.out.print("Apellido Materno .......... 3 \n");
							System.out.print("Carrera ................... 4 \n");
							System.out.print("Semestre .................. 5 \n");
							System.out.print("Materia ................... 6 \n");
							System.out.println("Elige una opción a modificar:   ");
							op1 = Lectura2.readInt_C();

							switch(op1)
							{
								case 1:

									//se cambia el nombre
									System.out.print("\n Ingresa el nombre del estudiante "+buscar+": ");
									Nombre = Lectura2.readString_C();

									Estudiantes.leerNombre(Nombre);
									arrayNombre[e] = Estudiantes.imprimirNombre();

								break;

								case 2:

									//se cambia el apellido paterno
									System.out.print("\n Ingresa el apellido paterno del estudiante "+buscar+": ");
									Paterno = Lectura2.readString_C();

									Estudiantes.leerPaterno(Paterno);
									arrayPaterno[e] = Estudiantes.imprimirPaterno();

								break;

								case 3:

									//se cambia el apellido materno
									System.out.print("\n Ingresa el apellido materno del estudiante "+buscar+": ");
									Materno = Lectura2.readString_C();

									Estudiantes.leerMaterno(Materno);
									arrayMaterno[e] = Estudiantes.imprimirMaterno();

								break;

								case 4:

									//cambia la carrera, validando que se eencuentre en el catálogo
									do
									{
										System.out.print("\n Ingresa la carrera del estudiante "+buscar+": ");
										Carrera = Lectura2.readString_C();

										for( i = 0 ; i <4 ; i++ )
										{
											comparar = Carrera.equals(arrayCatalogoCarreras[i]);
											if( comparar == true )
											{
												c++;
											}
										}

										if( c < 1 )
										{
											System.out.print("\n CARRERA FUERA DE CATALOGO. Ingresa la carrera de nuevo.");
										}
										else
										{
											c = 0;
											break;
										}
									}while(true);

									Estudiantes.leerCarrera(Carrera);
									arrayCarrera[e] = Estudiantes.imprimirCarrera();

								break;

								case 5:

									//cambia el semestre, validando que sea entre 1-8
									do
									{
										System.out.print("\n Ingresa el semestre del estudiante "+buscar+": ");
										Semestre = Lectura2.readInt_C();

										if ( Semestre < 1  |  Semestre > 8 )
										{
											System.out.print("\nSEMESTRE FUERA DE RANGO. Ingresa el semestre de nuevo.");
										}
										else
										{
											break;
										}
									}while(true);

									Estudiantes.leerSemestre(Semestre);
									arraySemestre[e] = Estudiantes.imprimirSemestre();

								break;

								case 6:

									//se cambia la materia, validando que se encuentre en el catálogo
									do
									{
										System.out.print("\n Ingresa la materia del estudiante "+buscar+": ");
										Materia = Lectura2.readString_C();

										for( i = 0 ; i <4 ; i++ )
										{
											comparar = Materia.equals(arrayCatalogoMaterias[i]);
											if( comparar == true )
											{
												c++;
											}
										}

										if( c < 1 )
										{
											System.out.print("\n MATERIA FUERA DE CATALOGO. Ingresa la materia de nuevo.");
										}
										else
										{
											c = 0;
											break;
										}
									}while(true);

									Estudiantes.leerMateria(Materia);
									arrayMateria[e] = Estudiantes.imprimirMateria();

								break;
							}
							System.out.println("Los datos del alumno "+buscar+" han sido modificados.");
							e = 0;
							break;
						}
						else
						{
							System.out.println("\nNo se ha encontrado la matrícula en el sistema. Vuelva a intentarlo.\n");
						}
				}while(true);
				break;


				case 4:

					//Indica los atributos de los estudiantes, ordenados por su posición.
					System.out.println("\n\nPosición:   Matrícula:  A. Paterno:  A. Materno:  Nombre:     Carrera:    Semestre:   Materia:    ");

					for(i=0;i<j;i++) //Mediante el for se va cambiando entre cada estudiante.
					{
						System.out.printf("%-12s%-12s%-13s%-13s%-12s%-12s%-12s%-12s%n", i, arrayMatricula[i], arrayPaterno[i],
						arrayMaterno[i], arrayNombre[i], arrayCarrera[i], arraySemestre[i], arrayMateria[i],"\n");
						//Con la función printf() se establecen espacios específicos para cada atributo para su impresión ordenada.
					}

				break;

				case 5:
					//pide el tipo de reportes (materia o carrera)
					while(op2!=3)
					{
						System.out.print("\n\n---------------- REPORTES ---------------- \n");
						System.out.print("Por carrera ........................... 1 \n");
						System.out.print("Por materia ........................... 2 \n");
						System.out.print("Salir       ........................... 3 \n");
						System.out.print("Elige una opción:                       ");
						op2 = Lectura2.readInt_C();
						//contador se reinicia
						c = 0;

						switch(op2)
						{
							case 1:
								//pregunta por la carrera a imprimir
								System.out.print("\n\n---------- ORDENAMIENTO POR CARRERA ---------- \n");
								System.out.print(arrayCatalogoCarreras[0]+"........................... 1 \n");
								System.out.print(arrayCatalogoCarreras[1]+"........................... 2 \n");
								System.out.print(arrayCatalogoCarreras[2]+"........................... 3 \n");
								System.out.print(arrayCatalogoCarreras[3]+"........................... 4 \n");
								System.out.print("Elige la carrera:    ");
								e = Lectura2.readInt_C();
								//se resta 1 a la variable e para obtener la posicion de la carrera
								e = e - 1;

								//se pide el orden
								System.out.print("\n\nMatrícula ........................... 1 \n");
								System.out.print("Nombre    ........................... 2 \n");
								System.out.print("Elige el orden:                     ");
								op3 = Lectura2.readInt_C();

								switch(op3)
								{
									case 1:
									//si la carrera en el arreglo de los estudiantes registrados es igual a la de los reportes, se guarda en un array auxiliar
										for( i = 0 ; i < j ; i++ )
										{
											comparar = arrayCarrera[i].equals(arrayCatalogoCarreras[e]);
											if( comparar == true )
											{
												auxarrayMatricula[i] = arrayMatricula[i];
												auxarrayNombre[i] = arrayNombre[i];
												auxarrayPaterno[i] = arrayPaterno[i];
												auxarrayMaterno[i] = arrayMaterno[i];
												auxarrayCarrera[i] = arrayCarrera[i];
												//el contador aumenta para saber cuantos alumnos hay en la carrera seleccionada
												c++;
											}
										}

										if( c >= 2 )
										{
											//si hay mas de dos alumnos en la carrera seleccionada, se ordenan por metodo de burbuja
											for(i = 0; i < j-1; i++)
											{
												for(k = 1; k < j; k++)
												{
													if(auxarrayMatricula[i] > auxarrayMatricula[k])
													{
														auxarrayMatricula[15] = auxarrayMatricula[i];
														auxarrayMatricula[i] = auxarrayMatricula[k];
														auxarrayMatricula[k] = auxarrayMatricula[15];

														auxarrayNombre[15] = auxarrayNombre[i];
														auxarrayNombre[i] = auxarrayNombre[k];
														auxarrayNombre[k] = auxarrayNombre[15];

														auxarrayPaterno[15] = auxarrayPaterno[i];
														auxarrayPaterno[i] = auxarrayPaterno[k];
														auxarrayPaterno[k] = auxarrayPaterno[15];

														auxarrayMaterno[15] = auxarrayMaterno[i];
														auxarrayMaterno[i] = auxarrayMaterno[k];
														auxarrayMaterno[k] = auxarrayMaterno[15];

														auxarrayCarrera[15] = auxarrayCarrera[i];
														auxarrayCarrera[i] = auxarrayCarrera[k];
														auxarrayCarrera[k] = auxarrayCarrera[15];
													}
												}
											}
										}

										//si no hay alumnos en la carrera seleccionada se imprime lo siguiente:
										if ( c == 0 )
										{
											System.out.print("\nNo hay ningún alumno registrado en esta carrera. \n\n");
										}
										//de lo contrario se imprimen los alumnos de la carrera de manera ordenada
										else
										{
											System.out.println("\n\nMatrícula:  A. Paterno:  A. Materno:  Nombre:     Carrera:    ");
											for(i = 0; i < j; i++)
											{
												if(auxarrayMatricula[i]!=0)
												{
													//Indica los atributos que aparecen el reporte seleccioanado.
													System.out.printf("%-12s%-13s%-13s%-12s%-12s%n", auxarrayMatricula[i], auxarrayPaterno[i],
													auxarrayMaterno[i], auxarrayNombre[i], auxarrayCarrera[i],"\n");
													//Con la función printf() se establecen espacios específicos para cada atributo para su impresión ordenada.
												}
											}
										}

										//se resetean los arreglos auxiliares
										for( i = 0; i < 16; i++)
										{
											auxarrayNombre[i] = null;
											auxarrayPaterno[i] = null;
											auxarrayMaterno[i] = null;
											auxarrayCarrera[i] = null;
											auxarrayMateria[i] = null;
											auxarrayMatricula[i] = 0;
										}

									break;

									case 2:
									//si la carrera en el arreglo de los estudiantes registrados es igual a la de los reportes, se guarda en un array auxiliar
										for( i = 0 ; i < j ; i++ )
										{
											comparar = arrayCarrera[i].equals(arrayCatalogoCarreras[e]);
											if( comparar == true )
											{
												auxarrayMatricula[i] = arrayMatricula[i];
												auxarrayNombre[i] = arrayNombre[i];
												auxarrayPaterno[i] = arrayPaterno[i];
												auxarrayMaterno[i] = arrayMaterno[i];
												auxarrayCarrera[i] = arrayCarrera[i];

												c++;
											}
										}

										if (c >= 2)
										{
											//si hay mas de dos alumnos en la carrera seleccionada, se ordenan por metodo de burbuja
											for(i = 0; i < j-1; i++)
											{
												for(k = 1; k < j-1; k++)
												{
													if(auxarrayPaterno[i].compareTo(auxarrayPaterno[k]) > 0)
													{
														auxarrayMatricula[15] = auxarrayMatricula[i];
														auxarrayMatricula[i] = auxarrayMatricula[k];
														auxarrayMatricula[k] = auxarrayMatricula[15];

														auxarrayNombre[15] = auxarrayNombre[i];
														auxarrayNombre[i] = auxarrayNombre[k];
														auxarrayNombre[k] = auxarrayNombre[15];

														auxarrayPaterno[15] = auxarrayPaterno[i];
														auxarrayPaterno[i] = auxarrayPaterno[k];
														auxarrayPaterno[k] = auxarrayPaterno[15];

														auxarrayMaterno[15] = auxarrayMaterno[i];
														auxarrayMaterno[i] = auxarrayMaterno[k];
														auxarrayMaterno[k] = auxarrayMaterno[15];

														auxarrayCarrera[15] = auxarrayCarrera[i];
														auxarrayCarrera[i] = auxarrayCarrera[k];
														auxarrayCarrera[k] = auxarrayCarrera[15];
													}
												}
											}
										}

										//si no hay alumnos en la carrera seleccionada se imprime lo siguiente:
										if ( c == 0 )
										{
											System.out.print("\nNo hay alumnos registrados en esta carrera. \n\n");
										}
										//de lo contrario se imprimen los alumnos de la carrera de manera ordenada
										else
										{
											System.out.println("\n\nA. Paterno:  A. Materno:  Nombre:     Matrícula:  Carrera:    ");

											for(i = 0; i < j; i++)
											{
												if(auxarrayMatricula[i]!=0)
												{
													//Indica los atributos que aparecen el reporte seleccionado.
													System.out.printf("%-13s%-13s%-12s%-12s%-12s%n", auxarrayPaterno[i],
													auxarrayMaterno[i], auxarrayNombre[i], auxarrayMatricula[i], auxarrayCarrera[i],"\n");
													//Con la función printf() se establecen espacios específicos para cada atributo para su impresión ordenada.
												}
											}
										}

										//se resetean los arreglos auxiliares
										for( i = 0; i < 16; i++)
										{
											auxarrayNombre[i] = null;
											auxarrayPaterno[i] = null;
											auxarrayMaterno[i] = null;
											auxarrayCarrera[i] = null;
											auxarrayMateria[i] = null;
											auxarrayMatricula[i] = 0;
										}

									break;
								}
							break;

							case 2:
							//pregunta por la materia a imprimir
								System.out.print("\n\n---------- ORDENAMIENTO POR MATERIA ---------- \n");
								System.out.print(arrayCatalogoMaterias[0]+"........................... 1 \n");
								System.out.print(arrayCatalogoMaterias[1]+"........................... 2 \n");
								System.out.print(arrayCatalogoMaterias[2]+"........................... 3 \n");
								System.out.print(arrayCatalogoMaterias[3]+"........................... 4 \n");
								System.out.print("Elige la materia:    ");
								e = Lectura2.readInt_C();

								//se resta 1 a la variable e para obtener la posicion de la materia seleccionada
								e = e - 1;

								//se pide el orden
								System.out.print("\n\nMatrícula ........................... 1 \n");
								System.out.print("Nombre    ........................... 2 \n");
								System.out.print("Elige un orden:                     ");
								op4 = Lectura2.readInt_C();

								switch(op4)
								{

									case 1:
									//si la materia en el arreglo de los estudiantes registrados es igual a la de los reportes, se guarda en un array auxiliar
										for( i = 0 ; i < j ; i++ )
										{
											comparar = arrayMateria[i].equals(arrayCatalogoMaterias[e]);
											if( comparar == true )
											{
												auxarrayMatricula[i] = arrayMatricula[i];
												auxarrayNombre[i] = arrayNombre[i];
												auxarrayPaterno[i] = arrayPaterno[i];
												auxarrayMaterno[i] = arrayMaterno[i];
												auxarrayMateria[i] = arrayMateria[i];
												//aumenta el contador de alumnos en esa materia
												c++;
											}
										}
										//si hay mas de dos alumnos en la materia seleccionada, se ordenan por metodo de burbuja
										if ( c >= 2 )
										{
											for(i = 0; i < j-1; i++)
											{
												for(k = 1; k < j; k++)
												{
													if(auxarrayMatricula[i] > auxarrayMatricula[k])
													{
														auxarrayMatricula[15] = auxarrayMatricula[i];
														auxarrayMatricula[i] = auxarrayMatricula[k];
														auxarrayMatricula[k] = auxarrayMatricula[15];

														auxarrayNombre[15] = auxarrayNombre[i];
														auxarrayNombre[i] = auxarrayNombre[k];
														auxarrayNombre[k] = auxarrayNombre[15];

														auxarrayPaterno[15] = auxarrayPaterno[i];
														auxarrayPaterno[i] = auxarrayPaterno[k];
														auxarrayPaterno[k] = auxarrayPaterno[15];

														auxarrayMaterno[15] = auxarrayMaterno[i];
														auxarrayMaterno[i] = auxarrayMaterno[k];
														auxarrayMaterno[k] = auxarrayMaterno[15];

														auxarrayCarrera[15] = auxarrayCarrera[i];
														auxarrayCarrera[i] = auxarrayCarrera[k];
														auxarrayCarrera[k] = auxarrayCarrera[15];
													}
												}
											}
										}
										//si no hay alumnos en la materia seleccionada se imprime lo siguiente:
										if ( c == 0 )
										{
											System.out.print("\nNo hay alumnos registrados en esta materia. \n\n");
										}
										//de lo contrario se imprimen los alumnos de la materia de manera ordenada
										else
										{
											System.out.println("\n\nMatrícula:  A. Paterno:  A. Materno:  Nombre:     Materia:    ");
											for(i = 0; i < j; i++)
											{
												if(auxarrayMatricula[i] != 0)
												{
													//Indica los atributos que aparecen el reporte seleccioanado.
													System.out.printf("%-12s%-13s%-13s%-12s%-12s%n", auxarrayMatricula[i],
													auxarrayPaterno[i], auxarrayMaterno[i], auxarrayNombre[i], auxarrayMateria[i],"\n");
													//Con la función printf() se establecen espacios específicos para cada atributo para su impresión ordenada.
												}
											}
										}
										//se resetean los arreglos auxiliares
										for( i = 0; i < 16; i++)
										{
											auxarrayNombre[i] = null;
											auxarrayPaterno[i] = null;
											auxarrayMaterno[i] = null;
											auxarrayCarrera[i] = null;
											auxarrayMateria[i] = null;
											auxarrayMatricula[i] = 0;
										}

									break;

									case 2:
									//si la materia en el arreglo de los estudiantes registrados es igual a la de los reportes, se guarda en un array auxiliar
										for( i = 0 ; i < j ; i++ )
										{
											comparar = arrayMateria[i].equals(arrayCatalogoMaterias[e]);
											if( comparar == true )
											{
												auxarrayMatricula[i] = arrayMatricula[i];
												auxarrayNombre[i] = arrayNombre[i];
												auxarrayPaterno[i] = arrayPaterno[i];
												auxarrayMaterno[i] = arrayMaterno[i];
												auxarrayMateria[i] = arrayMateria[i];
												//aumenta el contador de alumnos en la materia seleccionada
												c++;
											}
										}

										if (c >= 2)
										{
											//si hay mas de dos alumnos en la materia seleccionada, se ordenan por metodo de burbuja
											for(i = 0; i < j-1; i++)
											{
												for(k = 1; k < j-1; k++)
												{
													if(auxarrayPaterno[i].compareTo(auxarrayPaterno[k]) > 0)
													{
														auxarrayMatricula[15] = auxarrayMatricula[i];
														auxarrayMatricula[i] = auxarrayMatricula[k];
														auxarrayMatricula[k] = auxarrayMatricula[15];

														auxarrayNombre[15] = auxarrayNombre[i];
														auxarrayNombre[i] = auxarrayNombre[k];
														auxarrayNombre[k] = auxarrayNombre[15];

														auxarrayPaterno[15] = auxarrayPaterno[i];
														auxarrayPaterno[i] = auxarrayPaterno[k];
														auxarrayPaterno[k] = auxarrayPaterno[15];

														auxarrayMaterno[15] = auxarrayMaterno[i];
														auxarrayMaterno[i] = auxarrayMaterno[k];
														auxarrayMaterno[k] = auxarrayMaterno[15];

														auxarrayCarrera[15] = auxarrayCarrera[i];
														auxarrayCarrera[i] = auxarrayCarrera[k];
														auxarrayCarrera[k] = auxarrayCarrera[15];
													}
												}
											}
										}

										//si no hay alumnos en la materia seleccionada se imprime lo siguiente:
										if ( c == 0 )
										{
											System.out.print("\nNo hay alumnos registrados en esta materia. \n\n");
										}
										//de lo contrario se imprimen los alumnos de la materia de manera ordenada
										else
										{

											System.out.println("\n\nA. Paterno:  A. Materno:  Nombre:     Matrícula:  Materia:    ");
											for(i = 0; i < j; i++)
											{
												if(auxarrayMatricula[i]!=0)
												{
													//Indica los atributos que aparecen el reporte seleccioanado.
													System.out.printf("%-13s%-13s%-12s%-12s%-12s%n", auxarrayPaterno[i],
													auxarrayMaterno[i], auxarrayNombre[i], auxarrayMatricula[i], auxarrayMateria[i],"\n");
													//Con la función printf() se establecen espacios específicos para cada atributo para su impresión ordenada.
												}
											}
										}
										//se resetean los areglos auxiliares
										for( i = 0; i < 16; i++)
										{
											auxarrayNombre[i] = null;
											auxarrayPaterno[i] = null;
											auxarrayMaterno[i] = null;
											auxarrayCarrera[i] = null;
											auxarrayMateria[i] = null;
											auxarrayMatricula[i] = 0;
										}

									break;
								}
							break;

							case 3:
								System.out.print("\n Usted ha decidido salir del menú de reportes...\n\n");
							break;
						}
					}

				break;

				case 6:
					System.out.print("\n Usted ha decidido salir del programa... \n");
				break;

			}// fin switch

		}// fin while

    }// fin main

}// fin class