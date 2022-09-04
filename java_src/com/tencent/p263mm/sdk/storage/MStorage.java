package com.tencent.p263mm.sdk.storage;

import android.os.Looper;
import org.p356d.AbstractC11759f;
/* renamed from: com.tencent.mm.sdk.storage.MStorage */
/* loaded from: classes2.dex */
public abstract class MStorage {

    /* renamed from: bM */
    private final MStorageEvent<IOnStorageChange, String> f31704bM = new MStorageEvent<IOnStorageChange, String>() { // from class: com.tencent.mm.sdk.storage.MStorage.1
        @Override // com.tencent.p263mm.sdk.storage.MStorageEvent
        protected /* synthetic */ void processEvent(IOnStorageChange iOnStorageChange, String str) {
            MStorage mStorage = MStorage.this;
            iOnStorageChange.onNotifyChange(str);
        }
    };

    /* renamed from: bN */
    private final MStorageEvent<IOnStorageLoaded, String> f31705bN = new MStorageEvent<IOnStorageLoaded, String>() { // from class: com.tencent.mm.sdk.storage.MStorage.2
        @Override // com.tencent.p263mm.sdk.storage.MStorageEvent
        protected /* synthetic */ void processEvent(IOnStorageLoaded iOnStorageLoaded, String str) {
            MStorage mStorage = MStorage.this;
            iOnStorageLoaded.onNotifyLoaded();
        }
    };

    /* renamed from: com.tencent.mm.sdk.storage.MStorage$IOnStorageChange */
    /* loaded from: classes2.dex */
    public interface IOnStorageChange {
        void onNotifyChange(String str);
    }

    /* renamed from: com.tencent.mm.sdk.storage.MStorage$IOnStorageLoaded */
    /* loaded from: classes2.dex */
    public interface IOnStorageLoaded {
        void onNotifyLoaded();
    }

    public void add(IOnStorageChange iOnStorageChange) {
        this.f31704bM.add(iOnStorageChange, Looper.getMainLooper());
    }

    public void addLoadedListener(IOnStorageLoaded iOnStorageLoaded) {
        this.f31705bN.add(iOnStorageLoaded, Looper.getMainLooper());
    }

    public void doNotify() {
        this.f31704bM.event(AbstractC11759f.f37104a);
        this.f31704bM.doNotify();
    }

    public void doNotify(String str) {
        this.f31704bM.event(str);
        this.f31704bM.doNotify();
    }

    public void lock() {
        this.f31704bM.lock();
    }

    public void remove(IOnStorageChange iOnStorageChange) {
        this.f31704bM.remove(iOnStorageChange);
    }

    public void removeLoadedListener(IOnStorageLoaded iOnStorageLoaded) {
        this.f31705bN.remove(iOnStorageLoaded);
    }

    public void unlock() {
        this.f31704bM.unlock();
    }
}
