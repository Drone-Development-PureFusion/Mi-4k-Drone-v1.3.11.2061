package p005b.p006a.p007a.p029b.p052m.p053a;

import java.io.File;
import p005b.p006a.p007a.p029b.p052m.C0631c;
import p005b.p006a.p007a.p029b.p052m.C0634f;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0713l;
import p005b.p006a.p007a.p029b.p058r.C0716o;
/* renamed from: b.a.a.b.m.a.n */
/* loaded from: classes.dex */
public class C0623n extends C0662f {

    /* renamed from: a */
    static String f1095a = "http://logback.qos.ch/codes.html#renamingError";

    /* renamed from: a */
    void m38692a(File file) {
        if (!C0716o.m38406b(file) || C0716o.m38404c(file)) {
            return;
        }
        throw new C0634f("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
    }

    /* renamed from: a */
    public void m38690a(String str, String str2) {
        if (str.equals(str2)) {
            e("Source and target files are the same [" + str + "]. Skipping.");
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new C0634f("File [" + str + "] does not exist.");
        }
        File file2 = new File(str2);
        m38692a(file2);
        d("Renaming file [" + file + "] to [" + file2 + "]");
        if (file.renameTo(file2)) {
            return;
        }
        e("Failed to rename file [" + file + "] as [" + file2 + "].");
        if (m38691a(file, file2)) {
            e("Detected different file systems for source [" + str + "] and target [" + str2 + "]. Attempting rename by copying.");
            m38689b(str, str2);
            return;
        }
        e("Please consider leaving the [file] option of " + C0631c.class.getSimpleName() + " empty.");
        e("See also " + f1095a);
    }

    /* renamed from: a */
    boolean m38691a(File file, File file2) {
        if (!C0713l.m38414d()) {
            return false;
        }
        try {
            return !C0619j.m38696a(file, file2.getParentFile());
        } catch (C0634f e) {
            c("Error while checking file store equality", e);
            return false;
        }
    }

    /* renamed from: b */
    public void m38689b(String str, String str2) {
        new C0716o(c_()).m38405b(str, str2);
        if (!new File(str).delete()) {
            e("Could not delete " + str);
        }
    }

    public String toString() {
        return "c.q.l.co.rolling.helper.RenameUtil";
    }
}
