package CurrentIP;

import java.io.IOException;
import java.net.InetAddress;


public class LocalIP {

    public static void main(String[] args) {

        InetAddress IP;

        try {

            IP = InetAddress.getLocalHost();

            System.out.println("The IP of this machine is " + InetAddress.getLocalHost().getHostAddress());
            System.out.println("The name of the Host is " + InetAddress.getLocalHost().getHostName());



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
