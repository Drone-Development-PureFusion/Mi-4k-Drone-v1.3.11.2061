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
import android.widget.CheckBox;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.view.c */
/* loaded from: classes2.dex */
public class DialogC3221c extends Dialog {

    /* renamed from: com.fimi.soul.view.c$a */
    /* loaded from: classes2.dex */
    public static class C3222a {

        /* renamed from: a */
        private Context f12494a;

        /* renamed from: b */
        private String f12495b;

        /* renamed from: c */
        private String f12496c;

        /* renamed from: d */
        private String f12497d;

        /* renamed from: e */
        private String f12498e;

        /* renamed from: f */
        private String f12499f;

        /* renamed from: j */
        private DialogInterface.OnClickListener f12503j;

        /* renamed from: k */
        private DialogInterface.OnClickListener f12504k;

        /* renamed from: g */
        private int f12500g = -1;

        /* renamed from: h */
        private int f12501h = -1;

        /* renamed from: i */
        private int f12502i = -1;

        /* renamed from: l */
        private boolean f12505l = true;

        public C3222a(Context context) {
            this.f12494a = context;
        }

        /* renamed from: a */
        public C3222a m28738a(int i) {
            this.f12500g = i;
            return this;
        }

        /* renamed from: a */
        public C3222a m28736a(String str) {
            this.f12495b = str;
            return this;
        }

        /* renamed from: a */
        public C3222a m28735a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12497d = str;
            this.f12503j = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3222a m28734a(boolean z) {
            this.f12505l = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3221c m28739a() {
            final DialogC3221c dialogC3221c = new DialogC3221c(this.f12494a, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12494a.getSystemService("layout_inflater")).inflate(C1704R.layout.dialog_double_button, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.content_tv);
            C3103au.m29232a(this.f12494a.getAssets(), button2, button, textView, textView2);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-872415232);
            if (this.f12497d != null) {
                button2.setText(this.f12497d);
            }
            if (this.f12498e != null) {
                button.setText(this.f12498e);
            }
            if (this.f12496c != null) {
                textView.setText(this.f12496c);
            }
            if (this.f12500g != -1) {
                button2.setTextColor(this.f12500g);
            }
            if (this.f12501h != -1) {
                button.setTextColor(this.f12501h);
            }
            if (this.f12499f != null) {
                textView2.setVisibility(0);
                textView2.setText(this.f12499f);
            } else {
                textView2.setVisibility(8);
            }
            if (this.f12502i != -1) {
                textView.setMaxEms(this.f12502i);
            }
            if (this.f12503j != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.a.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3222a.this.f12503j.onClick(dialogC3221c, -1);
                        dialogC3221c.dismiss();
                    }
                });
            }
            if (this.f12504k != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3222a.this.f12504k.onClick(dialogC3221c, -2);
                        dialogC3221c.dismiss();
                    }
                });
            }
            if (this.f12505l) {
                dialogC3221c.setCanceledOnTouchOutside(true);
            } else {
                dialogC3221c.setCanceledOnTouchOutside(false);
            }
            dialogC3221c.setContentView(inflate);
            Window window = dialogC3221c.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) this.f12494a.getResources().getDimension(C1704R.dimen.double_dialog_width);
            window.setAttributes(attributes);
            dialogC3221c.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3221c;
        }

        /* renamed from: b */
        public C3222a m28733b(int i) {
            this.f12501h = i;
            return this;
        }

        /* renamed from: b */
        public C3222a m28731b(String str) {
            this.f12496c = str;
            return this;
        }

        /* renamed from: b */
        public C3222a m28730b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12498e = str;
            this.f12504k = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C3222a m28729c(int i) {
            this.f12502i = i;
            return this;
        }

        /* renamed from: c */
        public C3222a m28728c(String str) {
            this.f12499f = str;
            return this;
        }
    }

    /* renamed from: com.fimi.soul.view.c$b */
    /* loaded from: classes2.dex */
    public static class C3225b {

        /* renamed from: a */
        private Context f12510a;

        /* renamed from: b */
        private String f12511b;

        /* renamed from: c */
        private String f12512c;

        /* renamed from: d */
        private String f12513d;

        /* renamed from: e */
        private String f12514e;

        /* renamed from: h */
        private boolean f12517h;

        /* renamed from: i */
        private DialogInterface.OnClickListener f12518i;

        /* renamed from: j */
        private DialogInterface.OnClickListener f12519j;

        /* renamed from: f */
        private int f12515f = -1;

        /* renamed from: g */
        private int f12516g = -1;

        /* renamed from: k */
        private boolean f12520k = false;

        public C3225b(Context context) {
            this.f12510a = context;
        }

        /* renamed from: a */
        public C3225b m28726a(int i) {
            this.f12515f = i;
            return this;
        }

        /* renamed from: a */
        public C3225b m28724a(String str) {
            this.f12511b = str;
            return this;
        }

        /* renamed from: a */
        public C3225b m28723a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12512c = str;
            this.f12518i = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3225b m28722a(boolean z) {
            this.f12517h = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3221c m28727a() {
            final DialogC3221c dialogC3221c = new DialogC3221c(this.f12510a, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12510a.getSystemService("layout_inflater")).inflate(C1704R.layout.dialog_double_checkbox_button, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.check_tv);
            textView.setText(this.f12514e);
            CheckBox checkBox = (CheckBox) inflate.findViewById(C1704R.C1706id.checkbox);
            checkBox.setChecked(this.f12517h);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            if (this.f12511b != null) {
                textView2.setText(this.f12511b);
            }
            if (this.f12513d != null) {
                button.setText(this.f12513d);
            }
            if (this.f12512c != null) {
                button2.setText(this.f12512c);
            }
            if (this.f12514e != null) {
                textView.setText(this.f12514e);
            }
            if (this.f12517h) {
                checkBox.setChecked(this.f12517h);
            } else {
                checkBox.setChecked(this.f12517h);
            }
            C3103au.m29232a(this.f12510a.getAssets(), button2, button, textView, textView2);
            textView2.setTextColor(-872415232);
            textView2.getPaint().setFakeBoldText(true);
            if (this.f12518i != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.b.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3225b.this.f12518i.onClick(dialogC3221c, -1);
                    }
                });
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.b.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3225b.this.f12519j.onClick(dialogC3221c, -2);
                    }
                });
            }
            dialogC3221c.setContentView(inflate);
            Window window = dialogC3221c.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) this.f12510a.getResources().getDimension(C1704R.dimen.double_choose_dialog_width);
            window.setAttributes(attributes);
            dialogC3221c.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3221c;
        }

        /* renamed from: b */
        public C3225b m28721b(int i) {
            this.f12516g = i;
            return this;
        }

        /* renamed from: b */
        public C3225b m28719b(String str) {
            this.f12514e = str;
            return this;
        }

        /* renamed from: b */
        public C3225b m28718b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12513d = str;
            this.f12519j = onClickListener;
            return this;
        }
    }

    /* renamed from: com.fimi.soul.view.c$c */
    /* loaded from: classes2.dex */
    public static class C3228c {

        /* renamed from: a */
        private Context f12525a;

        /* renamed from: b */
        private String f12526b;

        /* renamed from: c */
        private String f12527c;

        /* renamed from: d */
        private String f12528d;

        /* renamed from: e */
        private String f12529e;

        /* renamed from: f */
        private String f12530f;

        /* renamed from: j */
        private DialogInterface.OnClickListener f12534j;

        /* renamed from: k */
        private DialogInterface.OnClickListener f12535k;

        /* renamed from: g */
        private int f12531g = -1;

        /* renamed from: h */
        private int f12532h = -1;

        /* renamed from: i */
        private int f12533i = -1;

        /* renamed from: l */
        private boolean f12536l = true;

        public C3228c(Context context) {
            this.f12525a = context;
        }

        /* renamed from: a */
        public C3228c m28716a(int i) {
            this.f12531g = i;
            return this;
        }

        /* renamed from: a */
        public C3228c m28714a(String str) {
            this.f12526b = str;
            return this;
        }

        /* renamed from: a */
        public C3228c m28713a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12528d = str;
            this.f12534j = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3228c m28712a(boolean z) {
            this.f12536l = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3221c m28717a() {
            final DialogC3221c dialogC3221c = new DialogC3221c(this.f12525a, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12525a.getSystemService("layout_inflater")).inflate(C1704R.layout.dialog_double_button_insurance, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.content_tv);
            C3103au.m29232a(this.f12525a.getAssets(), button2, button, textView, textView2);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-872415232);
            if (this.f12528d != null) {
                button2.setText(this.f12528d);
            }
            if (this.f12529e != null) {
                button.setText(this.f12529e);
            }
            if (this.f12526b != null) {
                textView.setText(this.f12526b);
            }
            if (this.f12527c != null) {
                textView2.setText(this.f12527c);
            }
            if (this.f12531g != -1) {
                button2.setTextColor(this.f12531g);
            }
            if (this.f12532h != -1) {
                button.setTextColor(this.f12532h);
            }
            if (this.f12533i != -1) {
                textView.setMaxEms(this.f12533i);
            }
            if (this.f12534j != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.c.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3228c.this.f12534j.onClick(dialogC3221c, -1);
                        dialogC3221c.dismiss();
                    }
                });
            }
            if (this.f12535k != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.c.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3228c.this.f12535k.onClick(dialogC3221c, -2);
                        dialogC3221c.dismiss();
                    }
                });
            }
            if (this.f12536l) {
                dialogC3221c.setCanceledOnTouchOutside(true);
            } else {
                dialogC3221c.setCanceledOnTouchOutside(false);
            }
            dialogC3221c.setContentView(inflate);
            Window window = dialogC3221c.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) this.f12525a.getResources().getDimension(C1704R.dimen.double_dialog_width);
            window.setAttributes(attributes);
            dialogC3221c.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3221c;
        }

        /* renamed from: b */
        public C3228c m28711b(int i) {
            this.f12532h = i;
            return this;
        }

        /* renamed from: b */
        public C3228c m28709b(String str) {
            this.f12527c = str;
            return this;
        }

        /* renamed from: b */
        public C3228c m28708b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12529e = str;
            this.f12535k = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C3228c m28707c(int i) {
            this.f12533i = i;
            return this;
        }

        /* renamed from: c */
        public C3228c m28706c(String str) {
            this.f12530f = str;
            return this;
        }
    }

    /* renamed from: com.fimi.soul.view.c$d */
    /* loaded from: classes2.dex */
    public static class C3231d {

        /* renamed from: a */
        private Context f12541a;

        /* renamed from: b */
        private String f12542b;

        /* renamed from: c */
        private String f12543c;

        /* renamed from: d */
        private String f12544d;

        /* renamed from: g */
        private DialogInterface.OnClickListener f12547g;

        /* renamed from: e */
        private int f12545e = -1;

        /* renamed from: f */
        private int f12546f = -1;

        /* renamed from: h */
        private boolean f12548h = false;

        public C3231d(Context context) {
            this.f12541a = context;
        }

        /* renamed from: a */
        public C3231d m28704a(int i) {
            this.f12546f = i;
            return this;
        }

        /* renamed from: a */
        public C3231d m28703a(Context context) {
            this.f12541a = context;
            return this;
        }

        /* renamed from: a */
        public C3231d m28701a(String str) {
            this.f12542b = str;
            return this;
        }

        /* renamed from: a */
        public C3231d m28700a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12544d = str;
            this.f12547g = onClickListener;
            return this;
        }

        /* renamed from: a */
        public DialogC3221c m28705a() {
            final DialogC3221c dialogC3221c = new DialogC3221c(this.f12541a, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12541a.getSystemService("layout_inflater")).inflate(C1704R.layout.dialog_pop, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_child_tv);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.dialog_btn);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            if (this.f12542b != null) {
                textView2.setText(this.f12542b);
            }
            if (this.f12544d != null) {
                button.setText(this.f12544d);
            }
            if (this.f12546f != -1) {
                textView2.setMaxEms(this.f12546f);
            }
            if (this.f12543c != null) {
                textView.setVisibility(0);
                textView.setText(this.f12543c);
            } else {
                textView.setVisibility(8);
            }
            if (this.f12547g != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.c.d.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3231d.this.f12547g.onClick(dialogC3221c, -1);
                        dialogC3221c.dismiss();
                    }
                });
            }
            C3103au.m29232a(this.f12541a.getAssets(), textView2, button, textView);
            textView2.getPaint().setFakeBoldText(true);
            if (this.f12543c != null) {
                textView.getPaint().setFakeBoldText(true);
            }
            dialogC3221c.setContentView(inflate);
            Window window = dialogC3221c.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = (int) this.f12541a.getResources().getDimension(C1704R.dimen.single_dialog_height);
            attributes.width = (int) this.f12541a.getResources().getDimension(C1704R.dimen.single_dialog_width);
            window.setAttributes(attributes);
            dialogC3221c.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3221c;
        }

        /* renamed from: b */
        public C3231d m28699b(String str) {
            this.f12543c = str;
            return this;
        }
    }

    public DialogC3221c(Context context) {
        super(context);
        requestWindowFeature(1);
    }

    public DialogC3221c(Context context, int i) {
        super(context, i);
        requestWindowFeature(1);
    }
}
