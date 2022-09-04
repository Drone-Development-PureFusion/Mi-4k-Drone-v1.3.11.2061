package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.AbstractC4562ad;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.plus.AbstractC8940b;
import com.google.android.gms.plus.C8943c;
import com.google.android.gms.plus.internal.AbstractC8965d;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.p249a.p250a.AbstractC8923a;
import com.google.android.gms.plus.p249a.p250a.C8939b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.e */
/* loaded from: classes2.dex */
public class C8968e extends AbstractC4638w<AbstractC8965d> {

    /* renamed from: a */
    private AbstractC8923a f28513a;

    /* renamed from: e */
    private final PlusSession f28514e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.plus.internal.e$a */
    /* loaded from: classes2.dex */
    public static final class C8969a implements AbstractC8940b.AbstractC8941a {

        /* renamed from: a */
        private final Status f28515a;

        /* renamed from: b */
        private final String f28516b;

        /* renamed from: c */
        private final C8939b f28517c;

        public C8969a(Status status, DataHolder dataHolder, String str) {
            this.f28515a = status;
            this.f28516b = str;
            this.f28517c = dataHolder != null ? new C8939b(dataHolder) : null;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f28515a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            if (this.f28517c != null) {
                this.f28517c.b();
            }
        }

        @Override // com.google.android.gms.plus.AbstractC8940b.AbstractC8941a
        /* renamed from: c */
        public C8939b mo9622c() {
            return this.f28517c;
        }

        @Override // com.google.android.gms.plus.AbstractC8940b.AbstractC8941a
        /* renamed from: d */
        public String mo9621d() {
            return this.f28516b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.plus.internal.e$b */
    /* loaded from: classes2.dex */
    public static final class BinderC8970b extends AbstractBinderC8958a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> f28518a;

        public BinderC8970b(ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> abstractC6344b) {
            this.f28518a = abstractC6344b;
        }

        @Override // com.google.android.gms.plus.internal.AbstractBinderC8958a, com.google.android.gms.plus.internal.AbstractC8959b
        /* renamed from: a */
        public void mo9620a(DataHolder dataHolder, String str) {
            Status status = new Status(dataHolder.m23883e(), null, dataHolder.m23881f() != null ? (PendingIntent) dataHolder.m23881f().getParcelable("pendingIntent") : null);
            if (!status.m24018f() && dataHolder != null) {
                if (!dataHolder.m23877h()) {
                    dataHolder.close();
                }
                dataHolder = null;
            }
            this.f28518a.mo7413a(new C8969a(status, dataHolder, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.plus.internal.e$c */
    /* loaded from: classes2.dex */
    public static final class BinderC8971c extends AbstractBinderC8958a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f28519a;

        public BinderC8971c(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f28519a = abstractC6344b;
        }

        @Override // com.google.android.gms.plus.internal.AbstractBinderC8958a, com.google.android.gms.plus.internal.AbstractC8959b
        /* renamed from: a */
        public void mo9619a(int i, Bundle bundle) {
            this.f28519a.mo7413a(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        }
    }

    public C8968e(Context context, Looper looper, C4626s c4626s, PlusSession plusSession, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 2, c4626s, abstractC4491b, abstractC4492c);
        this.f28514e = plusSession;
    }

    /* renamed from: b */
    public static boolean m9626b(Set<Scope> set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        return set.size() != 1 || !set.contains(new Scope("plus_one_placeholder_scope"));
    }

    /* renamed from: a */
    public AbstractC4562ad m9631a(ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> abstractC6344b, int i, String str) {
        F();
        BinderC8970b binderC8970b = new BinderC8970b(abstractC6344b);
        try {
            return ((AbstractC8965d) G()).mo9651a(binderC8970b, 1, i, -1, str);
        } catch (RemoteException e) {
            binderC8970b.mo9620a(DataHolder.m23889b(8), (String) null);
            return null;
        }
    }

    /* renamed from: a */
    public AbstractC4562ad m9630a(ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> abstractC6344b, String str) {
        return m9631a(abstractC6344b, 0, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8965d mo7440b(IBinder iBinder) {
        return AbstractC8965d.AbstractBinderC8966a.m9655a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.plus.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo7981a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f28513a = PersonEntity.m9609a(bundle.getByteArray("loaded_person"));
        }
        super.a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public void m9632a(ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> abstractC6344b) {
        F();
        BinderC8970b binderC8970b = new BinderC8970b(abstractC6344b);
        try {
            ((AbstractC8965d) G()).mo9651a(binderC8970b, 2, 1, -1, null);
        } catch (RemoteException e) {
            binderC8970b.mo9620a(DataHolder.m23889b(8), (String) null);
        }
    }

    /* renamed from: a */
    public void m9629a(ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> abstractC6344b, Collection<String> collection) {
        F();
        BinderC8970b binderC8970b = new BinderC8970b(abstractC6344b);
        try {
            ((AbstractC8965d) G()).mo9645a(binderC8970b, new ArrayList(collection));
        } catch (RemoteException e) {
            binderC8970b.mo9620a(DataHolder.m23889b(8), (String) null);
        }
    }

    /* renamed from: a */
    public void m9628a(ahl.AbstractC6344b<AbstractC8940b.AbstractC8941a> abstractC6344b, String[] strArr) {
        m9629a(abstractC6344b, Arrays.asList(strArr));
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    /* renamed from: b */
    public void m9627b(ahl.AbstractC6344b<Status> abstractC6344b) {
        F();
        m9623j();
        BinderC8971c binderC8971c = new BinderC8971c(abstractC6344b);
        try {
            ((AbstractC8965d) G()).mo9641b(binderC8971c);
        } catch (RemoteException e) {
            binderC8971c.mo9619a(8, (Bundle) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle m9668k = this.f28514e.m9668k();
        m9668k.putStringArray("request_visible_actions", this.f28514e.m9675d());
        m9668k.putString("auth_package", this.f28514e.m9673f());
        return m9668k;
    }

    /* renamed from: h */
    public String m9625h() {
        F();
        try {
            return ((AbstractC8965d) G()).mo9654a();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    public AbstractC8923a m9624i() {
        F();
        return this.f28513a;
    }

    /* renamed from: j */
    public void m9623j() {
        F();
        try {
            this.f28513a = null;
            ((AbstractC8965d) G()).mo9642b();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: v */
    public boolean mo9364v() {
        return m9626b(J().m23535a(C8943c.f28465c));
    }
}
