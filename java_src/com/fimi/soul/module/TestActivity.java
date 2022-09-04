package com.fimi.soul.module;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.view.EVview;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class TestActivity extends Activity {

    /* renamed from: a */
    private EVview f7950a;

    /* renamed from: b */
    private int f7951b = 0;

    /* renamed from: c */
    private Handler f7952c = new Handler() { // from class: com.fimi.soul.module.TestActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            TestActivity.this.f7950a.m28944a(TestActivity.this.f7951b);
        }
    };

    /* renamed from: b */
    static /* synthetic */ int m31595b(TestActivity testActivity) {
        int i = testActivity.f7951b;
        testActivity.f7951b = i + 1;
        return i;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.ev_layout);
        this.f7950a = (EVview) findViewById(C1704R.C1706id.ev_v);
        new Timer().schedule(new TimerTask() { // from class: com.fimi.soul.module.TestActivity.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                TestActivity.this.f7952c.sendEmptyMessage(0);
                TestActivity.m31595b(TestActivity.this);
                if (TestActivity.this.f7951b == 12) {
                    TestActivity.this.f7951b = 0;
                }
            }
        }, 500L, 1000L);
    }
}
