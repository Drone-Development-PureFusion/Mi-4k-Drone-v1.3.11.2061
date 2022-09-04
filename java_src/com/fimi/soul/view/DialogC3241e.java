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
import android.widget.RadioButton;
import android.widget.TextView;
import com.fimi.kernel.utils.C1675p;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.JustifyTextView;
/* renamed from: com.fimi.soul.view.e */
/* loaded from: classes2.dex */
public class DialogC3241e extends Dialog {

    /* renamed from: com.fimi.soul.view.e$a */
    /* loaded from: classes2.dex */
    public static class C3242a {

        /* renamed from: a */
        C1681v f12617a;

        /* renamed from: b */
        private Context f12618b;

        /* renamed from: c */
        private String f12619c;

        /* renamed from: d */
        private String f12620d;

        /* renamed from: e */
        private DialogInterface.OnClickListener f12621e;

        /* renamed from: f */
        private C1882h f12622f;

        /* renamed from: g */
        private String f12623g = C2279c.f7227bC;

        /* renamed from: h */
        private String f12624h = C2279c.f7228bD;

        /* renamed from: i */
        private String f12625i = C2279c.f7229bE;

        /* renamed from: j */
        private String f12626j = C2279c.f7230bF;

        /* renamed from: k */
        private boolean f12627k;

        /* renamed from: l */
        private boolean f12628l;

        public C3242a(Context context) {
            this.f12618b = context;
            this.f12622f = C1882h.m33763a(context);
        }

        /* renamed from: a */
        public C3242a m28658a(DialogInterface.OnClickListener onClickListener) {
            this.f12621e = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3242a m28655a(String str) {
            this.f12619c = str;
            return this;
        }

        /* renamed from: a */
        public C3242a m28654a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12621e = onClickListener;
            this.f12620d = str;
            return this;
        }

        /* renamed from: a */
        public C3242a m28653a(boolean z) {
            this.f12627k = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3241e m28659a() {
            this.f12617a = C1681v.m34543a(this.f12618b);
            this.f12623g = C2279c.f7227bC;
            this.f12625i = C2279c.f7229bE;
            this.f12624h = C2279c.f7228bD;
            this.f12626j = C2279c.f7230bF;
            final DialogC3241e dialogC3241e = new DialogC3241e(this.f12618b, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12618b.getSystemService("layout_inflater")).inflate(C1704R.layout.flyactiontipdialog, (ViewGroup) null);
            JustifyTextView justifyTextView = (JustifyTextView) inflate.findViewById(C1704R.C1706id.action_tip);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.title);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.single_btn);
            final RadioButton radioButton = (RadioButton) inflate.findViewById(C1704R.C1706id.remeber_tip);
            if (!this.f12627k) {
                radioButton.setVisibility(8);
            } else {
                radioButton.setVisibility(0);
            }
            DialogC3241e.m28660a(radioButton, 127);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.e.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (!C3242a.this.f12628l) {
                        radioButton.setChecked(true);
                        C3242a.this.f12628l = true;
                        if (C3242a.this.f12622f.m33765a().get() == 1) {
                            C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12623g, true).commit();
                            return;
                        } else if (C3242a.this.f12622f.m33765a().get() == 2) {
                            C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12624h, true).commit();
                            return;
                        } else if (C3242a.this.f12622f.m33765a().get() == 3) {
                            C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12625i, true).commit();
                            return;
                        } else if (C3242a.this.f12622f.m33765a().get() != 4) {
                            return;
                        } else {
                            C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12626j, true).commit();
                            return;
                        }
                    }
                    radioButton.setChecked(false);
                    C3242a.this.f12628l = false;
                    if (C3242a.this.f12622f.m33765a().get() == 1) {
                        C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12623g, false).commit();
                    } else if (C3242a.this.f12622f.m33765a().get() == 2) {
                        C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12624h, false).commit();
                    } else if (C3242a.this.f12622f.m33765a().get() == 3) {
                        C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12625i, false).commit();
                    } else if (C3242a.this.f12622f.m33765a().get() != 4) {
                    } else {
                        C3242a.this.f12617a.m34546a().edit().putBoolean(C3242a.this.f12626j, false).commit();
                    }
                }
            });
            if (this.f12620d != null) {
                button.setText(this.f12620d);
            }
            if (this.f12619c != null) {
                justifyTextView.setText(this.f12619c);
            }
            if (this.f12621e != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.e.a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3241e.dismiss();
                        C3242a.this.f12621e.onClick(dialogC3241e, -2);
                    }
                });
            }
            C3103au.m29232a(this.f12618b.getAssets(), justifyTextView, button, radioButton, textView);
            dialogC3241e.setContentView(inflate);
            Window window = dialogC3241e.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12618b) > ((float) C1675p.m34635a(this.f12618b)) ? C1675p.m34624b(this.f12618b) : C1675p.m34635a(this.f12618b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            dialogC3241e.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3241e;
        }

        /* renamed from: b */
        public C3242a m28651b(String str) {
            this.f12620d = str;
            return this;
        }
    }

    public DialogC3241e(Context context) {
        super(context);
    }

    public DialogC3241e(Context context, int i) {
        super(context, i);
    }

    public DialogC3241e(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    /* renamed from: a */
    public static void m28660a(RadioButton radioButton, int i) {
        radioButton.setTextColor(radioButton.getTextColors().withAlpha(i));
    }
}
