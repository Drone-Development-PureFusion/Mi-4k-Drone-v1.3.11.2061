package com.mob.commons.eventrecoder;

import android.content.Context;
import android.text.TextUtils;
import com.mob.commons.C10074d;
import com.mob.commons.LockAction;
import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
/* loaded from: classes2.dex */
public final class EventRecorder {

    /* renamed from: a */
    private static Context f31111a;

    /* renamed from: b */
    private static File f31112b;

    /* renamed from: c */
    private static FileOutputStream f31113c;

    /* renamed from: a */
    private static final void m6260a(LockAction lockAction) {
        C10074d.m6265a(new File(f31111a.getFilesDir(), "comm/locks/.mrlock"), lockAction);
    }

    /* renamed from: a */
    private static final void m6257a(final String str) {
        m6260a(new LockAction() { // from class: com.mob.commons.eventrecoder.EventRecorder.2
            @Override // com.mob.commons.LockAction
            public boolean run(FileLocker fileLocker) {
                try {
                    EventRecorder.f31113c.write(str.getBytes("utf-8"));
                    EventRecorder.f31113c.flush();
                    return false;
                } catch (Throwable th) {
                    MobLog.getInstance().m6187w(th);
                    return false;
                }
            }
        });
    }

    public static final synchronized void addBegin(String str, String str2) {
        synchronized (EventRecorder.class) {
            m6257a(str + " " + str2 + " 0\n");
        }
    }

    public static final synchronized void addEnd(String str, String str2) {
        synchronized (EventRecorder.class) {
            m6257a(str + " " + str2 + " 1\n");
        }
    }

    public static final synchronized String checkRecord(final String str) {
        String str2;
        synchronized (EventRecorder.class) {
            final LinkedList linkedList = new LinkedList();
            m6260a(new LockAction() { // from class: com.mob.commons.eventrecoder.EventRecorder.3
                @Override // com.mob.commons.LockAction
                public boolean run(FileLocker fileLocker) {
                    int indexOf;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(EventRecorder.f31112b), "utf-8"));
                        for (String readLine = bufferedReader.readLine(); !TextUtils.isEmpty(readLine); readLine = bufferedReader.readLine()) {
                            String[] split = readLine.split(" ");
                            if (str.equals(split[0])) {
                                if ("0".equals(split[2])) {
                                    linkedList.add(split[1]);
                                } else if ("1".equals(split[2]) && (indexOf = linkedList.indexOf(split[1])) != -1) {
                                    linkedList.remove(indexOf);
                                }
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        MobLog.getInstance().m6199d(th);
                    }
                    return false;
                }
            });
            str2 = linkedList.size() > 0 ? (String) linkedList.get(0) : null;
        }
        return str2;
    }

    public static final synchronized void clear() {
        synchronized (EventRecorder.class) {
            m6260a(new LockAction() { // from class: com.mob.commons.eventrecoder.EventRecorder.4
                @Override // com.mob.commons.LockAction
                public boolean run(FileLocker fileLocker) {
                    try {
                        EventRecorder.f31113c.close();
                        EventRecorder.f31112b.delete();
                        File unused = EventRecorder.f31112b = new File(EventRecorder.f31111a.getFilesDir(), ".mrecord");
                        EventRecorder.f31112b.createNewFile();
                        FileOutputStream unused2 = EventRecorder.f31113c = new FileOutputStream(EventRecorder.f31112b, true);
                        return false;
                    } catch (Throwable th) {
                        MobLog.getInstance().m6187w(th);
                        return false;
                    }
                }
            });
        }
    }

    public static final synchronized void prepare(Context context) {
        synchronized (EventRecorder.class) {
            f31111a = context.getApplicationContext();
            m6260a(new LockAction() { // from class: com.mob.commons.eventrecoder.EventRecorder.1
                @Override // com.mob.commons.LockAction
                public boolean run(FileLocker fileLocker) {
                    try {
                        File unused = EventRecorder.f31112b = new File(EventRecorder.f31111a.getFilesDir(), ".mrecord");
                        if (!EventRecorder.f31112b.exists()) {
                            EventRecorder.f31112b.createNewFile();
                        }
                        FileOutputStream unused2 = EventRecorder.f31113c = new FileOutputStream(EventRecorder.f31112b, true);
                        return false;
                    } catch (Throwable th) {
                        MobLog.getInstance().m6187w(th);
                        return false;
                    }
                }
            });
        }
    }
}
