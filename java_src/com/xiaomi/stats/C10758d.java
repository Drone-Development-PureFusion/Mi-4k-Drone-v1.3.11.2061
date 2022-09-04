package com.xiaomi.stats;

import com.xiaomi.push.thrift.EnumC10704a;
import com.xiaomi.smack.C10719c;
import com.xiaomi.smack.C10730l;
import java.net.UnknownHostException;
/* renamed from: com.xiaomi.stats.d */
/* loaded from: classes2.dex */
final class C10758d {

    /* renamed from: com.xiaomi.stats.d$a */
    /* loaded from: classes2.dex */
    static class C10759a {

        /* renamed from: a */
        EnumC10704a f33579a;

        /* renamed from: b */
        String f33580b;

        C10759a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10759a m3809a(Exception exc) {
        m3805e(exc);
        boolean z = exc instanceof C10730l;
        Exception exc2 = exc;
        if (z) {
            Throwable m3925a = ((C10730l) exc).m3925a();
            exc2 = exc;
            if (m3925a != null) {
                exc2 = ((C10730l) exc).m3925a();
            }
        }
        C10759a c10759a = new C10759a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + ":" + message;
        int m3954a = C10719c.m3954a(exc2);
        if (m3954a != 0) {
            c10759a.f33579a = EnumC10704a.m4076a(m3954a + EnumC10704a.GSLB_REQUEST_SUCCESS.m4077a());
        }
        if (c10759a.f33579a == null) {
            c10759a.f33579a = EnumC10704a.GSLB_TCP_ERR_OTHER;
        }
        if (c10759a.f33579a == EnumC10704a.GSLB_TCP_ERR_OTHER) {
            c10759a.f33580b = str;
        }
        return c10759a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C10759a m3808b(Exception exc) {
        Throwable cause;
        m3805e(exc);
        boolean z = exc instanceof C10730l;
        Exception exc2 = exc;
        if (z) {
            Throwable m3925a = ((C10730l) exc).m3925a();
            exc2 = exc;
            if (m3925a != null) {
                exc2 = ((C10730l) exc).m3925a();
            }
        }
        C10759a c10759a = new C10759a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int m3954a = C10719c.m3954a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (m3954a != 0) {
            c10759a.f33579a = EnumC10704a.m4076a(m3954a + EnumC10704a.CONN_SUCCESS.m4077a());
            if (c10759a.f33579a == EnumC10704a.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                c10759a.f33579a = EnumC10704a.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            c10759a.f33579a = EnumC10704a.CONN_XMPP_ERR;
        }
        if (c10759a.f33579a == EnumC10704a.CONN_TCP_ERR_OTHER || c10759a.f33579a == EnumC10704a.CONN_XMPP_ERR || c10759a.f33579a == EnumC10704a.CONN_BOSH_ERR) {
            c10759a.f33580b = str;
        }
        return c10759a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C10759a m3807c(Exception exc) {
        m3805e(exc);
        boolean z = exc instanceof C10730l;
        Exception exc2 = exc;
        if (z) {
            Throwable m3925a = ((C10730l) exc).m3925a();
            exc2 = exc;
            if (m3925a != null) {
                exc2 = ((C10730l) exc).m3925a();
            }
        }
        C10759a c10759a = new C10759a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + ":" + message;
        switch (C10719c.m3954a(exc2)) {
            case 105:
                c10759a.f33579a = EnumC10704a.BIND_TCP_READ_TIMEOUT;
                break;
            case 109:
                c10759a.f33579a = EnumC10704a.BIND_TCP_CONNRESET;
                break;
            case 110:
                c10759a.f33579a = EnumC10704a.BIND_TCP_BROKEN_PIPE;
                break;
            case 199:
                c10759a.f33579a = EnumC10704a.BIND_TCP_ERR;
                break;
            case 499:
                c10759a.f33579a = EnumC10704a.BIND_BOSH_ERR;
                if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                    c10759a.f33579a = EnumC10704a.BIND_BOSH_ITEM_NOT_FOUND;
                    break;
                }
                break;
            default:
                c10759a.f33579a = EnumC10704a.BIND_XMPP_ERR;
                break;
        }
        if (c10759a.f33579a == EnumC10704a.BIND_TCP_ERR || c10759a.f33579a == EnumC10704a.BIND_XMPP_ERR || c10759a.f33579a == EnumC10704a.BIND_BOSH_ERR) {
            c10759a.f33580b = str;
        }
        return c10759a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C10759a m3806d(Exception exc) {
        m3805e(exc);
        boolean z = exc instanceof C10730l;
        Exception exc2 = exc;
        if (z) {
            Throwable m3925a = ((C10730l) exc).m3925a();
            exc2 = exc;
            if (m3925a != null) {
                exc2 = ((C10730l) exc).m3925a();
            }
        }
        C10759a c10759a = new C10759a();
        String message = exc2.getMessage();
        String str = exc2.getClass().getSimpleName() + ":" + message;
        switch (C10719c.m3954a(exc2)) {
            case 105:
                c10759a.f33579a = EnumC10704a.CHANNEL_TCP_READTIMEOUT;
                break;
            case 109:
                c10759a.f33579a = EnumC10704a.CHANNEL_TCP_CONNRESET;
                break;
            case 110:
                c10759a.f33579a = EnumC10704a.CHANNEL_TCP_BROKEN_PIPE;
                break;
            case 199:
                c10759a.f33579a = EnumC10704a.CHANNEL_TCP_ERR;
                break;
            case 499:
                c10759a.f33579a = EnumC10704a.CHANNEL_BOSH_EXCEPTION;
                if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                    c10759a.f33579a = EnumC10704a.CHANNEL_BOSH_ITEMNOTFIND;
                    break;
                }
                break;
            default:
                c10759a.f33579a = EnumC10704a.CHANNEL_XMPPEXCEPTION;
                break;
        }
        if (c10759a.f33579a == EnumC10704a.CHANNEL_TCP_ERR || c10759a.f33579a == EnumC10704a.CHANNEL_XMPPEXCEPTION || c10759a.f33579a == EnumC10704a.CHANNEL_BOSH_EXCEPTION) {
            c10759a.f33580b = str;
        }
        return c10759a;
    }

    /* renamed from: e */
    private static void m3805e(Exception exc) {
        if (exc == null) {
            throw new NullPointerException();
        }
    }
}
