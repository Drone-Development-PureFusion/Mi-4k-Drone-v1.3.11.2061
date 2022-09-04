package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C3424R;
/* loaded from: classes.dex */
public final class zzah extends Button {
    public zzah(Context context) {
        this(context, null);
    }

    public zzah(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: a */
    private int m23382a(int i, int i2, int i3) {
        switch (i) {
            case 0:
            case 1:
                return i3;
            case 2:
                return i2;
            default:
                throw new IllegalStateException(new StringBuilder(32).append("Unknown button size: ").append(i).toString());
        }
    }

    /* renamed from: a */
    private int m23381a(int i, int i2, int i3, int i4) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            case 2:
                return i4;
            default:
                throw new IllegalStateException(new StringBuilder(33).append("Unknown color scheme: ").append(i).toString());
        }
    }

    /* renamed from: a */
    private void m23380a(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    /* renamed from: b */
    private void m23378b(Resources resources, int i, int i2) {
        setBackgroundDrawable(resources.getDrawable(m23382a(i, m23381a(i2, C3424R.C3425drawable.common_google_signin_btn_icon_dark, C3424R.C3425drawable.common_google_signin_btn_icon_light, C3424R.C3425drawable.common_google_signin_btn_icon_light), m23381a(i2, C3424R.C3425drawable.common_google_signin_btn_text_dark, C3424R.C3425drawable.common_google_signin_btn_text_light, C3424R.C3425drawable.common_google_signin_btn_text_light))));
    }

    /* renamed from: c */
    private void m23377c(Resources resources, int i, int i2) {
        setTextColor((ColorStateList) C4588d.m23627a(resources.getColorStateList(m23381a(i2, C3424R.color.common_google_signin_btn_text_dark, C3424R.color.common_google_signin_btn_text_light, C3424R.color.common_google_signin_btn_text_light))));
        switch (i) {
            case 0:
                setText(resources.getString(C3424R.C3427string.common_signin_button_text));
                break;
            case 1:
                setText(resources.getString(C3424R.C3427string.common_signin_button_text_long));
                break;
            case 2:
                setText((CharSequence) null);
                break;
            default:
                throw new IllegalStateException(new StringBuilder(32).append("Unknown button size: ").append(i).toString());
        }
        setTransformationMethod(null);
    }

    /* renamed from: a */
    public void m23379a(Resources resources, int i, int i2) {
        m23380a(resources);
        m23378b(resources, i, i2);
        m23377c(resources, i, i2);
    }
}
