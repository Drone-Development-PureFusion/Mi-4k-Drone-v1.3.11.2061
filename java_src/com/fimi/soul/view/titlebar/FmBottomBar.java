package com.fimi.soul.view.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.fimi.kernel.utils.C1675p;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes.dex */
public class FmBottomBar extends LinearLayout {

    /* renamed from: b */
    public LayoutInflater f13200b;

    /* renamed from: d */
    private Activity f13202d;

    /* renamed from: e */
    private PopupWindow f13203e;

    /* renamed from: a */
    public int f13199a = 2;

    /* renamed from: f */
    private WindowManager f13204f = null;

    /* renamed from: c */
    public int f13201c = 320;

    public FmBottomBar(Context context) {
        super(context);
        m28314a(context);
    }

    public FmBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28314a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28312a(View view, View view2, boolean z) {
        C1675p.m34630a(view2);
        int measuredWidth = view.getMeasuredWidth();
        if (view2.getMeasuredWidth() > view.getMeasuredWidth()) {
            measuredWidth = view2.getMeasuredWidth();
        }
        int measuredHeight = getMeasuredHeight();
        if (z) {
            this.f13203e = new PopupWindow(view2, measuredWidth, -2, true);
        } else {
            this.f13203e = new PopupWindow(view2, -1, -2, true);
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int left = iArr[0] - view.getLeft();
        int i = left + measuredWidth >= this.f13201c ? (this.f13201c - measuredWidth) - 2 : left;
        this.f13203e.setFocusable(true);
        this.f13203e.setOutsideTouchable(true);
        this.f13203e.setBackgroundDrawable(new ColorDrawable(AsyncImageView.f35337a));
        this.f13203e.showAtLocation(view, 83, i, measuredHeight + 2);
    }

    /* renamed from: a */
    public void m28314a(Context context) {
        this.f13202d = (Activity) context;
        setOrientation(0);
        setId(this.f13199a);
        setPadding(0, 0, 0, 0);
        this.f13200b = LayoutInflater.from(context);
        this.f13204f = this.f13202d.getWindowManager();
        this.f13201c = this.f13204f.getDefaultDisplay().getWidth();
    }

    /* renamed from: a */
    public void m28313a(final View view, final View view2) {
        if (view == null || view2 == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.titlebar.FmBottomBar.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                FmBottomBar.this.m28312a(view, view2, true);
            }
        });
    }

    public void setBottomBarBackground(int i) {
        setBackgroundResource(i);
    }

    public void setBottomBarBackgroundColor(int i) {
        setBackgroundColor(i);
    }

    public void setBottomBarBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBottomView(int i) {
        setBottomView(this.f13200b.inflate(i, (ViewGroup) null));
    }

    public void setBottomView(View view) {
        removeAllViews();
        addView(view, new LinearLayout.LayoutParams(-1, -2));
    }
}
