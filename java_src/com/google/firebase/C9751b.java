package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.p001v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.internal.C4583ak;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4678a;
import com.google.android.gms.common.util.C4680c;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.common.util.C4697t;
import com.google.android.gms.internal.AbstractC7414mq;
import com.google.android.gms.internal.C7413mp;
import com.google.android.gms.internal.C7415mr;
import com.google.android.gms.internal.ComponentCallbacks2C7397mn;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5290i;
import com.google.firebase.auth.C9741o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.firebase.b */
/* loaded from: classes.dex */
public class C9751b {

    /* renamed from: a */
    public static final String f30428a = "[DEFAULT]";

    /* renamed from: i */
    private final Context f30436i;

    /* renamed from: j */
    private final String f30437j;

    /* renamed from: k */
    private final C9903e f30438k;

    /* renamed from: l */
    private final AtomicBoolean f30439l = new AtomicBoolean(false);

    /* renamed from: m */
    private final AtomicBoolean f30440m = new AtomicBoolean();

    /* renamed from: n */
    private final List<AbstractC9752a> f30441n = new CopyOnWriteArrayList();

    /* renamed from: o */
    private final List<AbstractC9753b> f30442o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private final List<Object> f30443p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private AbstractC7414mq f30444q;

    /* renamed from: c */
    private static final List<String> f30430c = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");

    /* renamed from: d */
    private static final List<String> f30431d = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: e */
    private static final List<String> f30432e = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");

    /* renamed from: f */
    private static final List<String> f30433f = Arrays.asList(new String[0]);

    /* renamed from: g */
    private static final Set<String> f30434g = Collections.emptySet();

    /* renamed from: h */
    private static final Object f30435h = new Object();

    /* renamed from: b */
    static final Map<String, C9751b> f30429b = new ArrayMap();

    /* renamed from: com.google.firebase.b$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9752a {
        /* renamed from: a */
        void mo7192a(@NonNull C7415mr c7415mr);
    }

    /* renamed from: com.google.firebase.b$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9753b {
        /* renamed from: a */
        void mo7159a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* renamed from: com.google.firebase.b$c */
    /* loaded from: classes2.dex */
    public static class C9754c extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C9754c> f30445a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f30446b;

        public C9754c(Context context) {
            this.f30446b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m7156b(Context context) {
            if (f30445a.get() == null) {
                C9754c c9754c = new C9754c(context);
                if (!f30445a.compareAndSet(null, c9754c)) {
                    return;
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.USER_UNLOCKED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(c9754c, intentFilter);
            }
        }

        /* renamed from: a */
        public void m7158a() {
            this.f30446b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C9751b.f30435h) {
                for (C9751b c9751b : C9751b.f30429b.values()) {
                    c9751b.m7199j();
                }
            }
            m7158a();
        }
    }

    protected C9751b(Context context, String str, C9903e c9903e) {
        this.f30436i = (Context) C4588d.m23627a(context);
        this.f30437j = C4588d.m23625a(str);
        this.f30438k = (C9903e) C4588d.m23627a(c9903e);
    }

    /* renamed from: a */
    public static C9751b m7222a(Context context, C9903e c9903e) {
        return m7221a(context, c9903e, f30428a);
    }

    /* renamed from: a */
    public static C9751b m7221a(Context context, C9903e c9903e, String str) {
        C9751b c9751b;
        C7413mp m14551a = C7413mp.m14551a(context);
        m7207c(context);
        String m7210b = m7210b(str);
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        synchronized (f30435h) {
            C4588d.m23622a(!f30429b.containsKey(m7210b), new StringBuilder(String.valueOf(m7210b).length() + 33).append("FirebaseApp name ").append(m7210b).append(" already exists!").toString());
            C4588d.m23626a(context, "Application context cannot be null.");
            c9751b = new C9751b(context, m7210b, c9903e);
            f30429b.put(m7210b, c9751b);
        }
        m14551a.m14550a(c9751b);
        c9751b.m7215a((Class<Class>) C9751b.class, (Class) c9751b, (Iterable<String>) f30430c);
        if (c9751b.m7204e()) {
            c9751b.m7215a((Class<Class>) C9751b.class, (Class) c9751b, (Iterable<String>) f30431d);
            c9751b.m7215a((Class<Class>) Context.class, (Class) c9751b.m7224a(), (Iterable<String>) f30432e);
        }
        return c9751b;
    }

    /* renamed from: a */
    public static C9751b m7214a(@NonNull String str) {
        C9751b c9751b;
        String concat;
        synchronized (f30435h) {
            c9751b = f30429b.get(m7210b(str));
            if (c9751b == null) {
                List<String> m7200i = m7200i();
                if (m7200i.isEmpty()) {
                    concat = "";
                } else {
                    String valueOf = String.valueOf(C4583ak.m23640a(", ").m23642a((Iterable<?>) m7200i));
                    concat = valueOf.length() != 0 ? "Available app names: ".concat(valueOf) : new String("Available app names: ");
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, concat));
            }
        }
        return c9751b;
    }

    /* renamed from: a */
    public static List<C9751b> m7223a(Context context) {
        ArrayList arrayList;
        C7413mp m14551a = C7413mp.m14551a(context);
        synchronized (f30435h) {
            arrayList = new ArrayList(f30429b.values());
            Set<String> m14548b = C7413mp.m14552a().m14548b();
            m14548b.removeAll(f30429b.keySet());
            for (String str : m14548b) {
                arrayList.add(m7221a(context, m14551a.m14549a(str), str));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> void m7215a(Class<T> cls, T t, Iterable<String> iterable) {
        boolean z;
        if (C4696s.m23101m()) {
            boolean isDeviceProtectedStorage = this.f30436i.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                C9754c.m7156b(this.f30436i);
            }
            z = isDeviceProtectedStorage;
        } else {
            z = false;
        }
        for (String str : iterable) {
            if (z) {
                try {
                } catch (ClassNotFoundException e) {
                    if (f30434g.contains(str)) {
                        throw new IllegalStateException(String.valueOf(str).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d("FirebaseApp", String.valueOf(str).concat(" is not linked. Skipping initialization."));
                } catch (IllegalAccessException e2) {
                    String valueOf = String.valueOf(str);
                    Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new String("Failed to initialize "), e2);
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(String.valueOf(str).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e4) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e4);
                }
                if (f30433f.contains(str)) {
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    /* renamed from: a */
    public static void m7213a(boolean z) {
        synchronized (f30435h) {
            Iterator it2 = new ArrayList(f30429b.values()).iterator();
            while (it2.hasNext()) {
                C9751b c9751b = (C9751b) it2.next();
                if (c9751b.f30439l.get()) {
                    c9751b.m7206c(z);
                }
            }
        }
    }

    /* renamed from: b */
    public static C9751b m7211b(Context context) {
        C9751b m7222a;
        synchronized (f30435h) {
            if (f30429b.containsKey(f30428a)) {
                m7222a = m7205d();
            } else {
                C9903e m6639a = C9903e.m6639a(context);
                m7222a = m6639a == null ? null : m7222a(context, m6639a);
            }
        }
        return m7222a;
    }

    /* renamed from: b */
    private static String m7210b(@NonNull String str) {
        return str.trim();
    }

    @TargetApi(14)
    /* renamed from: c */
    private static void m7207c(Context context) {
        if (!C4696s.m23110d() || !(context.getApplicationContext() instanceof Application)) {
            return;
        }
        ComponentCallbacks2C7397mn.m14556a((Application) context.getApplicationContext());
    }

    /* renamed from: c */
    private void m7206c(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (AbstractC9753b abstractC9753b : this.f30442o) {
            abstractC9753b.mo7159a(z);
        }
    }

    @Nullable
    /* renamed from: d */
    public static C9751b m7205d() {
        C9751b c9751b;
        synchronized (f30435h) {
            c9751b = f30429b.get(f30428a);
            if (c9751b == null) {
                String valueOf = String.valueOf(C4697t.m23098b());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + Opcodes.INEG).append("Default FirebaseApp is not initialized in this process ").append(valueOf).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return c9751b;
    }

    /* renamed from: h */
    private void m7201h() {
        C4588d.m23622a(!this.f30440m.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    private static List<String> m7200i() {
        C4678a c4678a = new C4678a();
        synchronized (f30435h) {
            for (C9751b c9751b : f30429b.values()) {
                c4678a.add(c9751b.m7212b());
            }
            C7413mp m14552a = C7413mp.m14552a();
            if (m14552a != null) {
                c4678a.addAll(m14552a.m14548b());
            }
        }
        ArrayList arrayList = new ArrayList(c4678a);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m7199j() {
        m7215a((Class<Class>) C9751b.class, (Class) this, (Iterable<String>) f30430c);
        if (m7204e()) {
            m7215a((Class<Class>) C9751b.class, (Class) this, (Iterable<String>) f30431d);
            m7215a((Class<Class>) Context.class, (Class) this.f30436i, (Iterable<String>) f30432e);
        }
    }

    @NonNull
    /* renamed from: a */
    public Context m7224a() {
        m7201h();
        return this.f30436i;
    }

    /* renamed from: a */
    public void m7220a(@NonNull AbstractC7414mq abstractC7414mq) {
        this.f30444q = (AbstractC7414mq) C4588d.m23627a(abstractC7414mq);
    }

    @UiThread
    /* renamed from: a */
    public void m7219a(@NonNull C7415mr c7415mr) {
        Log.d("FirebaseApp", "Notifying auth state listeners.");
        int i = 0;
        for (AbstractC9752a abstractC9752a : this.f30441n) {
            abstractC9752a.mo7192a(c7415mr);
            i++;
        }
        Log.d("FirebaseApp", String.format("Notified %d auth state listeners.", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public void m7218a(@NonNull AbstractC9752a abstractC9752a) {
        m7201h();
        C4588d.m23627a(abstractC9752a);
        this.f30441n.add(abstractC9752a);
    }

    /* renamed from: a */
    public void m7217a(AbstractC9753b abstractC9753b) {
        m7201h();
        if (this.f30439l.get() && ComponentCallbacks2C7397mn.m14557a().m14555b()) {
            abstractC9753b.mo7159a(true);
        }
        this.f30442o.add(abstractC9753b);
    }

    /* renamed from: b */
    public AbstractC5285f<C9741o> m7209b(boolean z) {
        m7201h();
        return this.f30444q == null ? C5290i.m20826a((Exception) new C9653a("firebase-auth is not linked, please fall back to unauthenticated mode.")) : this.f30444q.mo7379a(z);
    }

    @NonNull
    /* renamed from: b */
    public String m7212b() {
        m7201h();
        return this.f30437j;
    }

    @NonNull
    /* renamed from: c */
    public C9903e m7208c() {
        m7201h();
        return this.f30438k;
    }

    /* renamed from: e */
    public boolean m7204e() {
        return f30428a.equals(m7212b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9751b)) {
            return false;
        }
        return this.f30437j.equals(((C9751b) obj).m7212b());
    }

    /* renamed from: f */
    public String m7203f() {
        String valueOf = String.valueOf(C4680c.m23158c(m7212b().getBytes()));
        String valueOf2 = String.valueOf(C4680c.m23158c(m7208c().m6637b().getBytes()));
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append(AbstractC11759f.f37105b).append(valueOf2).toString();
    }

    public int hashCode() {
        return this.f30437j.hashCode();
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f30437j).m23632a("options", this.f30438k).toString();
    }
}
