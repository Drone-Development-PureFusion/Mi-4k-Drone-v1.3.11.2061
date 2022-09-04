package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.akc;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.lang.reflect.Field;
/* loaded from: classes2.dex */
public final class akb {

    /* renamed from: f */
    private static akc f22114f;

    /* renamed from: h */
    private final Context f22116h;

    /* renamed from: g */
    private static final AbstractC6445b.AbstractC6446a f22115g = new AbstractC6445b.AbstractC6446a() { // from class: com.google.android.gms.internal.akb.1
        @Override // com.google.android.gms.internal.akb.AbstractC6445b.AbstractC6446a
        /* renamed from: a */
        public int mo17058a(Context context, String str) {
            return akb.m17065a(context, str);
        }

        @Override // com.google.android.gms.internal.akb.AbstractC6445b.AbstractC6446a
        /* renamed from: a */
        public int mo17057a(Context context, String str, boolean z) {
            return akb.m17063a(context, str, z);
        }
    };

    /* renamed from: a */
    public static final AbstractC6445b f22109a = new AbstractC6445b() { // from class: com.google.android.gms.internal.akb.2
        @Override // com.google.android.gms.internal.akb.AbstractC6445b
        /* renamed from: a */
        public AbstractC6445b.C6447b mo17059a(Context context, String str, AbstractC6445b.AbstractC6446a abstractC6446a) {
            AbstractC6445b.C6447b c6447b = new AbstractC6445b.C6447b();
            c6447b.f22119b = abstractC6446a.mo17057a(context, str, true);
            if (c6447b.f22119b != 0) {
                c6447b.f22120c = 1;
            } else {
                c6447b.f22118a = abstractC6446a.mo17058a(context, str);
                if (c6447b.f22118a != 0) {
                    c6447b.f22120c = -1;
                }
            }
            return c6447b;
        }
    };

    /* renamed from: b */
    public static final AbstractC6445b f22110b = new AbstractC6445b() { // from class: com.google.android.gms.internal.akb.3
        @Override // com.google.android.gms.internal.akb.AbstractC6445b
        /* renamed from: a */
        public AbstractC6445b.C6447b mo17059a(Context context, String str, AbstractC6445b.AbstractC6446a abstractC6446a) {
            AbstractC6445b.C6447b c6447b = new AbstractC6445b.C6447b();
            c6447b.f22118a = abstractC6446a.mo17058a(context, str);
            if (c6447b.f22118a != 0) {
                c6447b.f22120c = -1;
            } else {
                c6447b.f22119b = abstractC6446a.mo17057a(context, str, true);
                if (c6447b.f22119b != 0) {
                    c6447b.f22120c = 1;
                }
            }
            return c6447b;
        }
    };

    /* renamed from: c */
    public static final AbstractC6445b f22111c = new AbstractC6445b() { // from class: com.google.android.gms.internal.akb.4
        @Override // com.google.android.gms.internal.akb.AbstractC6445b
        /* renamed from: a */
        public AbstractC6445b.C6447b mo17059a(Context context, String str, AbstractC6445b.AbstractC6446a abstractC6446a) {
            AbstractC6445b.C6447b c6447b = new AbstractC6445b.C6447b();
            c6447b.f22118a = abstractC6446a.mo17058a(context, str);
            c6447b.f22119b = abstractC6446a.mo17057a(context, str, true);
            if (c6447b.f22118a == 0 && c6447b.f22119b == 0) {
                c6447b.f22120c = 0;
            } else if (c6447b.f22118a >= c6447b.f22119b) {
                c6447b.f22120c = -1;
            } else {
                c6447b.f22120c = 1;
            }
            return c6447b;
        }
    };

    /* renamed from: d */
    public static final AbstractC6445b f22112d = new AbstractC6445b() { // from class: com.google.android.gms.internal.akb.5
        @Override // com.google.android.gms.internal.akb.AbstractC6445b
        /* renamed from: a */
        public AbstractC6445b.C6447b mo17059a(Context context, String str, AbstractC6445b.AbstractC6446a abstractC6446a) {
            AbstractC6445b.C6447b c6447b = new AbstractC6445b.C6447b();
            c6447b.f22118a = abstractC6446a.mo17058a(context, str);
            c6447b.f22119b = abstractC6446a.mo17057a(context, str, true);
            if (c6447b.f22118a == 0 && c6447b.f22119b == 0) {
                c6447b.f22120c = 0;
            } else if (c6447b.f22119b >= c6447b.f22118a) {
                c6447b.f22120c = 1;
            } else {
                c6447b.f22120c = -1;
            }
            return c6447b;
        }
    };

    /* renamed from: e */
    public static final AbstractC6445b f22113e = new AbstractC6445b() { // from class: com.google.android.gms.internal.akb.6
        @Override // com.google.android.gms.internal.akb.AbstractC6445b
        /* renamed from: a */
        public AbstractC6445b.C6447b mo17059a(Context context, String str, AbstractC6445b.AbstractC6446a abstractC6446a) {
            AbstractC6445b.C6447b c6447b = new AbstractC6445b.C6447b();
            c6447b.f22118a = abstractC6446a.mo17058a(context, str);
            if (c6447b.f22118a != 0) {
                c6447b.f22119b = abstractC6446a.mo17057a(context, str, false);
            } else {
                c6447b.f22119b = abstractC6446a.mo17057a(context, str, true);
            }
            if (c6447b.f22118a == 0 && c6447b.f22119b == 0) {
                c6447b.f22120c = 0;
            } else if (c6447b.f22119b >= c6447b.f22118a) {
                c6447b.f22120c = 1;
            } else {
                c6447b.f22120c = -1;
            }
            return c6447b;
        }
    };

    /* renamed from: com.google.android.gms.internal.akb$a */
    /* loaded from: classes2.dex */
    public static class C6444a extends Exception {
        private C6444a(String str) {
            super(str);
        }

        private C6444a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.internal.akb$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6445b {

        /* renamed from: com.google.android.gms.internal.akb$b$a */
        /* loaded from: classes2.dex */
        public interface AbstractC6446a {
            /* renamed from: a */
            int mo17058a(Context context, String str);

            /* renamed from: a */
            int mo17057a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.internal.akb$b$b */
        /* loaded from: classes2.dex */
        public static class C6447b {

            /* renamed from: a */
            public int f22118a = 0;

            /* renamed from: b */
            public int f22119b = 0;

            /* renamed from: c */
            public int f22120c = 0;
        }

        /* renamed from: a */
        C6447b mo17059a(Context context, String str, AbstractC6446a abstractC6446a);
    }

    private akb(Context context) {
        this.f22116h = (Context) C4588d.m23627a(context);
    }

    /* renamed from: a */
    public static int m17065a(Context context, String str) {
        int i;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            String valueOf = String.valueOf("com.google.android.gms.dynamite.descriptors.");
            String valueOf2 = String.valueOf("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length() + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(".").append(valueOf2).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                String valueOf3 = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", new StringBuilder(String.valueOf(valueOf3).length() + 51 + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf3).append("' didn't match expected id '").append(str).append("'").toString());
                i = 0;
            } else {
                i = declaredField2.getInt(null);
            }
            return i;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e2) {
            String valueOf4 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf4.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf4) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: a */
    public static int m17063a(Context context, String str, boolean z) {
        akc m17067a = m17067a(context);
        if (m17067a == null) {
            return 0;
        }
        try {
            return m17067a.mo17053a(BinderC4173f.m25293a(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* renamed from: a */
    public static akb m17066a(Context context, AbstractC6445b abstractC6445b, String str) {
        AbstractC6445b.C6447b mo17059a = abstractC6445b.mo17059a(context, str, f22115g);
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(mo17059a.f22118a).append(" and remote module ").append(str).append(":").append(mo17059a.f22119b).toString());
        if (mo17059a.f22120c == 0 || ((mo17059a.f22120c == -1 && mo17059a.f22118a == 0) || (mo17059a.f22120c == 1 && mo17059a.f22119b == 0))) {
            throw new C6444a(new StringBuilder(91).append("No acceptable module found. Local version is ").append(mo17059a.f22118a).append(" and remote version is ").append(mo17059a.f22119b).append(".").toString());
        } else if (mo17059a.f22120c == -1) {
            return m17060c(context, str);
        } else {
            if (mo17059a.f22120c != 1) {
                throw new C6444a(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(mo17059a.f22120c).toString());
            }
            try {
                return m17064a(context, str, mo17059a.f22119b);
            } catch (C6444a e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
                if (mo17059a.f22118a != 0) {
                    final int i = mo17059a.f22118a;
                    if (abstractC6445b.mo17059a(context, str, new AbstractC6445b.AbstractC6446a() { // from class: com.google.android.gms.internal.akb.7
                        @Override // com.google.android.gms.internal.akb.AbstractC6445b.AbstractC6446a
                        /* renamed from: a */
                        public int mo17058a(Context context2, String str2) {
                            return i;
                        }

                        @Override // com.google.android.gms.internal.akb.AbstractC6445b.AbstractC6446a
                        /* renamed from: a */
                        public int mo17057a(Context context2, String str2, boolean z) {
                            return 0;
                        }
                    }).f22120c == -1) {
                        return m17060c(context, str);
                    }
                }
                throw new C6444a("Remote load failed. No local fallback found.", e);
            }
        }
    }

    /* renamed from: a */
    private static akb m17064a(Context context, String str, int i) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        akc m17067a = m17067a(context);
        if (m17067a == null) {
            throw new C6444a("Failed to create IDynamiteLoader.");
        }
        try {
            AbstractC4170e mo17054a = m17067a.mo17054a(BinderC4173f.m25293a(context), str, i);
            if (BinderC4173f.m25294a(mo17054a) != null) {
                return new akb((Context) BinderC4173f.m25294a(mo17054a));
            }
            throw new C6444a("Failed to load remote module.");
        } catch (RemoteException e) {
            throw new C6444a("Failed to load remote module.", e);
        }
    }

    /* renamed from: a */
    private static akc m17067a(Context context) {
        synchronized (akb.class) {
            if (f22114f != null) {
                return f22114f;
            } else if (C4648j.m23370b().mo23375a(context) != 0) {
                return null;
            } else {
                try {
                    akc m17056a = akc.AbstractBinderC6448a.m17056a((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (m17056a != null) {
                        f22114f = m17056a;
                        return m17056a;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
                return null;
            }
        }
    }

    /* renamed from: b */
    public static int m17061b(Context context, String str) {
        return m17063a(context, str, false);
    }

    /* renamed from: c */
    private static akb m17060c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new akb(context.getApplicationContext());
    }

    /* renamed from: a */
    public Context m17068a() {
        return this.f22116h;
    }

    /* renamed from: a */
    public IBinder m17062a(String str) {
        try {
            return (IBinder) this.f22116h.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C6444a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e);
        }
    }
}
