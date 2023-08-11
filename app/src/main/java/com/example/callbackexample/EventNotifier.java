package com.example.callbackexample;

public class EventNotifier {
    private CallbackListener callbackListener;
    public void setCallbackListener(CallbackListener listener){
        this.callbackListener = listener;
    }

    public void performEvent(){
        String eventMessage = "Event has occured!";
        if (callbackListener != null){
            callbackListener.onCallback(eventMessage);
        }
    }
}
