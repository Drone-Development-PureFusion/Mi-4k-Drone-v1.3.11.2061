package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.nearby.messages.Strategy;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10405a;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.string.C10432c;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.network.HostManager;
import com.xiaomi.push.log.C10559b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.C10636aw;
import com.xiaomi.push.service.C10666i;
import com.xiaomi.push.service.timers.C10694a;
import com.xiaomi.slim.C10710b;
import com.xiaomi.slim.C10714f;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.AbstractC10720d;
import com.xiaomi.smack.AbstractC10723f;
import com.xiaomi.smack.C10718b;
import com.xiaomi.smack.C10725g;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.packet.C10731a;
import com.xiaomi.smack.packet.C10732b;
import com.xiaomi.smack.packet.C10734c;
import com.xiaomi.smack.packet.C10737f;
import com.xiaomi.smack.util.C10749d;
import com.xiaomi.stats.C10761f;
import com.xiaomi.stats.C10764h;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10777af;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10806e;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.p286a.p321b.C11392f;
/* loaded from: classes.dex */
public class XMPushService extends Service implements AbstractC10720d {

    /* renamed from: c */
    private C10718b f32932c;

    /* renamed from: d */
    private C10628ar f32933d;

    /* renamed from: e */
    private C10589e f32934e;

    /* renamed from: h */
    private C10714f f32936h;

    /* renamed from: i */
    private AbstractC10716a f32937i;

    /* renamed from: j */
    private C10646b f32938j;

    /* renamed from: g */
    private static final int f32930g = Process.myPid();

    /* renamed from: b */
    public static int f32929b = 1;

    /* renamed from: f */
    private long f32935f = 0;

    /* renamed from: k */
    private PacketSync f32939k = null;

    /* renamed from: l */
    private C10666i f32940l = null;

    /* renamed from: m */
    private AbstractC10723f f32941m = new C10645az(this);

    /* renamed from: a */
    final BroadcastReceiver f32931a = new C10653bg(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$a */
    /* loaded from: classes.dex */
    public class C10585a extends AbstractC10592h {

        /* renamed from: b */
        C10615ak.C10617b f32942b;

        public C10585a(C10615ak.C10617b c10617b) {
            super(9);
            this.f32942b = null;
            this.f32942b = c10617b;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            try {
                if (!XMPushService.this.m4457f()) {
                    AbstractC10404b.m5264d("trying bind while the connection is not created, quit!");
                } else {
                    C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(this.f32942b.f33003h, this.f32942b.f32997b);
                    if (m4374b == null) {
                        AbstractC10404b.m5269a("ignore bind because the channel " + this.f32942b.f33003h + " is removed ");
                    } else if (m4374b.f33008m == C10615ak.EnumC10619c.unbind) {
                        m4374b.m4364a(C10615ak.EnumC10619c.binding, 0, 0, null, null);
                        XMPushService.this.f32937i.mo3989a(m4374b);
                        C10764h.m3778a(XMPushService.this, m4374b);
                    } else {
                        AbstractC10404b.m5269a("trying duplicate bind, ingore! " + m4374b.f33008m);
                    }
                }
            } catch (C10730l e) {
                AbstractC10404b.m5267a(e);
                XMPushService.this.m4499a(10, e);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "bind the client. " + this.f32942b.f33003h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$b */
    /* loaded from: classes.dex */
    public static class C10586b extends AbstractC10592h {

        /* renamed from: b */
        private final C10615ak.C10617b f32944b;

        public C10586b(C10615ak.C10617b c10617b) {
            super(12);
            this.f32944b = c10617b;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            this.f32944b.m4364a(C10615ak.EnumC10619c.unbind, 1, 21, null, null);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "bind time out. chid=" + this.f32944b.f33003h;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C10586b)) {
                return false;
            }
            return TextUtils.equals(((C10586b) obj).f32944b.f33003h, this.f32944b.f33003h);
        }

        public int hashCode() {
            return this.f32944b.f33003h.hashCode();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$c */
    /* loaded from: classes.dex */
    class C10587c extends AbstractC10592h {

        /* renamed from: c */
        private C10710b f32946c;

        public C10587c(C10710b c10710b) {
            super(8);
            this.f32946c = null;
            this.f32946c = c10710b;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            XMPushService.this.f32939k.m4508a(this.f32946c);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "receive a message.";
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$d */
    /* loaded from: classes.dex */
    public class C10588d extends AbstractC10592h {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C10588d() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            if (XMPushService.this.m4473b()) {
                XMPushService.this.m4446o();
            } else {
                AbstractC10404b.m5269a("should not connect. quit the job.");
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "do reconnect..";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$e */
    /* loaded from: classes.dex */
    public class C10589e extends BroadcastReceiver {
        C10589e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.m4450k();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$f */
    /* loaded from: classes.dex */
    public class C10590f extends AbstractC10592h {

        /* renamed from: b */
        public int f32949b;

        /* renamed from: c */
        public Exception f32950c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10590f(int i, Exception exc) {
            super(2);
            this.f32949b = i;
            this.f32950c = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            XMPushService.this.m4499a(this.f32949b, this.f32950c);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "disconnect the connection.";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$g */
    /* loaded from: classes.dex */
    public class C10591g extends AbstractC10592h {

        /* renamed from: c */
        private Intent f32953c;

        public C10591g(Intent intent) {
            super(15);
            this.f32953c = null;
            this.f32953c = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            XMPushService.this.m4465c(this.f32953c);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "Handle intent action = " + this.f32953c.getAction();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10592h extends C10666i.AbstractRunnableC10668b {
        public AbstractC10592h(int i) {
            super(i);
        }

        /* renamed from: a */
        public abstract void mo3811a();

        /* renamed from: b */
        public abstract String mo3810b();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33142a != 4 && this.f33142a != 8) {
                AbstractC10404b.m5269a("JOB: " + mo3810b());
            }
            mo3811a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$i */
    /* loaded from: classes.dex */
    class C10593i extends AbstractC10592h {
        public C10593i() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            XMPushService.this.f32940l.m4242b();
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "ask the job queue to quit";
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$j */
    /* loaded from: classes.dex */
    public class BinderC10594j extends Binder {
        public BinderC10594j() {
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$k */
    /* loaded from: classes.dex */
    class C10595k extends AbstractC10592h {

        /* renamed from: c */
        private AbstractC10735d f32957c;

        public C10595k(AbstractC10735d abstractC10735d) {
            super(8);
            this.f32957c = null;
            this.f32957c = abstractC10735d;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            XMPushService.this.f32939k.m4506a(this.f32957c);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "receive a message.";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$l */
    /* loaded from: classes.dex */
    public class C10596l extends AbstractC10592h {

        /* renamed from: b */
        boolean f32958b;

        public C10596l(boolean z) {
            super(4);
            this.f32958b = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            if (XMPushService.this.m4457f()) {
                try {
                    if (!this.f32958b) {
                        C10764h.m3783a();
                    }
                    XMPushService.this.f32937i.mo3933b(this.f32958b);
                } catch (C10730l e) {
                    AbstractC10404b.m5267a(e);
                    XMPushService.this.m4499a(10, e);
                }
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "send ping..";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$m */
    /* loaded from: classes.dex */
    public class C10597m extends AbstractC10592h {

        /* renamed from: b */
        C10615ak.C10617b f32960b;

        public C10597m(C10615ak.C10617b c10617b) {
            super(4);
            this.f32960b = null;
            this.f32960b = c10617b;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            try {
                this.f32960b.m4364a(C10615ak.EnumC10619c.unbind, 1, 16, null, null);
                XMPushService.this.f32937i.mo3984a(this.f32960b.f33003h, this.f32960b.f32997b);
                this.f32960b.m4364a(C10615ak.EnumC10619c.binding, 1, 16, null, null);
                XMPushService.this.f32937i.mo3989a(this.f32960b);
            } catch (C10730l e) {
                AbstractC10404b.m5267a(e);
                XMPushService.this.m4499a(10, e);
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "rebind the client. " + this.f32960b.f33003h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$n */
    /* loaded from: classes.dex */
    public class C10598n extends AbstractC10592h {
        C10598n() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            XMPushService.this.m4499a(11, (Exception) null);
            if (XMPushService.this.m4473b()) {
                XMPushService.this.m4446o();
            }
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "reset the connection.";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.XMPushService$o */
    /* loaded from: classes.dex */
    public class C10599o extends AbstractC10592h {

        /* renamed from: b */
        C10615ak.C10617b f32963b;

        /* renamed from: c */
        int f32964c;

        /* renamed from: d */
        String f32965d;

        /* renamed from: e */
        String f32966e;

        public C10599o(C10615ak.C10617b c10617b, int i, String str, String str2) {
            super(9);
            this.f32963b = null;
            this.f32963b = c10617b;
            this.f32964c = i;
            this.f32965d = str;
            this.f32966e = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: a */
        public void mo3811a() {
            if (this.f32963b.f33008m != C10615ak.EnumC10619c.unbind && XMPushService.this.f32937i != null) {
                try {
                    XMPushService.this.f32937i.mo3984a(this.f32963b.f33003h, this.f32963b.f32997b);
                } catch (C10730l e) {
                    AbstractC10404b.m5267a(e);
                    XMPushService.this.m4499a(10, e);
                }
            }
            this.f32963b.m4364a(C10615ak.EnumC10619c.unbind, this.f32964c, 0, this.f32966e, this.f32965d);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
        /* renamed from: b */
        public String mo3810b() {
            return "unbind the channel. " + this.f32963b.f33003h;
        }
    }

    static {
        HostManager.addReservedHost("app.chat.xiaomi.net", "app.chat.xiaomi.net");
        HostManager.addReservedHost("app.chat.xiaomi.net", "42.62.94.2:443");
        HostManager.addReservedHost("app.chat.xiaomi.net", "114.54.23.2");
        HostManager.addReservedHost("app.chat.xiaomi.net", "111.13.142.2");
        HostManager.addReservedHost("app.chat.xiaomi.net", "111.206.200.2");
    }

    @TargetApi(11)
    /* renamed from: a */
    public static Notification m4496a(Context context) {
        Intent intent = new Intent(context, XMPushService.class);
        if (Build.VERSION.SDK_INT < 11) {
            Notification notification = new Notification();
            notification.setLatestEventInfo(context, "Push Service", "Push Service", PendingIntent.getService(context, 0, intent, 0));
            return notification;
        }
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(context.getApplicationInfo().icon);
        builder.setContentTitle("Push Service");
        builder.setContentText("Push Service");
        builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, 0));
        return builder.getNotification();
    }

    /* renamed from: a */
    private C10734c m4485a(C10734c c10734c, String str) {
        byte[] m4350a = C10627aq.m4350a(str, c10734c.k());
        C10734c c10734c2 = new C10734c();
        c10734c2.n(c10734c.n());
        c10734c2.m(c10734c.m());
        c10734c2.k(c10734c.k());
        c10734c2.l(c10734c.l());
        c10734c2.m3905b(true);
        String m4347a = C10627aq.m4347a(m4350a, C10749d.m3834c(c10734c.mo3862c()));
        C10731a c10731a = new C10731a("s", null, null, null);
        c10731a.m3918b(m4347a);
        c10734c2.a(c10731a);
        return c10734c2;
    }

    /* renamed from: a */
    private AbstractC10735d m4483a(AbstractC10735d abstractC10735d, String str, String str2, boolean z) {
        C10615ak m4383a = C10615ak.m4383a();
        List<String> m4375b = m4383a.m4375b(str);
        if (m4375b.isEmpty()) {
            AbstractC10404b.m5269a("open channel should be called first before sending a packet, pkg=" + str);
        } else {
            abstractC10735d.m3877o(str);
            String m3884l = abstractC10735d.m3884l();
            if (TextUtils.isEmpty(m3884l)) {
                m3884l = m4375b.get(0);
                abstractC10735d.m3883l(m3884l);
            }
            C10615ak.C10617b m4374b = m4383a.m4374b(m3884l, abstractC10735d.m3880n());
            if (!m4457f()) {
                AbstractC10404b.m5269a("drop a packet as the channel is not connected, chid=" + m3884l);
            } else if (m4374b == null || m4374b.f33008m != C10615ak.EnumC10619c.binded) {
                AbstractC10404b.m5269a("drop a packet as the channel is not opened, chid=" + m3884l);
            } else if (TextUtils.equals(str2, m4374b.f33005j)) {
                return (!(abstractC10735d instanceof C10734c) || !z) ? abstractC10735d : m4485a((C10734c) abstractC10735d, m4374b.f33004i);
            } else {
                AbstractC10404b.m5269a("invalid session. " + str2);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m4495a(Intent intent) {
        AbstractC10716a m4453h;
        String stringExtra = intent.getStringExtra(AbstractC10621am.f33050y);
        String stringExtra2 = intent.getStringExtra(AbstractC10621am.f33019B);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        boolean booleanExtra = intent.getBooleanExtra("ext_encrypt", true);
        C10734c c10734c = (C10734c) m4483a((AbstractC10735d) new C10734c(bundleExtra), stringExtra, stringExtra2, false);
        if (c10734c == null) {
            return;
        }
        C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(c10734c.l(), c10734c.n());
        if (booleanExtra && "3".equals(c10734c.l()) && (m4453h = m4453h()) != null && m4453h.mo3993a()) {
            m4464c(new C10629as(this, C10710b.m4032a(c10734c, m4374b.f33004i)));
            return;
        }
        if (booleanExtra) {
            c10734c = m4485a(c10734c, m4374b.f33004i);
        }
        if (c10734c == null) {
            return;
        }
        m4464c(new C10629as(this, c10734c));
    }

    /* renamed from: a */
    private void m4482a(String str, int i) {
        Collection<C10615ak.C10617b> m4372c = C10615ak.m4383a().m4372c(str);
        if (m4372c != null) {
            for (C10615ak.C10617b c10617b : m4372c) {
                if (c10617b != null) {
                    m4494a(new C10599o(c10617b, i, null, null));
                }
            }
        }
        C10615ak.m4383a().m4378a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4478a(String str, byte[] bArr, boolean z) {
        Collection<C10615ak.C10617b> m4372c = C10615ak.m4383a().m4372c("5");
        if (m4372c.isEmpty()) {
            if (!z) {
                return;
            }
            C10690r.m4115b(str, bArr);
        } else if (m4372c.iterator().next().f33008m == C10615ak.EnumC10619c.binded) {
            m4464c(new C10659bm(this, 4, str, bArr));
        } else if (!z) {
        } else {
            C10690r.m4115b(str, bArr);
        }
    }

    /* renamed from: a */
    public static boolean m4498a(int i, String str) {
        if (!TextUtils.equals(str, "Enter") || i != 1) {
            return TextUtils.equals(str, "Leave") && i == 2;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m4481a(String str, Intent intent) {
        C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(str, intent.getStringExtra(AbstractC10621am.f33041p));
        boolean z = false;
        if (m4374b == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(AbstractC10621am.f33019B);
        String stringExtra2 = intent.getStringExtra(AbstractC10621am.f33046u);
        if (!TextUtils.isEmpty(m4374b.f33005j) && !TextUtils.equals(stringExtra, m4374b.f33005j)) {
            AbstractC10404b.m5269a("session changed. old session=" + m4374b.f33005j + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(m4374b.f33004i)) {
            return z;
        }
        AbstractC10404b.m5269a("security changed. chid = " + str + " sechash = " + C10432c.m5179a(stringExtra2));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4479a(String str, String str2, Context context) {
        if (!TextUtils.equals("Leave", str) || TextUtils.equals("Enter", C10662e.m4274a(context).m4264c(str2))) {
            if (C10662e.m4274a(context).m4269a(str2, str) != 0) {
                return true;
            }
            AbstractC10404b.m5269a("update geofence statue failed geo_id:" + str2);
            return false;
        }
        return false;
    }

    /* renamed from: b */
    private C10615ak.C10617b m4468b(String str, Intent intent) {
        C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(str, intent.getStringExtra(AbstractC10621am.f33041p));
        if (m4374b == null) {
            m4374b = new C10615ak.C10617b(this);
        }
        m4374b.f33003h = intent.getStringExtra(AbstractC10621am.f33042q);
        m4374b.f32997b = intent.getStringExtra(AbstractC10621am.f33041p);
        m4374b.f32998c = intent.getStringExtra(AbstractC10621am.f33044s);
        m4374b.f32996a = intent.getStringExtra(AbstractC10621am.f33050y);
        m4374b.f33001f = intent.getStringExtra(AbstractC10621am.f33048w);
        m4374b.f33002g = intent.getStringExtra(AbstractC10621am.f33049x);
        m4374b.f33000e = intent.getBooleanExtra(AbstractC10621am.f33047v, false);
        m4374b.f33004i = intent.getStringExtra(AbstractC10621am.f33046u);
        m4374b.f33005j = intent.getStringExtra(AbstractC10621am.f33019B);
        m4374b.f32999d = intent.getStringExtra(AbstractC10621am.f33045t);
        m4374b.f33006k = this.f32938j;
        m4374b.f33007l = getApplicationContext();
        C10615ak.m4383a().m4379a(m4374b);
        return m4374b;
    }

    /* renamed from: b */
    private void m4471b(Intent intent) {
        AbstractC10716a m4453h;
        int i = 0;
        String stringExtra = intent.getStringExtra(AbstractC10621am.f33050y);
        String stringExtra2 = intent.getStringExtra(AbstractC10621am.f33019B);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        C10734c[] c10734cArr = new C10734c[parcelableArrayExtra.length];
        boolean booleanExtra = intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            c10734cArr[i2] = new C10734c((Bundle) parcelableArrayExtra[i2]);
            c10734cArr[i2] = (C10734c) m4483a((AbstractC10735d) c10734cArr[i2], stringExtra, stringExtra2, false);
            if (c10734cArr[i2] == null) {
                return;
            }
        }
        C10615ak m4383a = C10615ak.m4383a();
        if (!booleanExtra || !"3".equals(c10734cArr[0].l()) || (m4453h = m4453h()) == null || !m4453h.mo3993a()) {
            while (i < c10734cArr.length) {
                c10734cArr[i] = booleanExtra ? m4485a(c10734cArr[i], m4383a.m4374b(c10734cArr[i].l(), c10734cArr[i].n()).f33004i) : c10734cArr[i];
                i++;
            }
            m4464c(new C10600a(this, c10734cArr));
            return;
        }
        C10710b[] c10710bArr = new C10710b[c10734cArr.length];
        while (i < c10734cArr.length) {
            C10734c c10734c = c10734cArr[i];
            c10710bArr[i] = C10710b.m4032a(c10734c, m4383a.m4374b(c10734c.l(), c10734c.n()).f33004i);
            i++;
        }
        m4464c(new C10600a(this, c10710bArr));
    }

    /* renamed from: b */
    private void m4467b(boolean z) {
        this.f32935f = System.currentTimeMillis();
        if (this.f32940l.m4238d()) {
            AbstractC10404b.m5264d("ERROR, the job controller is blocked.");
            C10615ak.m4383a().m4381a(this, 14);
            stopSelf();
        } else if (!m4457f()) {
            m4477a(true);
        } else if (this.f32937i.m3968o() || C10423d.m5211f(this)) {
            m4494a(new C10596l(z));
        } else {
            m4494a(new C10590f(17, null));
            m4477a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m4465c(Intent intent) {
        String m5178b;
        int i;
        C10615ak.C10617b c10617b = null;
        boolean z = true;
        boolean z2 = false;
        C10615ak m4383a = C10615ak.m4383a();
        if (AbstractC10621am.f33029d.equalsIgnoreCase(intent.getAction()) || AbstractC10621am.f33035j.equalsIgnoreCase(intent.getAction())) {
            String stringExtra = intent.getStringExtra(AbstractC10621am.f33042q);
            if (TextUtils.isEmpty(intent.getStringExtra(AbstractC10621am.f33046u))) {
                AbstractC10404b.m5269a("security is empty. ignore.");
            } else if (stringExtra == null) {
                AbstractC10404b.m5264d("channel id is empty, do nothing!");
            } else {
                boolean m4481a = m4481a(stringExtra, intent);
                C10615ak.C10617b m4468b = m4468b(stringExtra, intent);
                if (!C10423d.m5213d(this)) {
                    this.f32938j.m4290a(this, m4468b, false, 2, null);
                } else if (!m4457f()) {
                    m4477a(true);
                } else if (m4468b.f33008m == C10615ak.EnumC10619c.unbind) {
                    m4464c(new C10585a(m4468b));
                } else if (m4481a) {
                    m4464c(new C10597m(m4468b));
                } else if (m4468b.f33008m == C10615ak.EnumC10619c.binding) {
                    AbstractC10404b.m5269a(String.format("the client is binding. %1$s %2$s.", m4468b.f33003h, m4468b.f32997b));
                } else if (m4468b.f33008m == C10615ak.EnumC10619c.binded) {
                    this.f32938j.m4290a(this, m4468b, true, 0, null);
                }
            }
        } else if (AbstractC10621am.f33034i.equalsIgnoreCase(intent.getAction())) {
            String stringExtra2 = intent.getStringExtra(AbstractC10621am.f33050y);
            String stringExtra3 = intent.getStringExtra(AbstractC10621am.f33042q);
            String stringExtra4 = intent.getStringExtra(AbstractC10621am.f33041p);
            AbstractC10404b.m5269a("Service called closechannel chid = " + stringExtra3 + " userId = " + stringExtra4);
            if (TextUtils.isEmpty(stringExtra3)) {
                for (String str : m4383a.m4375b(stringExtra2)) {
                    m4482a(str, 2);
                }
            } else if (TextUtils.isEmpty(stringExtra4)) {
                m4482a(stringExtra3, 2);
            } else {
                m4480a(stringExtra3, stringExtra4, 2, null, null);
            }
        } else if (AbstractC10621am.f33030e.equalsIgnoreCase(intent.getAction())) {
            m4495a(intent);
        } else if (AbstractC10621am.f33032g.equalsIgnoreCase(intent.getAction())) {
            m4471b(intent);
        } else if (AbstractC10621am.f33031f.equalsIgnoreCase(intent.getAction())) {
            String stringExtra5 = intent.getStringExtra(AbstractC10621am.f33050y);
            String stringExtra6 = intent.getStringExtra(AbstractC10621am.f33019B);
            C10732b c10732b = new C10732b(intent.getBundleExtra("ext_packet"));
            if (m4483a((AbstractC10735d) c10732b, stringExtra5, stringExtra6, false) == null) {
                return;
            }
            m4464c(new C10629as(this, c10732b));
        } else if (AbstractC10621am.f33033h.equalsIgnoreCase(intent.getAction())) {
            String stringExtra7 = intent.getStringExtra(AbstractC10621am.f33050y);
            String stringExtra8 = intent.getStringExtra(AbstractC10621am.f33019B);
            C10737f c10737f = new C10737f(intent.getBundleExtra("ext_packet"));
            if (m4483a((AbstractC10735d) c10737f, stringExtra7, stringExtra8, false) == null) {
                return;
            }
            m4464c(new C10629as(this, c10737f));
        } else if (AbstractC10621am.f33036k.equals(intent.getAction())) {
            String stringExtra9 = intent.getStringExtra(AbstractC10621am.f33042q);
            String stringExtra10 = intent.getStringExtra(AbstractC10621am.f33041p);
            if (stringExtra9 == null) {
                return;
            }
            AbstractC10404b.m5269a("request reset connection from chid = " + stringExtra9);
            C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(stringExtra9, stringExtra10);
            if (m4374b == null || !m4374b.f33004i.equals(intent.getStringExtra(AbstractC10621am.f33046u)) || m4374b.f33008m != C10615ak.EnumC10619c.binded) {
                return;
            }
            AbstractC10716a m4453h = m4453h();
            if (m4453h != null && m4453h.m3990a(System.currentTimeMillis() - 15000)) {
                return;
            }
            m4464c(new C10598n());
        } else if (AbstractC10621am.f33037l.equals(intent.getAction())) {
            String stringExtra11 = intent.getStringExtra(AbstractC10621am.f33050y);
            List<String> m4375b = m4383a.m4375b(stringExtra11);
            if (m4375b.isEmpty()) {
                AbstractC10404b.m5269a("open channel should be called first before update info, pkg=" + stringExtra11);
                return;
            }
            String stringExtra12 = intent.getStringExtra(AbstractC10621am.f33042q);
            String stringExtra13 = intent.getStringExtra(AbstractC10621am.f33041p);
            if (TextUtils.isEmpty(stringExtra12)) {
                stringExtra12 = m4375b.get(0);
            }
            if (TextUtils.isEmpty(stringExtra13)) {
                Collection<C10615ak.C10617b> m4372c = m4383a.m4372c(stringExtra12);
                if (m4372c != null && !m4372c.isEmpty()) {
                    c10617b = m4372c.iterator().next();
                }
            } else {
                c10617b = m4383a.m4374b(stringExtra12, stringExtra13);
            }
            if (c10617b == null) {
                return;
            }
            if (intent.hasExtra(AbstractC10621am.f33048w)) {
                c10617b.f33001f = intent.getStringExtra(AbstractC10621am.f33048w);
            }
            if (!intent.hasExtra(AbstractC10621am.f33049x)) {
                return;
            }
            c10617b.f33002g = intent.getStringExtra(AbstractC10621am.f33049x);
        } else if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
            if (C10625ao.m4356a(getApplicationContext()).m4357a() && C10625ao.m4356a(getApplicationContext()).m4355b() == 0) {
                AbstractC10404b.m5269a("register without being provisioned. " + intent.getStringExtra("mipush_app_package"));
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            String stringExtra14 = intent.getStringExtra("mipush_app_package");
            boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
            int intExtra = intent.getIntExtra("mipush_env_type", 1);
            C10688p.m4130a(this).m4123g(stringExtra14);
            if (!booleanExtra || "com.xiaomi.xmsf".equals(getPackageName())) {
                m4476a(byteArrayExtra, stringExtra14);
            } else {
                m4464c(new C10657bk(this, 14, intExtra, byteArrayExtra, stringExtra14));
            }
        } else if ("com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
            String stringExtra15 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra2 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
            if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                C10688p.m4130a(this).m4126d(stringExtra15);
            }
            m4478a(stringExtra15, byteArrayExtra2, booleanExtra2);
        } else if (AbstractC10626ap.f33057a.equals(intent.getAction())) {
            String stringExtra16 = intent.getStringExtra("uninstall_pkg_name");
            if (stringExtra16 == null || TextUtils.isEmpty(stringExtra16.trim())) {
                return;
            }
            try {
                getPackageManager().getPackageInfo(stringExtra16, 8192);
                z = false;
            } catch (PackageManager.NameNotFoundException e) {
            }
            if ("com.xiaomi.channel".equals(stringExtra16) && !C10615ak.m4383a().m4372c("1").isEmpty() && z) {
                m4482a("1", 0);
                AbstractC10404b.m5269a("close the miliao channel as the app is uninstalled.");
                return;
            }
            SharedPreferences sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
            String string = sharedPreferences.getString(stringExtra16, null);
            if (TextUtils.isEmpty(string) || !z) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(stringExtra16);
            edit.commit();
            if (C10603ac.m4411e(this, stringExtra16)) {
                C10603ac.m4412d(this, stringExtra16);
            }
            C10603ac.m4416b(this, stringExtra16);
            if (!m4457f() || string == null) {
                return;
            }
            try {
                C10601aa.m4440a(this, C10601aa.m4436a(stringExtra16, string));
                AbstractC10404b.m5269a("uninstall " + stringExtra16 + " msg sent");
            } catch (C10730l e2) {
                AbstractC10404b.m5264d("Fail to send Message: " + e2.getMessage());
                m4499a(10, e2);
            }
        } else if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
            String stringExtra17 = intent.getStringExtra(AbstractC10621am.f33050y);
            int intExtra2 = intent.getIntExtra(AbstractC10621am.f33051z, -2);
            if (TextUtils.isEmpty(stringExtra17)) {
                return;
            }
            if (intExtra2 >= -1) {
                C10603ac.m4425a(this, stringExtra17, intExtra2);
            } else {
                C10603ac.m4423a(this, stringExtra17, intent.getStringExtra(AbstractC10621am.f33021D), intent.getStringExtra(AbstractC10621am.f33022E));
            }
        } else if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
            String stringExtra18 = intent.getStringExtra(AbstractC10621am.f33050y);
            String stringExtra19 = intent.getStringExtra(AbstractC10621am.f33020C);
            if (intent.hasExtra(AbstractC10621am.f33018A)) {
                i = intent.getIntExtra(AbstractC10621am.f33018A, 0);
                m5178b = C10432c.m5178b(stringExtra18 + i);
            } else {
                m5178b = C10432c.m5178b(stringExtra18);
                i = 0;
                z2 = true;
            }
            if (TextUtils.isEmpty(stringExtra18) || !TextUtils.equals(stringExtra19, m5178b)) {
                AbstractC10404b.m5264d("invalid notification for " + stringExtra18);
            } else if (z2) {
                C10603ac.m4412d(this, stringExtra18);
            } else {
                C10603ac.m4415b(this, stringExtra18, i);
            }
        } else if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
            String stringExtra20 = intent.getStringExtra("mipush_app_package");
            if (!TextUtils.isEmpty(stringExtra20)) {
                C10688p.m4130a(this).m4125e(stringExtra20);
            }
            if ("com.xiaomi.xmsf".equals(getPackageName())) {
                return;
            }
            if (this.f32934e != null) {
                unregisterReceiver(this.f32934e);
                this.f32934e = null;
            }
            this.f32940l.m4239c();
            m4494a(new C10658bl(this, 2));
            C10615ak.m4383a().m4369e();
            C10615ak.m4383a().m4381a(this, 0);
            C10615ak.m4383a().m4371d();
            C10630at.m4340a().m4334b();
            C10694a.m4087a();
        } else if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
            String stringExtra21 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            String stringExtra22 = intent.getStringExtra("mipush_app_id");
            String stringExtra23 = intent.getStringExtra("mipush_app_token");
            if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                C10688p.m4130a(this).m4124f(stringExtra21);
            }
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                C10688p.m4130a(this).m4122h(stringExtra21);
                C10688p.m4130a(this).m4121i(stringExtra21);
            }
            if (byteArrayExtra3 == null) {
                C10690r.m4119a(this, stringExtra21, byteArrayExtra3, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
                return;
            }
            C10690r.m4115b(stringExtra21, byteArrayExtra3);
            m4494a(new C10689q(this, stringExtra21, stringExtra22, stringExtra23, byteArrayExtra3));
            if (!"com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction()) || this.f32934e != null) {
                return;
            }
            this.f32934e = new C10589e();
            registerReceiver(this.f32934e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: c */
    private void m4464c(AbstractC10592h abstractC10592h) {
        this.f32940l.m4244a(abstractC10592h);
    }

    /* renamed from: c */
    private void m4462c(boolean z) {
        try {
            if (C10399j.m5290d()) {
                if (z) {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                } else {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                }
            }
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
        }
    }

    /* renamed from: j */
    private C10636aw.AbstractC10638b m4451j() {
        return new C10655bi(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m4450k() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            networkInfo = null;
        }
        if (networkInfo != null) {
            AbstractC10404b.m5269a("network changed, " + networkInfo.toString());
        } else {
            AbstractC10404b.m5269a("network changed, no active network");
        }
        if (C10761f.m3791b() != null) {
            C10761f.m3791b().m3800b();
        }
        this.f32936h.p();
        if (C10423d.m5213d(this)) {
            if (m4457f() && m4449l()) {
                m4467b(false);
            }
            if (!m4457f() && !m4455g()) {
                this.f32940l.m4241b(1);
                m4494a(new C10588d());
            }
            C10559b.m4723a(this).m4725a();
        } else {
            m4494a(new C10590f(2, null));
        }
        m4447n();
    }

    /* renamed from: l */
    private boolean m4449l() {
        if (System.currentTimeMillis() - this.f32935f < NotificationOptions.f16268b) {
            return false;
        }
        return C10423d.m5212e(this);
    }

    /* renamed from: m */
    private boolean m4448m() {
        return "com.xiaomi.xmsf".equals(getPackageName()) || !C10688p.m4130a(this).m4128b(getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m4447n() {
        if (!m4473b()) {
            C10694a.m4087a();
        } else if (C10694a.m4084b()) {
        } else {
            C10694a.m4085a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m4446o() {
        if (this.f32937i != null && this.f32937i.m3973j()) {
            AbstractC10404b.m5264d("try to connect while connecting.");
        } else if (this.f32937i != null && this.f32937i.m3972k()) {
            AbstractC10404b.m5264d("try to connect while is connected.");
        } else {
            this.f32932c.m3963a(C10423d.m5206k(this));
            m4445p();
            if (this.f32937i != null) {
                return;
            }
            C10615ak.m4383a().m4382a(this);
            m4462c(false);
        }
    }

    /* renamed from: p */
    private void m4445p() {
        try {
            this.f32936h.a(this.f32941m, new C10648bb(this));
            this.f32936h.r();
            this.f32937i = this.f32936h;
        } catch (C10730l e) {
            AbstractC10404b.m5268a("fail to create Slim connection", e);
            this.f32936h.b(3, e);
        }
    }

    /* renamed from: q */
    private boolean m4444q() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return C10612ah.m4394a(this).m4395a(EnumC10806e.ForegroundServiceSwitch.m3437a(), false);
    }

    /* renamed from: r */
    private void m4443r() {
        if (Build.VERSION.SDK_INT < 18) {
            startForeground(f32930g, new Notification());
        } else {
            bindService(new Intent(this, XMJobService.class), new ServiceConnectionC10649bc(this), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4501a() {
        if (System.currentTimeMillis() - this.f32935f >= C10725g.m3946c() && C10423d.m5212e(this)) {
            m4467b(true);
        }
    }

    /* renamed from: a */
    public void m4500a(int i) {
        this.f32940l.m4241b(i);
    }

    /* renamed from: a */
    public void m4499a(int i, Exception exc) {
        AbstractC10404b.m5269a("disconnect " + hashCode() + ", " + (this.f32937i == null ? null : Integer.valueOf(this.f32937i.hashCode())));
        if (this.f32937i != null) {
            this.f32937i.mo3935b(i, exc);
            this.f32937i = null;
        }
        m4500a(7);
        m4500a(4);
        C10615ak.m4383a().m4381a(this, i);
    }

    /* renamed from: a */
    public void m4497a(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaomi.metok.geofencing.state_change");
        registerReceiver(broadcastReceiver, intentFilter);
    }

    /* renamed from: a */
    public void m4494a(AbstractC10592h abstractC10592h) {
        m4493a(abstractC10592h, 0L);
    }

    /* renamed from: a */
    public void m4493a(AbstractC10592h abstractC10592h, long j) {
        try {
            this.f32940l.m4243a(abstractC10592h, j);
        } catch (IllegalStateException e) {
        }
    }

    /* renamed from: a */
    public void m4487a(C10615ak.C10617b c10617b) {
        if (c10617b != null) {
            long m4368a = c10617b.m4368a();
            AbstractC10404b.m5269a("schedule rebind job in " + (m4368a / 1000));
            m4493a(new C10585a(c10617b), m4368a);
        }
    }

    /* renamed from: a */
    public void m4486a(C10710b c10710b) {
        if (this.f32937i != null) {
            this.f32937i.mo3982b(c10710b);
            return;
        }
        throw new C10730l("try send msg while connection is null.");
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3803a(AbstractC10716a abstractC10716a) {
        C10761f.m3791b().mo3803a(abstractC10716a);
        m4462c(true);
        this.f32933d.m4343a();
        Iterator<C10615ak.C10617b> it2 = C10615ak.m4383a().m4376b().iterator();
        while (it2.hasNext()) {
            m4494a(new C10585a(it2.next()));
        }
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3802a(AbstractC10716a abstractC10716a, int i, Exception exc) {
        C10761f.m3791b().mo3802a(abstractC10716a, i, exc);
        m4477a(false);
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3801a(AbstractC10716a abstractC10716a, Exception exc) {
        C10761f.m3791b().mo3801a(abstractC10716a, exc);
        m4462c(false);
        m4477a(false);
    }

    /* renamed from: a */
    public void m4484a(AbstractC10735d abstractC10735d) {
        if (this.f32937i != null) {
            this.f32937i.mo3986a(abstractC10735d);
            return;
        }
        throw new C10730l("try send msg while connection is null.");
    }

    /* renamed from: a */
    public void m4480a(String str, String str2, int i, String str3, String str4) {
        C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(str, str2);
        if (m4374b != null) {
            m4494a(new C10599o(m4374b, i, str4, str3));
        }
        C10615ak.m4383a().m4377a(str, str2);
    }

    /* renamed from: a */
    public void m4477a(boolean z) {
        this.f32933d.m4342a(z);
    }

    /* renamed from: a */
    public void m4476a(byte[] bArr, String str) {
        if (bArr == null) {
            C10690r.m4119a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            AbstractC10404b.m5269a("register request without payload");
            return;
        }
        C10769ab c10769ab = new C10769ab();
        try {
            C10799aq.m3470a(c10769ab, bArr);
            if (c10769ab.f33666a == EnumC10766a.Registration) {
                C10777af c10777af = new C10777af();
                try {
                    C10799aq.m3470a(c10777af, c10769ab.m3734f());
                    C10690r.m4117a(c10769ab.m3730j(), bArr);
                    m4494a(new C10689q(this, c10769ab.m3730j(), c10777af.m3665d(), c10777af.m3656h(), bArr));
                } catch (C11392f e) {
                    AbstractC10404b.m5267a(e);
                    C10690r.m4119a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                C10690r.m4119a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                AbstractC10404b.m5269a("register request with invalid payload");
            }
        } catch (C11392f e2) {
            AbstractC10404b.m5267a(e2);
            C10690r.m4119a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    /* renamed from: a */
    public void m4475a(C10710b[] c10710bArr) {
        if (this.f32937i != null) {
            this.f32937i.mo3938a(c10710bArr);
            return;
        }
        throw new C10730l("try send msg while connection is null.");
    }

    /* renamed from: a */
    public void m4474a(AbstractC10735d[] abstractC10735dArr) {
        if (this.f32937i != null) {
            this.f32937i.mo3937a(abstractC10735dArr);
            return;
        }
        throw new C10730l("try send msg while connection is null.");
    }

    /* renamed from: b */
    public void m4470b(AbstractC10592h abstractC10592h) {
        this.f32940l.m4245a(abstractC10592h.f33142a, abstractC10592h);
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: b */
    public void mo3799b(AbstractC10716a abstractC10716a) {
        AbstractC10404b.m5265c("begin to connect...");
        C10761f.m3791b().mo3799b(abstractC10716a);
    }

    /* renamed from: b */
    public boolean m4473b() {
        return C10423d.m5213d(this) && C10615ak.m4383a().m4373c() > 0 && !m4466c() && m4448m();
    }

    /* renamed from: b */
    public boolean m4472b(int i) {
        return this.f32940l.m4246a(i);
    }

    /* renamed from: c */
    public boolean m4466c() {
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            Field field = cls.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = cls.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = cls.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: d */
    public C10646b m4461d() {
        return new C10646b();
    }

    /* renamed from: e */
    public C10646b m4459e() {
        return this.f32938j;
    }

    /* renamed from: f */
    public boolean m4457f() {
        return this.f32937i != null && this.f32937i.m3972k();
    }

    /* renamed from: g */
    public boolean m4455g() {
        return this.f32937i != null && this.f32937i.m3973j();
    }

    /* renamed from: h */
    public AbstractC10716a m4453h() {
        return this.f32937i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC10594j();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C10399j.m5294a(this);
        C10685n m4137a = C10686o.m4137a(this);
        if (m4137a != null) {
            C10405a.m5261a(m4137a.f33212g);
        }
        C10622an.m4359a(this);
        this.f32932c = new C10650bd(this, null, 5222, "xiaomi.com", null);
        this.f32932c.m3961a(true);
        this.f32936h = new C10714f(this, this.f32932c);
        this.f32938j = m4461d();
        try {
            if (C10399j.m5290d()) {
                this.f32938j.m4294a(this);
            }
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
        }
        C10694a.m4086a(this);
        this.f32936h.a(this);
        this.f32939k = new PacketSync(this);
        this.f32933d = new C10628ar(this);
        new C10660c().m4279a();
        C10761f.m3796a().m3793a(this);
        this.f32940l = new C10666i("Connection Controller Thread");
        if (m4448m()) {
            m4494a(new C10651be(this, 11));
        }
        C10615ak m4383a = C10615ak.m4383a();
        m4383a.m4369e();
        m4383a.m4380a(new C10652bf(this));
        if (m4448m()) {
            this.f32934e = new C10589e();
            registerReceiver(this.f32934e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (m4444q()) {
            m4443r();
        }
        if (!getPackageName().equals(C10390b.m5324c(this))) {
            C10636aw m4319a = C10636aw.m4319a();
            if (m4319a.m4308b()) {
                m4319a.m4316a(this);
            }
            m4319a.m4314a(m4451j(), "UPLOADER_FROM_XMPUSHSERVICE");
        }
        m4497a(this.f32931a);
        C10410f.m5253a(this).m5251a((C10410f.AbstractRunnableC10411a) new C10661d(this), Strategy.f28191g);
        AbstractC10404b.m5269a("XMPushService created pid = " + f32930g);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.f32934e != null) {
            unregisterReceiver(this.f32934e);
        }
        unregisterReceiver(this.f32931a);
        this.f32940l.m4239c();
        m4494a(new C10647ba(this, 2));
        m4494a(new C10593i());
        C10615ak.m4383a().m4369e();
        C10615ak.m4383a().m4381a(this, 15);
        C10615ak.m4383a().m4371d();
        this.f32936h.b(this);
        C10630at.m4340a().m4334b();
        C10694a.m4087a();
        super.onDestroy();
        AbstractC10404b.m5269a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        if (intent == null) {
            AbstractC10404b.m5264d("onStart() with intent NULL");
        } else {
            AbstractC10404b.m5265c(String.format("onStart() with intent.Action = %s, chid = %s", intent.getAction(), intent.getStringExtra(AbstractC10621am.f33042q)));
        }
        if (intent == null || intent.getAction() == null) {
            return;
        }
        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
            AbstractC10404b.m5269a("Service called on timer");
            if (!m4449l()) {
                return;
            }
            m4467b(false);
        } else if (!"com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
            if ("com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                return;
            }
            m4494a(new C10591g(intent));
        } else {
            AbstractC10404b.m5269a("Service called on check alive.");
            if (!m4449l()) {
                return;
            }
            m4467b(false);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return f32929b;
    }
}
