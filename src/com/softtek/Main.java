package com.softtek;

import com.softtek.modelo.ejercicio1.*;
import com.softtek.modelo.ejercicio2.*;
import com.softtek.modelo.ejercicio2.Nautico;
import com.softtek.modelo.ejercicio2.ObjetoVolador;
import com.softtek.modelo.ejercicio3.Coche;
import com.softtek.modelo.ejercicio3.Conductor;
import com.softtek.modelo.ejercicio4.ITaller;
import com.softtek.modelo.ejercicio4.SeguroCoche;
import com.softtek.modelo.ejercicio4.TallerMecanica;
import com.softtek.modelo.ejercicio4.TallerPintura;
import com.softtek.modelo.ejercicio5.*;
import com.softtek.modelo.ejercicio6.*;
import com.softtek.modelo.ejercicio7.Producto;
import com.softtek.modelo.ejercicio7.ProductoException;
import com.softtek.modelo.ejercicio8.CalculadoraSegura;

public class Main {
    public static void main(String[] args) {
        // Ejercicio1
        Animal perro = new Perro();
        Animal pez = new Pez();
        Animal pajaro = new Pajaro();
        Animal gusano = new Gusano();
        Animal gorrión = new Gorrion();
        Animal buitre = new Buitre();


        System.out.println("--- Acciones de los animales ---");
        perro.comer();
        perro.moverse();

        pez.comer();
        pez.moverse();

        pajaro.comer();
        pajaro.moverse();

        gusano.comer();
        gusano.moverse();

        gorrión.comer();
        gorrión.moverse();

        buitre.comer();
        buitre.moverse();

        // Ejercicio2
        Nautico barcaza = new Barcaza();
        ObjetoVolador avion = new Avion();
        ObjetoVolador hidroavion = new Hidroavion(); // Usamos ObjetoVolador para acceder a los métodos de vuelo
        ObjetoVolador helicoptero = new Helicoptero(); // Usamos ObjetoVolador para acceder a los métodos de vuelo

        // Ejecutar acciones
        System.out.println();
        System.out.println("--- Acciones de los vehículos náuticos ---");
        barcaza.atracar();
        ((Nautico) barcaza).navegar(); // Convertimos a Nautico para llamar al método navegar

        System.out.println("\n--- Acciones de los vehículos voladores ---");
        avion.despegar();
        avion.volar();
        avion.aterrizar();

        System.out.println("\n--- Acciones de los hidroaviones ---");
        hidroavion.despegar();
        hidroavion.volar();
        hidroavion.aterrizar();

        System.out.println("\n--- Acciones de los helicópteros ---");
        helicoptero.despegar();
        helicoptero.volar();
        helicoptero.aterrizar();

        // Ejercicio3
        // Crear un coche con 50 unidades de gasolina en el depósito
        System.out.println();
        Coche miCoche = new Coche(50);

        // Crear un conductor y asignarle el coche
        Conductor conductor = new Conductor(miCoche);

        // El conductor intenta conducir el coche
        System.out.println("El conductor intenta conducir el coche:");
        conductor.conducir();

        // Agotar el combustible del coche
        miCoche = new Coche(0);
        conductor = new Conductor(miCoche);

        // El conductor intenta conducir el coche sin gasolina
        System.out.println("\nEl conductor intenta conducir el coche sin gasolina:");
        conductor.conducir();

        // Ejercicio4
        ITaller tallerMecanica = new TallerMecanica();
        ITaller tallerPintura = new TallerPintura();

        // Ejecutar acciones
        com.softtek.modelo.ejercicio4.Coche coche = new com.softtek.modelo.ejercicio4.Coche("ABC123", "Toyota");

        SeguroCoche seguroMecanica = new SeguroCoche(tallerMecanica, "SeguroCoche Company");

        String resultadoReparacionMecanica = seguroMecanica.reparar(coche);
        System.out.println(resultadoReparacionMecanica);

        SeguroCoche seguroPintura = new SeguroCoche(tallerPintura, "SeguroCoche Company");

        String resultadoReparacionPintura = seguroPintura.reparar(coche);
        System.out.println(resultadoReparacionPintura);

        // Ejercicio5
        // Crear instancias de los informes para los trimestres
        System.out.println();
        Informe informeTrimestre1 = new InformeTrimestre1();
        Informe informeTrimestre2 = new InformeTrimestre2();

        // Crear instancias de empleados
        Empleado director = new Director(informeTrimestre1);
        Empleado secretario = new Secretario(informeTrimestre2, "Softtek", "secretario@softtek.com");

        // Obtener tareas e informes de los empleados
        System.out.println("Tareas del director: " + director.getTareas());
        System.out.println("Informe del director: " + director.getInforme());

        System.out.println("\nTareas del secretario: " + secretario.getTareas());
        System.out.println("Informe del secretario: " + secretario.getInforme());

        // Ejercicio6

        IDAO accesoProduccion = new AccesoProduccion();
        IDAO accesoDesarrollo = new AccesoDesarrollo();

        ClienteDao clienteDaoProduccion = new ClienteDao(accesoProduccion);

        ClienteDao clienteDaoDesarrollo = new ClienteDao(accesoDesarrollo);


        Cliente cliente = new Cliente("Juan", "123456789");


        String resultadoProduccion = clienteDaoProduccion.insertar(cliente);
        System.out.println(resultadoProduccion);


        String resultadoDesarrollo = clienteDaoDesarrollo.insertar(cliente);
        System.out.println(resultadoDesarrollo);
        System.out.println();

        // Ejercicio7
        try {
            Producto producto1 = new Producto(1, "Producto 1", 10.5, "Proveedor 1", "Descripción 1");
            producto1.comprobar(); // Esto debería funcionar correctamente
            System.out.println("Producto 1 creado con éxito.");

            Producto producto2 = new Producto("Producto 2", 20.75, "Proveedor 2", "Descripción 2");
            producto2.comprobar(); // Esto también debería funcionar correctamente
            System.out.println("Producto 2 creado con éxito.");
        } catch (ProductoException e) {
            System.out.println("Error al comprobar el producto: " + e.getMessage());
        }

        // Ejercicio8
        System.out.println();
        double num1 = 10;
        double num2 = 0;

        try {
            double suma = CalculadoraSegura.sumar(num1, num2);
            System.out.println("Suma: " + suma);

            double resta = CalculadoraSegura.restar(num1, num2);
            System.out.println("Resta: " + resta);

            double multiplicacion = CalculadoraSegura.multiplicar(num1, num2);
            System.out.println("Multiplicación: " + multiplicacion);

            double division = CalculadoraSegura.dividir(num1, num2);
            System.out.println("División: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
