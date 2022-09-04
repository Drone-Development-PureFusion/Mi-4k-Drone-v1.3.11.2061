package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.p001v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
@TargetApi(11)
/* loaded from: classes2.dex */
public final class zzrc extends Fragment implements aik {

    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<zzrc>> f26601a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, aij> f26602b = new ArrayMap();

    /* renamed from: c */
    private int f26603c = 0;

    /* renamed from: d */
    private Bundle f26604d;

    /* renamed from: a */
    public static zzrc m12691a(Activity activity) {
        zzrc zzrcVar;
        WeakReference<zzrc> weakReference = f26601a.get(activity);
        if (weakReference == null || (zzrcVar = weakReference.get()) == null) {
            try {
                zzrcVar = (zzrc) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zzrcVar == null || zzrcVar.isRemoving()) {
                    zzrcVar = new zzrc();
                    activity.getFragmentManager().beginTransaction().add(zzrcVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                f26601a.put(activity, new WeakReference<>(zzrcVar));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return zzrcVar;
    }

    /* renamed from: b */
    private void m12688b(final String str, @NonNull final aij aijVar) {
        if (this.f26603c > 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.zzrc.1
                @Override // java.lang.Runnable
                public void run() {
                    if (zzrc.this.f26603c >= 1) {
                        aijVar.mo17222a(zzrc.this.f26604d != null ? zzrc.this.f26604d.getBundle(str) : null);
                    }
                    if (zzrc.this.f26603c >= 2) {
                        aijVar.mo17220b();
                    }
                    if (zzrc.this.f26603c >= 3) {
                        aijVar.mo14499a();
                    }
                    if (zzrc.this.f26603c >= 4) {
                        aijVar.mo17204f();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.aik
    /* renamed from: a */
    public Activity mo12687a() {
        return getActivity();
    }

    @Override // com.google.android.gms.internal.aik
    /* renamed from: a */
    public <T extends aij> T mo12683a(String str, Class<T> cls) {
        return cls.cast(this.f26602b.get(str));
    }

    @Override // com.google.android.gms.internal.aik
    /* renamed from: a */
    public void mo12684a(String str, @NonNull aij aijVar) {
        if (!this.f26602b.containsKey(str)) {
            this.f26602b.put(str, aijVar);
            m12688b(str, aijVar);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // android.app.Fragment
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (aij aijVar : this.f26602b.values()) {
            aijVar.mo17221a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (aij aijVar : this.f26602b.values()) {
            aijVar.mo17223a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26603c = 1;
        this.f26604d = bundle;
        for (Map.Entry<String, aij> entry : this.f26602b.entrySet()) {
            entry.getValue().mo17222a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onStop();
        this.f26603c = 4;
        for (aij aijVar : this.f26602b.values()) {
            aijVar.mo17204f();
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, aij> entry : this.f26602b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo17218b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStop();
        this.f26603c = 2;
        for (aij aijVar : this.f26602b.values()) {
            aijVar.mo17220b();
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f26603c = 3;
        for (aij aijVar : this.f26602b.values()) {
            aijVar.mo14499a();
        }
    }
}
