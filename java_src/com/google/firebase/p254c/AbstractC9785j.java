package com.google.firebase.p254c;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.p239g.AbstractC5282c;
import com.google.android.gms.p239g.AbstractC5283d;
import com.google.android.gms.p239g.C5284e;
import com.google.firebase.p254c.AbstractC9785j.AbstractC9791a;
import com.google.firebase.p254c.C9805q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
/* renamed from: com.google.firebase.c.j */
/* loaded from: classes2.dex */
public abstract class AbstractC9785j<TResult extends AbstractC9791a> extends AbstractC9768b<TResult> {

    /* renamed from: b */
    private static final HashMap<Integer, HashSet<Integer>> f30538b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<Integer, HashSet<Integer>> f30539c = new HashMap<>();

    /* renamed from: a */
    protected final Object f30540a = new Object();

    /* renamed from: d */
    private final C9805q<AbstractC5283d<? super TResult>, TResult> f30541d = new C9805q<>(this, 128, new C9805q.AbstractC9808a<AbstractC5283d<? super TResult>, TResult>() { // from class: com.google.firebase.c.j.1
        /* renamed from: a */
        public void m6980a(@NonNull AbstractC5283d<? super TResult> abstractC5283d, @NonNull TResult tresult) {
            C9802o.m6934a().m6930b(AbstractC9785j.this);
            abstractC5283d.mo7033a(tresult);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.firebase.p254c.C9805q.AbstractC9808a
        /* renamed from: a */
        public /* synthetic */ void mo6920a(@NonNull Object obj, @NonNull Object obj2) {
            m6980a((AbstractC5283d<? super AbstractC5283d>) obj, (AbstractC5283d) ((AbstractC9791a) obj2));
        }
    });

    /* renamed from: e */
    private final C9805q<AbstractC5282c, TResult> f30542e = new C9805q<>(this, 320, new C9805q.AbstractC9808a<AbstractC5282c, TResult>() { // from class: com.google.firebase.c.j.2
        /* renamed from: a */
        public void m6979a(@NonNull AbstractC5282c abstractC5282c, @NonNull TResult tresult) {
            C9802o.m6934a().m6930b(AbstractC9785j.this);
            abstractC5282c.mo7035a(tresult.mo6940c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.firebase.p254c.C9805q.AbstractC9808a
        /* renamed from: a */
        public /* synthetic */ void mo6920a(@NonNull AbstractC5282c abstractC5282c, @NonNull Object obj) {
            m6979a(abstractC5282c, (AbstractC5282c) ((AbstractC9791a) obj));
        }
    });

    /* renamed from: f */
    private final C9805q<AbstractC9773f<? super TResult>, TResult> f30543f = new C9805q<>(this, -465, new C9805q.AbstractC9808a<AbstractC9773f<? super TResult>, TResult>() { // from class: com.google.firebase.c.j.3
        /* renamed from: a */
        public void m6978a(@NonNull AbstractC9773f<? super TResult> abstractC9773f, @NonNull TResult tresult) {
            abstractC9773f.m7121a(tresult);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.firebase.p254c.C9805q.AbstractC9808a
        /* renamed from: a */
        public /* synthetic */ void mo6920a(@NonNull Object obj, @NonNull Object obj2) {
            m6978a((AbstractC9773f<? super AbstractC9773f>) obj, (AbstractC9773f) ((AbstractC9791a) obj2));
        }
    });

    /* renamed from: g */
    private final C9805q<AbstractC9772e<? super TResult>, TResult> f30544g = new C9805q<>(this, 16, new C9805q.AbstractC9808a<AbstractC9772e<? super TResult>, TResult>() { // from class: com.google.firebase.c.j.4
        /* renamed from: a */
        public void m6977a(@NonNull AbstractC9772e<? super TResult> abstractC9772e, @NonNull TResult tresult) {
            abstractC9772e.m7122a(tresult);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.firebase.p254c.C9805q.AbstractC9808a
        /* renamed from: a */
        public /* synthetic */ void mo6920a(@NonNull Object obj, @NonNull Object obj2) {
            m6977a((AbstractC9772e<? super AbstractC9772e>) obj, (AbstractC9772e) ((AbstractC9791a) obj2));
        }
    });

    /* renamed from: h */
    private int f30545h = 1;

    /* renamed from: i */
    private TResult f30546i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.firebase.c.j$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9791a {
        /* renamed from: c */
        Exception mo6940c();
    }

    /* renamed from: com.google.firebase.c.j$b */
    /* loaded from: classes2.dex */
    class C9792b implements AbstractC9791a {

        /* renamed from: a */
        private final Exception f30552a;

        public C9792b(Exception exc) {
            this.f30552a = exc;
        }

        @Override // com.google.firebase.p254c.AbstractC9785j.AbstractC9791a
        @Nullable
        /* renamed from: c */
        public Exception mo6940c() {
            return this.f30552a;
        }

        @NonNull
        /* renamed from: d */
        public C9779i mo6939d() {
            return mo6938e().mo6949l();
        }

        @NonNull
        /* renamed from: e */
        public AbstractC9785j<TResult> mo6938e() {
            return AbstractC9785j.this;
        }
    }

    static {
        f30538b.put(1, new HashSet<>(Arrays.asList(16, 256)));
        f30538b.put(2, new HashSet<>(Arrays.asList(8, 32)));
        f30538b.put(4, new HashSet<>(Arrays.asList(8, 32)));
        f30538b.put(16, new HashSet<>(Arrays.asList(2, 256)));
        f30538b.put(64, new HashSet<>(Arrays.asList(2, 256)));
        f30539c.put(1, new HashSet<>(Collections.singletonList(2)));
        f30539c.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        f30539c.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        f30539c.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        f30539c.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    /* renamed from: a */
    private String m7027a(int i) {
        switch (i) {
            case 1:
                return "INTERNAL_STATE_NOT_STARTED";
            case 2:
                return "INTERNAL_STATE_QUEUED";
            case 4:
                return "INTERNAL_STATE_IN_PROGRESS";
            case 8:
                return "INTERNAL_STATE_PAUSING";
            case 16:
                return "INTERNAL_STATE_PAUSED";
            case 32:
                return "INTERNAL_STATE_CANCELING";
            case 64:
                return "INTERNAL_STATE_FAILURE";
            case 128:
                return "INTERNAL_STATE_SUCCESS";
            case 256:
                return "INTERNAL_STATE_CANCELED";
            default:
                return "Unknown Internal State!";
        }
    }

    /* renamed from: k */
    private TResult m6988k() {
        if (this.f30546i != null) {
            return this.f30546i;
        }
        if (!mo7028a()) {
            return null;
        }
        if (this.f30546i == null) {
            this.f30546i = m6982x();
        }
        return this.f30546i;
    }

    /* renamed from: A */
    protected void m7032A() {
    }

    /* renamed from: B */
    protected void m7031B() {
    }

    /* renamed from: C */
    protected void m7030C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public Runnable m7029D() {
        return new Runnable() { // from class: com.google.firebase.c.j.5
            @Override // java.lang.Runnable
            public void run() {
                AbstractC9785j.this.mo6946o();
            }
        };
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: a */
    public boolean mo7028a() {
        return ((m6984v() & 128) == 0 && (m6984v() & 320) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m7026a(int i, boolean z) {
        boolean z2;
        if (Log.isLoggable("StorageTask", 3)) {
            String valueOf = String.valueOf(m7027a(i));
            String valueOf2 = String.valueOf(m7027a(this.f30545h));
            Log.d("StorageTask", new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length()).append("changing internal state to: ").append(valueOf).append(" isUser: ").append(z).append(" from state:").append(valueOf2).toString());
        }
        synchronized (this.f30540a) {
            HashSet<Integer> hashSet = (z ? f30538b : f30539c).get(Integer.valueOf(m6984v()));
            if (hashSet == null || !hashSet.contains(Integer.valueOf(i))) {
                String valueOf3 = String.valueOf(m7027a(i));
                String valueOf4 = String.valueOf(m7027a(this.f30545h));
                Log.w("StorageTask", new StringBuilder(String.valueOf(valueOf3).length() + 62 + String.valueOf(valueOf4).length()).append("unable to change internal state to: ").append(valueOf3).append(" isUser: ").append(z).append(" from state:").append(valueOf4).toString());
                z2 = false;
            } else {
                this.f30545h = i;
                switch (this.f30545h) {
                    case 2:
                        C9802o.m6934a().m6932a(this);
                        m6981y();
                        break;
                    case 4:
                        mo6966z();
                        break;
                    case 16:
                        m7032A();
                        break;
                    case 64:
                        m7031B();
                        break;
                    case 128:
                        m7030C();
                        break;
                    case 256:
                        mo6945p();
                        break;
                }
                this.f30541d.m6924a();
                this.f30542e.m6924a();
                this.f30544g.m6924a();
                this.f30543f.m6924a();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: b */
    public <X extends Throwable> TResult mo7017a(@NonNull Class<X> cls) {
        if (m6988k() == null) {
            throw new IllegalStateException();
        }
        if (cls.isInstance(m6988k().mo6940c())) {
            throw cls.cast(m6988k().mo6940c());
        }
        Exception mo6940c = m6988k().mo6940c();
        if (mo6940c == null) {
            return m6988k();
        }
        throw new C5284e(mo6940c);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7025a(@NonNull Activity activity, @NonNull AbstractC5282c abstractC5282c) {
        C4588d.m23627a(abstractC5282c);
        C4588d.m23627a(activity);
        this.f30542e.m6923a(activity, null, abstractC5282c);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7024a(@NonNull Activity activity, @NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        C4588d.m23627a(activity);
        C4588d.m23627a(abstractC5283d);
        this.f30541d.m6923a(activity, null, abstractC5283d);
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9768b
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7023a(@NonNull Activity activity, @NonNull AbstractC9772e<? super TResult> abstractC9772e) {
        C4588d.m23627a(abstractC9772e);
        C4588d.m23627a(activity);
        this.f30544g.m6923a(activity, null, abstractC9772e);
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9767a
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7022a(@NonNull Activity activity, @NonNull AbstractC9773f<? super TResult> abstractC9773f) {
        C4588d.m23627a(abstractC9773f);
        C4588d.m23627a(activity);
        this.f30543f.m6923a(activity, null, abstractC9773f);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7021a(@NonNull AbstractC5282c abstractC5282c) {
        C4588d.m23627a(abstractC5282c);
        this.f30542e.m6923a(null, null, abstractC5282c);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7020a(@NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        C4588d.m23627a(abstractC5283d);
        this.f30541d.m6923a(null, null, abstractC5283d);
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9768b
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7019a(@NonNull AbstractC9772e<? super TResult> abstractC9772e) {
        C4588d.m23627a(abstractC9772e);
        this.f30544g.m6923a(null, null, abstractC9772e);
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9767a
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7018a(@NonNull AbstractC9773f<? super TResult> abstractC9773f) {
        C4588d.m23627a(abstractC9773f);
        this.f30543f.m6923a(null, null, abstractC9773f);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7016a(@NonNull Executor executor, @NonNull AbstractC5282c abstractC5282c) {
        C4588d.m23627a(abstractC5282c);
        C4588d.m23627a(executor);
        this.f30542e.m6923a(null, executor, abstractC5282c);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7015a(@NonNull Executor executor, @NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        C4588d.m23627a(executor);
        C4588d.m23627a(abstractC5283d);
        this.f30541d.m6923a(null, executor, abstractC5283d);
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9768b
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7014a(@NonNull Executor executor, @NonNull AbstractC9772e<? super TResult> abstractC9772e) {
        C4588d.m23627a(abstractC9772e);
        C4588d.m23627a(executor);
        this.f30544g.m6923a(null, executor, abstractC9772e);
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9767a
    /* renamed from: b */
    public AbstractC9785j<TResult> mo7013a(@NonNull Executor executor, @NonNull AbstractC9773f<? super TResult> abstractC9773f) {
        C4588d.m23627a(abstractC9773f);
        C4588d.m23627a(executor);
        this.f30543f.m6923a(null, executor, abstractC9773f);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: b */
    public boolean mo7012b() {
        return (m6984v() & 128) != 0;
    }

    /* renamed from: c */
    public AbstractC9785j<TResult> m6997c(@NonNull AbstractC5282c abstractC5282c) {
        C4588d.m23627a(abstractC5282c);
        this.f30542e.m6921a((C9805q<AbstractC5282c, TResult>) abstractC5282c);
        return this;
    }

    /* renamed from: c */
    public AbstractC9785j<TResult> m6996c(@NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        C4588d.m23627a(abstractC5283d);
        this.f30541d.m6921a((C9805q<AbstractC5283d<? super TResult>, TResult>) abstractC5283d);
        return this;
    }

    /* renamed from: c */
    public AbstractC9785j<TResult> m6995c(@NonNull AbstractC9772e<? super TResult> abstractC9772e) {
        C4588d.m23627a(abstractC9772e);
        this.f30544g.m6921a((C9805q<AbstractC9772e<? super TResult>, TResult>) abstractC9772e);
        return this;
    }

    /* renamed from: c */
    public AbstractC9785j<TResult> m6994c(@NonNull AbstractC9773f<? super TResult> abstractC9773f) {
        C4588d.m23627a(abstractC9773f);
        this.f30543f.m6921a((C9805q<AbstractC9773f<? super TResult>, TResult>) abstractC9773f);
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @Nullable
    /* renamed from: d */
    public Exception mo6993d() {
        if (m6988k() == null) {
            return null;
        }
        return m6988k().mo6940c();
    }

    @Override // com.google.firebase.p254c.AbstractC9767a
    /* renamed from: e */
    public boolean mo6992e() {
        return m7026a(256, true) || m7026a(32, true);
    }

    @Override // com.google.firebase.p254c.AbstractC9767a
    /* renamed from: f */
    public boolean mo6991f() {
        return m6984v() == 256;
    }

    @Override // com.google.firebase.p254c.AbstractC9767a
    /* renamed from: g */
    public boolean mo6990g() {
        return (m6984v() & (-465)) != 0;
    }

    @Override // com.google.firebase.p254c.AbstractC9768b
    /* renamed from: h */
    public boolean mo6970h() {
        return m7026a(16, true) || m7026a(8, true);
    }

    @Override // com.google.firebase.p254c.AbstractC9768b
    /* renamed from: i */
    public boolean mo6969i() {
        if (m7026a(2, true)) {
            mo6943s();
            mo6948m();
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.p254c.AbstractC9768b
    /* renamed from: j */
    public boolean mo6989j() {
        return (m6984v() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract C9779i mo6949l();

    /* renamed from: m */
    abstract void mo6948m();

    /* renamed from: o */
    abstract void mo6946o();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo6945p() {
    }

    @NonNull
    /* renamed from: q */
    abstract TResult mo6944q();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m6987r() {
        if (m7026a(2, false)) {
            mo6948m();
            return true;
        }
        return false;
    }

    /* renamed from: s */
    void mo6943s() {
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: t */
    public TResult mo6998c() {
        if (m6988k() == null) {
            throw new IllegalStateException();
        }
        Exception mo6940c = m6988k().mo6940c();
        if (mo6940c == null) {
            return m6988k();
        }
        throw new C5284e(mo6940c);
    }

    /* renamed from: u */
    public TResult m6985u() {
        return m6982x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public int m6984v() {
        return this.f30545h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public Object m6983w() {
        return this.f30540a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: x */
    public TResult m6982x() {
        TResult mo6944q;
        synchronized (this.f30540a) {
            mo6944q = mo6944q();
        }
        return mo6944q;
    }

    /* renamed from: y */
    protected void m6981y() {
    }

    /* renamed from: z */
    protected void mo6966z() {
    }
}
