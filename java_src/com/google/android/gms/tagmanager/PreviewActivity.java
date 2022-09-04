package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes2.dex */
public class PreviewActivity extends Activity {
    /* renamed from: a */
    private void m9354a(String str, String str2, String str3) {
        AlertDialog create = new AlertDialog.Builder(this).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton(-1, str3, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.tagmanager.PreviewActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        create.show();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            C9065aw.m9297c("Preview activity");
            Uri data = getIntent().getData();
            if (!C9203f.m8943a(this).m8942a(data)) {
                String valueOf = String.valueOf(data);
                String sb = new StringBuilder(String.valueOf(valueOf).length() + 73).append("Cannot preview the app with the uri: ").append(valueOf).append(". Launching current version instead.").toString();
                C9065aw.m9299b(sb);
                m9354a("Preview failure", sb, "Continue");
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage == null) {
                String valueOf2 = String.valueOf(getPackageName());
                C9065aw.m9297c(valueOf2.length() != 0 ? "No launch activity found for package name: ".concat(valueOf2) : new String("No launch activity found for package name: "));
                return;
            }
            String valueOf3 = String.valueOf(getPackageName());
            C9065aw.m9297c(valueOf3.length() != 0 ? "Invoke the launch activity for package name: ".concat(valueOf3) : new String("Invoke the launch activity for package name: "));
            startActivity(launchIntentForPackage);
        } catch (Exception e) {
            String valueOf4 = String.valueOf(e.getMessage());
            C9065aw.m9301a(valueOf4.length() != 0 ? "Calling preview threw an exception: ".concat(valueOf4) : new String("Calling preview threw an exception: "));
        }
    }
}
