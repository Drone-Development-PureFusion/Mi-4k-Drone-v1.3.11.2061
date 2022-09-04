package com.fimi.soul.module.p208a;

import android.content.Context;
import android.content.res.Resources;
import com.fimi.overseas.soul.C1704R;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.a.b */
/* loaded from: classes.dex */
public class C2462b {

    /* renamed from: a */
    private List<C2473d> f7965a = new ArrayList();

    /* renamed from: b */
    private Context f7966b;

    /* renamed from: c */
    private String[] f7967c;

    /* renamed from: d */
    private Resources f7968d;

    /* renamed from: e */
    private String[] f7969e;

    /* renamed from: com.fimi.soul.module.a.b$a */
    /* loaded from: classes.dex */
    public enum EnumC2463a {
        AE,
        ME
    }

    public C2462b(Context context) {
        this.f7966b = context;
        this.f7968d = context.getResources();
        m31589a();
    }

    /* renamed from: a */
    public List<C2473d> m31588a(EnumC2463a enumC2463a, boolean z) {
        this.f7965a.clear();
        for (int i = 0; i < this.f7967c.length; i++) {
            C2473d c2473d = new C2473d();
            c2473d.m31553a(this.f7967c[i]);
            if (!z) {
                c2473d.m31552a(true);
            } else if (i != 0) {
                c2473d.m31552a(true);
            }
            c2473d.m31550b(this.f7969e[i]);
            this.f7965a.add(c2473d);
        }
        return this.f7965a;
    }

    /* renamed from: a */
    public void m31589a() {
        this.f7967c = this.f7968d.getStringArray(C1704R.array.camera_menu);
    }

    /* renamed from: a */
    public void m31587a(String[] strArr) {
        this.f7969e = strArr;
    }
}
