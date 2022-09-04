package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.C3424R;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.firebase.p251a.C9654a;
import java.util.Map;
import org.p286a.p287a.C11086e;
@aaa
/* renamed from: com.google.android.gms.internal.yh */
/* loaded from: classes.dex */
public class C8050yh extends C8063yn {

    /* renamed from: a */
    private final Map<String, String> f26365a;

    /* renamed from: b */
    private final Context f26366b;

    /* renamed from: c */
    private String f26367c;

    /* renamed from: d */
    private long f26368d;

    /* renamed from: e */
    private long f26369e;

    /* renamed from: f */
    private String f26370f;

    /* renamed from: g */
    private String f26371g;

    public C8050yh(acy acyVar, Map<String, String> map) {
        super(acyVar, "createCalendarEvent");
        this.f26365a = map;
        this.f26366b = acyVar.mo18090f();
        m12925c();
    }

    /* renamed from: a */
    private String m12927a(String str) {
        return TextUtils.isEmpty(this.f26365a.get(str)) ? "" : this.f26365a.get(str);
    }

    /* renamed from: c */
    private void m12925c() {
        this.f26367c = m12927a("description");
        this.f26370f = m12927a("summary");
        this.f26368d = m12924e("start_ticks");
        this.f26369e = m12924e("end_ticks");
        this.f26371g = m12927a(C9654a.C9656b.f30231p);
    }

    /* renamed from: e */
    private long m12924e(String str) {
        String str2 = this.f26365a.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    /* renamed from: a */
    public void m12929a() {
        if (this.f26366b == null) {
            b("Activity context is not available.");
        } else if (!C3779u.m26890e().m18319e(this.f26366b).m13497f()) {
            b("This feature is not available on the device.");
        } else {
            AlertDialog.Builder m18322d = C3779u.m26890e().m18322d(this.f26366b);
            Resources m18430q = C3779u.m26886i().m18430q();
            m18322d.setTitle(m18430q != null ? m18430q.getString(C3424R.C3427string.create_calendar_title) : "Create calendar event");
            m18322d.setMessage(m18430q != null ? m18430q.getString(C3424R.C3427string.create_calendar_message) : "Allow Ad to create a calendar event?");
            m18322d.setPositiveButton(m18430q != null ? m18430q.getString(C3424R.C3427string.accept) : C11086e.f35705a, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.yh.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C3779u.m26890e().m18377a(C8050yh.this.f26366b, C8050yh.this.m12926b());
                }
            });
            m18322d.setNegativeButton(m18430q != null ? m18430q.getString(C3424R.C3427string.decline) : "Decline", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.yh.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C8050yh.this.b("Operation denied by user.");
                }
            });
            m18322d.create().show();
        }
    }

    @TargetApi(14)
    /* renamed from: b */
    Intent m12926b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f26367c);
        data.putExtra("eventLocation", this.f26371g);
        data.putExtra("description", this.f26370f);
        if (this.f26368d > -1) {
            data.putExtra("beginTime", this.f26368d);
        }
        if (this.f26369e > -1) {
            data.putExtra("endTime", this.f26369e);
        }
        data.setFlags(AbstractC4808e.f17570a_);
        return data;
    }
}
