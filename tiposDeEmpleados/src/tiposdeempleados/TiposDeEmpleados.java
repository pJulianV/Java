package tiposdeempleados;

import java.util.Scanner;

public class TiposDeEmpleados {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String nombre, apellido, dni, direccion, añosEmpresa, telefono, despacho,
                cocheEmpresa,mensaje;
        double salario;

        int seleccion;
        while (true){
            System.out.println("Ingrese Empleado a Agregar: \n !El programa solo"
                    + " se detendra cuando selecciones \"Salir\"¡ \n \n~ 1 = Secretario"
            + "       ~ 2 = Vendedor \n~ 3 = Jefe de la Zona        ~ 4 = Salir");
            seleccion = consola.nextInt();
            if (seleccion == 1){
                String  numFax;
                System.out.println(" - Secretario - ");
                mensaje = consola.nextLine();
                                System.out.println("Despacho: ");
                despacho = consola.nextLine();
                System.out.println("Nummero de Fax: ");
                numFax = consola.nextLine();
                System.out.println("Nombre: ");
                nombre = consola.nextLine();
                System.out.println("Apellido: ");
                apellido = consola.nextLine();
                System.out.println("DNI: ");
                dni = consola.nextLine();
                System.out.println("Direccion: ");
                direccion = consola.nextLine();
                System.out.println("Años de antiguedad en la empresa: ");
                añosEmpresa = consola.nextLine();
                System.out.println("Telefono: ");
                telefono = consola.nextLine();
                System.out.println("Salario: ");
                salario = consola.nextDouble();
                Secretario objSecretario;
                objSecretario = new Secretario(despacho, numFax, nombre,
                        apellido, dni, direccion, añosEmpresa, telefono, salario);
                while (true) {
                    System.out.println(" - Secretario - !Los resultados de la "
                            + "seleccion apareceran encima de este enunciado¡\n ! Las opciones "
                            + "estaran disponibles hasta seleccionar \"Salir\" !\n "
                            + "\n~ 1 = Incrementar Salario + 5% "
                    + "     ~ 2 = Imprimir informacion      \n~ 3 = Salir" );
                    seleccion = consola.nextInt();
                    System.out.println(seleccion);
                    
                    if (seleccion == 1){
                        System.out.println("El antiguo salario de " + nombre + ": " + salario);
                        salario = objSecretario.incrementarSalario();
                        System.out.println("El salario actualizado de " + nombre + ": " + salario);
                        System.out.println("!Salario de secretari@ " +nombre +
                                " ha incrementado un 5% ¡");
                    }else if(seleccion == 2){
                        objSecretario.imprimir();
                    }else{
                        break;
                    }
                }
            }else if (seleccion == 2){
                String telefonoMovil, areaVenta, listaCliente, 
                        porcentaje; 
                System.out.println(" - Vendedor - ");
                mensaje = consola.nextLine();
                System.out.println("Coche de la Empresa ( matrícula, marca y modelo ): ");
                cocheEmpresa = consola.nextLine();
                System.out.println("Telefono Movil: ");
                telefonoMovil = consola.nextLine();
                System.out.println("Area de ventas: ");
                areaVenta = consola.nextLine();
                System.out.println("Lista de Clientes (Separados por coma \",\"): ");
                listaCliente = consola.nextLine(); // Seria mejor hacer una array
                System.out.println("Porcentaje que se lleva por concepto de "
                        + "comisiones (sin \"%\"): ");
                porcentaje = consola.nextLine();
                System.out.println("Nombre: ");
                nombre = consola.nextLine();
                System.out.println("Apellido: ");
                apellido = consola.nextLine();
                System.out.println("DNI: ");
                dni = consola.nextLine();
                System.out.println("Direccion: ");
                direccion = consola.nextLine();
                System.out.println("Años de antiguedad en la empresa: ");
                añosEmpresa = consola.nextLine();
                System.out.println("Telefono: ");
                telefono = consola.nextLine();
                System.out.println("Salario: ");
                salario = consola.nextDouble();                

                Vendedor objVendedor;
                objVendedor = new Vendedor(cocheEmpresa, telefonoMovil, areaVenta,
             listaCliente,  porcentaje, nombre, apellido,
             dni, direccion, añosEmpresa, telefono, salario);
                while (true) {
                    System.out.println(" - Vendedor - !Los resultados de la "
                    + "seleccion apareceran encima de este enunciado¡\n ! Las opciones estaran "
                    + "disponibles hasta seleccionar \"Salir\" !\n\n ~ 1 = "
                    + "Incrementar Salario +10% "
                    + "       ~ 2 = Imprimir informacion \n~ 3 = Dar de alta "
                    + "a nuevo cliente        ~ 4 = Dar de baja a cliente \n"
                    + "~ 5 Cambiar de coche        ~ 6 = Salir" );
                    seleccion = consola.nextInt();                    
                    if (seleccion == 1) {
                        System.out.println("El antiguo salario de " + nombre + ": " + salario);
                        salario = objVendedor.incrementarSalario();
                        System.out.println("El salario actualizado de " + nombre + ": " + salario);
                        System.out.println("Salario de vendedor/a " + nombre +
                                " ha incrementado un 10%");
                    }else if (seleccion == 2){
                        objVendedor.imprimir();
                    }else if (seleccion == 3){
                        objVendedor.darDeAltaCliente();
                    }else if (seleccion == 4){
                        objVendedor.darDeBajaCliente();
                    }else if (seleccion == 5){
                        objVendedor.cambiarCoche();
                    }else{
                        break;
                    }
                }
            }else if (seleccion == 3){
                String secretario, listaVendedores;
                System.out.println(" - Secretario - ");
                mensaje = consola.nextLine();
                System.out.println("Despacho: ");
                despacho = consola.nextLine();
                System.out.println("Secretario a su cargo: ");
                secretario = consola.nextLine();
                System.out.println("Lista de vendedores: ");
                listaVendedores = consola.nextLine();
                System.out.println("Coche de la Empresa ( matrícula, marca y modelo ): ");
                cocheEmpresa = consola.nextLine();
                System.out.println("Nombre: ");
                nombre = consola.nextLine();
                System.out.println("Apellido: ");
                apellido = consola.nextLine();
                System.out.println("DNI: ");
                dni = consola.nextLine();
                System.out.println("Direccion: ");
                direccion = consola.nextLine();
                System.out.println("Años de antiguedad en la empresa: ");
                añosEmpresa = consola.nextLine();
                System.out.println("Telefono: ");
                telefono = consola.nextLine();
                System.out.println("Salario: ");
                salario = consola.nextDouble();
                JefeDeZona objJefeDeZona;
                objJefeDeZona = new JefeDeZona(despacho, secretario, listaVendedores,
                        cocheEmpresa, nombre, apellido, dni, direccion, 
                        añosEmpresa,  telefono, salario);
                System.out.println(seleccion);
                while (true) {
                    System.out.println(" - Jefe de Zona - \n ! Los resultados de "
                        + "la seleccion apareceran encima de este enunciado! \n \n~ 1 = Incrementar "
                        + "Salario + 20%"
                        + "       ~ 2 = Imprimir informacion \n~ 3 = Cambiar de secretario "
                        + "a su cargo        ~ 4 = Cambiar coche \n~ 5 = Dar de alta a un Vendedor "
                        + "       ~ 6 = Dar de baja a vendedor \n~ 7 = Salir" );

                    seleccion = consola.nextInt();
                    if (seleccion == 1){
                        System.out.println("El antiguo salario de " + nombre + ": " + salario);
                        salario = objJefeDeZona.incrementarSalario();
                        System.out.println("El salario actualizado de " + nombre + ": " + salario);
                        System.out.println("Salario de jefe/a de la zona " +nombre +
                                " ha incrementado un 20%");
                    }else if (seleccion == 2){
                        objJefeDeZona.imprimir();
                    }else if (seleccion == 3){
                        objJefeDeZona.cambiarSecretario();
                    }else if (seleccion == 4){
                        objJefeDeZona.cambiarCoche();
                    }else if (seleccion ==  5){
                        objJefeDeZona.DarDeAltaVendedor();
                    }else if (seleccion == 6){
                        objJefeDeZona.DarDeBajaVendedor();
                    }else{
                        break;
                    }
                }
            }else{
                break;
            }
        }
    }
}    
