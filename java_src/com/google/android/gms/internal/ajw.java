package com.google.android.gms.internal;

import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.AbstractC4993c;
import com.google.android.gms.drive.metadata.AbstractC4995e;
import com.google.android.gms.drive.metadata.AbstractC4997g;
import com.google.android.gms.drive.metadata.internal.AbstractC5013k;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.C5003b;
import com.google.android.gms.drive.metadata.internal.C5009g;
import com.google.android.gms.drive.metadata.internal.C5012j;
import com.google.android.gms.drive.metadata.internal.C5015m;
import com.google.android.gms.drive.metadata.internal.C5018o;
import com.google.android.gms.drive.metadata.internal.C5019p;
import com.google.android.gms.drive.metadata.internal.C5020q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes2.dex */
public class ajw {

    /* renamed from: a */
    public static final AbstractC4991a<DriveId> f22073a = ajz.f22106a;

    /* renamed from: b */
    public static final AbstractC4991a<String> f22074b = new C5019p("alternateLink", 4300000);

    /* renamed from: c */
    public static final C6421a f22075c = new C6421a(5000000);

    /* renamed from: d */
    public static final AbstractC4991a<String> f22076d = new C5019p("description", 4300000);

    /* renamed from: e */
    public static final AbstractC4991a<String> f22077e = new C5019p("embedLink", 4300000);

    /* renamed from: f */
    public static final AbstractC4991a<String> f22078f = new C5019p("fileExtension", 4300000);

    /* renamed from: g */
    public static final AbstractC4991a<Long> f22079g = new C5009g("fileSize", 4300000);

    /* renamed from: h */
    public static final AbstractC4991a<String> f22080h = new C5019p("folderColorRgb", 7500000);

    /* renamed from: i */
    public static final AbstractC4991a<Boolean> f22081i = new C5003b("hasThumbnail", 4300000);

    /* renamed from: j */
    public static final AbstractC4991a<String> f22082j = new C5019p("indexableText", 4300000);

    /* renamed from: k */
    public static final AbstractC4991a<Boolean> f22083k = new C5003b("isAppData", 4300000);

    /* renamed from: l */
    public static final AbstractC4991a<Boolean> f22084l = new C5003b("isCopyable", 4300000);

    /* renamed from: m */
    public static final AbstractC4991a<Boolean> f22085m = new C5003b("isEditable", 4100000);

    /* renamed from: n */
    public static final AbstractC4991a<Boolean> f22086n = new C5003b("isExplicitlyTrashed", Collections.singleton("trashed"), Collections.emptySet(), 7000000) { // from class: com.google.android.gms.internal.ajw.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.drive.metadata.internal.C5003b, com.google.android.gms.drive.metadata.AbstractC4996f
        /* renamed from: a_ */
        public Boolean mo17070c(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.m23888b("trashed", i, i2) == 2);
        }
    };

    /* renamed from: o */
    public static final AbstractC4991a<Boolean> f22087o = new C5003b("isLocalContentUpToDate", 7800000);

    /* renamed from: p */
    public static final C6422b f22088p = new C6422b("isPinned", 4100000);

    /* renamed from: q */
    public static final AbstractC4991a<Boolean> f22089q = new C5003b("isOpenable", 7200000);

    /* renamed from: r */
    public static final AbstractC4991a<Boolean> f22090r = new C5003b("isRestricted", 4300000);

    /* renamed from: s */
    public static final AbstractC4991a<Boolean> f22091s = new C5003b("isShared", 4300000);

    /* renamed from: t */
    public static final AbstractC4991a<Boolean> f22092t = new C5003b("isGooglePhotosFolder", 7000000);

    /* renamed from: u */
    public static final AbstractC4991a<Boolean> f22093u = new C5003b("isGooglePhotosRootFolder", 7000000);

    /* renamed from: v */
    public static final AbstractC4991a<Boolean> f22094v = new C5003b("isTrashable", 4400000);

    /* renamed from: w */
    public static final AbstractC4991a<Boolean> f22095w = new C5003b("isViewed", 4300000);

    /* renamed from: x */
    public static final C6423c f22096x = new C6423c(4100000);

    /* renamed from: y */
    public static final AbstractC4991a<String> f22097y = new C5019p("originalFilename", 4300000);

    /* renamed from: z */
    public static final AbstractC4997g<String> f22098z = new C5018o("ownerNames", 4300000);

    /* renamed from: A */
    public static final C5020q f22056A = new C5020q("lastModifyingUser", 6000000);

    /* renamed from: B */
    public static final C5020q f22057B = new C5020q("sharingUser", 6000000);

    /* renamed from: C */
    public static final C5015m f22058C = new C5015m(4100000);

    /* renamed from: D */
    public static final C6424d f22059D = new C6424d("quotaBytesUsed", 4300000);

    /* renamed from: E */
    public static final C6426f f22060E = new C6426f("starred", 4100000);

    /* renamed from: F */
    public static final AbstractC4991a<BitmapTeleporter> f22061F = new AbstractC5013k<BitmapTeleporter>("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000) { // from class: com.google.android.gms.internal.ajw.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.drive.metadata.AbstractC4996f
        /* renamed from: d */
        public BitmapTeleporter mo17070c(DataHolder dataHolder, int i, int i2) {
            throw new IllegalStateException("Thumbnail field is write only");
        }
    };

    /* renamed from: G */
    public static final C6427g f22062G = new C6427g("title", 4100000);

    /* renamed from: H */
    public static final C6428h f22063H = new C6428h("trashed", 4100000);

    /* renamed from: I */
    public static final AbstractC4991a<String> f22064I = new C5019p("webContentLink", 4300000);

    /* renamed from: J */
    public static final AbstractC4991a<String> f22065J = new C5019p("webViewLink", 4300000);

    /* renamed from: K */
    public static final AbstractC4991a<String> f22066K = new C5019p("uniqueIdentifier", 5000000);

    /* renamed from: L */
    public static final C5003b f22067L = new C5003b("writersCanShare", 6000000);

    /* renamed from: M */
    public static final AbstractC4991a<String> f22068M = new C5019p("role", 6000000);

    /* renamed from: N */
    public static final AbstractC4991a<String> f22069N = new C5019p("md5Checksum", 7000000);

    /* renamed from: O */
    public static final C6425e f22070O = new C6425e(7000000);

    /* renamed from: P */
    public static final AbstractC4991a<String> f22071P = new C5019p("recencyReason", 8000000);

    /* renamed from: Q */
    public static final AbstractC4991a<Boolean> f22072Q = new C5003b("subscribed", 8000000);

    /* renamed from: com.google.android.gms.internal.ajw$a */
    /* loaded from: classes2.dex */
    public static class C6421a extends ajx implements AbstractC4993c<AppVisibleCustomProperties> {
        public C6421a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$b */
    /* loaded from: classes2.dex */
    public static class C6422b extends C5003b implements AbstractC4993c<Boolean> {
        public C6422b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$c */
    /* loaded from: classes2.dex */
    public static class C6423c extends C5019p implements AbstractC4993c<String> {
        public C6423c(int i) {
            super("mimeType", i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$d */
    /* loaded from: classes2.dex */
    public static class C6424d extends C5009g implements AbstractC4995e<Long> {
        public C6424d(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$e */
    /* loaded from: classes2.dex */
    public static class C6425e extends C5012j<DriveSpace> {
        public C6425e(int i) {
            super("spaces", Arrays.asList("inDriveSpace", "isAppData", "inGooglePhotosSpace"), Collections.emptySet(), i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.drive.metadata.AbstractC4997g, com.google.android.gms.drive.metadata.AbstractC4996f
        /* renamed from: e_ */
        public Collection<DriveSpace> mo17070c(DataHolder dataHolder, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            if (dataHolder.m23884d("inDriveSpace", i, i2)) {
                arrayList.add(DriveSpace.f17523a);
            }
            if (dataHolder.m23884d("isAppData", i, i2)) {
                arrayList.add(DriveSpace.f17524b);
            }
            if (dataHolder.m23884d("inGooglePhotosSpace", i, i2)) {
                arrayList.add(DriveSpace.f17525c);
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$f */
    /* loaded from: classes2.dex */
    public static class C6426f extends C5003b implements AbstractC4993c<Boolean> {
        public C6426f(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$g */
    /* loaded from: classes2.dex */
    public static class C6427g extends C5019p implements AbstractC4993c<String>, AbstractC4995e<String> {
        public C6427g(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.google.android.gms.internal.ajw$h */
    /* loaded from: classes2.dex */
    public static class C6428h extends C5003b implements AbstractC4993c<Boolean> {
        public C6428h(String str, int i) {
            super(str, i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.drive.metadata.internal.C5003b, com.google.android.gms.drive.metadata.AbstractC4996f
        /* renamed from: a_ */
        public Boolean mo17070c(DataHolder dataHolder, int i, int i2) {
            return Boolean.valueOf(dataHolder.m23888b(a(), i, i2) != 0);
        }
    }
}
