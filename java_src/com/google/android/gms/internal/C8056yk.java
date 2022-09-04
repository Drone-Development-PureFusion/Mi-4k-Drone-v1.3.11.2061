package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.fimi.kernel.C1576a;
import com.google.android.gms.C3424R;
import com.google.android.gms.ads.internal.C3779u;
import java.util.Map;
import org.p286a.p287a.C11086e;
@aaa
/* renamed from: com.google.android.gms.internal.yk */
/* loaded from: classes.dex */
public class C8056yk extends C8063yn {

    /* renamed from: a */
    private final Map<String, String> f26397a;

    /* renamed from: b */
    private final Context f26398b;

    public C8056yk(acy acyVar, Map<String, String> map) {
        super(acyVar, "storePicture");
        this.f26397a = map;
        this.f26398b = acyVar.mo18090f();
    }

    /* renamed from: a */
    DownloadManager.Request m12908a(String str, String str2) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        C3779u.m26888g().mo18300a(request);
        return request;
    }

    /* renamed from: a */
    String m12909a(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    /* renamed from: a */
    public void m12911a() {
        if (this.f26398b == null) {
            b("Activity context is not available");
        } else if (!C3779u.m26890e().m18319e(this.f26398b).m13500c()) {
            b("Feature is not supported by the device.");
        } else {
            final String str = this.f26397a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                b("Image url cannot be empty.");
            } else if (!URLUtil.isValidUrl(str)) {
                String valueOf = String.valueOf(str);
                b(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
            } else {
                final String m12909a = m12909a(str);
                if (!C3779u.m26890e().m18325c(m12909a)) {
                    String valueOf2 = String.valueOf(m12909a);
                    b(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                    return;
                }
                Resources m18430q = C3779u.m26886i().m18430q();
                AlertDialog.Builder m18322d = C3779u.m26890e().m18322d(this.f26398b);
                m18322d.setTitle(m18430q != null ? m18430q.getString(C3424R.C3427string.store_picture_title) : "Save image");
                m18322d.setMessage(m18430q != null ? m18430q.getString(C3424R.C3427string.store_picture_message) : "Allow Ad to store image in Picture gallery?");
                m18322d.setPositiveButton(m18430q != null ? m18430q.getString(C3424R.C3427string.accept) : C11086e.f35705a, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.yk.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        try {
                            ((DownloadManager) C8056yk.this.f26398b.getSystemService(C1576a.f3871a)).enqueue(C8056yk.this.m12908a(str, m12909a));
                        } catch (IllegalStateException e) {
                            C8056yk.this.b("Could not store picture.");
                        }
                    }
                });
                m18322d.setNegativeButton(m18430q != null ? m18430q.getString(C3424R.C3427string.decline) : "Decline", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.yk.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C8056yk.this.b("User canceled the download.");
                    }
                });
                m18322d.create().show();
            }
        }
    }
}
