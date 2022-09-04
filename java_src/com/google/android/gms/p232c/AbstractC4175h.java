package com.google.android.gms.p232c;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C4656l;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.c.h */
/* loaded from: classes.dex */
public abstract class AbstractC4175h<T> {

    /* renamed from: a */
    private final String f15772a;

    /* renamed from: b */
    private T f15773b;

    /* renamed from: com.google.android.gms.c.h$a */
    /* loaded from: classes.dex */
    public static class C4176a extends Exception {
        public C4176a(String str) {
            super(str);
        }

        public C4176a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4175h(String str) {
        this.f15772a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final T m25291b(Context context) {
        if (this.f15773b == null) {
            C4588d.m23627a(context);
            Context m23329l = C4656l.m23329l(context);
            if (m23329l == null) {
                throw new C4176a("Could not get remote context.");
            }
            try {
                this.f15773b = mo9613b((IBinder) m23329l.getClassLoader().loadClass(this.f15772a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C4176a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new C4176a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new C4176a("Could not instantiate creator.", e3);
            }
        }
        return this.f15773b;
    }

    /* renamed from: b */
    protected abstract T mo9613b(IBinder iBinder);
}
