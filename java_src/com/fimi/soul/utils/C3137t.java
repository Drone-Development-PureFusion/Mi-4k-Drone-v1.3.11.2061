package com.fimi.soul.utils;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/* renamed from: com.fimi.soul.utils.t */
/* loaded from: classes.dex */
public class C3137t extends Thread {

    /* renamed from: a */
    File[] f11841a;

    /* renamed from: b */
    private String f11842b;

    public C3137t(File[] fileArr, String str) {
        this.f11841a = fileArr;
        this.f11842b = str;
    }

    /* renamed from: a */
    public void m29027a() {
        start();
    }

    /* renamed from: a */
    public void m29026a(File file, String str) {
        int i = 0;
        try {
            if (!file.exists()) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileInputStream.close();
                    return;
                }
                i += read;
                System.out.println(i);
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e) {
            System.out.println("复制单个文件操作出错");
            e.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        File[] fileArr;
        for (File file : this.f11841a) {
            if (file != null) {
                Log.i("istep", " wwwww " + file.exists());
                m29026a(file, this.f11842b + "/" + file.getName());
            }
        }
    }
}
