package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4596l;
import com.google.android.gms.plus.internal.C8973g;
/* loaded from: classes2.dex */
public final class PlusOneButton extends FrameLayout {

    /* renamed from: a */
    public static final int f28423a = 0;

    /* renamed from: b */
    public static final int f28424b = 1;

    /* renamed from: c */
    public static final int f28425c = 2;

    /* renamed from: d */
    public static final int f28426d = 3;

    /* renamed from: e */
    public static final int f28427e = 0;

    /* renamed from: f */
    public static final int f28428f = 1;

    /* renamed from: g */
    public static final int f28429g = 2;

    /* renamed from: h */
    public static final int f28430h = -1;

    /* renamed from: i */
    private View f28431i;

    /* renamed from: j */
    private int f28432j;

    /* renamed from: k */
    private int f28433k;

    /* renamed from: l */
    private String f28434l;

    /* renamed from: m */
    private int f28435m;

    /* renamed from: n */
    private AbstractC8921b f28436n;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.plus.PlusOneButton$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC8920a implements View.OnClickListener, AbstractC8921b {

        /* renamed from: b */
        private final AbstractC8921b f28438b;

        public View$OnClickListenerC8920a(AbstractC8921b abstractC8921b) {
            this.f28438b = abstractC8921b;
        }

        @Override // com.google.android.gms.plus.PlusOneButton.AbstractC8921b
        /* renamed from: a */
        public void mo9719a(Intent intent) {
            Context context = PlusOneButton.this.getContext();
            if (!(context instanceof Activity) || intent == null) {
                return;
            }
            ((Activity) context).startActivityForResult(intent, PlusOneButton.this.f28435m);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = (Intent) PlusOneButton.this.f28431i.getTag();
            if (this.f28438b != null) {
                this.f28438b.mo9719a(intent);
            } else {
                mo9719a(intent);
            }
        }
    }

    /* renamed from: com.google.android.gms.plus.PlusOneButton$b */
    /* loaded from: classes2.dex */
    public interface AbstractC8921b {
        /* renamed from: a */
        void mo9719a(Intent intent);
    }

    public PlusOneButton(Context context) {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28432j = m9725a(context, attributeSet);
        this.f28433k = m9721b(context, attributeSet);
        this.f28435m = -1;
        m9726a(getContext());
        if (isInEditMode()) {
        }
    }

    /* renamed from: a */
    protected static int m9725a(Context context, AttributeSet attributeSet) {
        String m23598a = C4596l.m23598a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(m23598a)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(m23598a)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(m23598a) ? 2 : 3;
    }

    /* renamed from: a */
    private void m9726a(Context context) {
        if (this.f28431i != null) {
            removeView(this.f28431i);
        }
        this.f28431i = C8973g.m9615a(context, this.f28432j, this.f28433k, this.f28434l, this.f28435m);
        setOnPlusOneClickListener(this.f28436n);
        addView(this.f28431i);
    }

    /* renamed from: b */
    protected static int m9721b(Context context, AttributeSet attributeSet) {
        String m23598a = C4596l.m23598a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(m23598a)) {
            return 2;
        }
        return !"NONE".equalsIgnoreCase(m23598a) ? 1 : 0;
    }

    /* renamed from: a */
    public void m9727a() {
        this.f28431i.performClick();
    }

    /* renamed from: a */
    public void m9723a(String str, int i) {
        C4588d.m23622a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        this.f28434l = str;
        this.f28435m = i;
        m9726a(getContext());
    }

    /* renamed from: a */
    public void m9722a(String str, AbstractC8921b abstractC8921b) {
        this.f28434l = str;
        this.f28435m = 0;
        m9726a(getContext());
        setOnPlusOneClickListener(abstractC8921b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f28431i.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.f28431i;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.f28433k = i;
        m9726a(getContext());
    }

    public void setIntent(Intent intent) {
        this.f28431i.setTag(intent);
    }

    public void setOnPlusOneClickListener(AbstractC8921b abstractC8921b) {
        this.f28436n = abstractC8921b;
        this.f28431i.setOnClickListener(new View$OnClickListenerC8920a(abstractC8921b));
    }

    public void setSize(int i) {
        this.f28432j = i;
        m9726a(getContext());
    }
}
