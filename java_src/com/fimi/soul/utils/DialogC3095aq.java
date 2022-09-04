package com.fimi.soul.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
/* renamed from: com.fimi.soul.utils.aq */
/* loaded from: classes.dex */
public class DialogC3095aq extends Dialog {

    /* renamed from: a */
    Dialog f11556a;

    /* renamed from: c */
    private AbstractC3097a f11558c;

    /* renamed from: d */
    private Context f11559d;

    /* renamed from: e */
    private int f11560e;

    /* renamed from: f */
    private TextView f11561f;

    /* renamed from: g */
    private TextView f11562g;

    /* renamed from: h */
    private ImageView f11563h;

    /* renamed from: i */
    private Handler f11564i = new Handler();

    /* renamed from: b */
    Runnable f11557b = new Runnable() { // from class: com.fimi.soul.utils.aq.1
        @Override // java.lang.Runnable
        public void run() {
            DialogC3095aq.m29287a(DialogC3095aq.this);
            if (DialogC3095aq.this.f11560e >= 0) {
                DialogC3095aq.this.f11564i.postDelayed(this, 1000L);
            } else if (DialogC3095aq.this.f11558c == null) {
            } else {
                DialogC3095aq.this.f11558c.mo29281a();
            }
        }
    };

    /* renamed from: com.fimi.soul.utils.aq$a */
    /* loaded from: classes.dex */
    public interface AbstractC3097a {
        /* renamed from: a */
        void mo29281a();
    }

    public DialogC3095aq(Context context, AbstractC3097a abstractC3097a, int i) {
        super(context, C1704R.style.Dialog_Fullscreen);
        this.f11559d = context;
        this.f11558c = abstractC3097a;
        this.f11560e = i;
        this.f11564i.post(this.f11557b);
    }

    /* renamed from: a */
    static /* synthetic */ int m29287a(DialogC3095aq dialogC3095aq) {
        int i = dialogC3095aq.f11560e;
        dialogC3095aq.f11560e = i - 1;
        return i;
    }

    /* renamed from: a */
    public void m29288a(int i) {
        if (this.f11563h != null) {
            this.f11563h.setImageResource(i);
        }
    }

    /* renamed from: a */
    public void m29286a(String str) {
        if (this.f11561f != null) {
            this.f11561f.setText(str);
        }
    }

    /* renamed from: b */
    public void m29284b(String str) {
        if (this.f11561f != null) {
            this.f11562g.setText(str);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setContentView(C1704R.layout.lostcontroldialog);
        this.f11563h = (ImageView) findViewById(C1704R.C1706id.erroric);
        this.f11561f = (TextView) findViewById(C1704R.C1706id.title);
        this.f11562g = (TextView) findViewById(C1704R.C1706id.desmessage);
        this.f11561f.getPaint().setFakeBoldText(true);
        C3103au.m29232a(this.f11559d.getAssets(), this.f11561f, this.f11562g);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i && this.f11558c != null) {
            this.f11558c.mo29281a();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
