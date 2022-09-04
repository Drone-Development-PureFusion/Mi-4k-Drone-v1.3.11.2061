package com.fimi.soul.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.utils.C1675p;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.biz.p188p.C2024a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.utils.C3103au;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.view.i */
/* loaded from: classes2.dex */
public class DialogC3275i extends Dialog {

    /* renamed from: com.fimi.soul.view.i$a */
    /* loaded from: classes2.dex */
    public static class C3276a implements AbstractC1625d, C2104d.AbstractC2106b {

        /* renamed from: a */
        DialogC3275i f12756a;

        /* renamed from: b */
        private Context f12757b;

        /* renamed from: c */
        private String f12758c;

        /* renamed from: d */
        private String f12759d;

        /* renamed from: e */
        private DialogInterface.OnClickListener f12760e;

        /* renamed from: f */
        private DialogInterface.OnClickListener f12761f;

        /* renamed from: g */
        private EditText f12762g;

        /* renamed from: h */
        private EditText f12763h;

        /* renamed from: i */
        private TextView f12764i;

        /* renamed from: j */
        private String f12765j;

        /* renamed from: k */
        private String f12766k;

        /* renamed from: l */
        private C2083a f12767l;

        public C3276a(Context context, C2083a c2083a) {
            this.f12757b = context;
            this.f12767l = c2083a;
            c2083a.mo32908a(this);
            C1772d.m34208a().m34183o().m34939b(this);
        }

        /* renamed from: a */
        public C3276a m28530a(String str, DialogInterface.OnClickListener onClickListener, String str2, DialogInterface.OnClickListener onClickListener2) {
            this.f12758c = str;
            this.f12759d = str2;
            this.f12760e = onClickListener;
            this.f12761f = onClickListener2;
            return this;
        }

        /* renamed from: a */
        public String m28532a() {
            if (this.f12762g != null) {
                return this.f12762g.getText().toString();
            }
            return null;
        }

        @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
        /* renamed from: a */
        public void mo28036a(String str) {
            try {
                if (!str.contains("command")) {
                    return;
                }
                if (!"0".equals(((JSONObject) new JSONObject(str).get("command")).getString("result"))) {
                    if (this.f12756a == null || this.f12764i == null) {
                        return;
                    }
                    this.f12764i.setText(C1704R.C1707string.relay_modify_error);
                } else if (this.f12756a == null || !this.f12756a.isShowing() || this.f12757b == null) {
                } else {
                    this.f12756a.dismiss();
                    if (C1846a.m33917a().m33915b() == 2) {
                        C1688z.m34449a(this.f12757b, (int) C1704R.C1707string.relay_modify_sucess, 3000);
                    }
                    C2024a m33219a = C2024a.m33219a();
                    String m33213c = m33219a.m33213c();
                    String m33212d = m33219a.m33212d();
                    if (m33213c != null) {
                        C1772d.m34208a().m34194e(m33213c);
                    }
                    if (m33212d == null) {
                        return;
                    }
                    C1772d.m34208a().m34196d(m33212d);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public String m28529b() {
            if (this.f12763h != null) {
                return this.f12763h.getText().toString();
            }
            return null;
        }

        /* renamed from: b */
        public void m28527b(String str) {
            if (this.f12764i != null) {
                this.f12764i.setText(str);
            }
        }

        /* renamed from: c */
        public C3276a m28524c(String str) {
            this.f12765j = str;
            return this;
        }

        /* renamed from: c */
        public DialogC3275i m28526c() {
            this.f12756a = new DialogC3275i(this.f12757b, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12757b.getSystemService("layout_inflater")).inflate(C1704R.layout.relay_wifi_dialog, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.wifi_name);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.wifi_password);
            TextView textView3 = (TextView) inflate.findViewById(C1704R.C1706id.dialog_title);
            this.f12762g = (EditText) inflate.findViewById(C1704R.C1706id.ssid_name);
            this.f12762g.clearFocus();
            if (this.f12765j != null) {
                this.f12762g.setText(this.f12765j);
            }
            this.f12763h = (EditText) inflate.findViewById(C1704R.C1706id.key_pas);
            this.f12763h.clearFocus();
            if (this.f12766k != null) {
                this.f12763h.setText(this.f12766k);
            }
            this.f12764i = (TextView) inflate.findViewById(C1704R.C1706id.pas_tip);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            if (this.f12758c != null) {
                button.setText(this.f12758c);
            }
            if (this.f12759d != null) {
                button2.setText(this.f12759d);
            }
            if (this.f12760e != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.i.a.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3276a.this.f12760e.onClick(C3276a.this.f12756a, -2);
                    }
                });
            }
            if (this.f12761f != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.i.a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3276a.this.f12761f.onClick(C3276a.this.f12756a, -1);
                    }
                });
            }
            C3103au.m29232a(this.f12757b.getAssets(), textView3, this.f12762g, this.f12763h, button, button2, this.f12764i, textView, textView2);
            this.f12756a.setContentView(inflate);
            Window window = this.f12756a.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12757b) > ((float) C1675p.m34635a(this.f12757b)) ? C1675p.m34624b(this.f12757b) : C1675p.m34635a(this.f12757b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.f12756a.getWindow().getDecorView().setBackgroundColor(0);
            this.f12756a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.fimi.soul.view.i.a.3
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    if (C3276a.this.f12767l != null) {
                        C3276a.this.f12767l.mo32903b(C3276a.this);
                    }
                }
            });
            return this.f12756a;
        }

        /* renamed from: d */
        public C3276a m28523d(String str) {
            this.f12766k = str;
            return this;
        }

        @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
        public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
            if (enumC2105a != C2104d.EnumC2105a.CLEANALLOBJ || this.f12756a == null || !this.f12756a.isShowing() || c2083a == null) {
                return;
            }
            m28527b(c2083a.f5919d.getString(C1704R.C1707string.connectdefault));
        }
    }

    public DialogC3275i(Context context) {
        super(context);
    }

    public DialogC3275i(Context context, int i) {
        super(context, i);
    }

    public DialogC3275i(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
