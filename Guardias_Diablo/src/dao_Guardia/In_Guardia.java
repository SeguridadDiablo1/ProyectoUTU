package dao_Guardia;

import modelo.Guardia;// pada poder usar el parametro del tipo Guardia
import java.util.List;// para poder usar ArrayList

public interface In_Guardia {
	public boolean registrar(Guardia Guardia);
	public List<Guardia> obtener();
	public boolean actualizar(Guardia Guardia);
	public boolean eliminar(Guardia Guardia);

}

/* Esta interfase crea los metodos abstractos para
 *  registrar actualizar y eliminar los registro*/
