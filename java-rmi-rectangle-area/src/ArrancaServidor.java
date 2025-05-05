package java_rmi_rectangle_area;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ArrancaServidor {
    public static void main(String[] args) {
        try {
            ServidorMat servidor = new ServidorMat();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("ServidorMat", servidor);
            System.out.println("Servidor de cálculo de área de retângulo está pronto.");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}