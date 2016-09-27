package workshop.com.br.workshopeldo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class WorkShopService extends Service {
    private int i;
    private Timer timer;

    public WorkShopService() {
    }

    public int onStartCommand(Intent in, int flags, int startId){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Log.d("Service", "running "+ ++i);
            }
        },0,3000);
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
