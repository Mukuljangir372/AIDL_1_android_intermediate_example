package com.mu.jan.app.aidl_1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class AIDLService extends Service {

    public AIDLService() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
    //A interface in aidl file has inner abstract class called Stub that extends Binder and methods defined in
    //aidl file interface

    private final MyAIDLInterface.Stub binder = new MyAIDLInterface.Stub() {
        @Override
        public int getResultSum(int number1, int number2) throws RemoteException {
            return number1+number2;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder.asBinder();

    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
