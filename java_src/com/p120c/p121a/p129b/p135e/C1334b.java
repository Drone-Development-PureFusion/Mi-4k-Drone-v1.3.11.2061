package com.p120c.p121a.p129b.p135e;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
import com.p120c.p121a.p138c.C1356d;
import java.lang.reflect.Field;
/* renamed from: com.c.a.b.e.b */
/* loaded from: classes.dex */
public class C1334b extends AbstractC1336d {
    public C1334b(ImageView imageView) {
        super(imageView);
    }

    public C1334b(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* renamed from: a */
    private static int m35689a(Object obj, String str) {
        try {
            Field declaredField = ImageView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(obj)).intValue();
            if (intValue > 0 && intValue < Integer.MAX_VALUE) {
                return intValue;
            }
        } catch (Exception e) {
            C1356d.m35611a(e);
        }
        return 0;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1336d, com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public int mo35686a() {
        ImageView imageView;
        int mo35686a = super.mo35686a();
        return (mo35686a > 0 || (imageView = (ImageView) this.f3449c.get()) == null) ? mo35686a : m35689a(imageView, "mMaxWidth");
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1336d
    /* renamed from: a */
    protected void mo35684a(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1336d
    /* renamed from: a */
    protected void mo35682a(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1336d, com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: b */
    public int mo35681b() {
        ImageView imageView;
        int mo35681b = super.mo35681b();
        return (mo35681b > 0 || (imageView = (ImageView) this.f3449c.get()) == null) ? mo35681b : m35689a(imageView, "mMaxHeight");
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1336d, com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: c */
    public EnumC1303h mo35680c() {
        ImageView imageView = (ImageView) this.f3449c.get();
        return imageView != null ? EnumC1303h.m35907a(imageView) : super.mo35680c();
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1336d, com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: g */
    public ImageView mo35679d() {
        return (ImageView) super.mo35679d();
    }
}
