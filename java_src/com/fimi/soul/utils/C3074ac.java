package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
/* renamed from: com.fimi.soul.utils.ac */
/* loaded from: classes.dex */
public class C3074ac {

    /* renamed from: a */
    private Context f11514a;

    public C3074ac(Context context) {
        this.f11514a = context;
    }

    /* renamed from: a */
    public Toast m29368a(int i) {
        View inflate = LayoutInflater.from(this.f11514a).inflate(i, (ViewGroup) null);
        Toast toast = new Toast(this.f11514a);
        toast.setGravity(53, 12, 40);
        toast.setDuration(1);
        toast.setView(inflate);
        return toast;
    }

    /* renamed from: a */
    public Toast m29367a(String str) {
        return Toast.makeText(this.f11514a, str, 0);
    }

    /* renamed from: a */
    public Toast m29366a(String str, Drawable drawable) {
        Toast makeText = Toast.makeText(this.f11514a, str, 1);
        makeText.setGravity(17, 0, 0);
        ImageView imageView = new ImageView(this.f11514a);
        imageView.setBackgroundDrawable(drawable);
        ((LinearLayout) makeText.getView()).addView(imageView, 0);
        return makeText;
    }
}
