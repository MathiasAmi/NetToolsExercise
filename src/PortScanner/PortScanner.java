package PortScanner;

import java.net.InetSocketAddress;
import java.net.Socket;

public class PortScanner {

    public static void main(String[] args) {

        // Manuel søgning af port på en ip addresse. Skal laves automatisk.

        boolean isOpen = portIsOpen("192.168.0.109", 14123, 200);

        if (isOpen == true) {
            System.out.println("The port is open");
        }
        // Skal have lavet så man ikke skal søge manuelt. så nedstående skal væk.
        else {
            System.out.println("The port is closed");
        }





    }

    public static boolean portIsOpen(String ip, int port, int timeout) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), timeout);
            socket.close();
            return true;


        } catch (Exception ex) {
            return false;
        }


    }
}