package android.support.p004v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.media.RegisteredMediaRouteProviderWatcher */
/* loaded from: classes.dex */
public final class RegisteredMediaRouteProviderWatcher {
    private final Callback mCallback;
    private final Context mContext;
    private final PackageManager mPackageManager;
    private boolean mRunning;
    private final ArrayList<RegisteredMediaRouteProvider> mProviders = new ArrayList<>();
    private final BroadcastReceiver mScanPackagesReceiver = new BroadcastReceiver() { // from class: android.support.v7.media.RegisteredMediaRouteProviderWatcher.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RegisteredMediaRouteProviderWatcher.this.scanPackages();
        }
    };
    private final Runnable mScanPackagesRunnable = new Runnable() { // from class: android.support.v7.media.RegisteredMediaRouteProviderWatcher.2
        @Override // java.lang.Runnable
        public void run() {
            RegisteredMediaRouteProviderWatcher.this.scanPackages();
        }
    };
    private final Handler mHandler = new Handler();

    /* renamed from: android.support.v7.media.RegisteredMediaRouteProviderWatcher$Callback */
    /* loaded from: classes.dex */
    public interface Callback {
        void addProvider(MediaRouteProvider mediaRouteProvider);

        void removeProvider(MediaRouteProvider mediaRouteProvider);
    }

    public RegisteredMediaRouteProviderWatcher(Context context, Callback callback) {
        this.mContext = context;
        this.mCallback = callback;
        this.mPackageManager = context.getPackageManager();
    }

    private int findProvider(String str, String str2) {
        int size = this.mProviders.size();
        for (int i = 0; i < size; i++) {
            if (this.mProviders.get(i).hasComponentName(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scanPackages() {
        int i;
        int i2 = 0;
        if (!this.mRunning) {
            return;
        }
        Iterator<ResolveInfo> it2 = this.mPackageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
        while (true) {
            i = i2;
            if (!it2.hasNext()) {
                break;
            }
            ServiceInfo serviceInfo = it2.next().serviceInfo;
            if (serviceInfo != null) {
                int findProvider = findProvider(serviceInfo.packageName, serviceInfo.name);
                if (findProvider < 0) {
                    RegisteredMediaRouteProvider registeredMediaRouteProvider = new RegisteredMediaRouteProvider(this.mContext, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    registeredMediaRouteProvider.start();
                    i2 = i + 1;
                    this.mProviders.add(i, registeredMediaRouteProvider);
                    this.mCallback.addProvider(registeredMediaRouteProvider);
                } else if (findProvider >= i) {
                    RegisteredMediaRouteProvider registeredMediaRouteProvider2 = this.mProviders.get(findProvider);
                    registeredMediaRouteProvider2.start();
                    registeredMediaRouteProvider2.rebindIfDisconnected();
                    i2 = i + 1;
                    Collections.swap(this.mProviders, findProvider, i);
                }
            }
            i2 = i;
        }
        if (i >= this.mProviders.size()) {
            return;
        }
        for (int size = this.mProviders.size() - 1; size >= i; size--) {
            RegisteredMediaRouteProvider registeredMediaRouteProvider3 = this.mProviders.get(size);
            this.mCallback.removeProvider(registeredMediaRouteProvider3);
            this.mProviders.remove(registeredMediaRouteProvider3);
            registeredMediaRouteProvider3.stop();
        }
    }

    public void start() {
        if (!this.mRunning) {
            this.mRunning = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter.addDataScheme("package");
            this.mContext.registerReceiver(this.mScanPackagesReceiver, intentFilter, null, this.mHandler);
            this.mHandler.post(this.mScanPackagesRunnable);
        }
    }

    public void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            this.mContext.unregisterReceiver(this.mScanPackagesReceiver);
            this.mHandler.removeCallbacks(this.mScanPackagesRunnable);
            for (int size = this.mProviders.size() - 1; size >= 0; size--) {
                this.mProviders.get(size).stop();
            }
        }
    }
}
