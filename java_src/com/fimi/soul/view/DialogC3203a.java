package com.fimi.soul.view;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.C1675p;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.view.a */
/* loaded from: classes2.dex */
public class DialogC3203a extends Dialog {

    /* renamed from: com.fimi.soul.view.a$a */
    /* loaded from: classes2.dex */
    public static class C3204a {

        /* renamed from: a */
        private DialogC3203a f12438a;

        /* renamed from: b */
        private Context f12439b;

        /* renamed from: c */
        private String f12440c;

        /* renamed from: d */
        private String f12441d;

        /* renamed from: e */
        private DialogInterface.OnClickListener f12442e;

        public C3204a(Context context) {
            this.f12439b = context;
            this.f12438a = new DialogC3203a(this.f12439b, C1704R.style.DropDialog1);
        }

        /* renamed from: a */
        public C3204a m28765a(DialogInterface.OnClickListener onClickListener) {
            this.f12442e = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3204a m28763a(String str) {
            this.f12440c = str;
            return this;
        }

        /* renamed from: a */
        public C3204a m28762a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12442e = onClickListener;
            this.f12441d = str;
            return this;
        }

        /* renamed from: a */
        public DialogC3203a m28766a() {
            View inflate = ((LayoutInflater) this.f12439b.getSystemService("layout_inflater")).inflate(C1704R.layout.horizon_single_button_dialog, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.single_btn);
            if (this.f12441d != null) {
                button.setText(this.f12441d);
            }
            if (this.f12440c != null) {
                textView.setText(this.f12440c);
            }
            if (this.f12442e != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.a.a.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3204a.this.f12438a.dismiss();
                        C3204a.this.f12442e.onClick(C3204a.this.f12438a, -2);
                    }
                });
            }
            C3103au.m29232a(this.f12439b.getAssets(), textView, button);
            this.f12438a.setContentView(inflate);
            Window window = this.f12438a.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12439b) > ((float) C1675p.m34635a(this.f12439b)) ? C1675p.m34624b(this.f12439b) : C1675p.m34635a(this.f12439b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.f12438a.getWindow().getDecorView().setBackgroundColor(0);
            return this.f12438a;
        }

        /* renamed from: b */
        public C3204a m28759b(String str) {
            this.f12441d = str;
            return this;
        }

        /* renamed from: b */
        public DialogC3203a m28761b() {
            return this.f12438a;
        }
    }

    /* renamed from: com.fimi.soul.view.a$b */
    /* loaded from: classes2.dex */
    public static class C3206b {

        /* renamed from: a */
        private Context f12444a;

        /* renamed from: b */
        private String f12445b;

        /* renamed from: c */
        private String f12446c;

        /* renamed from: e */
        private DialogInterface.OnClickListener f12448e;

        /* renamed from: f */
        private Button f12449f;

        /* renamed from: g */
        private Button f12450g;

        /* renamed from: h */
        private TextView f12451h;

        /* renamed from: i */
        private ImageView f12452i;

        /* renamed from: d */
        private int f12447d = 0;

        /* renamed from: j */
        private C1846a f12453j = C1846a.m33917a();

        public C3206b(Context context) {
            this.f12444a = context;
        }

        /* renamed from: a */
        public C3206b m28757a(int i) {
            this.f12447d = i;
            return this;
        }

        /* renamed from: a */
        public C3206b m28753a(String str) {
            this.f12445b = str;
            return this;
        }

        /* renamed from: a */
        public C3206b m28752a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12448e = onClickListener;
            this.f12446c = str;
            return this;
        }

        @TargetApi(16)
        /* renamed from: a */
        public DialogC3203a m28758a() {
            final DialogC3203a dialogC3203a = new DialogC3203a(this.f12444a, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12444a.getSystemService("layout_inflater")).inflate(C1704R.layout.connect_type_dialog, (ViewGroup) null);
            this.f12451h = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            this.f12452i = (ImageView) inflate.findViewById(C1704R.C1706id.imageview);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.single_btn);
            this.f12449f = (Button) inflate.findViewById(C1704R.C1706id.usb_type);
            this.f12449f.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.a.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C3206b.this.m28755a(C3206b.this.f12450g, 102, C1704R.color.black);
                    C3206b.this.m28756a(C3206b.this.f12450g, C1704R.C1705drawable.connect_type_wifi_bg);
                    C3206b.this.m28755a(C3206b.this.f12449f, 255, C1704R.color.dronehomeline);
                    C3206b.this.m28756a(C3206b.this.f12449f, C1704R.C1705drawable.connect_type_usb_on_bg);
                    C3206b.this.f12451h.setText(C1704R.C1707string.usb_network_share);
                    C3206b.this.f12452i.setImageResource(C1704R.C1705drawable.bg_dialog_usb_android_en);
                    C3206b.this.f12453j.m33916a(1);
                }
            });
            this.f12450g = (Button) inflate.findViewById(C1704R.C1706id.wifi_type);
            this.f12450g.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.a.b.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C3206b.this.m28755a(C3206b.this.f12449f, 102, C1704R.color.black);
                    C3206b.this.m28756a(C3206b.this.f12449f, C1704R.C1705drawable.connect_type_usb_bg);
                    C3206b.this.m28755a(C3206b.this.f12450g, 255, C1704R.color.dronehomeline);
                    C3206b.this.m28756a(C3206b.this.f12450g, C1704R.C1705drawable.connect_type_wifi_on_bg);
                    C3206b.this.f12451h.setText(C1704R.C1707string.usb_wifi_network_share);
                    C3206b.this.f12452i.setImageResource(C1704R.C1705drawable.bg_dialog_usb_android_wifi_en);
                    C3206b.this.f12453j.m33916a(2);
                }
            });
            if (this.f12453j.m33915b() == 1) {
                m28755a(this.f12449f, 255, C1704R.color.dronehomeline);
                m28756a(this.f12449f, C1704R.C1705drawable.connect_type_usb_on_bg);
                m28755a(this.f12450g, 102, C1704R.color.black);
                m28756a(this.f12450g, C1704R.C1705drawable.connect_type_wifi_bg);
                this.f12451h.setText(C1704R.C1707string.usb_network_share);
                this.f12452i.setImageResource(C1704R.C1705drawable.bg_dialog_usb_android_en);
            } else {
                m28755a(this.f12450g, 255, C1704R.color.dronehomeline);
                m28756a(this.f12450g, C1704R.C1705drawable.connect_type_wifi_on_bg);
                m28755a(this.f12449f, 102, C1704R.color.black);
                m28756a(this.f12449f, C1704R.C1705drawable.connect_type_usb_bg);
                this.f12451h.setText(C1704R.C1707string.usb_wifi_network_share);
                this.f12452i.setImageResource(C1704R.C1705drawable.bg_dialog_usb_android_wifi_en);
            }
            if (this.f12447d != 0) {
                this.f12452i.setBackground(this.f12444a.getResources().getDrawable(this.f12447d));
            }
            if (this.f12445b != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12445b);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12444a.getResources().getColor(C1704R.color.setting_dialog_force_attitude)), 5, 8, 33);
                this.f12451h.setText(spannableStringBuilder);
            }
            if (this.f12446c != null) {
                button.setText(this.f12446c);
            }
            if (this.f12448e != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.a.b.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3203a.dismiss();
                        C3206b.this.f12448e.onClick(dialogC3203a, -2);
                    }
                });
            }
            C3103au.m29232a(this.f12444a.getAssets(), this.f12451h, button, this.f12449f, this.f12450g);
            dialogC3203a.setContentView(inflate);
            Window window = dialogC3203a.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12444a) > ((float) C1675p.m34635a(this.f12444a)) ? C1675p.m34624b(this.f12444a) : C1675p.m34635a(this.f12444a)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            dialogC3203a.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3203a;
        }

        /* renamed from: a */
        public void m28756a(Button button, int i) {
            if (button != null) {
                button.setBackgroundResource(i);
            }
        }

        /* renamed from: a */
        public void m28755a(Button button, int i, int i2) {
            button.setTextColor(this.f12444a.getResources().getColor(i2));
            button.setTextColor(button.getTextColors().withAlpha(i));
        }

        /* renamed from: b */
        public C3206b m28750b(String str) {
            this.f12446c = str;
            return this;
        }
    }

    public DialogC3203a(Context context) {
        super(context);
    }

    public DialogC3203a(Context context, int i) {
        super(context, i);
    }

    public DialogC3203a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
