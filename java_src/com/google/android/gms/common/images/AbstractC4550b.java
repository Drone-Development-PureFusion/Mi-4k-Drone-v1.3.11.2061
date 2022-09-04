package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajb;
import com.google.android.gms.internal.zzrv;
import it.p273a.p274a.AbstractC10866e;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.gms.common.images.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4550b {

    /* renamed from: a */
    final C4551a f16974a;

    /* renamed from: c */
    protected int f16976c;

    /* renamed from: b */
    protected int f16975b = 0;

    /* renamed from: d */
    protected boolean f16977d = false;

    /* renamed from: e */
    private boolean f16978e = true;

    /* renamed from: f */
    private boolean f16979f = false;

    /* renamed from: g */
    private boolean f16980g = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.images.b$a */
    /* loaded from: classes2.dex */
    public static final class C4551a {

        /* renamed from: a */
        public final Uri f16981a;

        public C4551a(Uri uri) {
            this.f16981a = uri;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4551a)) {
                return false;
            }
            if (this != obj) {
                return C4585c.m23634a(((C4551a) obj).f16981a, this.f16981a);
            }
            return true;
        }

        public int hashCode() {
            return C4585c.m23633a(this.f16981a);
        }
    }

    /* renamed from: com.google.android.gms.common.images.b$b */
    /* loaded from: classes2.dex */
    public static final class C4552b extends AbstractC4550b {

        /* renamed from: e */
        private WeakReference<ImageView> f16982e;

        public C4552b(ImageView imageView, int i) {
            super(null, i);
            C4598n.m23595a(imageView);
            this.f16982e = new WeakReference<>(imageView);
        }

        public C4552b(ImageView imageView, Uri uri) {
            super(uri, 0);
            C4598n.m23595a(imageView);
            this.f16982e = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        private void m23748a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
            boolean z4 = !z2 && !z3;
            if (z4 && (imageView instanceof ajb)) {
                int m17139a = ((ajb) imageView).m17139a();
                if (this.f16976c != 0 && m17139a == this.f16976c) {
                    return;
                }
            }
            boolean a = a(z, z2);
            Drawable a2 = a ? a(imageView.getDrawable(), drawable) : drawable;
            imageView.setImageDrawable(a2);
            if (imageView instanceof ajb) {
                ajb ajbVar = (ajb) imageView;
                ajbVar.m17137a(z3 ? this.f16974a.f16981a : null);
                ajbVar.m17138a(z4 ? this.f16976c : 0);
            }
            if (a) {
                ((aja) a2).m17142a(AbstractC10866e.f34828G);
            }
        }

        @Override // com.google.android.gms.common.images.AbstractC4550b
        /* renamed from: a */
        protected void mo23747a(Drawable drawable, boolean z, boolean z2, boolean z3) {
            ImageView imageView = this.f16982e.get();
            if (imageView != null) {
                m23748a(imageView, drawable, z, z2, z3);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4552b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageView imageView = this.f16982e.get();
            ImageView imageView2 = ((C4552b) obj).f16982e.get();
            return (imageView2 == null || imageView == null || !C4585c.m23634a(imageView2, imageView)) ? false : true;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: com.google.android.gms.common.images.b$c */
    /* loaded from: classes2.dex */
    public static final class C4553c extends AbstractC4550b {

        /* renamed from: e */
        private WeakReference<ImageManager.AbstractC4542a> f16983e;

        public C4553c(ImageManager.AbstractC4542a abstractC4542a, Uri uri) {
            super(uri, 0);
            C4598n.m23595a(abstractC4542a);
            this.f16983e = new WeakReference<>(abstractC4542a);
        }

        @Override // com.google.android.gms.common.images.AbstractC4550b
        /* renamed from: a */
        protected void mo23747a(Drawable drawable, boolean z, boolean z2, boolean z3) {
            ImageManager.AbstractC4542a abstractC4542a;
            if (z2 || (abstractC4542a = this.f16983e.get()) == null) {
                return;
            }
            abstractC4542a.m23771a(this.f16974a.f16981a, drawable, z3);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4553c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C4553c c4553c = (C4553c) obj;
            ImageManager.AbstractC4542a abstractC4542a = this.f16983e.get();
            ImageManager.AbstractC4542a abstractC4542a2 = c4553c.f16983e.get();
            return abstractC4542a2 != null && abstractC4542a != null && C4585c.m23634a(abstractC4542a2, abstractC4542a) && C4585c.m23634a(c4553c.f16974a, this.f16974a);
        }

        public int hashCode() {
            return C4585c.m23633a(this.f16974a);
        }
    }

    public AbstractC4550b(Uri uri, int i) {
        this.f16976c = 0;
        this.f16974a = new C4551a(uri);
        this.f16976c = i;
    }

    /* renamed from: a */
    private Drawable m23752a(Context context, zzrv zzrvVar, int i) {
        return context.getResources().getDrawable(i);
    }

    /* renamed from: a */
    protected aja m23750a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof aja) {
            drawable = ((aja) drawable).m17141b();
        }
        return new aja(drawable, drawable2);
    }

    /* renamed from: a */
    public void m23755a(int i) {
        this.f16976c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m23754a(Context context, Bitmap bitmap, boolean z) {
        C4598n.m23595a(bitmap);
        mo23747a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m23753a(Context context, zzrv zzrvVar) {
        if (this.f16980g) {
            mo23747a(null, false, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m23751a(Context context, zzrv zzrvVar, boolean z) {
        Drawable drawable = null;
        if (this.f16976c != 0) {
            drawable = m23752a(context, zzrvVar, this.f16976c);
        }
        mo23747a(drawable, z, false, false);
    }

    /* renamed from: a */
    protected abstract void mo23747a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* renamed from: a */
    protected boolean m23749a(boolean z, boolean z2) {
        return this.f16978e && !z2 && !z;
    }
}
