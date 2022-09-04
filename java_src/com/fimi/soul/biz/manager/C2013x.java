package com.fimi.soul.biz.manager;

import android.content.Context;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.entity.UserDeviceFirmwareVersion;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.NetUtil;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.fimi.soul.biz.manager.x */
/* loaded from: classes.dex */
public class C2013x {

    /* renamed from: a */
    private Gson f5638a = new Gson();

    /* renamed from: b */
    private Context f5639b;

    /* renamed from: com.fimi.soul.biz.manager.x$a */
    /* loaded from: classes.dex */
    public class RunnableC2014a implements Runnable {

        /* renamed from: a */
        List<NameValuePair> f5640a;

        public RunnableC2014a(List<NameValuePair> list) {
            this.f5640a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetUtil.m29411a(C1756a.f4551j, this.f5640a, C2013x.this.f5639b);
        }
    }

    public C2013x(Context context) {
        this.f5639b = context;
    }

    /* renamed from: a */
    public void m33260a() {
        m33258a(m33257b());
    }

    /* renamed from: a */
    public void m33258a(UserDeviceFirmwareVersion userDeviceFirmwareVersion) {
        if (userDeviceFirmwareVersion != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("commandCode", "getUserVersion"));
            arrayList.add(new BasicNameValuePair("jsonStr", this.f5638a.toJson(userDeviceFirmwareVersion)));
            C1685x.m34455b(new RunnableC2014a(arrayList));
        }
    }

    /* renamed from: b */
    public UserDeviceFirmwareVersion m33257b() {
        String userID = C1756a.m34259c(this.f5639b).getUserID();
        UserDeviceFirmwareVersion userDeviceFirmwareVersion = new UserDeviceFirmwareVersion();
        if (userID != null && !userID.equals("")) {
            userDeviceFirmwareVersion.setUserID(Integer.parseInt(userID));
        }
        userDeviceFirmwareVersion.setFcID(C3021a.m29616a().m29615a(0).m29550i());
        userDeviceFirmwareVersion.setAndroidVer(C3103au.m29209d(this.f5639b));
        if (C1772d.m34208a().m34187k()) {
            userDeviceFirmwareVersion.setDeviceType("1");
            int m29566b = C3021a.m29616a().m29615a(14).m29566b();
            if (m29566b != 0) {
                userDeviceFirmwareVersion.setX6D4kVer("" + m29566b);
            } else {
                int m29566b2 = C3021a.m29616a().m29615a(25).m29566b();
                if (m29566b2 != 0) {
                    userDeviceFirmwareVersion.setX6D4kVer("" + m29566b2);
                }
            }
            int m29566b3 = C3021a.m29616a().m29615a(13).m29566b();
            if (m29566b3 != 0) {
                userDeviceFirmwareVersion.setCamVer("" + m29566b3);
            }
            int m29566b4 = C3021a.m29616a().m29615a(15).m29566b();
            if (m29566b4 != 0) {
                userDeviceFirmwareVersion.setX6RVer("" + m29566b4);
            } else {
                int m29566b5 = C3021a.m29616a().m29615a(26).m29566b();
                if (m29566b5 != 0) {
                    userDeviceFirmwareVersion.setX6RVer("" + m29566b5);
                }
            }
        } else {
            userDeviceFirmwareVersion.setDeviceType("0");
            int m29566b6 = C3021a.m29616a().m29615a(4).m29566b();
            if (m29566b6 != 0) {
                userDeviceFirmwareVersion.setCamVer("" + m29566b6);
            }
            int m29566b7 = C3021a.m29616a().m29615a(11).m29566b();
            if (m29566b7 != 0) {
                userDeviceFirmwareVersion.setX6RVer("" + m29566b7);
            }
        }
        int m29566b8 = C3021a.m29616a().m29615a(0).m29566b();
        if (m29566b8 != 0) {
            userDeviceFirmwareVersion.setFcVer("" + m29566b8);
        }
        int m29566b9 = C3021a.m29616a().m29615a(1).m29566b();
        if (m29566b9 != 0) {
            userDeviceFirmwareVersion.setRcVer("" + m29566b9);
        }
        int m29566b10 = C3021a.m29616a().m29615a(10).m29566b();
        if (m29566b10 != 0) {
            userDeviceFirmwareVersion.setNoflyVer("" + m29566b10);
        }
        int m29566b11 = C3021a.m29616a().m29615a(3).m29566b();
        if (m29566b11 != 0) {
            userDeviceFirmwareVersion.setGcVer("" + m29566b11);
        }
        int m29566b12 = C3021a.m29616a().m29615a(6).m29566b();
        if (m29566b12 != 0) {
            userDeviceFirmwareVersion.setServVer("" + m29566b12);
        }
        int m29566b13 = C3021a.m29616a().m29615a(9).m29566b();
        if (m29566b13 != 0) {
            userDeviceFirmwareVersion.setX2Ver("" + m29566b13);
        }
        int m29566b14 = C3021a.m29616a().m29615a(5).m29566b();
        if (m29566b14 != 0) {
            userDeviceFirmwareVersion.setBatteryVer("" + m29566b14);
        }
        return userDeviceFirmwareVersion;
    }
}
