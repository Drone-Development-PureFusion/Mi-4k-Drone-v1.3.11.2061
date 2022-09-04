package com.fimi.soul.module.update.p218a;

import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1680u;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.update.C2075g;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.biz.update.C2082m;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.C3129m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.fimi.soul.module.update.a.a */
/* loaded from: classes.dex */
public class C3021a {

    /* renamed from: c */
    private static C3021a f11218c = new C3021a();

    /* renamed from: b */
    private Map<Integer, C3025e> f11220b = new HashMap();

    /* renamed from: a */
    AbstractC3023c f11219a = new C3026f();

    /* renamed from: a */
    public static synchronized C3021a m29616a() {
        C3021a c3021a;
        synchronized (C3021a.class) {
            if (f11218c == null) {
                f11218c = new C3021a();
            }
            c3021a = f11218c;
        }
        return c3021a;
    }

    /* renamed from: a */
    public C3025e m29615a(int i) {
        return this.f11220b.containsKey(Integer.valueOf(i)) ? this.f11220b.get(Integer.valueOf(i)) : new C3025e();
    }

    /* renamed from: a */
    public void m29614a(int i, int i2) {
        this.f11219a.mo29543a(i, i2);
    }

    /* renamed from: a */
    public void m29613a(C3025e c3025e) {
        if (c3025e == null) {
            return;
        }
        this.f11220b.put(Integer.valueOf(c3025e.m29557d()), c3025e);
    }

    /* renamed from: a */
    public void m29612a(List<UpdateVersonBean> list, List<UpdateVersonBean> list2) {
        boolean z;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                list2.add(list.get(i));
            }
            int i2 = 0;
            while (true) {
                if (i2 >= list2.size()) {
                    z = false;
                    break;
                }
                UpdateVersonBean updateVersonBean = list.get(i);
                UpdateVersonBean updateVersonBean2 = list2.get(i2);
                if (!updateVersonBean.getSysname().equals(updateVersonBean2.getSysname())) {
                    i2++;
                } else if (Integer.valueOf(updateVersonBean.getNewVersion()).intValue() > Integer.valueOf(updateVersonBean2.getNewVersion()).intValue()) {
                    list2.set(i2, list.get(i));
                    z = true;
                } else {
                    z = true;
                }
            }
            if (!z) {
                list2.add(list.get(i));
            }
        }
    }

    /* renamed from: b */
    public Map<Integer, C3025e> m29611b() {
        return this.f11220b;
    }

    /* renamed from: b */
    public void m29610b(int i) {
        this.f11219a.mo29541a(this.f11220b.get(Integer.valueOf(i)));
        this.f11219a.mo29537d(i);
    }

    /* renamed from: c */
    public void m29609c() {
        C1642c.m34887c().mo34879a(C3029b.f11258C, new C3022b());
        this.f11220b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01aa, code lost:
        if (r13 <= 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ac, code lost:
        r0 = true;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<FirmwareInfo> m29608d() {
        C3025e c3025e;
        int m29566b;
        C3025e c3025e2;
        ArrayList arrayList = new ArrayList();
        List<UpdateVersonBean> mo34874b = C1645c.m34884a().mo34874b(InitAppService.f11416a, UpdateVersonBean.class);
        if (mo34874b != null && mo34874b.size() > 0) {
            for (UpdateVersonBean updateVersonBean : mo34874b) {
                int intValue = Integer.valueOf(updateVersonBean.getNewVersion()).intValue();
                int m33051c = C2080l.m33051c(updateVersonBean.getSysid());
                File file = updateVersonBean.getSysid() == 11 ? new File(C3129m.m29045v() + C2080l.m33060a(updateVersonBean.getFileEncode())) : updateVersonBean.getSysid() == 15 ? new File(C3129m.m29045v() + C2080l.m33059a(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 26 ? new File(C3129m.m29045v() + C2080l.m33054b(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 14 ? new File(C3129m.m29045v() + C2080l.m33049c(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 25 ? new File(C3129m.m29045v() + C2080l.m33049c(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : new File(this.f11219a.mo29538c(m33051c));
                boolean z = C1681v.m34543a(DroidPlannerApp.m34273g()).m34499r() == 1;
                if (!C1772d.m34208a().m34186l() || z) {
                    if (!C1772d.m34208a().m34189i() || (updateVersonBean.getSysid() != 6 && updateVersonBean.getSysid() != 9 && updateVersonBean.getSysid() != 10 && updateVersonBean.getSysid() != 0 && updateVersonBean.getSysid() != 3 && updateVersonBean.getSysid() != 1 && updateVersonBean.getSysid() != 11 && updateVersonBean.getSysid() != 4 && updateVersonBean.getSysid() != 253 && updateVersonBean.getSysid() != 5)) {
                        if (!C1772d.m34208a().m34188j() || (updateVersonBean.getSysid() != 12 && updateVersonBean.getSysid() != 14 && updateVersonBean.getSysid() != 25 && updateVersonBean.getSysid() != 15 && updateVersonBean.getSysid() != 26 && updateVersonBean.getSysid() != 17 && updateVersonBean.getSysid() != 16 && updateVersonBean.getSysid() != 20 && updateVersonBean.getSysid() != 18 && updateVersonBean.getSysid() != 19 && updateVersonBean.getSysid() != 13 && updateVersonBean.getSysid() != 23)) {
                            if (updateVersonBean.getSysid() != 27 || z) {
                                if (updateVersonBean.getFileEncode().equals(C1680u.m34548a(file)) && (c3025e = f11218c.m29611b().get(Integer.valueOf(m33051c))) != null && ((m29566b = c3025e.m29566b()) >= 1335 || m29566b == 1 || (updateVersonBean.getSysid() != 5 && updateVersonBean.getSysid() != 23))) {
                                    if (updateVersonBean.getSysid() != 11 || (c3025e2 = f11218c.m29611b().get(1)) == null || c3025e2.m29566b() >= 1707) {
                                        boolean z2 = false;
                                        boolean z3 = "1".equals(updateVersonBean.getForceSign()) && intValue != m29566b;
                                        boolean z4 = "2".equals(updateVersonBean.getForceSign()) && intValue > m29566b;
                                        if (z2 || z3 || z4) {
                                            int m33056b = C2080l.m33056b(m33051c);
                                            int intValue2 = C2080l.m33066a().get(Integer.valueOf(m33051c)).intValue();
                                            FirmwareInfo firmwareInfo = new FirmwareInfo(m33051c, m33051c, updateVersonBean.getSysname(), "", "", updateVersonBean.getNewVersion(), 1, m33056b, updateVersonBean.getSysname());
                                            firmwareInfo.setFileEncode(updateVersonBean.getFileEncode());
                                            firmwareInfo.setUpdcontents(updateVersonBean.getUpdcontents());
                                            firmwareInfo.setSource(1);
                                            firmwareInfo.setUpdateTime(intValue2);
                                            firmwareInfo.setForceSign(updateVersonBean.getForceSign());
                                            firmwareInfo.setFileSize(Long.valueOf(updateVersonBean.getSize()).longValue());
                                            if (m29566b == 1) {
                                                firmwareInfo.setVersionError(true);
                                            }
                                            arrayList.add(firmwareInfo);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, new C2075g());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01fa, code lost:
        if (r5 <= 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fc, code lost:
        r2 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<UpdateVersonBean> m29607e() {
        List<UpdateVersonBean> mo34874b = C1642c.m34887c().mo34874b(InitAppService.f11416a, UpdateVersonBean.class);
        ArrayList arrayList = new ArrayList();
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null || c3022b.m29588i() == null || c3022b.m29588i().size() == 0) {
            return arrayList;
        }
        if (mo34874b != null && mo34874b.size() > 0) {
            for (UpdateVersonBean updateVersonBean : mo34874b) {
                int m33051c = C2080l.m33051c(updateVersonBean.getSysid());
                File file = updateVersonBean.getSysid() == 11 ? new File(C3129m.m29045v() + C2080l.m33060a(updateVersonBean.getFileEncode())) : updateVersonBean.getSysid() == 15 ? new File(C3129m.m29045v() + C2080l.m33059a(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 26 ? new File(C3129m.m29045v() + C2080l.m33054b(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 14 ? new File(C3129m.m29045v() + C2080l.m33049c(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : updateVersonBean.getSysid() == 25 ? new File(C3129m.m29045v() + C2080l.m33045d(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion())) : new File(this.f11219a.mo29538c(m33051c));
                String fileEncode = updateVersonBean.getFileEncode();
                String m34548a = C1680u.m34548a(file);
                boolean z = C1681v.m34543a(DroidPlannerApp.m34273g()).m34499r() == 1;
                if (!C1772d.m34208a().m34186l() || z) {
                    if ((!C1772d.m34208a().m34189i() && !z) || (updateVersonBean.getSysid() != 6 && updateVersonBean.getSysid() != 9 && updateVersonBean.getSysid() != 10 && updateVersonBean.getSysid() != 0 && updateVersonBean.getSysid() != 3 && updateVersonBean.getSysid() != 1 && updateVersonBean.getSysid() != 11 && updateVersonBean.getSysid() != 4 && updateVersonBean.getSysid() != 253 && updateVersonBean.getSysid() != 5)) {
                        if (!C1772d.m34208a().m34188j() || (updateVersonBean.getSysid() != 12 && updateVersonBean.getSysid() != 14 && updateVersonBean.getSysid() != 15 && updateVersonBean.getSysid() != 26 && updateVersonBean.getSysid() != 17 && updateVersonBean.getSysid() != 16 && updateVersonBean.getSysid() != 20 && updateVersonBean.getSysid() != 18 && updateVersonBean.getSysid() != 19 && updateVersonBean.getSysid() != 25 && updateVersonBean.getSysid() != 13 && updateVersonBean.getSysid() != 23 && updateVersonBean.getSysid() != 27)) {
                            Log.d("moweiru", "fileURL:" + this.f11219a.mo29538c(m33051c));
                            Log.d("moweiru", "SysName:" + updateVersonBean.getSysname() + ";Net Md5:" + fileEncode + ";Local Md5:" + m34548a + ";SysID:" + m33051c);
                            if (!fileEncode.equals(m34548a)) {
                                int intValue = Integer.valueOf(updateVersonBean.getNewVersion()).intValue();
                                int intValue2 = c3022b.m29588i().get(Integer.valueOf(m33051c)) == null ? 0 : c3022b.m29588i().get(Integer.valueOf(m33051c)).intValue();
                                if (intValue2 >= 1335 || intValue2 == 1 || (updateVersonBean.getSysid() != 5 && updateVersonBean.getSysid() != 23)) {
                                    boolean z2 = false;
                                    boolean z3 = "1".equals(updateVersonBean.getForceSign()) && intValue != intValue2 && intValue2 > 0;
                                    boolean z4 = "2".equals(updateVersonBean.getForceSign()) && intValue > intValue2 && intValue2 > 0;
                                    if (z2 || z3 || z4) {
                                        updateVersonBean.setSort(C2080l.m33056b(m33051c));
                                        arrayList.add(updateVersonBean);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            Collections.sort(arrayList, new C2082m());
        }
        return arrayList;
    }

    /* renamed from: f */
    public AbstractC3023c m29606f() {
        return this.f11219a;
    }

    /* renamed from: g */
    public UpdateVersonBean m29605g() {
        List mo34874b = C1642c.m34887c().mo34874b(InitAppService.f11416a, UpdateVersonBean.class);
        if (mo34874b != null && mo34874b.size() > 0) {
            Iterator it2 = mo34874b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UpdateVersonBean updateVersonBean = (UpdateVersonBean) it2.next();
                if (updateVersonBean.getSysid() == 24) {
                    if (!updateVersonBean.getFileEncode().equals(C1680u.m34548a(new File(C3129m.m29045v() + C2080l.m33057b())))) {
                        return updateVersonBean;
                    }
                }
            }
        }
        return null;
    }
}
