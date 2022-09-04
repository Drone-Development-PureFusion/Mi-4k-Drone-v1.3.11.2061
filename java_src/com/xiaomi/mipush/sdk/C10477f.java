package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.C10662e;
import com.xiaomi.push.service.C10664g;
import com.xiaomi.push.service.C10665h;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10812j;
import com.xiaomi.xmpush.thrift.C10828s;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import org.p286a.p321b.C11392f;
/* renamed from: com.xiaomi.mipush.sdk.f */
/* loaded from: classes2.dex */
public class C10477f {

    /* renamed from: a */
    private static volatile C10477f f32566a;

    /* renamed from: b */
    private final String f32567b = "GeoFenceRegMessageProcessor.";

    /* renamed from: c */
    private Context f32568c;

    private C10477f(Context context) {
        this.f32568c = context;
    }

    /* renamed from: a */
    public static C10477f m4992a(Context context) {
        if (f32566a == null) {
            synchronized (C10477f.class) {
                if (f32566a == null) {
                    f32566a = new C10477f(context);
                }
            }
        }
        return f32566a;
    }

    /* renamed from: a */
    private C10828s m4993a() {
        ArrayList<C10812j> m4275a = C10662e.m4274a(this.f32568c).m4275a();
        C10828s c10828s = new C10828s();
        TreeSet treeSet = new TreeSet();
        Iterator<C10812j> it2 = m4275a.iterator();
        while (it2.hasNext()) {
            treeSet.add(it2.next());
        }
        c10828s.m3262a(treeSet);
        return c10828s;
    }

    /* renamed from: a */
    private void m4990a(C10812j c10812j) {
        byte[] m3471a = C10799aq.m3471a(c10812j);
        C10775ae c10775ae = new C10775ae("-1", false);
        c10775ae.m3695c(EnumC10821o.GeoPackageUninstalled.f34418N);
        c10775ae.m3701a(m3471a);
        C10494u.m4943a(this.f32568c).m4932a(c10775ae, EnumC10766a.Notification, true, null);
        AbstractC10404b.m5269a("GeoFenceRegMessageProcessor.report package not exist geo_fencing id:" + c10812j.m3417a());
    }

    /* renamed from: a */
    private void m4989a(C10812j c10812j, boolean z) {
        byte[] m3471a = C10799aq.m3471a(c10812j);
        C10775ae c10775ae = new C10775ae("-1", false);
        c10775ae.m3695c(z ? EnumC10821o.GeoRegsiterResult.f34418N : EnumC10821o.GeoUnregsiterResult.f34418N);
        c10775ae.m3701a(m3471a);
        C10494u.m4943a(this.f32568c).m4932a(c10775ae, EnumC10766a.Notification, true, null);
        AbstractC10404b.m5269a("GeoFenceRegMessageProcessor.report geo_fencing id:" + c10812j.m3417a() + " " + (z ? "geo_reg" : "geo_unreg"));
    }

    /* renamed from: d */
    private C10812j m4986d(C10775ae c10775ae) {
        if (C10665h.m4251a(this.f32568c) && C10665h.m4248b(this.f32568c)) {
            try {
                C10812j c10812j = new C10812j();
                C10799aq.m3470a(c10812j, c10775ae.m3684m());
                return c10812j;
            } catch (C11392f e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m4991a(C10775ae c10775ae) {
        C10812j m4986d = m4986d(c10775ae);
        if (m4986d == null) {
            AbstractC10404b.m5264d("registration convert geofence object failed notification_id:" + c10775ae.m3696c());
        } else if (!C10390b.m5319f(this.f32568c, m4986d.m3396g())) {
            m4990a(m4986d);
        } else {
            if (C10662e.m4274a(this.f32568c).m4271a(m4986d) == -1) {
                AbstractC10404b.m5269a("GeoFenceRegMessageProcessor. insert a new geofence failed about geo_id:" + m4986d.m3417a());
            }
            new C10478g(this.f32568c).m4984a(m4986d);
            m4989a(m4986d, true);
            AbstractC10404b.m5269a("receive geo reg notification");
        }
    }

    /* renamed from: b */
    public void m4988b(C10775ae c10775ae) {
        C10812j m4986d = m4986d(c10775ae);
        if (m4986d == null) {
            AbstractC10404b.m5264d("unregistration convert geofence object failed notification_id:" + c10775ae.m3696c());
        } else if (!C10390b.m5319f(this.f32568c, m4986d.m3396g())) {
            m4990a(m4986d);
        } else {
            if (C10662e.m4274a(this.f32568c).m4262d(m4986d.m3417a()) == 0) {
                AbstractC10404b.m5269a("GeoFenceRegMessageProcessor. delete a geofence about geo_id:" + m4986d.m3417a() + " falied");
            }
            if (C10664g.m4257a(this.f32568c).m4253b(m4986d.m3417a()) == 0) {
                AbstractC10404b.m5269a("GeoFenceRegMessageProcessor. delete all geofence messages about geo_id:" + m4986d.m3417a() + " failed");
            }
            new C10478g(this.f32568c).m4983a(m4986d.m3417a());
            m4989a(m4986d, false);
            AbstractC10404b.m5269a("receive geo unreg notification");
        }
    }

    /* renamed from: c */
    public void m4987c(C10775ae c10775ae) {
        if (C10665h.m4251a(this.f32568c) && C10665h.m4248b(this.f32568c) && C10390b.m5319f(this.f32568c, c10775ae.f33733i)) {
            C10828s m4993a = m4993a();
            byte[] m3471a = C10799aq.m3471a(m4993a);
            C10775ae c10775ae2 = new C10775ae("-1", false);
            c10775ae2.m3695c(EnumC10821o.GeoUpload.f34418N);
            c10775ae2.m3701a(m3471a);
            C10494u.m4943a(this.f32568c).m4932a(c10775ae2, EnumC10766a.Notification, true, null);
            AbstractC10404b.m5265c("GeoFenceRegMessageProcessor.sync_geo_data. geos size:" + m4993a.m3264a().size());
        }
    }
}
