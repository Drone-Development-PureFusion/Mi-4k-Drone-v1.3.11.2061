package com.tencent.p263mm.sdk.platformtools;

import android.os.SystemClock;
import java.util.ArrayList;
/* renamed from: com.tencent.mm.sdk.platformtools.TimeLogger */
/* loaded from: classes2.dex */
public class TimeLogger {

    /* renamed from: bg */
    private String f31665bg;

    /* renamed from: bh */
    private String f31666bh;

    /* renamed from: bi */
    private boolean f31667bi;

    /* renamed from: bj */
    ArrayList<Long> f31668bj;

    /* renamed from: bk */
    ArrayList<String> f31669bk;

    public TimeLogger(String str, String str2) {
        reset(str, str2);
    }

    public void addSplit(String str) {
        if (this.f31667bi) {
            return;
        }
        this.f31668bj.add(Long.valueOf(SystemClock.elapsedRealtime()));
        this.f31669bk.add(str);
    }

    public void dumpToLog() {
        long longValue;
        if (this.f31667bi) {
            return;
        }
        Log.m5877d(this.f31665bg, this.f31666bh + ": begin");
        int i = 1;
        long longValue2 = this.f31668bj.get(0).longValue();
        while (i < this.f31668bj.size()) {
            long longValue3 = this.f31668bj.get(i).longValue();
            long longValue4 = this.f31668bj.get(i - 1).longValue();
            Log.m5877d(this.f31665bg, this.f31666bh + ":      " + (longValue3 - longValue4) + " ms, " + this.f31669bk.get(i));
            i++;
            longValue2 = longValue3;
        }
        Log.m5877d(this.f31665bg, this.f31666bh + ": end, " + (longValue2 - longValue) + " ms");
    }

    public void reset() {
        this.f31667bi = false;
        if (this.f31667bi) {
            return;
        }
        if (this.f31668bj == null) {
            this.f31668bj = new ArrayList<>();
            this.f31669bk = new ArrayList<>();
        } else {
            this.f31668bj.clear();
            this.f31669bk.clear();
        }
        addSplit(null);
    }

    public void reset(String str, String str2) {
        this.f31665bg = str;
        this.f31666bh = str2;
        reset();
    }
}
