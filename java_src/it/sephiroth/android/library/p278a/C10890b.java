package it.sephiroth.android.library.p278a;

import android.os.Build;
import android.util.Log;
import android.view.View;
import it.sephiroth.android.library.p278a.p280b.C10893a;
import it.sephiroth.android.library.p278a.p281c.C10894a;
/* renamed from: it.sephiroth.android.library.a.b */
/* loaded from: classes2.dex */
public class C10890b {

    /* renamed from: a */
    private static final String f34901a = "ViewHelper";

    /* renamed from: it.sephiroth.android.library.a.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10891a {

        /* renamed from: a */
        protected View f34902a;

        protected AbstractC10891a(View view) {
            this.f34902a = view;
        }

        /* renamed from: a */
        public abstract void mo2934a(int i);

        /* renamed from: a */
        public abstract void mo2933a(Runnable runnable);

        /* renamed from: a */
        public abstract boolean mo2935a();
    }

    /* renamed from: it.sephiroth.android.library.a.b$b */
    /* loaded from: classes2.dex */
    public static class C10892b extends AbstractC10891a {
        public C10892b(View view) {
            super(view);
        }

        @Override // it.sephiroth.android.library.p278a.C10890b.AbstractC10891a
        /* renamed from: a */
        public void mo2934a(int i) {
            Log.d(C10890b.f34901a, "setScrollX: " + i);
            this.f34902a.scrollTo(i, this.f34902a.getScrollY());
        }

        @Override // it.sephiroth.android.library.p278a.C10890b.AbstractC10891a
        /* renamed from: a */
        public void mo2933a(Runnable runnable) {
            this.f34902a.post(runnable);
        }

        @Override // it.sephiroth.android.library.p278a.C10890b.AbstractC10891a
        /* renamed from: a */
        public boolean mo2935a() {
            return false;
        }
    }

    /* renamed from: a */
    public static final AbstractC10891a m2936a(View view) {
        int i = Build.VERSION.SDK_INT;
        return i >= 16 ? new C10894a(view) : i >= 14 ? new C10893a(view) : new C10892b(view);
    }
}
