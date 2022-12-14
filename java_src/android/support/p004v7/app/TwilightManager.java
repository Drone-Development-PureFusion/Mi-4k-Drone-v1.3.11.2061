package android.support.p004v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.content.PermissionChecker;
import android.util.Log;
import com.google.firebase.p251a.C9654a;
import java.util.Calendar;
/* renamed from: android.support.v7.app.TwilightManager */
/* loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private static final TwilightState sTwilightState = new TwilightState();
    private final Context mContext;
    private final LocationManager mLocationManager;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.TwilightManager$TwilightState */
    /* loaded from: classes.dex */
    public static class TwilightState {
        boolean isNight;
        long nextUpdate;
        long todaySunrise;
        long todaySunset;
        long tomorrowSunrise;
        long yesterdaySunset;

        private TwilightState() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TwilightManager(Context context) {
        this.mContext = context;
        this.mLocationManager = (LocationManager) context.getSystemService(C9654a.C9656b.f30231p);
    }

    private Location getLastKnownLocation() {
        Location location = null;
        Location lastKnownLocationForProvider = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? getLastKnownLocationForProvider("network") : null;
        if (PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = getLastKnownLocationForProvider("gps");
        }
        if (location != null && lastKnownLocationForProvider != null) {
            return location.getTime() > lastKnownLocationForProvider.getTime() ? location : lastKnownLocationForProvider;
        }
        if (location == null) {
            location = lastKnownLocationForProvider;
        }
        return location;
    }

    private Location getLastKnownLocationForProvider(String str) {
        if (this.mLocationManager != null) {
            try {
                if (this.mLocationManager.isProviderEnabled(str)) {
                    return this.mLocationManager.getLastKnownLocation(str);
                }
            } catch (Exception e) {
                Log.d(TAG, "Failed to get last known location", e);
            }
        }
        return null;
    }

    private boolean isStateValid(TwilightState twilightState) {
        return twilightState != null && twilightState.nextUpdate > System.currentTimeMillis();
    }

    private void updateState(@NonNull Location location) {
        long j;
        TwilightState twilightState = sTwilightState;
        long currentTimeMillis = System.currentTimeMillis();
        TwilightCalculator twilightCalculator = TwilightCalculator.getInstance();
        twilightCalculator.calculateTwilight(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = twilightCalculator.sunset;
        twilightCalculator.calculateTwilight(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = twilightCalculator.state == 1;
        long j3 = twilightCalculator.sunrise;
        long j4 = twilightCalculator.sunset;
        twilightCalculator.calculateTwilight(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = twilightCalculator.sunrise;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        twilightState.isNight = z;
        twilightState.yesterdaySunset = j2;
        twilightState.todaySunrise = j3;
        twilightState.todaySunset = j4;
        twilightState.tomorrowSunrise = j5;
        twilightState.nextUpdate = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isNight() {
        TwilightState twilightState = sTwilightState;
        if (isStateValid(twilightState)) {
            return twilightState.isNight;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return twilightState.isNight;
        }
        Log.i(TAG, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
