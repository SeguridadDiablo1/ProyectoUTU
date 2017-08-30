package modelo;
import java.text.DateFormat;
import java.util.*;

public class Guardia {

	private int Id_Guardia;
	private String Nomb_Guardia;
	private String Apellido_Guardia;
	private String Calle_Direccion_Guardia;
	private int	NroPuerta_Guardia;
	private Date FechaNac_Guardia;
	private boolean PorteArmas_Guardia;
	private boolean Libreta_Guardia;
	private String correo_electronico;
	private String Tipo_Guardia;
	// establesco las variables privates para que no se modifiquen fuera de esta clase


	public int getId_Guardia() {
		return Id_Guardia;
	}
	public void setId_Guardia(int Id_Guardia) {
		this.Id_Guardia =Id_Guardia;
	}
	public String getNombre_Gurardia() {
		return Nomb_Guardia;
	}
	public void setNombre_Guardia(String Nomb_Guardia) {
		this.Nomb_Guardia = Nomb_Guardia;
	}
	public String getApellido_Guardia() {
		return Apellido_Guardia;
	}
	public void setApellido_Guardia(String Apellido_Guardia) {
		this.Apellido_Guardia = Apellido_Guardia;
	}

	public String getCalle_Guardia(){
		return Calle_Direccion_Guardia;
	}

	public void setCalle_Guardia(String Calle_Guardia)
	{
		Calle_Direccion_Guardia=Calle_Guardia;
	}

	public int getNro_Puerta_Guardia(){
		return NroPuerta_Guardia;
	}

	public void setNro_Puerta_Guardia(int NroPuerta_Guardia)
	{
		this.NroPuerta_Guardia=NroPuerta_Guardia;
	}

	public void setFechaNaciGuardia(int dia,int mes,int ano){

		GregorianCalendar FechNacGuardia = new GregorianCalendar(dia,mes,ano);
		FechaNac_Guardia=FechNacGuardia.getTime();// te lo pone en String

	}

	public String getFormatFechac() {// cambia el formato de fecha al "uruguayo"
		DateFormat fn = DateFormat.getDateInstance(DateFormat.SHORT);
		return fn.format(FechaNac_Guardia);
	}

	public void setPorteDeArma(String respuestaPorteArma){
		if (respuestaPorteArma.equals("SI")){
			this.PorteArmas_Guardia=true;
		}
		else {
			this.PorteArmas_Guardia=true;
		}

	}
	

	public static void main(String[] args) {
		Guardia yoGuardia = new Guardia();

		yoGuardia.setFechaNaciGuardia(12,4,2016);
			System.out.println(yoGuardia.getFormatFechac());

	}
	
	
	// fin de los setters y getters para usar en el DAO











}
