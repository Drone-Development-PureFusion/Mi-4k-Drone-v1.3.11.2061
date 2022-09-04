package com.google.firebase.crash.internal.config.flag;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.internal.amf;
import com.google.android.gms.internal.amg;
import com.google.android.gms.internal.amk;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes2.dex */
public final class Flags {
    public static final amf<Boolean> aVh = amf.m16827a(0, "crash:enabled", (Boolean) true);
    public static final amf<String> aVi = amf.m16826a(0, "crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
    public static final amf<Integer> aVj = amf.m16829a(0, "crash:log_buffer_capacity", 100);
    public static final amf<Integer> aVk = amf.m16829a(0, "crash:log_buffer_max_total_size", 32768);
    public static final amf<Integer> aVl = amf.m16829a(0, "crash:crash_backlog_capacity", 5);
    public static final amf<Long> aVm = amf.m16828a(0, "crash:crash_backlog_max_age", 604800000L);
    public static final amf<Long> aVn = amf.m16828a(0, "crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
    public static final amf<Long> aVo = amf.m16828a(0, "crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
    public static final amf<Integer> aVp = amf.m16829a(0, "crash:retry_num_attempts", 12);
    public static final amf<Integer> aVq = amf.m16829a(0, "crash:batch_size", 5);
    public static final amf<Long> aVr = amf.m16828a(0, "crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
    public static final amf<Integer> aVs = amf.m16829a(0, "crash:frame_depth", 60);

    private Flags() {
    }

    public static final void initialize(Context context) {
        amk.m16793a();
        amg.m16817a(context);
    }
}
