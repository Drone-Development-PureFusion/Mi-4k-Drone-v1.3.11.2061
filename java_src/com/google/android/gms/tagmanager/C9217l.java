package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.internal.akb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import com.google.android.gms.tagmanager.AbstractC9045ak;
import com.google.android.gms.tagmanager.AbstractC9048al;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.l */
/* loaded from: classes.dex */
final class C9217l {

    /* renamed from: a */
    private static volatile akb f29048a;

    /* renamed from: b */
    private static volatile AbstractC9045ak f29049b;

    /* renamed from: c */
    private static final Map<String, AbstractC9101c> f29050c = new HashMap();

    /* renamed from: d */
    private static final Map<String, AbstractC9151d> f29051d = new HashMap();

    private C9217l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static IBinder m8908a(Context context) {
        try {
            try {
                return AbstractC9048al.AbstractBinderC9049a.asInterface(m8900d(context).m17062a("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(BinderC4173f.m25293a(context), m8899e(context), m8909a()).asBinder();
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        } catch (akb.C6444a e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    static AbstractC9032af m8909a() {
        return new AbstractC9032af.AbstractBinderC9033a() { // from class: com.google.android.gms.tagmanager.l.2
            @Override // com.google.android.gms.tagmanager.AbstractC9032af
            /* renamed from: a */
            public void mo8892a(String str, Map map) {
                AbstractC9101c abstractC9101c;
                if (!C9217l.f29050c.containsKey(str)) {
                    abstractC9101c = (AbstractC9101c) C9217l.m8903b(str, AbstractC9101c.class);
                    C9217l.f29050c.put(str, abstractC9101c);
                } else {
                    abstractC9101c = (AbstractC9101c) C9217l.f29050c.get(str);
                }
                if (abstractC9101c != null) {
                    abstractC9101c.m9254a(map);
                }
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9032af
            /* renamed from: b */
            public String mo8891b(String str, Map map) {
                AbstractC9151d abstractC9151d;
                if (!C9217l.f29051d.containsKey(str)) {
                    abstractC9151d = (AbstractC9151d) C9217l.m8903b(str, AbstractC9151d.class);
                    C9217l.f29051d.put(str, abstractC9151d);
                } else {
                    abstractC9151d = (AbstractC9151d) C9217l.f29051d.get(str);
                }
                if (abstractC9151d != null) {
                    return abstractC9151d.m9085a(map);
                }
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8907a(Intent intent, Context context) {
        AbstractC9045ak m8901c = m8901c(context);
        synchronized (C9217l.class) {
            try {
                m8901c.previewIntent(intent, BinderC4173f.m25293a(context), BinderC4173f.m25293a(f29048a.m17068a()), m8899e(context), m8909a());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Object m8903b(String str, Class<?> cls) {
        boolean z = false;
        try {
            Class<?> cls2 = Class.forName(str);
            Class<?>[] interfaces = cls2.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (interfaces[i].equals(cls)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                String valueOf = String.valueOf(cls.getCanonicalName());
                Log.e("GoogleTagManagerAPI", new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(valueOf).length()).append(str).append(" doesn't implement ").append(valueOf).append(" interface.").toString());
                return null;
            }
            try {
                try {
                    return cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException e) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                    return null;
                } catch (InvocationTargetException e2) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" construction threw an exception."));
                    return null;
                }
            } catch (InstantiationException e3) {
                Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" is an abstract class."));
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have a valid no-arg constructor"));
                return null;
            } catch (SecurityException e5) {
                Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                return null;
            }
        } catch (ClassNotFoundException e6) {
            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" can't be found in the application."));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m8904b(Context context) {
        AbstractC9045ak m8901c = m8901c(context);
        synchronized (C9217l.class) {
            try {
                m8901c.initialize(BinderC4173f.m25293a(context), m8899e(context), m8909a());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    private static AbstractC9045ak m8901c(Context context) {
        AbstractC9045ak abstractC9045ak = f29049b;
        if (abstractC9045ak == null) {
            synchronized (C9217l.class) {
                abstractC9045ak = f29049b;
                if (abstractC9045ak == null) {
                    try {
                        abstractC9045ak = AbstractC9045ak.AbstractBinderC9046a.asInterface(m8900d(context).m17062a("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        f29049b = abstractC9045ak;
                    } catch (akb.C6444a e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return abstractC9045ak;
    }

    /* renamed from: d */
    private static akb m8900d(Context context) {
        akb akbVar = f29048a;
        if (akbVar == null) {
            synchronized (C9217l.class) {
                akbVar = f29048a;
                if (f29048a == null) {
                    akbVar = akb.m17066a(context, akb.f22111c, ModuleDescriptor.MODULE_ID);
                    f29048a = akbVar;
                }
            }
        }
        return akbVar;
    }

    /* renamed from: e */
    private static AbstractC9042aj m8899e(Context context) {
        final AppMeasurement appMeasurement = AppMeasurement.getInstance(context);
        return new AbstractC9042aj.AbstractBinderC9043a() { // from class: com.google.android.gms.tagmanager.l.1
            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public Map<String, Object> mo8898a() {
                return AppMeasurement.this.m10903b(true);
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public void mo8897a(final AbstractC9035ag abstractC9035ag) {
                AppMeasurement.this.m10913a(new AppMeasurement.AbstractC8637c() { // from class: com.google.android.gms.tagmanager.l.1.2
                    @Override // com.google.android.gms.measurement.AppMeasurement.AbstractC8637c
                    /* renamed from: a */
                    public void mo8893a(String str, String str2, Bundle bundle, long j) {
                        try {
                            abstractC9035ag.mo9319a(str, str2, bundle, j);
                        } catch (RemoteException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public void mo8896a(final AbstractC9039ai abstractC9039ai) {
                AppMeasurement.this.m10914a(new AppMeasurement.AbstractC8636b() { // from class: com.google.android.gms.tagmanager.l.1.1
                    @Override // com.google.android.gms.measurement.AppMeasurement.AbstractC8636b
                    /* renamed from: a */
                    public void mo8894a(String str, String str2, Bundle bundle, long j) {
                        try {
                            abstractC9039ai.mo9317a(str, str2, bundle, j);
                        } catch (RemoteException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.tagmanager.AbstractC9042aj
            /* renamed from: a */
            public void mo8895a(String str, String str2, Bundle bundle, long j) {
                AppMeasurement.this.m10908a(str, str2, bundle, j);
            }
        };
    }
}
