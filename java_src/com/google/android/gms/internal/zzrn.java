package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public final class zzrn extends Fragment implements aik {

    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<zzrn>> f26608a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, aij> f26609b = new ArrayMap();

    /* renamed from: c */
    private int f26610c = 0;

    /* renamed from: d */
    private Bundle f26611d;

    /* renamed from: a */
    public static zzrn m12686a(FragmentActivity fragmentActivity) {
        zzrn zzrnVar;
        WeakReference<zzrn> weakReference = f26608a.get(fragmentActivity);
        if (weakReference == null || (zzrnVar = weakReference.get()) == null) {
            try {
                zzrnVar = (zzrn) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                if (zzrnVar == null || zzrnVar.isRemoving()) {
                    zzrnVar = new zzrn();
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(zzrnVar, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                }
                f26608a.put(fragmentActivity, new WeakReference<>(zzrnVar));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return zzrnVar;
    }

    /* renamed from: b */
    private void m12680b(final String str, @NonNull final aij aijVar) {
        if (this.f26610c > 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.zzrn.1
                @Override // java.lang.Runnable
                public void run() {
                    if (zzrn.this.f26610c >= 1) {
                        aijVar.mo17222a(zzrn.this.f26611d != null ? zzrn.this.f26611d.getBundle(str) : null);
                    }
                    if (zzrn.this.f26610c >= 2) {
                        aijVar.mo17220b();
                    }
                    if (zzrn.this.f26610c >= 3) {
                        aijVar.mo14499a();
                    }
                    if (zzrn.this.f26610c >= 4) {
                        aijVar.mo17204f();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.aik
    /* renamed from: a */
    public <T extends aij> T mo12683a(String str, Class<T> cls) {
        return cls.cast(this.f26609b.get(str));
    }

    @Override // com.google.android.gms.internal.aik
    /* renamed from: a */
    public void mo12684a(String str, @NonNull aij aijVar) {
        if (!this.f26609b.containsKey(str)) {
            this.f26609b.put(str, aijVar);
            m12680b(str, aijVar);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // com.google.android.gms.internal.aik
    /* renamed from: b */
    public FragmentActivity mo12687a() {
        return getActivity();
    }

    @Override // android.support.p001v4.app.Fragment
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (aij aijVar : this.f26609b.values()) {
            aijVar.mo17221a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (aij aijVar : this.f26609b.values()) {
            aijVar.mo17223a(i, i2, intent);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26610c = 1;
        this.f26611d = bundle;
        for (Map.Entry<String, aij> entry : this.f26609b.entrySet()) {
            entry.getValue().mo17222a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onStop();
        this.f26610c = 4;
        for (aij aijVar : this.f26609b.values()) {
            aijVar.mo17204f();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, aij> entry : this.f26609b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo17218b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStop();
        this.f26610c = 2;
        for (aij aijVar : this.f26609b.values()) {
            aijVar.mo17220b();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f26610c = 3;
        for (aij aijVar : this.f26609b.values()) {
            aijVar.mo14499a();
        }
    }
}
