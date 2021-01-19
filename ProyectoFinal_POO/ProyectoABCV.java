/*
/* Diccionario de Datos
/*

===================================================================================================
Variable................. Tipo de Datos............... Uso de la Variable
===================================================================================================
nombre................... static String............... Variable para almacenar y enviar el nombre del estudiante.
paterno.................. static String............... Variable para almacenar y enviar el apellido paterno del estudiante.
materno.................. static String............... Variable para almacenar y enviar el apellido materno del estudiante.
carrera.................. static String............... Variable para almacenar y enviar la carrera del estudiante.
materia.................. static String............... Variable para almacenar y enviar la materia del estudiante.
matricula................ static int.................. Variable para almacenar y enviar la matrícula del estudiante.
semestre................. static int.................. Variable para almacenar y enviar el semestre del estudiante.

*/

public class ProyectoABCV
{
	//declarar variables estáticas
    static int matricula;
    static String nombre, paterno, materno;
    static int semestre;
    static String carrera;
    static String materia;

	public ProyectoABCV ()
	{
		//almacenar variables
		this.matricula = matricula;
        this.nombre = nombre;
        this.paterno = paterno;
		this.materno = materno;
		this.semestre = semestre;
        this.carrera= carrera;
        this.materia= materia;
    }

		//Metodos para leer e imprimir la matrícula
       public void leerMatricula (int matricula)
       {
           this.matricula = matricula;
       }
       public int imprimirMatricula()
       {
           return matricula;
       }

		//Metodos para leer e imprimir la el nombre
       public void leerNombre (String nombre)
       {
           this.nombre = nombre;
       }
       public String imprimirNombre()
       {
           return nombre;
       }

		//Metodos para leer e imprimir el apellido paterno
       public void leerPaterno (String paterno)
       {
           this.paterno = paterno;
       }
       public String imprimirPaterno()
       {
           return paterno;
       }

		//Metodos para leer e imprimir el apellido materno
       public void leerMaterno (String materno)
       {
           this.materno = materno;
       }
       public String imprimirMaterno()
       {
           return materno;
       }

		//Metodos para leer e imprimir el semestre
		public void leerSemestre (int semestre)
		{
			this.semestre = semestre;
		}
		public int imprimirSemestre()
		{
			return semestre;
		}


		//Metodos para leer e imprimir la carrera
       public void leerCarrera (String carrera)
       {
           this.carrera = carrera;
       }
       public String imprimirCarrera()
       {
           return carrera;
       }


		//Metodos para leer e imprimir la materia
       public void leerMateria (String materia)
	   {
	       this.materia = materia;
	   }
	   public String imprimirMateria()
	   {
	       return materia;
       }

}//fin clase