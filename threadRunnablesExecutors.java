import android.os.Handler;
import android.widget.TextView;

import org.ter.json.JSONInputStream;
import org.ter.json.JSONOutputStream;


import java.net.Socket;
import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ankomah
 */
public class threadRunnablesExecutors {

    private final int messageSent;
    private final String server;
    private final Handler uiThreadStack;
    private Object TextView;

    public threadRunnablesExecutors(int currentNumMessagesSent, String aMessageForServer, Handler aUIThreadStack) {
        this.messageSent = currentNumMessagesSent;
        this.server = aMessageForServer;
        this.uiThreadStack = aUIThreadStack;
    }

    @Override
    public void run() {
        try {
            Socket toServer = new Socket("10.0", 989);
            final JSONInputStream inFromServer
                    = new JSONInputStream(toServer.getInputStream());
            final JSONOutputStream outToServer
                    = new JSONOutputStream(toServer.getOutputStream());

            HashMap<String, Object> commandMap = new HashMap<>();
            commandMap.put("command", "Speak");
            commandMap.put("count", this.messageSent);
            commandMap.put("message", this.server);

            outToServer.writeObject(commandMap);
            System.out.println("waiting for response");
            HashMap<String, Object> response = (HashMap<String, Object>) inFromServer.readObject();
            System.out.println("response: " + response);
            if (response.get("command").equals("Done")) {
                final TextView responseView = TextView.get();
                uiThreadStack.post(new Runnable() {
                    @Override
                    public void run() {
                        if (responseView != null) {
                            responseView.setText("Sent " + threadRunnablesExecutors.this.server
                                    + ". Message number " + threadRunnablesExecutors.this.messageSent);
                        }
                    }
                });
            }
        } catch (Exception e) {
            final String theErrorMessage = e.getLocalizedMessage();
            final TextView responseView = TextView.get();
            uiThreadStack.post(new Runnable() {
                @Override
                public void run() {
                    if (responseView != null) {
                        responseView.setText("Error: there was an error. " + theErrorMessage);
                    }
                }
            });
        }
    }

}
