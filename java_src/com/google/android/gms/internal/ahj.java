package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.C4588d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes2.dex */
public class ahj extends ahm {

    /* renamed from: e */
    private final SparseArray<C6342a> f21731e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ahj$a */
    /* loaded from: classes2.dex */
    public class C6342a implements AbstractC4489g.AbstractC4492c {

        /* renamed from: a */
        public final int f21732a;

        /* renamed from: b */
        public final AbstractC4489g f21733b;

        /* renamed from: c */
        public final AbstractC4489g.AbstractC4492c f21734c;

        public C6342a(int i, AbstractC4489g abstractC4489g, AbstractC4489g.AbstractC4492c abstractC4492c) {
            this.f21732a = i;
            this.f21733b = abstractC4489g;
            this.f21734c = abstractC4492c;
            abstractC4489g.mo17380a((AbstractC4489g.AbstractC4492c) this);
        }

        /* renamed from: a */
        public void m17484a() {
            this.f21733b.mo17361c(this);
            this.f21733b.mo17356g();
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
        /* renamed from: a */
        public void mo17280a(@NonNull ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf).toString());
            ahj.this.b(connectionResult, this.f21732a);
        }

        /* renamed from: a */
        public void m17483a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append((CharSequence) str).append("GoogleApiClient #").print(this.f21732a);
            printWriter.println(":");
            this.f21733b.mo17365b(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    private ahj(aik aikVar) {
        super(aikVar);
        this.f21940d.mo12684a("AutoManageHelper", this);
    }

    /* renamed from: a */
    public static ahj m17485a(aih aihVar) {
        aik b = b(aihVar);
        ahj ahjVar = (ahj) b.mo12683a("AutoManageHelper", ahj.class);
        return ahjVar != null ? ahjVar : new ahj(b);
    }

    @Override // com.google.android.gms.internal.ahm, com.google.android.gms.internal.aij
    /* renamed from: a */
    public void mo14499a() {
        super.mo14499a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f21731e.size()) {
                this.f21731e.valueAt(i2).f21733b.mo17356g();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m17487a(int i) {
        C6342a c6342a = this.f21731e.get(i);
        this.f21731e.remove(i);
        if (c6342a != null) {
            c6342a.m17484a();
        }
    }

    /* renamed from: a */
    public void m17486a(int i, AbstractC4489g abstractC4489g, AbstractC4489g.AbstractC4492c abstractC4492c) {
        C4588d.m23626a(abstractC4489g, "GoogleApiClient instance cannot be null");
        C4588d.m23622a(this.f21731e.indexOfKey(i) < 0, new StringBuilder(54).append("Already managing a GoogleApiClient with id ").append(i).toString());
        Log.d("AutoManageHelper", new StringBuilder(54).append("starting AutoManage for client ").append(i).append(" ").append(this.f21740a).append(" ").append(this.f21741b).toString());
        this.f21731e.put(i, new C6342a(i, abstractC4489g, abstractC4492c));
        if (!this.f21740a || this.f21741b) {
            return;
        }
        String valueOf = String.valueOf(abstractC4489g);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf).toString());
        abstractC4489g.mo17358e();
    }

    @Override // com.google.android.gms.internal.ahm
    /* renamed from: a */
    protected void mo17206a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C6342a c6342a = this.f21731e.get(i);
        if (c6342a == null) {
            return;
        }
        m17487a(i);
        AbstractC4489g.AbstractC4492c abstractC4492c = c6342a.f21734c;
        if (abstractC4492c == null) {
            return;
        }
        abstractC4492c.mo17280a(connectionResult);
    }

    @Override // com.google.android.gms.internal.aij
    /* renamed from: a */
    public void mo17221a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f21731e.size()) {
                this.f21731e.valueAt(i2).m17483a(str, fileDescriptor, printWriter, strArr);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ahm, com.google.android.gms.internal.aij
    /* renamed from: b */
    public void mo17220b() {
        super.mo17220b();
        boolean z = this.f21740a;
        String valueOf = String.valueOf(this.f21731e);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf).toString());
        if (!this.f21741b) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f21731e.size()) {
                    return;
                }
                this.f21731e.valueAt(i2).f21733b.mo17358e();
                i = i2 + 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ahm
    /* renamed from: c */
    protected void mo17205c() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f21731e.size()) {
                this.f21731e.valueAt(i2).f21733b.mo17358e();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
