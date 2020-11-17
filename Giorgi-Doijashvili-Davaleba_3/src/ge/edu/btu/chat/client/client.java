package ge.edu.btu.chat.client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",1111);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

        String msg1 = "გამარჯობა";
        String msg2 = "მაჩვენე კურსი";

        objectOutputStream.writeObject(msg1);
        objectOutputStream.writeObject(msg2);

        objectOutputStream.close();
        socket.close();
    }
}