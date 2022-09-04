package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.internal.AbstractC6830df;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.qs */
/* loaded from: classes2.dex */
public class C7636qs extends AbstractC7665rm {

    /* renamed from: s */
    private static final String f25352s = C7636qs.class.getSimpleName();

    /* renamed from: t */
    private C3433a.C3434a f25353t;

    protected C7636qs(Context context) {
        super(context, "");
    }

    /* renamed from: c */
    public static C7636qs m14020c(Context context) {
        a(context, true);
        return new C7636qs(context);
    }

    @Override // com.google.android.gms.internal.AbstractC7665rm, com.google.android.gms.internal.AbstractC7601pr
    /* renamed from: a */
    protected AbstractC6830df.C6831a mo13808a(Context context, View view) {
        return null;
    }

    /* renamed from: a */
    public String m14021a(String str, String str2) {
        return C7352ln.m14722a(str, str2, true);
    }

    /* renamed from: a */
    public void m14022a(C3433a.C3434a c3434a) {
        this.f25353t = c3434a;
    }

    @Override // com.google.android.gms.internal.AbstractC7665rm
    /* renamed from: a */
    protected void mo13804a(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        if (!c7677rw.m13712h()) {
            a(mo13794b(c7677rw, c6831a));
        } else if (this.f25353t == null) {
        } else {
            String m27865a = this.f25353t.m27865a();
            if (!TextUtils.isEmpty(m27865a)) {
                c6831a.f22957aa = C7681ry.m13697a(m27865a);
                c6831a.f22958ab = 5;
                c6831a.f22959ac = Boolean.valueOf(this.f25353t.m27864b());
            }
            this.f25353t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7665rm
    /* renamed from: b */
    public List<Callable<Void>> mo13794b(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        ArrayList arrayList = new ArrayList();
        if (c7677rw.m13717c() == null) {
            return arrayList;
        }
        arrayList.add(new C7689sf(c7677rw, C7671rr.m13750n(), C7671rr.m13749o(), c6831a, c7677rw.m13703q(), 24));
        return arrayList;
    }
}
