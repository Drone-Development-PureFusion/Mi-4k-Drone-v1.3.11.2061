package com.fimi.kernel.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.fimi.kernel.C1572R;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.C1646d;
import com.fimi.kernel.view.dialog.ProgressDialogC1698b;
import java.util.Calendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.fimi.kernel.view.a */
/* loaded from: classes.dex */
public class C1691a implements AbstractC1692b {

    /* renamed from: a */
    private ProgressDialogC1698b f4199a;

    /* renamed from: b */
    private ProgressDialog f4200b;

    /* renamed from: d */
    private Activity m34441d() {
        return C1642c.m34886d();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34440a() {
        mo34431b("");
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34439a(int i) {
        Toast.makeText(m34441d(), m34441d().getResources().getString(i), 0).show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34438a(int i, int i2) {
        if (this.f4200b != null) {
            this.f4200b.setMax(i2);
            this.f4200b.setProgress(i);
        }
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34437a(DatePickerDialog.OnDateSetListener onDateSetListener, Calendar calendar) {
        new DatePickerDialog(m34441d(), onDateSetListener, calendar.get(1), calendar.get(2), calendar.get(5)).show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34436a(TimePickerDialog.OnTimeSetListener onTimeSetListener, Calendar calendar) {
        new TimePickerDialog(m34441d(), onTimeSetListener, calendar.get(11), calendar.get(12), true).show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34435a(String str) {
        Toast.makeText(m34441d(), str, 0).show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: a */
    public void mo34434a(String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(m34441d()).setTitle(mo34428c(C1572R.C1575string.message)).setMessage(str).setPositiveButton(mo34428c(C1572R.C1575string.confirm), onClickListener).show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: b */
    public Dialog mo34433b() {
        if (this.f4200b != null) {
            return this.f4200b;
        }
        if (this.f4199a == null) {
            return null;
        }
        return this.f4199a;
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: b */
    public void mo34432b(int i) {
        if (this.f4200b != null) {
            this.f4200b.setMax(100);
            this.f4200b.setProgress(i);
        }
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: b */
    public void mo34431b(String str) {
        if (m34441d() == null) {
            return;
        }
        this.f4199a = new ProgressDialogC1698b(m34441d());
        this.f4199a.setProgressStyle(0);
        this.f4199a.m34406a(str);
        this.f4199a.setTitle(str);
        this.f4199a.show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: b */
    public void mo34430b(String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(m34441d()).setTitle(mo34428c(C1572R.C1575string.message)).setMessage(str).setPositiveButton(mo34428c(C1572R.C1575string.confirm), onClickListener).setNegativeButton(mo34428c(C1572R.C1575string.cancel), onClickListener).show();
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: c */
    public CharSequence mo34428c(int i) {
        return m34441d().getResources().getText(i);
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: c */
    public void mo34429c() {
        if (this.f4200b != null) {
            this.f4200b.dismiss();
        }
        if (this.f4199a != null) {
            this.f4199a.dismiss();
        }
    }

    @Override // com.fimi.kernel.view.AbstractC1692b
    /* renamed from: c */
    public void mo34427c(String str) {
        this.f4200b = new ProgressDialog(m34441d());
        this.f4200b.setProgressStyle(1);
        this.f4200b.setMessage(str);
        this.f4200b.setMax(C1646d.f4059a);
        this.f4200b.setCancelable(false);
        this.f4200b.show();
    }
}
