package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.C3424R;
/* loaded from: classes2.dex */
public class apl {

    /* renamed from: a */
    private final Context f22720a;

    /* renamed from: b */
    private final Context f22721b;

    /* renamed from: c */
    private final Intent f22722c;

    /* renamed from: d */
    private final apx f22723d;

    public apl(Intent intent, Context context, Context context2, apx apxVar) {
        this.f22720a = context;
        this.f22721b = context2;
        this.f22722c = intent;
        this.f22723d = apxVar;
    }

    /* renamed from: a */
    private void m16355a(String str, String str2, String str3) {
        AlertDialog create = new AlertDialog.Builder(this.f22720a).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton(-1, str3, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.apl.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String packageName = apl.this.f22720a.getPackageName();
                Intent launchIntentForPackage = apl.this.f22720a.getPackageManager().getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    String valueOf = String.valueOf(packageName);
                    aph.m16394b(valueOf.length() != 0 ? "No launch activity found for package name: ".concat(valueOf) : new String("No launch activity found for package name: "));
                    return;
                }
                String valueOf2 = String.valueOf(packageName);
                aph.m16392c(valueOf2.length() != 0 ? "Invoke the launch activity for package name: ".concat(valueOf2) : new String("Invoke the launch activity for package name: "));
                apl.this.f22720a.startActivity(launchIntentForPackage);
            }
        });
        create.show();
    }

    /* renamed from: a */
    public void m16357a() {
        try {
            this.f22723d.m16275a(this.f22722c.getData());
            m16355a(this.f22721b.getResources().getString(C3424R.C3427string.tagmanager_preview_dialog_title), this.f22721b.getResources().getString(C3424R.C3427string.tagmanager_preview_dialog_message), this.f22721b.getResources().getString(C3424R.C3427string.tagmanager_preview_dialog_button));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            aph.m16396a(valueOf.length() != 0 ? "Calling preview threw an exception: ".concat(valueOf) : new String("Calling preview threw an exception: "));
        }
    }
}
