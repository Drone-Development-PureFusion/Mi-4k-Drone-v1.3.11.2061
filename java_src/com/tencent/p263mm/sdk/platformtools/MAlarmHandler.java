package com.tencent.p263mm.sdk.platformtools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p070c.p072b.C0744a;
/* renamed from: com.tencent.mm.sdk.platformtools.MAlarmHandler */
/* loaded from: classes2.dex */
public class MAlarmHandler {
    public static final long NEXT_FIRE_INTERVAL = Long.MAX_VALUE;

    /* renamed from: aC */
    private static IBumper f31622aC;

    /* renamed from: av */
    private static int f31624av;

    /* renamed from: aB */
    private final CallBack f31625aB;

    /* renamed from: aw */
    private final int f31626aw;

    /* renamed from: ax */
    private final boolean f31627ax;

    /* renamed from: ay */
    private long f31628ay = 0;

    /* renamed from: az */
    private long f31629az = 0;

    /* renamed from: aA */
    private static Map<Integer, MAlarmHandler> f31621aA = new HashMap();

    /* renamed from: aD */
    private static boolean f31623aD = false;

    /* renamed from: com.tencent.mm.sdk.platformtools.MAlarmHandler$CallBack */
    /* loaded from: classes2.dex */
    public interface CallBack {
        boolean onTimerExpired();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MAlarmHandler$IBumper */
    /* loaded from: classes2.dex */
    public interface IBumper {
        void cancel();

        void prepare();
    }

    public MAlarmHandler(CallBack callBack, boolean z) {
        C0744a.m38271a("bumper not initialized", f31623aD);
        this.f31625aB = callBack;
        this.f31627ax = z;
        if (f31624av >= 8192) {
            f31624av = 0;
        }
        int i = f31624av + 1;
        f31624av = i;
        this.f31626aw = i;
    }

    public static long fire() {
        LinkedList linkedList = new LinkedList();
        HashSet<Integer> hashSet = new HashSet();
        hashSet.addAll(f31621aA.keySet());
        long j = Long.MAX_VALUE;
        for (Integer num : hashSet) {
            MAlarmHandler mAlarmHandler = f31621aA.get(num);
            if (mAlarmHandler != null) {
                long ticksToNow = Util.ticksToNow(mAlarmHandler.f31628ay);
                if (ticksToNow < 0) {
                    ticksToNow = 0;
                }
                if (ticksToNow > mAlarmHandler.f31629az) {
                    if (!mAlarmHandler.f31625aB.onTimerExpired() || !mAlarmHandler.f31627ax) {
                        linkedList.add(num);
                    } else {
                        j = mAlarmHandler.f31629az;
                    }
                    mAlarmHandler.f31628ay = Util.currentTicks();
                } else if (mAlarmHandler.f31629az - ticksToNow < j) {
                    j = mAlarmHandler.f31629az - ticksToNow;
                }
            }
            j = j;
        }
        for (int i = 0; i < linkedList.size(); i++) {
            f31621aA.remove(linkedList.get(i));
        }
        if (j == Long.MAX_VALUE && f31622aC != null) {
            f31622aC.cancel();
            Log.m5869v("MicroMsg.MAlarmHandler", "cancel bumper for no more handler");
        }
        return j;
    }

    public static void initAlarmBumper(IBumper iBumper) {
        f31623aD = true;
        f31622aC = iBumper;
    }

    protected void finalize() {
        stopTimer();
        super.finalize();
    }

    public void startTimer(long j) {
        long j2;
        this.f31629az = j;
        this.f31628ay = Util.currentTicks();
        long j3 = this.f31629az;
        Log.m5877d("MicroMsg.MAlarmHandler", "check need prepare: check=" + j3);
        long j4 = Long.MAX_VALUE;
        Iterator<Map.Entry<Integer, MAlarmHandler>> it2 = f31621aA.entrySet().iterator();
        while (true) {
            j2 = j4;
            if (!it2.hasNext()) {
                break;
            }
            MAlarmHandler value = it2.next().getValue();
            if (value != null) {
                long ticksToNow = Util.ticksToNow(value.f31628ay);
                if (ticksToNow < 0) {
                    ticksToNow = 0;
                }
                if (ticksToNow > value.f31629az) {
                    j4 = value.f31629az;
                } else if (value.f31629az - ticksToNow < j2) {
                    j2 = value.f31629az - ticksToNow;
                }
            }
            j4 = j2;
        }
        boolean z = j2 > j3;
        stopTimer();
        f31621aA.put(Integer.valueOf(this.f31626aw), this);
        if (f31622aC == null || !z) {
            return;
        }
        Log.m5869v("MicroMsg.MAlarmHandler", "prepare bumper");
        f31622aC.prepare();
    }

    public void stopTimer() {
        f31621aA.remove(Integer.valueOf(this.f31626aw));
    }

    public boolean stopped() {
        return !f31621aA.containsKey(Integer.valueOf(this.f31626aw));
    }
}
