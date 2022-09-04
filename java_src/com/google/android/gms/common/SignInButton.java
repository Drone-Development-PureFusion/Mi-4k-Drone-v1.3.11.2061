package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4592h;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.p232c.AbstractC4175h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public static final int f16771a = 0;

    /* renamed from: b */
    public static final int f16772b = 1;

    /* renamed from: c */
    public static final int f16773c = 2;

    /* renamed from: d */
    public static final int f16774d = 0;

    /* renamed from: e */
    public static final int f16775e = 1;

    /* renamed from: f */
    public static final int f16776f = 2;

    /* renamed from: g */
    private int f16777g;

    /* renamed from: h */
    private int f16778h;

    /* renamed from: i */
    private View f16779i;

    /* renamed from: j */
    private View.OnClickListener f16780j;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$a */
    /* loaded from: classes.dex */
    public @interface AbstractC4464a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$b */
    /* loaded from: classes.dex */
    public @interface AbstractC4465b {
    }

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16780j = null;
        m24037a(context, attributeSet);
        m24041a(this.f16777g, this.f16778h);
    }

    /* renamed from: a */
    private static Button m24038a(Context context, int i, int i2) {
        zzah zzahVar = new zzah(context);
        zzahVar.m23379a(context.getResources(), i, i2);
        return zzahVar;
    }

    /* renamed from: a */
    private void m24039a(Context context) {
        if (this.f16779i != null) {
            removeView(this.f16779i);
        }
        try {
            this.f16779i = C4592h.m23606a(context, this.f16777g, this.f16778h);
        } catch (AbstractC4175h.C4176a e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.f16779i = m24038a(context, this.f16777g, this.f16778h);
        }
        addView(this.f16779i);
        this.f16779i.setEnabled(isEnabled());
        this.f16779i.setOnClickListener(this);
    }

    /* renamed from: a */
    private void m24037a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3424R.styleable.SignInButton, 0, 0);
        try {
            this.f16777g = obtainStyledAttributes.getInt(C3424R.styleable.SignInButton_buttonSize, 0);
            this.f16778h = obtainStyledAttributes.getInt(C3424R.styleable.SignInButton_colorScheme, 2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void m24041a(int i, int i2) {
        this.f16777g = i;
        this.f16778h = i2;
        m24039a(getContext());
    }

    @Deprecated
    /* renamed from: a */
    public void m24040a(int i, int i2, Scope[] scopeArr) {
        m24041a(i, i2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f16780j == null || view != this.f16779i) {
            return;
        }
        this.f16780j.onClick(this);
    }

    public void setColorScheme(int i) {
        m24041a(this.f16777g, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f16779i.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16780j = onClickListener;
        if (this.f16779i != null) {
            this.f16779i.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        m24041a(this.f16777g, this.f16778h);
    }

    public void setSize(int i) {
        m24041a(i, this.f16778h);
    }
}
