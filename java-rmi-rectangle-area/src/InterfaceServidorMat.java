package java_rmi_rectangle_area;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidorMat extends Remote {
    double calcularArea(double larg, double alt) throws RemoteException;
}