package com.fimi.soul.view.sliding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.C1675p;
/* loaded from: classes2.dex */
public class FmTabItemView extends LinearLayout {

    /* renamed from: a */
    private Context f13187a;

    /* renamed from: b */
    private int f13188b;

    /* renamed from: c */
    private TextView f13189c;

    /* renamed from: d */
    private Drawable f13190d;

    /* renamed from: e */
    private Drawable f13191e;

    /* renamed from: f */
    private Drawable f13192f;

    /* renamed from: g */
    private Drawable f13193g;

    /* renamed from: h */
    private int f13194h;

    /* renamed from: i */
    private int f13195i;

    /* renamed from: j */
    private int f13196j;

    /* renamed from: k */
    private int f13197k;

    public FmTabItemView(Context context) {
        this(context, null);
    }

    public FmTabItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(17);
        setPadding(10, 10, 10, 10);
        this.f13187a = context;
        this.f13189c = new TextView(context);
        this.f13189c.setGravity(17);
        this.f13189c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f13189c.setFocusable(true);
        this.f13189c.setPadding(0, 0, 0, 0);
        this.f13189c.setCompoundDrawablePadding(10);
        this.f13189c.setSingleLine();
        addView(this.f13189c);
    }

    /* renamed from: a */
    public void m28317a(int i, int i2, int i3, int i4) {
        this.f13194h = C1675p.m34614e(this.f13187a, i);
        this.f13195i = C1675p.m34614e(this.f13187a, i2);
        this.f13196j = C1675p.m34614e(this.f13187a, i3);
        this.f13197k = C1675p.m34614e(this.f13187a, i4);
    }

    /* renamed from: a */
    public void m28316a(int i, String str) {
        this.f13188b = i;
        this.f13189c.setText(str);
    }

    /* renamed from: a */
    public void m28315a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f13190d = drawable;
        this.f13191e = drawable2;
        this.f13192f = drawable3;
        this.f13193g = drawable4;
        if (this.f13190d != null) {
            this.f13190d.setBounds(this.f13194h, this.f13195i, this.f13196j, this.f13197k);
        }
        if (this.f13191e != null) {
            this.f13191e.setBounds(this.f13194h, this.f13195i, this.f13196j, this.f13197k);
        }
        if (this.f13192f != null) {
            this.f13192f.setBounds(this.f13194h, this.f13195i, this.f13196j, this.f13197k);
        }
        if (this.f13193g != null) {
            this.f13193g.setBounds(this.f13194h, this.f13195i, this.f13196j, this.f13197k);
        }
        this.f13189c.setCompoundDrawables(this.f13190d, this.f13191e, this.f13192f, this.f13193g);
    }

    public int getIndex() {
        return this.f13188b;
    }

    public TextView getTextView() {
        return this.f13189c;
    }

    public void setTabBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setTabBackgroundResource(int i) {
        setBackgroundResource(i);
    }

    public void setTabTextColor(int i) {
        this.f13189c.setTextColor(i);
    }

    public void setTabTextSize(int i) {
        C1675p.m34619b(this.f13189c, i);
    }
}
