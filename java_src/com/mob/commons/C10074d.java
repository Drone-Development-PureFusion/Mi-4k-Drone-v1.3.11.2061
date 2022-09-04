package com.mob.commons;

import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import java.io.File;
/* renamed from: com.mob.commons.d */
/* loaded from: classes2.dex */
public class C10074d {
    /* renamed from: a */
    public static final void m6265a(File file, LockAction lockAction) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileLocker fileLocker = new FileLocker();
            fileLocker.setLockFile(file.getAbsolutePath());
            if (!fileLocker.lock(true) || lockAction.run(fileLocker)) {
                return;
            }
            fileLocker.release();
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
    }
}
