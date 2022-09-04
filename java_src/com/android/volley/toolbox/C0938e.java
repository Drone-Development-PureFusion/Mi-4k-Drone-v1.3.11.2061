package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.AbstractC0900b;
import com.android.volley.AbstractC0916n;
import com.android.volley.C0912j;
import com.android.volley.C0924p;
/* renamed from: com.android.volley.toolbox.e */
/* loaded from: classes.dex */
public class C0938e extends AbstractC0916n<Object> {

    /* renamed from: a */
    private final AbstractC0900b f2094a;

    /* renamed from: b */
    private final Runnable f2095b;

    public C0938e(AbstractC0900b abstractC0900b, Runnable runnable) {
        super(0, null, null);
        this.f2094a = abstractC0900b;
        this.f2095b = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: a */
    public C0924p<Object> mo34917a(C0912j c0912j) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: b */
    public void mo34916b(Object obj) {
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: m */
    public boolean mo37356m() {
        this.f2094a.mo37277b();
        if (this.f2095b != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f2095b);
            return true;
        }
        return true;
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: x */
    public AbstractC0916n.EnumC0919b mo37286x() {
        return AbstractC0916n.EnumC0919b.IMMEDIATE;
    }
}
