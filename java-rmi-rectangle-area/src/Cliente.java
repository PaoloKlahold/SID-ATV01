package java_rmi_rectangle_area;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            InterfaceServidorMat servidor = (InterfaceServidorMat) registry.lookup("ServidorMat");

            double larg = 5.0;
            double alt = 10.0;

            double area = servidor.calcularArea(larg, alt);

            System.out.println("A area do retangulo e: " + area);
        } catch (Exception e) {
            System.err.println("Excecao no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}