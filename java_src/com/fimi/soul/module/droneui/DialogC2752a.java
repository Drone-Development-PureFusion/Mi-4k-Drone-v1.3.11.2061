package com.fimi.soul.module.droneui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.module.droneui.a */
/* loaded from: classes.dex */
public class DialogC2752a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    Runnable f9572a = new Runnable() { // from class: com.fimi.soul.module.droneui.a.1
        @Override // java.lang.Runnable
        public void run() {
            DialogC2752a.m30406a(DialogC2752a.this);
            if (DialogC2752a.this.f9580i >= 0 || DialogC2752a.this.f9579h == null) {
                DialogC2752a.this.f9573b.postDelayed(DialogC2752a.this.f9572a, 1000L);
            } else {
                DialogC2752a.this.f9579h.mo29722d();
            }
        }
    };

    /* renamed from: b */
    final Handler f9573b = new Handler() { // from class: com.fimi.soul.module.droneui.a.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    };

    /* renamed from: c */
    private String f9574c;

    /* renamed from: d */
    private String f9575d;

    /* renamed from: e */
    private int f9576e;

    /* renamed from: f */
    private boolean f9577f;

    /* renamed from: g */
    private Context f9578g;

    /* renamed from: h */
    private AbstractC2755a f9579h;

    /* renamed from: i */
    private int f9580i;

    /* renamed from: com.fimi.soul.module.droneui.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC2755a {
        /* renamed from: a */
        void mo29725a();

        /* renamed from: b */
        void mo29724b();

        /* renamed from: c */
        void mo29723c();

        /* renamed from: d */
        void mo29722d();
    }

    public DialogC2752a(Context context, String str, String str2, int i, int i2, boolean z, AbstractC2755a abstractC2755a) {
        super(context, C1704R.style.Dialog_Fullscreen);
        this.f9574c = null;
        this.f9575d = null;
        this.f9576e = 0;
        this.f9577f = false;
        this.f9580i = 0;
        this.f9578g = context;
        this.f9574c = str;
        this.f9575d = str2;
        this.f9576e = i;
        this.f9577f = z;
        this.f9579h = abstractC2755a;
        this.f9580i = i2;
        this.f9573b.postDelayed(this.f9572a, 1000L);
    }

    /* renamed from: a */
    static /* synthetic */ int m30406a(DialogC2752a dialogC2752a) {
        int i = dialogC2752a.f9580i;
        dialogC2752a.f9580i = i - 1;
        return i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.command_one /* 2131755277 */:
                if (this.f9579h == null) {
                    return;
                }
                this.f9579h.mo29724b();
                return;
            case C1704R.C1706id.command_two /* 2131755278 */:
                if (this.f9579h == null) {
                    return;
                }
                this.f9579h.mo29723c();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_fault);
        TextView textView = (TextView) findViewById(C1704R.C1706id.fault_title);
        TextView textView2 = (TextView) findViewById(C1704R.C1706id.fault_describe);
        ImageView imageView = (ImageView) findViewById(C1704R.C1706id.error_icon);
        C3103au.m29232a(this.f9578g.getAssets(), textView);
        C3103au.m29232a(this.f9578g.getAssets(), textView2);
        textView.setText(this.f9574c);
        textView2.setText(this.f9575d);
        if (this.f9576e != 0) {
            imageView.setImageBitmap(BitmapFactory.decodeResource(this.f9578g.getResources(), this.f9576e));
        }
        findViewById(C1704R.C1706id.command_one).setVisibility(this.f9577f ? 0 : 8);
        View findViewById = findViewById(C1704R.C1706id.command_two);
        if (!this.f9577f) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f9579h != null) {
            this.f9579h.mo29725a();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
