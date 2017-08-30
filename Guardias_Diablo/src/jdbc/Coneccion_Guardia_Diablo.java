package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Coneccion_Guardia_Diablo {
	
	

		 
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=Transgas1710;database=Seguridad_Diablo");
			if (conn!=null) {
				System.out.print("si");
				
			} else {
				System.out.print("no");

			}
			
			}
		}
	
