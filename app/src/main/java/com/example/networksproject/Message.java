package com.example.networksproject;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Message extends AsyncTask<String, Void, Void> {

    Socket socket;
    DataOutputStream dataOutputStream;
    PrintWriter printWriter;

    @Override
    protected Void doInBackground(String...voids) {
String message = voids[0];
        try {
            socket = new Socket("192.168.1.13", 7000);
            printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write(message);
            printWriter.flush();
            socket.close();

        }catch(IOException e){
            e.printStackTrace();
        }




        return null;
    }
}
