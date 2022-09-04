package com.p120c.p121a.p129b.p135e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
import com.p120c.p121a.p138c.C1356d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* renamed from: com.c.a.b.e.d */
/* loaded from: classes.dex */
public abstract class AbstractC1336d implements AbstractC1333a {

    /* renamed from: a */
    public static final String f3447a = "Can't set a drawable into view. You should call ImageLoader on UI thread for it.";

    /* renamed from: b */
    public static final String f3448b = "Can't set a bitmap into view. You should call ImageLoader on UI thread for it.";

    /* renamed from: c */
    protected Reference<View> f3449c;

    /* renamed from: d */
    protected boolean f3450d;

    public AbstractC1336d(View view) {
        this(view, true);
    }

    public AbstractC1336d(View view, boolean z) {
        if (view == null) {
            throw new IllegalArgumentException("view must not be null");
        }
        this.f3449c = new WeakReference(view);
        this.f3450d = z;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public int mo35686a() {
        View view = this.f3449c.get();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int width = (!this.f3450d || layoutParams == null || layoutParams.width == -2) ? 0 : view.getWidth();
            return (width > 0 || layoutParams == null) ? width : layoutParams.width;
        }
        return 0;
    }

    /* renamed from: a */
    protected abstract void mo35684a(Bitmap bitmap, View view);

    /* renamed from: a */
    protected abstract void mo35682a(Drawable drawable, View view);

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public boolean mo35685a(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f3449c.get();
            if (view != null) {
                mo35684a(bitmap, view);
                return true;
            }
        } else {
            C1356d.m35605c(f3448b, new Object[0]);
        }
        return false;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public boolean mo35683a(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f3449c.get();
            if (view != null) {
                mo35682a(drawable, view);
                return true;
            }
        } else {
            C1356d.m35605c(f3447a, new Object[0]);
        }
        return false;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: b */
    public int mo35681b() {
        View view = this.f3449c.get();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int height = (!this.f3450d || layoutParams == null || layoutParams.height == -2) ? 0 : view.getHeight();
            return (height > 0 || layoutParams == null) ? height : layoutParams.height;
        }
        return 0;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: c */
    public EnumC1303h mo35680c() {
        return EnumC1303h.CROP;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: d */
    public View mo35679d() {
        return this.f3449c.get();
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: e */
    public boolean mo35678e() {
        return this.f3449c.get() == null;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: f */
    public int mo35677f() {
        View view = this.f3449c.get();
        return view == null ? super.hashCode() : view.hashCode();
    }
}
