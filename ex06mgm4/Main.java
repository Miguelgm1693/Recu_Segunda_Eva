package ex06mgm4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuario = new ArrayList();
        ArrayList<Empresa> listadoEmpresa = new ArrayList();
        ArrayList<Comercial> listadoComercial = new ArrayList();

        listaUsuario.add(new Usuario("Miguel", "miguelgm@gmail.com", "666999111"));
        listaUsuario.add(new Usuario("Juan", "juanlk@gmail.com", "666777888"));
        listadoEmpresa.add(new Empresa("777444D", "Malaga CF", "952554488"));
        listadoEmpresa.add(new Empresa("845235L", "Prolongo", "952662244"));
        listadoComercial.add(new Comercial("Luis", "luis22@gmail.com", "coordinador de ventas"));
        listadoComercial.add(new Comercial("Paco", "francis3@gmail.com", "jefe de ventas"));

        Scanner sc = new Scanner(System.in);
        boolean activar = true;

        while (activar) {

            /*CREAR MENÚ DE INTERFAZ*/
            System.out.println("---- MENÚ -----");
            System.out.println("1. Operaciones con comerciales");
            System.out.println("2. Operaciones con cliente");
            System.out.println("3. Salir");

            int opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                System.out.println("MENÚ COMERCIAL");
                System.out.println("1. Listado");
                System.out.println("2. Alta");
                System.out.println("3. Baja");
                System.out.println("4. Modificar");
                System.out.println("5. Vender");
                System.out.println("6. Consultar ventas");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        for (Comercial comercial : listadoComercial) {
                            System.out.println(comercial);
                        }

                        break;
                    case 2:
                        System.out.println("Introduzca nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca Email: ");
                        String email = sc.nextLine();
                        System.out.println("Introduzca cargo: ");
                        String cargo = sc.nextLine();

                        listadoComercial.add(new Comercial(nombre, email, cargo));

                        break;
                    case 3:

                        System.out.println("Introduzca el Email del comercial a borrar: ");
                        String emailComercial = sc.nextLine();

                        listadoComercial.removeIf(comercial -> comercial.getEmail().equals(emailComercial));

                        break;
                    case 4:

                        System.out.println("Introduzca el Email de usuario a modificar: ");
                        String emailEdit = sc.nextLine();

                        System.out.println("Introduzca un nuevo nombre: ");
                        String nombreComercial = sc.nextLine();
                        System.out.println("Introduzca un nuevo email: ");
                        String emailnuevo = sc.nextLine();
                        System.out.println("Introduzca un nuevo cargo: ");
                        String cargoNuevo = sc.nextLine();

                        for (Comercial comercial : listadoComercial) {
                            if (comercial.getEmail().equals(emailEdit)) {
                                comercial.setNombre(nombreComercial);
                                comercial.setEmail(emailnuevo);
                                comercial.setCargo(cargoNuevo);
                            }
                        }
                        break;
                    case 5:

                        System.out.println("Introduzca email de comercial de venta: ");
                        String emailVenta = sc.nextLine();

                        System.out.println("Introduzca el nombre del artículo que desea vender: ");
                        String nombreArticulo = sc.nextLine();

                        System.out.println("Introduzca nº de unidades a vender: ");
                        int unidades = Integer.parseInt(sc.nextLine());

                        System.out.println("¡El artículo ha sido vendido!");

                        for (Comercial comercial : listadoComercial) {
                            if (comercial.getEmail().equals(emailVenta)) {
                                comercial.setVendidosAdd(new Articulo(nombreArticulo, unidades));

                            }

                        }

                        break;
                    case 6:
                        System.out.println("Introduzca el email del comercial a consultar venta: ");
                        String emailConsulta = sc.nextLine();

                        for (Comercial comercial : listadoComercial) {
                            if (comercial.getEmail().equals(emailConsulta)) {
                                comercial.consultarVenta();

                            }

                        }
                        break;
                }

            } else if (opcion == 2) {
                System.out.println("MENÚ CLIENTE");
                System.out.println("1. Listado");
                System.out.println("2. Alta");
                System.out.println("3. Baja");
                System.out.println("4. Modificar");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: //listado
                        for (Usuario usuario : listaUsuario) {
                            System.out.println(usuario);
                        }
                        for (Empresa empresa : listadoEmpresa) {
                            System.out.println(empresa);
                        }

                        break;

                    case 2:
                        System.out.println("1. Alta usuario");
                        System.out.println("2. Alta empresa");

                        opcion = Integer.parseInt(sc.nextLine());

                        if (opcion == 1) {
                            System.out.println("Introduzca el nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduzca Email: ");
                            String email = sc.nextLine();
                            System.out.println("Introduzca teléfono: ");
                            String telefono = sc.nextLine();

                            listaUsuario.add(new Usuario(nombre, email, telefono));

                        } else {
                            System.out.println("Introduzca el Cif: ");
                            String cif = sc.nextLine();
                            System.out.println("Introduzca nombre empresa: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduzca teléfono: ");
                            String telefono = sc.nextLine();

                            listadoEmpresa.add(new Empresa(cif, nombre, telefono));

                        }

                        break;

                    case 3:
                        System.out.println("1. Baja usuario");
                        System.out.println("2. Baja empresa");

                        opcion = Integer.parseInt(sc.nextLine());

                        if (opcion == 1) {

                            System.out.println("Introduzca el Email de usuario a borrar: ");
                            String email = sc.nextLine();

                            listaUsuario.removeIf(usuario -> usuario.getEmail().equals(email));

                        } else if (opcion == 2) {

                            System.out.println("Introduzca el Cif de empresa a borrar: ");
                            String cif = sc.nextLine();

                            listadoEmpresa.removeIf(empresa -> empresa.getCif().equals(cif));

                        }

                        break;

                    case 4:
                        System.out.println("1. Modificar Usuario");
                        System.out.println("2. Modificar Empresa");

                        opcion = Integer.parseInt(sc.nextLine());

                        if (opcion == 1) {

                            System.out.println("Introduzca el Email de usuario a modificar: ");
                            String email = sc.nextLine();

                            System.out.println("Introduzca un nuevo nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduzca un nuevo email: ");
                            String emailnuevo = sc.nextLine();
                            System.out.println("Introduzca un nuevo telefono: ");
                            String telefono = sc.nextLine();

                            for (Usuario usuario : listaUsuario) {
                                if (usuario.getEmail().equals(email)) {
                                    usuario.setNombre(nombre);
                                    usuario.setEmail(emailnuevo);
                                    usuario.setTelefono(telefono);
                                }
                            }

                        } else if (opcion == 2) {

                            System.out.println("Introduzca el Cif de empresa a modificar: ");
                            String cif = sc.nextLine();

                            System.out.println("Introduzca un nuevo cif: ");
                            String cifnuevo = sc.nextLine();
                            System.out.println("Introduzca un nuevo nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduzca un nuevo telefono: ");
                            String telefono = sc.nextLine();

                            for (Empresa empresa : listadoEmpresa) {
                                if (empresa.getCif().equals(cif)) {
                                    empresa.setCif(cifnuevo);
                                    empresa.setNombre(nombre);
                                    empresa.setTelefono(telefono);
                                }
                            }

                        }

                        break;

                }

            } else if (opcion == 3) {
                System.out.println("Hasta luego");
                activar = false;
            }

        }
    }

}
