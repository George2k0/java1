package ge.edu.btu.chat.server;

import java.io.ObjectInputStream;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(1111);
        System.out.println("მიმდინარეობს კავშირის დამყარება...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("დასვით კითხვა: ");
        ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
        String message = (String) objectInputStream.readObject();
        System.out.println(message);

        if (message.equals("გამარჯობა")){
            System.out.println("მოგესალმებით, რით შემიძლია დაგეხმაროთ?");
        }if (message.equals("მაჩვენე კურსი")){
            System.out.println("2.97");
        }else{
        }
    }
}
