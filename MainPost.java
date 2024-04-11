import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainPost {
    public static void main(String[] args) {
        // Establecer la conexión
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/publicaciones", // URL de conexión
                "postgres", // Usuario de la base de datos
                "postgres" // Contraseña de la base de datos
        )) {
            System.out.println("Conexión exitosa.");

            // Crear una declaración
            Statement statement = connection.createStatement();

            // Ejecutar una consulta
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            // Iterar sobre los resultados
            while (resultSet.next()) {
                // Acceder a los datos de cada fila
                int idUsuario = resultSet.getInt("id_usuario");
                String nombreUsuario = resultSet.getString("nombre_usuario");
                String correoElectronico = resultSet.getString("correo_electronico_usuario");

                // Imprimir los resultados
                System.out.println("ID: " + idUsuario + ", Nombre: " + nombreUsuario + ", Correo: " + correoElectronico);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }
}