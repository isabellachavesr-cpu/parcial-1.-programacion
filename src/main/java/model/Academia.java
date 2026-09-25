package co.edu.uniquindio.lenguajecafetero.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;




public final class Academia {

    private final String nombreComercial;
    private final String nit;
    private final String direccion;
    private final String telefono;
    private final String correo;
    private final String paginaWeb;

    private final List<Estudiante> estudiantes = new ArrayList<>();
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();
    private final List<ServicioAdicional> serviciosAdicionales = new ArrayList<>();
    private final List<Matricula> matriculas = new ArrayList<>();
    private final List<PoliticaDescuento> politicasDescuento = new ArrayList<>();

