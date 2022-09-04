package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aaa;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.b */
/* loaded from: classes.dex */
public class C3596b extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f14091a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private final RelativeLayout f14092b;
    @Nullable

    /* renamed from: c */
    private AnimationDrawable f14093c;

    public C3596b(Context context, C3595a c3595a) {
        super(context);
        C4588d.m23627a(c3595a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        switch (c3595a.m27387g()) {
            case 0:
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                break;
            case 1:
            default:
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                break;
            case 2:
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                break;
            case 3:
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                break;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f14091a, null, null));
        shapeDrawable.getPaint().setColor(c3595a.m27391c());
        this.f14092b = new RelativeLayout(context);
        this.f14092b.setLayoutParams(layoutParams);
        C3779u.m26888g().mo18287a(this.f14092b, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(c3595a.m27393a())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(c3595a.m27393a());
            textView.setTextColor(c3595a.m27390d());
            textView.setTextSize(c3595a.m27389e());
            textView.setPadding(C3514ac.m27586a().m26865a(context, 4), 0, C3514ac.m27586a().m26865a(context, 4), 0);
            this.f14092b.addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<Drawable> m27392b = c3595a.m27392b();
        if (m27392b.size() > 1) {
            this.f14093c = new AnimationDrawable();
            for (Drawable drawable : m27392b) {
                this.f14093c.addFrame(drawable, c3595a.m27388f());
            }
            C3779u.m26888g().mo18287a(imageView, this.f14093c);
        } else if (m27392b.size() == 1) {
            imageView.setImageDrawable(m27392b.get(0));
        }
        this.f14092b.addView(imageView);
        addView(this.f14092b);
    }

    /* renamed from: a */
    public ViewGroup m27386a() {
        return this.f14092b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (this.f14093c != null) {
            this.f14093c.start();
        }
        super.onAttachedToWindow();
    }
}
