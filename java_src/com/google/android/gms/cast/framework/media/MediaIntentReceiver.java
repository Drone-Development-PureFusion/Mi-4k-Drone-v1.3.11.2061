package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.AbstractC4279j;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.C4282k;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f16256a = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";

    /* renamed from: b */
    public static final String f16257b = "com.google.android.gms.cast.framework.action.SKIP_NEXT";

    /* renamed from: c */
    public static final String f16258c = "com.google.android.gms.cast.framework.action.SKIP_PREV";

    /* renamed from: d */
    public static final String f16259d = "com.google.android.gms.cast.framework.action.FORWARD";

    /* renamed from: e */
    public static final String f16260e = "com.google.android.gms.cast.framework.action.REWIND";

    /* renamed from: f */
    public static final String f16261f = "com.google.android.gms.cast.framework.action.STOP_CASTING";

    /* renamed from: g */
    public static final String f16262g = "com.google.android.gms.cast.framework.action.DISCONNECT";

    /* renamed from: h */
    public static final String f16263h = "googlecast-extra_skip_step_ms";

    /* renamed from: a */
    private void m24692a(C4253d c4253d) {
        C4298c m24686b = m24686b(c4253d);
        if (m24686b == null) {
            return;
        }
        m24686b.m24516s();
    }

    /* renamed from: a */
    private void m24691a(C4253d c4253d, long j) {
        C4298c m24686b;
        if (j != 0 && (m24686b = m24686b(c4253d)) != null && !m24686b.m24524k() && !m24686b.m24514u()) {
            m24686b.m24578a(m24686b.m24534e() + j);
        }
    }

    /* renamed from: b */
    private C4298c m24686b(C4253d c4253d) {
        if (c4253d == null || !c4253d.o()) {
            return null;
        }
        return c4253d.m24853a();
    }

    /* renamed from: a */
    protected void m24690a(AbstractC4279j abstractC4279j) {
        if (abstractC4279j instanceof C4253d) {
            m24692a((C4253d) abstractC4279j);
        }
    }

    /* renamed from: a */
    protected void m24689a(AbstractC4279j abstractC4279j, long j) {
        if (abstractC4279j instanceof C4253d) {
            m24691a((C4253d) abstractC4279j, j);
        }
    }

    /* renamed from: a */
    protected void m24688a(AbstractC4279j abstractC4279j, Intent intent) {
        KeyEvent keyEvent;
        if (!(abstractC4279j instanceof C4253d) || !intent.hasExtra("android.intent.extra.KEY_EVENT") || (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 85) {
            return;
        }
        m24692a((C4253d) abstractC4279j);
    }

    /* renamed from: a */
    protected void m24687a(String str, Intent intent) {
    }

    /* renamed from: b */
    protected void m24685b(AbstractC4279j abstractC4279j) {
        C4298c m24686b;
        if (!(abstractC4279j instanceof C4253d) || (m24686b = m24686b((C4253d) abstractC4279j)) == null || m24686b.m24514u()) {
            return;
        }
        m24686b.m24532e((JSONObject) null);
    }

    /* renamed from: b */
    protected void m24684b(AbstractC4279j abstractC4279j, long j) {
        if (abstractC4279j instanceof C4253d) {
            m24691a((C4253d) abstractC4279j, -j);
        }
    }

    /* renamed from: c */
    protected void m24683c(AbstractC4279j abstractC4279j) {
        C4298c m24686b;
        if (!(abstractC4279j instanceof C4253d) || (m24686b = m24686b((C4253d) abstractC4279j)) == null || m24686b.m24514u()) {
            return;
        }
        m24686b.m24535d((JSONObject) null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        C4282k m24862b = C4251c.m24868a(context).m24862b();
        char c = 65535;
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(f16260e)) {
                    c = 4;
                    break;
                }
                break;
            case -945151566:
                if (action.equals(f16257b)) {
                    c = 1;
                    break;
                }
                break;
            case -945080078:
                if (action.equals(f16258c)) {
                    c = 2;
                    break;
                }
                break;
            case -668151673:
                if (action.equals(f16261f)) {
                    c = 5;
                    break;
                }
                break;
            case -124479363:
                if (action.equals(f16262g)) {
                    c = 6;
                    break;
                }
                break;
            case 235550565:
                if (action.equals(f16256a)) {
                    c = 0;
                    break;
                }
                break;
            case 1362116196:
                if (action.equals(f16259d)) {
                    c = 3;
                    break;
                }
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m24690a(m24862b.m24720a());
                return;
            case 1:
                m24685b(m24862b.m24720a());
                return;
            case 2:
                m24683c(m24862b.m24720a());
                return;
            case 3:
                m24689a(m24862b.m24720a(), intent.getLongExtra(f16263h, 0L));
                return;
            case 4:
                m24684b(m24862b.m24720a(), intent.getLongExtra(f16263h, 0L));
                return;
            case 5:
                m24862b.m24716a(true);
                return;
            case 6:
                m24862b.m24716a(false);
                return;
            case 7:
                m24688a(m24862b.m24720a(), intent);
                return;
            default:
                m24687a(action, intent);
                return;
        }
    }
}
