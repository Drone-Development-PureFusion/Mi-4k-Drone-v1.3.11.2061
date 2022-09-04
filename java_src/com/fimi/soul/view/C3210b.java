package com.fimi.soul.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.fimi.kernel.view.dialog.AbstractC1697a;
import com.fimi.kernel.view.dialog.AbstractC1699c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.view.b */
/* loaded from: classes.dex */
public class C3210b implements AbstractC1699c {

    /* renamed from: c */
    private AlertDialogC3216b f12458c;

    /* renamed from: d */
    private AlertDialogC3219c f12459d;

    /* renamed from: e */
    private AlertDialogC3213a f12460e;

    /* renamed from: com.fimi.soul.view.b$a */
    /* loaded from: classes2.dex */
    class AlertDialogC3213a extends AlertDialog {

        /* renamed from: a */
        Context f12465a;

        /* renamed from: b */
        String f12466b;

        /* renamed from: c */
        AbstractC1697a f12467c;

        /* renamed from: d */
        int f12468d;

        /* renamed from: e */
        String f12469e;

        /* renamed from: f */
        String f12470f;

        /* renamed from: g */
        Boolean f12471g;

        /* renamed from: h */
        String f12472h;

        protected AlertDialogC3213a(Context context, String str, String str2, String str3, Boolean bool, String str4, AbstractC1697a abstractC1697a) {
            super(context);
            this.f12465a = context;
            this.f12466b = str;
            this.f12467c = abstractC1697a;
            this.f12469e = str2;
            this.f12470f = str3;
            this.f12471g = bool;
            this.f12472h = str4;
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(C1704R.layout.dialog_double_checkbox_button);
            Button button = (Button) findViewById(C1704R.C1706id.left_btn);
            Button button2 = (Button) findViewById(C1704R.C1706id.right_btn);
            TextView textView = (TextView) findViewById(C1704R.C1706id.check_tv);
            textView.setText(this.f12472h);
            final CheckBox checkBox = (CheckBox) findViewById(C1704R.C1706id.checkbox);
            checkBox.setChecked(this.f12471g.booleanValue());
            TextView textView2 = (TextView) findViewById(C1704R.C1706id.msg_tv);
            textView2.setText(this.f12466b);
            button.setText(this.f12469e);
            button2.setText(this.f12470f);
            C3103au.m29232a(this.f12465a.getAssets(), button2, button, textView, textView2);
            textView2.setTextColor(-872415232);
            textView2.getPaint().setFakeBoldText(true);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.b.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AlertDialogC3213a.this.f12467c != null) {
                        AlertDialogC3213a.this.f12467c.mo31688a(-2, Boolean.valueOf(checkBox.isChecked()));
                        AlertDialogC3213a.this.dismiss();
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.b.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AlertDialogC3213a.this.f12467c != null) {
                        AlertDialogC3213a.this.f12467c.mo31688a(-1, Boolean.valueOf(checkBox.isChecked()));
                        AlertDialogC3213a.this.dismiss();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.view.b$b */
    /* loaded from: classes2.dex */
    public class AlertDialogC3216b extends AlertDialog {

        /* renamed from: a */
        Context f12478a;

        /* renamed from: b */
        String f12479b;

        /* renamed from: c */
        String f12480c;

        /* renamed from: d */
        AbstractC1697a f12481d;

        /* renamed from: e */
        int f12482e;

        /* renamed from: f */
        String f12483f;

        /* renamed from: g */
        String f12484g;

        protected AlertDialogC3216b(Context context, String str, String str2, int i, String str3, String str4, AbstractC1697a abstractC1697a) {
            super(context);
            this.f12478a = context;
            this.f12479b = str;
            this.f12480c = str2;
            this.f12481d = abstractC1697a;
            this.f12483f = str3;
            this.f12482e = i;
            this.f12484g = str4;
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(C1704R.layout.dialog_double_button);
            Button button = (Button) findViewById(C1704R.C1706id.left_btn);
            Button button2 = (Button) findViewById(C1704R.C1706id.right_btn);
            TextView textView = (TextView) findViewById(C1704R.C1706id.msg_tv);
            TextView textView2 = (TextView) findViewById(C1704R.C1706id.content_tv);
            if (this.f12480c == null) {
                textView2.setVisibility(8);
            }
            textView2.setText(this.f12480c);
            textView.setText(this.f12479b);
            button2.setTextColor(this.f12482e);
            button.setText(this.f12483f);
            button2.setText(this.f12484g);
            C3103au.m29232a(this.f12478a.getAssets(), button2, button, textView, textView2);
            textView.setTextColor(-872415232);
            textView.getPaint().setFakeBoldText(true);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.b.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AlertDialogC3216b.this.f12481d != null) {
                        AlertDialogC3216b.this.dismiss();
                        AlertDialogC3216b.this.f12481d.mo31689a(-2);
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.b.b.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AlertDialogC3216b.this.f12481d != null) {
                        AlertDialogC3216b.this.dismiss();
                        AlertDialogC3216b.this.f12481d.mo31689a(-1);
                    }
                }
            });
        }
    }

    /* renamed from: com.fimi.soul.view.b$c */
    /* loaded from: classes2.dex */
    class AlertDialogC3219c extends AlertDialog {

        /* renamed from: a */
        Context f12488a;

        /* renamed from: b */
        String f12489b;

        /* renamed from: c */
        String f12490c;

        /* renamed from: d */
        AbstractC1697a f12491d;

        protected AlertDialogC3219c(Context context, String str, String str2, AbstractC1697a abstractC1697a) {
            super(context);
            this.f12488a = context;
            this.f12489b = str;
            this.f12490c = str2;
            this.f12491d = abstractC1697a;
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(C1704R.layout.dialog_pop);
            TextView textView = (TextView) findViewById(C1704R.C1706id.msg_child_tv);
            Button button = (Button) findViewById(C1704R.C1706id.dialog_btn);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.b.c.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AlertDialogC3219c.this.dismiss();
                    AlertDialogC3219c.this.f12491d.mo31689a(-1);
                }
            });
            TextView textView2 = (TextView) findViewById(C1704R.C1706id.msg_tv);
            textView2.setText(this.f12489b);
            textView.setText(this.f12490c);
            C3103au.m29232a(this.f12488a.getAssets(), textView2, button, textView);
            textView2.setTextColor(-872415232);
            textView2.getPaint().setFakeBoldText(true);
            textView.getPaint().setFakeBoldText(true);
        }
    }

    @Override // com.fimi.kernel.view.dialog.AbstractC1699c
    /* renamed from: a */
    public Dialog mo28745a(Context context, int i, String str, String str2, AbstractC1697a abstractC1697a) {
        return mo28742a(context, str, str2, abstractC1697a);
    }

    @Override // com.fimi.kernel.view.dialog.AbstractC1699c
    /* renamed from: a */
    public Dialog mo28744a(Context context, String str, int i, String str2, String str3, AbstractC1697a abstractC1697a) {
        return m28743a(context, str, (String) null, i, str2, str3, abstractC1697a);
    }

    /* renamed from: a */
    public Dialog m28743a(Context context, String str, String str2, int i, String str3, String str4, AbstractC1697a abstractC1697a) {
        if (this.f12458c == null) {
            this.f12458c = new AlertDialogC3216b(context, str, str2, i, str3, str4, abstractC1697a);
        }
        if (!this.f12458c.isShowing()) {
            this.f12458c.show();
        }
        return this.f12458c;
    }

    @Override // com.fimi.kernel.view.dialog.AbstractC1699c
    /* renamed from: a */
    public Dialog mo28742a(Context context, String str, String str2, final AbstractC1697a abstractC1697a) {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(context.getString(C1704R.C1707string.confirm), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.view.b.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (abstractC1697a != null) {
                    abstractC1697a.mo31689a(-1);
                }
            }
        });
        if (abstractC1697a != null) {
            negativeButton.setPositiveButton(context.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.view.b.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (abstractC1697a != null) {
                        abstractC1697a.mo31689a(-2);
                    }
                }
            });
        }
        return negativeButton.show();
    }

    @Override // com.fimi.kernel.view.dialog.AbstractC1699c
    /* renamed from: a */
    public Dialog mo28741a(Context context, String str, String str2, String str3, Boolean bool, String str4, AbstractC1697a abstractC1697a) {
        if (this.f12460e == null) {
            this.f12460e = new AlertDialogC3213a(context, str, str2, str3, bool, str4, abstractC1697a);
        }
        if (!this.f12460e.isShowing()) {
            this.f12460e.show();
        }
        return this.f12460e;
    }

    @Override // com.fimi.kernel.view.dialog.AbstractC1699c
    /* renamed from: b */
    public Dialog mo28740b(Context context, String str, String str2, AbstractC1697a abstractC1697a) {
        if (this.f12459d == null) {
            this.f12459d = new AlertDialogC3219c(context, str, str2, abstractC1697a);
        }
        if (!this.f12459d.isShowing()) {
            this.f12459d.show();
        }
        return this.f12459d;
    }
}
