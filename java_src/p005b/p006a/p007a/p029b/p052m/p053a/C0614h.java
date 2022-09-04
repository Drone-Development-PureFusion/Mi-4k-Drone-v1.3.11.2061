package p005b.p006a.p007a.p029b.p052m.p053a;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: b.a.a.b.m.a.h */
/* loaded from: classes.dex */
public class C0614h {
    /* renamed from: a */
    public static int m38713a(File[] fileArr, String str) {
        int i = Integer.MIN_VALUE;
        int length = fileArr.length;
        int i2 = 0;
        while (i2 < length) {
            int m38712b = m38712b(fileArr[i2], str);
            if (i >= m38712b) {
                m38712b = i;
            }
            i2++;
            i = m38712b;
        }
        return i;
    }

    /* renamed from: a */
    public static String m38715a(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    public static void m38717a(File file, int i) {
        if (i >= 3) {
            return;
        }
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() || !m38718a(parentFile)) {
            return;
        }
        parentFile.delete();
        m38717a(parentFile, i + 1);
    }

    /* renamed from: a */
    public static void m38714a(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() { // from class: b.a.a.b.m.a.h.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(File file, File file2) {
                return file.getName().compareTo(file2.getName());
            }
        });
    }

    /* renamed from: a */
    public static boolean m38718a(File file) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("[" + file + "] must be a directory");
        }
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* renamed from: a */
    public static File[] m38716a(File file, final String str) {
        return file == null ? new File[0] : (!file.exists() || !file.isDirectory()) ? new File[0] : file.listFiles(new FilenameFilter() { // from class: b.a.a.b.m.a.h.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.matches(str);
            }
        });
    }

    /* renamed from: b */
    public static int m38712b(File file, String str) {
        Pattern compile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = compile.matcher(name);
        if (!matcher.matches()) {
            throw new IllegalStateException("The regex [" + str + "] should match [" + name + "]");
        }
        return new Integer(matcher.group(1)).intValue();
    }

    /* renamed from: b */
    public static String m38711b(String str) {
        return str.replace('\\', '/');
    }

    /* renamed from: b */
    public static void m38710b(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() { // from class: b.a.a.b.m.a.h.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
    }
}
