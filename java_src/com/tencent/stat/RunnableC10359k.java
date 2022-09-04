package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.C10351p;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.AbstractC10327e;
import com.tencent.stat.p268a.EnumC10328f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.k */
/* loaded from: classes2.dex */
public class RunnableC10359k implements Runnable {

    /* renamed from: a */
    private AbstractC10327e f32282a;

    /* renamed from: b */
    private StatReportStrategy f32283b;

    /* renamed from: c */
    private AbstractC10335c f32284c = new C10360l(this);

    public RunnableC10359k(AbstractC10327e abstractC10327e) {
        this.f32283b = null;
        this.f32282a = abstractC10327e;
        this.f32283b = StatConfig.getStatSendStrategy();
    }

    /* renamed from: a */
    private void m5367a() {
        if (C10362n.m5351b().m5364a() <= 0) {
            m5365a(true);
            return;
        }
        C10362n.m5351b().m5361a(this.f32282a, (AbstractC10335c) null);
        C10362n.m5351b().m5363a(-1);
    }

    /* renamed from: a */
    private void m5365a(boolean z) {
        C10352d.m5372b().m5374a(this.f32282a, this.f32284c);
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        StatLogger statLogger2;
        StatLogger statLogger3;
        StatLogger statLogger4;
        StatLogger statLogger5;
        StatLogger statLogger6;
        try {
            if (!StatConfig.isEnableStatService()) {
                return;
            }
            if (this.f32282a.mo5470a() != EnumC10328f.ERROR && this.f32282a.m5473d().length() > StatConfig.getMaxReportEventLength()) {
                statLogger6 = StatService.f32152i;
                statLogger6.m5464e("Event length exceed StatConfig.getMaxReportEventLength(): " + StatConfig.getMaxReportEventLength());
                return;
            }
            if (StatConfig.getMaxSessionStatReportCount() > 0) {
                if (StatConfig.getCurSessionStatReportCount() >= StatConfig.getMaxSessionStatReportCount()) {
                    statLogger5 = StatService.f32152i;
                    statLogger5.m5464e("Times for reporting events has reached the limit of StatConfig.getMaxSessionStatReportCount() in current session.");
                    return;
                }
                StatConfig.m5514c();
            }
            statLogger2 = StatService.f32152i;
            statLogger2.m5463i("Lauch stat task in thread:" + Thread.currentThread().getName());
            Context m5474c = this.f32282a.m5474c();
            if (!C10346k.m5408h(m5474c)) {
                C10362n.m5362a(m5474c).m5361a(this.f32282a, (AbstractC10335c) null);
                return;
            }
            if (StatConfig.isEnableSmartReporting() && this.f32283b != StatReportStrategy.ONLY_WIFI_NO_CACHE && C10346k.m5410g(m5474c)) {
                this.f32283b = StatReportStrategy.INSTANT;
            }
            switch (this.f32283b) {
                case INSTANT:
                    m5367a();
                    return;
                case ONLY_WIFI:
                    if (C10346k.m5414e(m5474c)) {
                        m5367a();
                        return;
                    } else {
                        C10362n.m5362a(m5474c).m5361a(this.f32282a, (AbstractC10335c) null);
                        return;
                    }
                case APP_LAUNCH:
                case DEVELOPER:
                    C10362n.m5362a(m5474c).m5361a(this.f32282a, (AbstractC10335c) null);
                    return;
                case BATCH:
                    if (C10362n.m5362a(this.f32282a.m5474c()) == null) {
                        return;
                    }
                    C10362n.m5362a(m5474c).m5361a(this.f32282a, new C10361m(this));
                    return;
                case PERIOD:
                    try {
                        C10362n.m5362a(m5474c).m5361a(this.f32282a, (AbstractC10335c) null);
                        Long valueOf = Long.valueOf(C10351p.m5381a(m5474c, "last_period_ts", 0L));
                        Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                        if (Long.valueOf(Long.valueOf(valueOf2.longValue() - valueOf.longValue()).longValue() / 60000).longValue() <= StatConfig.getSendPeriodMinutes()) {
                            return;
                        }
                        C10362n.m5362a(m5474c).m5363a(-1);
                        C10351p.m5378b(m5474c, "last_period_ts", valueOf2.longValue());
                        return;
                    } catch (Exception e) {
                        statLogger3 = StatService.f32152i;
                        statLogger3.m5465e(e);
                        return;
                    }
                case ONLY_WIFI_NO_CACHE:
                    if (!C10346k.m5414e(m5474c)) {
                        return;
                    }
                    m5365a(false);
                    return;
                default:
                    statLogger4 = StatService.f32152i;
                    statLogger4.error("Invalid stat strategy:" + StatConfig.getStatSendStrategy());
                    return;
            }
        } catch (Throwable th) {
            statLogger = StatService.f32152i;
            statLogger.m5464e(th);
        }
    }
}
