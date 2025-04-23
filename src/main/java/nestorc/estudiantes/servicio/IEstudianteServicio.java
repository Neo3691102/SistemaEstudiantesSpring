package nestorc.estudiantes.servicio;

import nestorc.estudiantes.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {
    public List<Estudiante> listarEstudiantes();

    public Estudiante buscarEstudiantePorId(Integer idEstudiante);

    public void guardarEstudiante(Estudiante estudiante); //agregar o modificar

    public void eliminarEstudiante(Estudiante estudiante);
}
