package android.support.p004v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p004v7.app.AppCompatDelegateImplBase;
import android.support.p004v7.view.SupportActionModeWrapper;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AppCompatDelegateImplV14 */
/* loaded from: classes.dex */
public class AppCompatDelegateImplV14 extends AppCompatDelegateImplV11 {
    private static final String KEY_LOCAL_NIGHT_MODE = "appcompat:local_night_mode";
    private static TwilightManager sTwilightManager;
    private boolean mApplyDayNightCalled;
    private int mLocalNightMode = -100;
    private boolean mHandleNativeActionModes = true;

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV14$AppCompatWindowCallbackV14 */
    /* loaded from: classes.dex */
    class AppCompatWindowCallbackV14 extends AppCompatDelegateImplBase.AppCompatWindowCallbackBase {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AppCompatWindowCallbackV14(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.p004v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return AppCompatDelegateImplV14.this.isHandleNativeActionModesEnabled() ? startAsSupportActionMode(callback) : super.onWindowStartingActionMode(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImplV14.this.mContext, callback);
            android.support.p004v7.view.ActionMode startSupportActionMode = AppCompatDelegateImplV14.this.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImplV14(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
    }

    private TwilightManager getTwilightManager() {
        if (sTwilightManager == null) {
            sTwilightManager = new TwilightManager(this.mContext.getApplicationContext());
        }
        return sTwilightManager;
    }

    private boolean updateConfigurationForNightMode(int i) {
        Resources resources = this.mContext.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 != i3) {
            Configuration configuration2 = new Configuration(configuration);
            configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            return true;
        }
        return false;
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase, android.support.p004v7.app.AppCompatDelegate
    public boolean applyDayNight() {
        this.mApplyDayNightCalled = true;
        int mapNightMode = mapNightMode(this.mLocalNightMode == -100 ? getDefaultNightMode() : this.mLocalNightMode);
        if (mapNightMode != -1) {
            return updateConfigurationForNightMode(mapNightMode);
        }
        return false;
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase, android.support.p004v7.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int mapNightMode(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                return getTwilightManager().isNight() ? 2 : 1;
            default:
                return i;
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplV7, android.support.p004v7.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || this.mLocalNightMode != -100) {
            return;
        }
        this.mLocalNightMode = bundle.getInt(KEY_LOCAL_NIGHT_MODE, -100);
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase, android.support.p004v7.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mLocalNightMode != -100) {
            bundle.putInt(KEY_LOCAL_NIGHT_MODE, this.mLocalNightMode);
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase, android.support.p004v7.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z) {
        this.mHandleNativeActionModes = z;
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase, android.support.p004v7.app.AppCompatDelegate
    public void setLocalNightMode(int i) {
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
                if (this.mLocalNightMode == i) {
                    return;
                }
                this.mLocalNightMode = i;
                if (!this.mApplyDayNightCalled) {
                    return;
                }
                applyDayNight();
                return;
            default:
                Log.d("AppCompatDelegate", "setLocalNightMode() called with an unknown mode");
                return;
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    Window.Callback wrapWindowCallback(Window.Callback callback) {
        return new AppCompatWindowCallbackV14(callback);
    }
}
