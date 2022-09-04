package com.fimi.soul.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
/* renamed from: com.fimi.soul.utils.w */
/* loaded from: classes.dex */
public class C3144w {

    /* renamed from: com.fimi.soul.utils.w$a */
    /* loaded from: classes.dex */
    public class C3149a implements FilenameFilter {
        public C3149a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(new StringBuilder().append(file.getAbsolutePath()).append("/").append(str).toString()).isDirectory();
        }
    }

    /* renamed from: com.fimi.soul.utils.w$b */
    /* loaded from: classes.dex */
    public class C3150b implements FilenameFilter {

        /* renamed from: a */
        String f11848a;

        public C3150b(String str) {
            this.f11848a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.toLowerCase().endsWith(this.f11848a) && !str.contains("&synced");
        }
    }

    /* renamed from: com.fimi.soul.utils.w$c */
    /* loaded from: classes.dex */
    public class C3151c implements FilenameFilter {

        /* renamed from: a */
        String f11850a;

        public C3151c(String str) {
            this.f11850a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.toLowerCase().endsWith(this.f11850a);
        }
    }

    /* renamed from: a */
    public String m29017a(String str) {
        File[] listFiles = new File(str).listFiles(new C3149a());
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.fimi.soul.utils.w.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
        return listFiles[0].getAbsolutePath();
    }

    /* renamed from: a */
    public boolean m29018a(File file) {
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str : list) {
                if (!m29018a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public File[] m29016a(String str, String str2) {
        File[] listFiles = new File(str).listFiles(new C3151c(str2));
        if (listFiles != null && listFiles.length > 0) {
            Arrays.sort(listFiles, new Comparator<File>() { // from class: com.fimi.soul.utils.w.4
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(File file, File file2) {
                    return (int) (file2.lastModified() - file.lastModified());
                }
            });
        }
        return listFiles;
    }

    /* renamed from: b */
    public String m29015b(String str) {
        File[] listFiles = new File(str).listFiles(new C3150b(".fc"));
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.fimi.soul.utils.w.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
        return listFiles[0].getName().replace(".fc", "");
    }

    /* renamed from: c */
    public File[] m29014c(String str) {
        File[] listFiles = new File(str).listFiles(new C3149a());
        if (listFiles != null && listFiles.length > 0) {
            Arrays.sort(listFiles, new Comparator<File>() { // from class: com.fimi.soul.utils.w.3
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(File file, File file2) {
                    return file2.getName().compareTo(file.getName());
                }
            });
        }
        return listFiles;
    }
}
