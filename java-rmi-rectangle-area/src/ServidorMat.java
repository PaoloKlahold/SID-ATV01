package java_rmi_rectangle_area;

public class ServidorMat extends java.rmi.server.UnicastRemoteObject implements InterfaceServidorMat{
    public ServidorMat() throws java.rmi.RemoteException {
        super();
    }

    @Override
    public double calcularArea(double larg, double alt) throws java.rmi.RemoteException {
        return larg * alt;
    }
}