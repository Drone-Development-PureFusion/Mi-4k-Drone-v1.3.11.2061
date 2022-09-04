package com.fimi.soul.view;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import java.util.List;
/* renamed from: com.fimi.soul.view.d */
/* loaded from: classes2.dex */
public class C3238d extends PopupWindow {

    /* renamed from: c */
    private LinearLayout f12611c;

    /* renamed from: d */
    private LinearLayout.LayoutParams f12612d;

    /* renamed from: e */
    private Context f12613e;

    /* renamed from: a */
    final Handler f12609a = new Handler();

    /* renamed from: f */
    private int f12614f = 2;

    /* renamed from: b */
    Runnable f12610b = new Runnable() { // from class: com.fimi.soul.view.d.2
        @Override // java.lang.Runnable
        public void run() {
            C3238d.m28663a(C3238d.this);
            if (C3238d.this.f12614f >= 0) {
                C3238d.this.f12609a.postDelayed(C3238d.this.f12610b, 1000L);
            } else if (!C3238d.this.isShowing()) {
            } else {
                C3238d.this.dismiss();
            }
        }
    };

    public C3238d(Context context, int i, int i2) {
        super(context);
        this.f12612d = null;
        this.f12613e = context;
        this.f12612d = new LinearLayout.LayoutParams(-2, -2);
        this.f12612d.gravity = 17;
        this.f12612d.topMargin = 10;
        this.f12611c = new LinearLayout(context);
        this.f12611c.setOrientation(1);
        this.f12611c.setGravity(1);
        setContentView(this.f12611c);
        setWidth(-2);
        setHeight(i2);
        setBackgroundDrawable(context.getResources().getDrawable(C1704R.C1705drawable.bubble));
        getContentView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.view.d.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    C3238d.this.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ int m28663a(C3238d c3238d) {
        int i = c3238d.f12614f;
        c3238d.f12614f = i - 1;
        return i;
    }

    /* renamed from: a */
    public void m28662a(List<Integer> list, View view, int i, int i2) {
        if (isShowing()) {
            dismiss();
            return;
        }
        this.f12611c.removeAllViews();
        View view2 = new View(this.f12613e);
        view2.setLayoutParams(new ViewGroup.LayoutParams(1, 30));
        this.f12611c.addView(view2);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= list.size()) {
                setHeight((list.size() * ((int) this.f12613e.getResources().getDimension(C1704R.dimen.popuwindows_h))) + 50);
                setFocusable(true);
                showAsDropDown(view, i, i2);
                this.f12614f = 1;
                this.f12609a.postDelayed(this.f12610b, 1000L);
                return;
            }
            TextView textView = new TextView(this.f12613e);
            textView.setTextColor(-1);
            textView.setSingleLine(true);
            textView.setText(this.f12613e.getResources().getString(list.get(i4).intValue()));
            this.f12612d.topMargin = 5;
            this.f12611c.addView(textView, this.f12612d);
            i3 = i4 + 1;
        }
    }
}
