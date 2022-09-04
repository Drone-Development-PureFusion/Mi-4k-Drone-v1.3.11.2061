package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.fitness.C5129d;
import com.google.android.gms.plus.C8954e;
import com.google.android.gms.plus.p249a.p250a.AbstractC8923a;
import com.google.firebase.p251a.C9654a;
import com.tencent.p263mm.sdk.contact.RContact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class PersonEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a {

    /* renamed from: a */
    final Set<Integer> f28522a;

    /* renamed from: b */
    final int f28523b;

    /* renamed from: c */
    String f28524c;

    /* renamed from: d */
    AgeRangeEntity f28525d;

    /* renamed from: e */
    String f28526e;

    /* renamed from: f */
    String f28527f;

    /* renamed from: g */
    int f28528g;

    /* renamed from: h */
    CoverEntity f28529h;

    /* renamed from: i */
    String f28530i;

    /* renamed from: j */
    String f28531j;

    /* renamed from: k */
    int f28532k;

    /* renamed from: l */
    String f28533l;

    /* renamed from: m */
    ImageEntity f28534m;

    /* renamed from: n */
    boolean f28535n;

    /* renamed from: o */
    String f28536o;

    /* renamed from: p */
    NameEntity f28537p;

    /* renamed from: q */
    String f28538q;

    /* renamed from: r */
    int f28539r;

    /* renamed from: s */
    List<OrganizationsEntity> f28540s;

    /* renamed from: t */
    List<PlacesLivedEntity> f28541t;

    /* renamed from: u */
    int f28542u;

    /* renamed from: v */
    int f28543v;

    /* renamed from: w */
    String f28544w;

    /* renamed from: x */
    String f28545x;

    /* renamed from: y */
    List<UrlsEntity> f28546y;

    /* renamed from: z */
    boolean f28547z;
    public static final C8976a CREATOR = new C8976a();

    /* renamed from: A */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28521A = new HashMap<>();

    /* loaded from: classes2.dex */
    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8924a {
        public static final C8977b CREATOR = new C8977b();

        /* renamed from: e */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28548e = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28549a;

        /* renamed from: b */
        final int f28550b;

        /* renamed from: c */
        int f28551c;

        /* renamed from: d */
        int f28552d;

        static {
            f28548e.put("max", FastJsonResponse.Field.m23287a("max", 2));
            f28548e.put("min", FastJsonResponse.Field.m23287a("min", 3));
        }

        public AgeRangeEntity() {
            this.f28550b = 1;
            this.f28549a = new HashSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AgeRangeEntity(Set<Integer> set, int i, int i2, int i3) {
            this.f28549a = set;
            this.f28550b = i;
            this.f28551c = i2;
            this.f28552d = i3;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28549a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 2:
                    return Integer.valueOf(this.f28551c);
                case 3:
                    return Integer.valueOf(this.f28552d);
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            AgeRangeEntity ageRangeEntity = (AgeRangeEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28548e.values()) {
                if (mo9534a(field)) {
                    if (ageRangeEntity.mo9534a(field) && mo9533b(field).equals(ageRangeEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (ageRangeEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28548e;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8924a
        /* renamed from: g */
        public int mo9605g() {
            return this.f28551c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8924a
        /* renamed from: h */
        public boolean mo9604h() {
            return this.f28549a.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28548e.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8924a
        /* renamed from: i */
        public int mo9603i() {
            return this.f28552d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8924a
        /* renamed from: j */
        public boolean mo9602j() {
            return this.f28549a.contains(3);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: k */
        public AgeRangeEntity mo7785a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8977b c8977b = CREATOR;
            C8977b.m9516a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CoverEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8925b {
        public static final C8978c CREATOR = new C8978c();

        /* renamed from: f */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28553f = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28554a;

        /* renamed from: b */
        final int f28555b;

        /* renamed from: c */
        CoverInfoEntity f28556c;

        /* renamed from: d */
        CoverPhotoEntity f28557d;

        /* renamed from: e */
        int f28558e;

        /* loaded from: classes2.dex */
        public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8925b.AbstractC8926a {
            public static final C8979d CREATOR = new C8979d();

            /* renamed from: e */
            private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28559e = new HashMap<>();

            /* renamed from: a */
            final Set<Integer> f28560a;

            /* renamed from: b */
            final int f28561b;

            /* renamed from: c */
            int f28562c;

            /* renamed from: d */
            int f28563d;

            static {
                f28559e.put("leftImageOffset", FastJsonResponse.Field.m23287a("leftImageOffset", 2));
                f28559e.put("topImageOffset", FastJsonResponse.Field.m23287a("topImageOffset", 3));
            }

            public CoverInfoEntity() {
                this.f28561b = 1;
                this.f28560a = new HashSet();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public CoverInfoEntity(Set<Integer> set, int i, int i2, int i3) {
                this.f28560a = set;
                this.f28561b = i;
                this.f28562c = i2;
                this.f28563d = i3;
            }

            @Override // com.google.android.gms.common.server.response.FastJsonResponse
            /* renamed from: a */
            protected boolean mo9534a(FastJsonResponse.Field field) {
                return this.f28560a.contains(Integer.valueOf(field.m23276g()));
            }

            @Override // com.google.android.gms.common.server.response.FastJsonResponse
            /* renamed from: b */
            protected Object mo9533b(FastJsonResponse.Field field) {
                switch (field.m23276g()) {
                    case 2:
                        return Integer.valueOf(this.f28562c);
                    case 3:
                        return Integer.valueOf(this.f28563d);
                    default:
                        throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
                }
            }

            @Override // com.google.android.gms.common.data.AbstractC4527f
            /* renamed from: b */
            public boolean mo7790b() {
                return true;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverInfoEntity coverInfoEntity = (CoverInfoEntity) obj;
                for (FastJsonResponse.Field<?, ?> field : f28559e.values()) {
                    if (mo9534a(field)) {
                        if (coverInfoEntity.mo9534a(field) && mo9533b(field).equals(coverInfoEntity.mo9533b(field))) {
                        }
                        return false;
                    } else if (coverInfoEntity.mo9534a(field)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.android.gms.common.server.response.FastJsonResponse
            /* renamed from: f */
            public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
                return f28559e;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8926a
            /* renamed from: g */
            public int mo9591g() {
                return this.f28562c;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8926a
            /* renamed from: h */
            public boolean mo9590h() {
                return this.f28560a.contains(2);
            }

            public int hashCode() {
                int i = 0;
                Iterator<FastJsonResponse.Field<?, ?>> it2 = f28559e.values().iterator();
                while (true) {
                    int i2 = i;
                    if (it2.hasNext()) {
                        FastJsonResponse.Field<?, ?> next = it2.next();
                        if (mo9534a(next)) {
                            i = mo9533b(next).hashCode() + i2 + next.m23276g();
                        } else {
                            i = i2;
                        }
                    } else {
                        return i2;
                    }
                }
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8926a
            /* renamed from: i */
            public int mo9589i() {
                return this.f28563d;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8926a
            /* renamed from: j */
            public boolean mo9588j() {
                return this.f28560a.contains(3);
            }

            @Override // com.google.android.gms.common.data.AbstractC4527f
            /* renamed from: k */
            public CoverInfoEntity mo7785a() {
                return this;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                C8979d c8979d = CREATOR;
                C8979d.m9510a(this, parcel, i);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8925b.AbstractC8927b {
            public static final C8980e CREATOR = new C8980e();

            /* renamed from: f */
            private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28564f = new HashMap<>();

            /* renamed from: a */
            final Set<Integer> f28565a;

            /* renamed from: b */
            final int f28566b;

            /* renamed from: c */
            int f28567c;

            /* renamed from: d */
            String f28568d;

            /* renamed from: e */
            int f28569e;

            static {
                f28564f.put(FimiMediaMeta.IJKM_KEY_HEIGHT, FastJsonResponse.Field.m23287a(FimiMediaMeta.IJKM_KEY_HEIGHT, 2));
                f28564f.put("url", FastJsonResponse.Field.m23280c("url", 3));
                f28564f.put(FimiMediaMeta.IJKM_KEY_WIDTH, FastJsonResponse.Field.m23287a(FimiMediaMeta.IJKM_KEY_WIDTH, 4));
            }

            public CoverPhotoEntity() {
                this.f28566b = 1;
                this.f28565a = new HashSet();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public CoverPhotoEntity(Set<Integer> set, int i, int i2, String str, int i3) {
                this.f28565a = set;
                this.f28566b = i;
                this.f28567c = i2;
                this.f28568d = str;
                this.f28569e = i3;
            }

            @Override // com.google.android.gms.common.server.response.FastJsonResponse
            /* renamed from: a */
            protected boolean mo9534a(FastJsonResponse.Field field) {
                return this.f28565a.contains(Integer.valueOf(field.m23276g()));
            }

            @Override // com.google.android.gms.common.server.response.FastJsonResponse
            /* renamed from: b */
            protected Object mo9533b(FastJsonResponse.Field field) {
                switch (field.m23276g()) {
                    case 2:
                        return Integer.valueOf(this.f28567c);
                    case 3:
                        return this.f28568d;
                    case 4:
                        return Integer.valueOf(this.f28569e);
                    default:
                        throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
                }
            }

            @Override // com.google.android.gms.common.data.AbstractC4527f
            /* renamed from: b */
            public boolean mo7790b() {
                return true;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                CoverPhotoEntity coverPhotoEntity = (CoverPhotoEntity) obj;
                for (FastJsonResponse.Field<?, ?> field : f28564f.values()) {
                    if (mo9534a(field)) {
                        if (coverPhotoEntity.mo9534a(field) && mo9533b(field).equals(coverPhotoEntity.mo9533b(field))) {
                        }
                        return false;
                    } else if (coverPhotoEntity.mo9534a(field)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.android.gms.common.server.response.FastJsonResponse
            /* renamed from: f */
            public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
                return f28564f;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8927b
            /* renamed from: g */
            public int mo9585g() {
                return this.f28567c;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8927b
            /* renamed from: h */
            public boolean mo9584h() {
                return this.f28565a.contains(2);
            }

            public int hashCode() {
                int i = 0;
                Iterator<FastJsonResponse.Field<?, ?>> it2 = f28564f.values().iterator();
                while (true) {
                    int i2 = i;
                    if (it2.hasNext()) {
                        FastJsonResponse.Field<?, ?> next = it2.next();
                        if (mo9534a(next)) {
                            i = mo9533b(next).hashCode() + i2 + next.m23276g();
                        } else {
                            i = i2;
                        }
                    } else {
                        return i2;
                    }
                }
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8927b
            /* renamed from: i */
            public String mo9583i() {
                return this.f28568d;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8927b
            /* renamed from: j */
            public boolean mo9582j() {
                return this.f28565a.contains(3);
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8927b
            /* renamed from: k */
            public int mo9581k() {
                return this.f28569e;
            }

            @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b.AbstractC8927b
            /* renamed from: l */
            public boolean mo9580l() {
                return this.f28565a.contains(4);
            }

            @Override // com.google.android.gms.common.data.AbstractC4527f
            /* renamed from: m */
            public CoverPhotoEntity mo7785a() {
                return this;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                C8980e c8980e = CREATOR;
                C8980e.m9507a(this, parcel, i);
            }
        }

        static {
            f28553f.put("coverInfo", FastJsonResponse.Field.m23285a("coverInfo", 2, CoverInfoEntity.class));
            f28553f.put("coverPhoto", FastJsonResponse.Field.m23285a("coverPhoto", 3, CoverPhotoEntity.class));
            f28553f.put("layout", FastJsonResponse.Field.m23286a("layout", 4, new StringToIntConverter().m23310a("banner", 0), false));
        }

        public CoverEntity() {
            this.f28555b = 1;
            this.f28554a = new HashSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CoverEntity(Set<Integer> set, int i, CoverInfoEntity coverInfoEntity, CoverPhotoEntity coverPhotoEntity, int i2) {
            this.f28554a = set;
            this.f28555b = i;
            this.f28556c = coverInfoEntity;
            this.f28557d = coverPhotoEntity;
            this.f28558e = i2;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28554a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 2:
                    return this.f28556c;
                case 3:
                    return this.f28557d;
                case 4:
                    return Integer.valueOf(this.f28558e);
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CoverEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            CoverEntity coverEntity = (CoverEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28553f.values()) {
                if (mo9534a(field)) {
                    if (coverEntity.mo9534a(field) && mo9533b(field).equals(coverEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (coverEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28553f;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b
        /* renamed from: g */
        public AbstractC8923a.AbstractC8925b.AbstractC8926a mo9599g() {
            return this.f28556c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b
        /* renamed from: h */
        public boolean mo9598h() {
            return this.f28554a.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28553f.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b
        /* renamed from: i */
        public AbstractC8923a.AbstractC8925b.AbstractC8927b mo9597i() {
            return this.f28557d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b
        /* renamed from: j */
        public boolean mo9596j() {
            return this.f28554a.contains(3);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b
        /* renamed from: k */
        public int mo9595k() {
            return this.f28558e;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8925b
        /* renamed from: l */
        public boolean mo9594l() {
            return this.f28554a.contains(4);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: m */
        public CoverEntity mo7785a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8978c c8978c = CREATOR;
            C8978c.m9513a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ImageEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8930d {
        public static final C8981f CREATOR = new C8981f();

        /* renamed from: d */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28570d = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28571a;

        /* renamed from: b */
        final int f28572b;

        /* renamed from: c */
        String f28573c;

        static {
            f28570d.put("url", FastJsonResponse.Field.m23280c("url", 2));
        }

        public ImageEntity() {
            this.f28572b = 1;
            this.f28571a = new HashSet();
        }

        public ImageEntity(String str) {
            this.f28571a = new HashSet();
            this.f28572b = 1;
            this.f28573c = str;
            this.f28571a.add(2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImageEntity(Set<Integer> set, int i, String str) {
            this.f28571a = set;
            this.f28572b = i;
            this.f28573c = str;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28571a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 2:
                    return this.f28573c;
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageEntity imageEntity = (ImageEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28570d.values()) {
                if (mo9534a(field)) {
                    if (imageEntity.mo9534a(field) && mo9533b(field).equals(imageEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (imageEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28570d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8930d
        /* renamed from: g */
        public String mo9577g() {
            return this.f28573c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8930d
        /* renamed from: h */
        public boolean mo9576h() {
            return this.f28571a.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28570d.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: i */
        public ImageEntity mo7785a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8981f c8981f = CREATOR;
            C8981f.m9504a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class NameEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8931e {
        public static final C8982g CREATOR = new C8982g();

        /* renamed from: i */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28574i = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28575a;

        /* renamed from: b */
        final int f28576b;

        /* renamed from: c */
        String f28577c;

        /* renamed from: d */
        String f28578d;

        /* renamed from: e */
        String f28579e;

        /* renamed from: f */
        String f28580f;

        /* renamed from: g */
        String f28581g;

        /* renamed from: h */
        String f28582h;

        static {
            f28574i.put("familyName", FastJsonResponse.Field.m23280c("familyName", 2));
            f28574i.put("formatted", FastJsonResponse.Field.m23280c("formatted", 3));
            f28574i.put("givenName", FastJsonResponse.Field.m23280c("givenName", 4));
            f28574i.put("honorificPrefix", FastJsonResponse.Field.m23280c("honorificPrefix", 5));
            f28574i.put("honorificSuffix", FastJsonResponse.Field.m23280c("honorificSuffix", 6));
            f28574i.put("middleName", FastJsonResponse.Field.m23280c("middleName", 7));
        }

        public NameEntity() {
            this.f28576b = 1;
            this.f28575a = new HashSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public NameEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f28575a = set;
            this.f28576b = i;
            this.f28577c = str;
            this.f28578d = str2;
            this.f28579e = str3;
            this.f28580f = str4;
            this.f28581g = str5;
            this.f28582h = str6;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28575a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 2:
                    return this.f28577c;
                case 3:
                    return this.f28578d;
                case 4:
                    return this.f28579e;
                case 5:
                    return this.f28580f;
                case 6:
                    return this.f28581g;
                case 7:
                    return this.f28582h;
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            NameEntity nameEntity = (NameEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28574i.values()) {
                if (mo9534a(field)) {
                    if (nameEntity.mo9534a(field) && mo9533b(field).equals(nameEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (nameEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28574i;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: g */
        public String mo9573g() {
            return this.f28577c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: h */
        public boolean mo9572h() {
            return this.f28575a.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28574i.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: i */
        public String mo9571i() {
            return this.f28578d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: j */
        public boolean mo9570j() {
            return this.f28575a.contains(3);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: k */
        public String mo9569k() {
            return this.f28579e;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: l */
        public boolean mo9568l() {
            return this.f28575a.contains(4);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: m */
        public String mo9567m() {
            return this.f28580f;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: n */
        public boolean mo9566n() {
            return this.f28575a.contains(5);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: o */
        public String mo9565o() {
            return this.f28581g;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: p */
        public boolean mo9564p() {
            return this.f28575a.contains(6);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: q */
        public String mo9563q() {
            return this.f28582h;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8931e
        /* renamed from: r */
        public boolean mo9562r() {
            return this.f28575a.contains(7);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: s */
        public NameEntity mo7785a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8982g c8982g = CREATOR;
            C8982g.m9501a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8933g {
        public static final C8983h CREATOR = new C8983h();

        /* renamed from: l */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28583l = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28584a;

        /* renamed from: b */
        final int f28585b;

        /* renamed from: c */
        String f28586c;

        /* renamed from: d */
        String f28587d;

        /* renamed from: e */
        String f28588e;

        /* renamed from: f */
        String f28589f;

        /* renamed from: g */
        String f28590g;

        /* renamed from: h */
        boolean f28591h;

        /* renamed from: i */
        String f28592i;

        /* renamed from: j */
        String f28593j;

        /* renamed from: k */
        int f28594k;

        static {
            f28583l.put("department", FastJsonResponse.Field.m23280c("department", 2));
            f28583l.put("description", FastJsonResponse.Field.m23280c("description", 3));
            f28583l.put("endDate", FastJsonResponse.Field.m23280c("endDate", 4));
            f28583l.put(C9654a.C9656b.f30231p, FastJsonResponse.Field.m23280c(C9654a.C9656b.f30231p, 5));
            f28583l.put("name", FastJsonResponse.Field.m23280c("name", 6));
            f28583l.put("primary", FastJsonResponse.Field.m23283b("primary", 7));
            f28583l.put("startDate", FastJsonResponse.Field.m23280c("startDate", 8));
            f28583l.put("title", FastJsonResponse.Field.m23280c("title", 9));
            f28583l.put("type", FastJsonResponse.Field.m23286a("type", 10, new StringToIntConverter().m23310a("work", 0).m23310a("school", 1), false));
        }

        public OrganizationsEntity() {
            this.f28585b = 1;
            this.f28584a = new HashSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OrganizationsEntity(Set<Integer> set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f28584a = set;
            this.f28585b = i;
            this.f28586c = str;
            this.f28587d = str2;
            this.f28588e = str3;
            this.f28589f = str4;
            this.f28590g = str5;
            this.f28591h = z;
            this.f28592i = str6;
            this.f28593j = str7;
            this.f28594k = i2;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28584a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 2:
                    return this.f28586c;
                case 3:
                    return this.f28587d;
                case 4:
                    return this.f28588e;
                case 5:
                    return this.f28589f;
                case 6:
                    return this.f28590g;
                case 7:
                    return Boolean.valueOf(this.f28591h);
                case 8:
                    return this.f28592i;
                case 9:
                    return this.f28593j;
                case 10:
                    return Integer.valueOf(this.f28594k);
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            OrganizationsEntity organizationsEntity = (OrganizationsEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28583l.values()) {
                if (mo9534a(field)) {
                    if (organizationsEntity.mo9534a(field) && mo9533b(field).equals(organizationsEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (organizationsEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28583l;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: g */
        public String mo9559g() {
            return this.f28586c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: h */
        public boolean mo9558h() {
            return this.f28584a.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28583l.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: i */
        public String mo9557i() {
            return this.f28587d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: j */
        public boolean mo9556j() {
            return this.f28584a.contains(3);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: k */
        public String mo9555k() {
            return this.f28588e;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: l */
        public boolean mo9554l() {
            return this.f28584a.contains(4);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: m */
        public String mo9553m() {
            return this.f28589f;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: n */
        public boolean mo9552n() {
            return this.f28584a.contains(5);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: o */
        public String mo9551o() {
            return this.f28590g;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: p */
        public boolean mo9550p() {
            return this.f28584a.contains(6);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: q */
        public boolean mo9549q() {
            return this.f28591h;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: r */
        public boolean mo9548r() {
            return this.f28584a.contains(7);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: s */
        public String mo9547s() {
            return this.f28592i;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: t */
        public boolean mo9546t() {
            return this.f28584a.contains(8);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: u */
        public String mo9545u() {
            return this.f28593j;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: v */
        public boolean mo9544v() {
            return this.f28584a.contains(9);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: w */
        public int mo9543w() {
            return this.f28594k;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8983h c8983h = CREATOR;
            C8983h.m9498a(this, parcel, i);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8933g
        /* renamed from: x */
        public boolean mo9542x() {
            return this.f28584a.contains(10);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: y */
        public OrganizationsEntity mo7785a() {
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8935h {
        public static final C8984i CREATOR = new C8984i();

        /* renamed from: e */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28595e = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28596a;

        /* renamed from: b */
        final int f28597b;

        /* renamed from: c */
        boolean f28598c;

        /* renamed from: d */
        String f28599d;

        static {
            f28595e.put("primary", FastJsonResponse.Field.m23283b("primary", 2));
            f28595e.put("value", FastJsonResponse.Field.m23280c("value", 3));
        }

        public PlacesLivedEntity() {
            this.f28597b = 1;
            this.f28596a = new HashSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PlacesLivedEntity(Set<Integer> set, int i, boolean z, String str) {
            this.f28596a = set;
            this.f28597b = i;
            this.f28598c = z;
            this.f28599d = str;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28596a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 2:
                    return Boolean.valueOf(this.f28598c);
                case 3:
                    return this.f28599d;
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PlacesLivedEntity placesLivedEntity = (PlacesLivedEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28595e.values()) {
                if (mo9534a(field)) {
                    if (placesLivedEntity.mo9534a(field) && mo9533b(field).equals(placesLivedEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (placesLivedEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28595e;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8935h
        /* renamed from: g */
        public boolean mo9539g() {
            return this.f28598c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8935h
        /* renamed from: h */
        public boolean mo9538h() {
            return this.f28596a.contains(2);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28595e.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8935h
        /* renamed from: i */
        public String mo9537i() {
            return this.f28599d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8935h
        /* renamed from: j */
        public boolean mo9536j() {
            return this.f28596a.contains(3);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: k */
        public PlacesLivedEntity mo7785a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8984i c8984i = CREATOR;
            C8984i.m9495a(this, parcel, i);
        }
    }

    /* loaded from: classes.dex */
    public static final class UrlsEntity extends FastSafeParcelableJsonResponse implements AbstractC8923a.AbstractC8937j {
        public static final C8985j CREATOR = new C8985j();

        /* renamed from: f */
        private static final HashMap<String, FastJsonResponse.Field<?, ?>> f28600f = new HashMap<>();

        /* renamed from: a */
        final Set<Integer> f28601a;

        /* renamed from: b */
        final int f28602b;

        /* renamed from: c */
        String f28603c;

        /* renamed from: d */
        int f28604d;

        /* renamed from: e */
        String f28605e;

        /* renamed from: g */
        private final int f28606g;

        static {
            f28600f.put(C8954e.f28488i, FastJsonResponse.Field.m23280c(C8954e.f28488i, 5));
            f28600f.put("type", FastJsonResponse.Field.m23286a("type", 6, new StringToIntConverter().m23310a("home", 0).m23310a("work", 1).m23310a("blog", 2).m23310a(C4538f.f16921a, 3).m23310a(C5129d.f18301ad, 4).m23310a("otherProfile", 5).m23310a("contributor", 6).m23310a("website", 7), false));
            f28600f.put("value", FastJsonResponse.Field.m23280c("value", 4));
        }

        public UrlsEntity() {
            this.f28606g = 4;
            this.f28602b = 1;
            this.f28601a = new HashSet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public UrlsEntity(Set<Integer> set, int i, String str, int i2, String str2, int i3) {
            this.f28606g = 4;
            this.f28601a = set;
            this.f28602b = i;
            this.f28603c = str;
            this.f28604d = i2;
            this.f28605e = str2;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: a */
        protected boolean mo9534a(FastJsonResponse.Field field) {
            return this.f28601a.contains(Integer.valueOf(field.m23276g()));
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: b */
        protected Object mo9533b(FastJsonResponse.Field field) {
            switch (field.m23276g()) {
                case 4:
                    return this.f28605e;
                case 5:
                    return this.f28603c;
                case 6:
                    return Integer.valueOf(this.f28604d);
                default:
                    throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            }
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof UrlsEntity)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            UrlsEntity urlsEntity = (UrlsEntity) obj;
            for (FastJsonResponse.Field<?, ?> field : f28600f.values()) {
                if (mo9534a(field)) {
                    if (urlsEntity.mo9534a(field) && mo9533b(field).equals(urlsEntity.mo9533b(field))) {
                    }
                    return false;
                } else if (urlsEntity.mo9534a(field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastJsonResponse
        /* renamed from: f */
        public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
            return f28600f;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8937j
        /* renamed from: g */
        public String mo9530g() {
            return this.f28603c;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8937j
        /* renamed from: h */
        public boolean mo9529h() {
            return this.f28601a.contains(5);
        }

        public int hashCode() {
            int i = 0;
            Iterator<FastJsonResponse.Field<?, ?>> it2 = f28600f.values().iterator();
            while (true) {
                int i2 = i;
                if (it2.hasNext()) {
                    FastJsonResponse.Field<?, ?> next = it2.next();
                    if (mo9534a(next)) {
                        i = mo9533b(next).hashCode() + i2 + next.m23276g();
                    } else {
                        i = i2;
                    }
                } else {
                    return i2;
                }
            }
        }

        @Deprecated
        /* renamed from: i */
        public int m9528i() {
            return 4;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8937j
        /* renamed from: j */
        public int mo9527j() {
            return this.f28604d;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8937j
        /* renamed from: k */
        public boolean mo9526k() {
            return this.f28601a.contains(6);
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8937j
        /* renamed from: l */
        public String mo9525l() {
            return this.f28605e;
        }

        @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a.AbstractC8937j
        /* renamed from: m */
        public boolean mo9524m() {
            return this.f28601a.contains(4);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: n */
        public UrlsEntity mo7785a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8985j c8985j = CREATOR;
            C8985j.m9492a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.plus.internal.model.people.PersonEntity$a */
    /* loaded from: classes2.dex */
    public static class C8975a {
        /* renamed from: a */
        public static int m9522a(String str) {
            if (str.equals("person")) {
                return 0;
            }
            if (str.equals("page")) {
                return 1;
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown objectType string: ".concat(valueOf) : new String("Unknown objectType string: "));
        }
    }

    static {
        f28521A.put("aboutMe", FastJsonResponse.Field.m23280c("aboutMe", 2));
        f28521A.put("ageRange", FastJsonResponse.Field.m23285a("ageRange", 3, AgeRangeEntity.class));
        f28521A.put("birthday", FastJsonResponse.Field.m23280c("birthday", 4));
        f28521A.put("braggingRights", FastJsonResponse.Field.m23280c("braggingRights", 5));
        f28521A.put("circledByCount", FastJsonResponse.Field.m23287a("circledByCount", 6));
        f28521A.put("cover", FastJsonResponse.Field.m23285a("cover", 7, CoverEntity.class));
        f28521A.put("currentLocation", FastJsonResponse.Field.m23280c("currentLocation", 8));
        f28521A.put("displayName", FastJsonResponse.Field.m23280c("displayName", 9));
        f28521A.put("gender", FastJsonResponse.Field.m23286a("gender", 12, new StringToIntConverter().m23310a("male", 0).m23310a("female", 1).m23310a(C5129d.f18301ad, 2), false));
        f28521A.put("id", FastJsonResponse.Field.m23280c("id", 14));
        f28521A.put("image", FastJsonResponse.Field.m23285a("image", 15, ImageEntity.class));
        f28521A.put("isPlusUser", FastJsonResponse.Field.m23283b("isPlusUser", 16));
        f28521A.put("language", FastJsonResponse.Field.m23280c("language", 18));
        f28521A.put("name", FastJsonResponse.Field.m23285a("name", 19, NameEntity.class));
        f28521A.put(RContact.COL_NICKNAME, FastJsonResponse.Field.m23280c(RContact.COL_NICKNAME, 20));
        f28521A.put("objectType", FastJsonResponse.Field.m23286a("objectType", 21, new StringToIntConverter().m23310a("person", 0).m23310a("page", 1), false));
        f28521A.put("organizations", FastJsonResponse.Field.m23282b("organizations", 22, OrganizationsEntity.class));
        f28521A.put("placesLived", FastJsonResponse.Field.m23282b("placesLived", 23, PlacesLivedEntity.class));
        f28521A.put("plusOneCount", FastJsonResponse.Field.m23287a("plusOneCount", 24));
        f28521A.put("relationshipStatus", FastJsonResponse.Field.m23286a("relationshipStatus", 25, new StringToIntConverter().m23310a("single", 0).m23310a("in_a_relationship", 1).m23310a("engaged", 2).m23310a("married", 3).m23310a("its_complicated", 4).m23310a("open_relationship", 5).m23310a("widowed", 6).m23310a("in_domestic_partnership", 7).m23310a("in_civil_union", 8), false));
        f28521A.put("tagline", FastJsonResponse.Field.m23280c("tagline", 26));
        f28521A.put("url", FastJsonResponse.Field.m23280c("url", 27));
        f28521A.put("urls", FastJsonResponse.Field.m23282b("urls", 28, UrlsEntity.class));
        f28521A.put("verified", FastJsonResponse.Field.m23283b("verified", 29));
    }

    public PersonEntity() {
        this.f28523b = 1;
        this.f28522a = new HashSet();
    }

    public PersonEntity(String str, String str2, ImageEntity imageEntity, int i, String str3) {
        this.f28523b = 1;
        this.f28522a = new HashSet();
        this.f28531j = str;
        this.f28522a.add(9);
        this.f28533l = str2;
        this.f28522a.add(14);
        this.f28534m = imageEntity;
        this.f28522a.add(15);
        this.f28539r = i;
        this.f28522a.add(21);
        this.f28545x = str3;
        this.f28522a.add(27);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PersonEntity(Set<Integer> set, int i, String str, AgeRangeEntity ageRangeEntity, String str2, String str3, int i2, CoverEntity coverEntity, String str4, String str5, int i3, String str6, ImageEntity imageEntity, boolean z, String str7, NameEntity nameEntity, String str8, int i4, List<OrganizationsEntity> list, List<PlacesLivedEntity> list2, int i5, int i6, String str9, String str10, List<UrlsEntity> list3, boolean z2) {
        this.f28522a = set;
        this.f28523b = i;
        this.f28524c = str;
        this.f28525d = ageRangeEntity;
        this.f28526e = str2;
        this.f28527f = str3;
        this.f28528g = i2;
        this.f28529h = coverEntity;
        this.f28530i = str4;
        this.f28531j = str5;
        this.f28532k = i3;
        this.f28533l = str6;
        this.f28534m = imageEntity;
        this.f28535n = z;
        this.f28536o = str7;
        this.f28537p = nameEntity;
        this.f28538q = str8;
        this.f28539r = i4;
        this.f28540s = list;
        this.f28541t = list2;
        this.f28542u = i5;
        this.f28543v = i6;
        this.f28544w = str9;
        this.f28545x = str10;
        this.f28546y = list3;
        this.f28547z = z2;
    }

    /* renamed from: a */
    public static PersonEntity m9609a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        PersonEntity personEntity = (PersonEntity) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return personEntity;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: A */
    public AbstractC8923a.AbstractC8930d mo9491A() {
        return this.f28534m;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: B */
    public boolean mo9490B() {
        return this.f28522a.contains(15);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: C */
    public boolean mo9489C() {
        return this.f28535n;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: D */
    public boolean mo9488D() {
        return this.f28522a.contains(16);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: E */
    public String mo9487E() {
        return this.f28536o;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: F */
    public boolean mo9486F() {
        return this.f28522a.contains(18);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: G */
    public AbstractC8923a.AbstractC8931e mo9485G() {
        return this.f28537p;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: H */
    public boolean mo9484H() {
        return this.f28522a.contains(19);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: I */
    public String mo9483I() {
        return this.f28538q;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: J */
    public boolean mo9482J() {
        return this.f28522a.contains(20);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: K */
    public int mo9481K() {
        return this.f28539r;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: L */
    public boolean mo9480L() {
        return this.f28522a.contains(21);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: M */
    public List<AbstractC8923a.AbstractC8933g> mo9479M() {
        return (ArrayList) this.f28540s;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: N */
    public boolean mo9478N() {
        return this.f28522a.contains(22);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: O */
    public List<AbstractC8923a.AbstractC8935h> mo9477O() {
        return (ArrayList) this.f28541t;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: P */
    public boolean mo9476P() {
        return this.f28522a.contains(23);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: Q */
    public int mo9475Q() {
        return this.f28542u;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: R */
    public boolean mo9474R() {
        return this.f28522a.contains(24);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: S */
    public int mo9473S() {
        return this.f28543v;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: T */
    public boolean mo9472T() {
        return this.f28522a.contains(25);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: U */
    public String mo9471U() {
        return this.f28544w;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: V */
    public boolean mo9470V() {
        return this.f28522a.contains(26);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: W */
    public String mo9469W() {
        return this.f28545x;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: X */
    public boolean mo9468X() {
        return this.f28522a.contains(27);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: Y */
    public List<AbstractC8923a.AbstractC8937j> mo9467Y() {
        return (ArrayList) this.f28546y;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: Z */
    public boolean mo9466Z() {
        return this.f28522a.contains(28);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    protected boolean mo9534a(FastJsonResponse.Field field) {
        return this.f28522a.contains(Integer.valueOf(field.m23276g()));
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: aa */
    public boolean mo9465aa() {
        return this.f28547z;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: ab */
    public boolean mo9464ab() {
        return this.f28522a.contains(29);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: ac */
    public PersonEntity mo7785a() {
        return this;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    protected Object mo9533b(FastJsonResponse.Field field) {
        switch (field.m23276g()) {
            case 2:
                return this.f28524c;
            case 3:
                return this.f28525d;
            case 4:
                return this.f28526e;
            case 5:
                return this.f28527f;
            case 6:
                return Integer.valueOf(this.f28528g);
            case 7:
                return this.f28529h;
            case 8:
                return this.f28530i;
            case 9:
                return this.f28531j;
            case 10:
            case 11:
            case 13:
            case 17:
            default:
                throw new IllegalStateException(new StringBuilder(38).append("Unknown safe parcelable id=").append(field.m23276g()).toString());
            case 12:
                return Integer.valueOf(this.f28532k);
            case 14:
                return this.f28533l;
            case 15:
                return this.f28534m;
            case 16:
                return Boolean.valueOf(this.f28535n);
            case 18:
                return this.f28536o;
            case 19:
                return this.f28537p;
            case 20:
                return this.f28538q;
            case 21:
                return Integer.valueOf(this.f28539r);
            case 22:
                return this.f28540s;
            case 23:
                return this.f28541t;
            case 24:
                return Integer.valueOf(this.f28542u);
            case 25:
                return Integer.valueOf(this.f28543v);
            case 26:
                return this.f28544w;
            case 27:
                return this.f28545x;
            case 28:
                return this.f28546y;
            case 29:
                return Boolean.valueOf(this.f28547z);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonEntity personEntity = (PersonEntity) obj;
        for (FastJsonResponse.Field<?, ?> field : f28521A.values()) {
            if (mo9534a(field)) {
                if (personEntity.mo9534a(field) && mo9533b(field).equals(personEntity.mo9533b(field))) {
                }
                return false;
            } else if (personEntity.mo9534a(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: f */
    public HashMap<String, FastJsonResponse.Field<?, ?>> mo9532c() {
        return f28521A;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: g */
    public String mo9459g() {
        return this.f28524c;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: h */
    public boolean mo9458h() {
        return this.f28522a.contains(2);
    }

    public int hashCode() {
        int i = 0;
        Iterator<FastJsonResponse.Field<?, ?>> it2 = f28521A.values().iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                FastJsonResponse.Field<?, ?> next = it2.next();
                if (mo9534a(next)) {
                    i = mo9533b(next).hashCode() + i2 + next.m23276g();
                } else {
                    i = i2;
                }
            } else {
                return i2;
            }
        }
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: i */
    public AbstractC8923a.AbstractC8924a mo9457i() {
        return this.f28525d;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: j */
    public boolean mo9456j() {
        return this.f28522a.contains(3);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: k */
    public String mo9455k() {
        return this.f28526e;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: l */
    public boolean mo9454l() {
        return this.f28522a.contains(4);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: m */
    public String mo9453m() {
        return this.f28527f;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: n */
    public boolean mo9452n() {
        return this.f28522a.contains(5);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: o */
    public int mo9451o() {
        return this.f28528g;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: p */
    public boolean mo9450p() {
        return this.f28522a.contains(6);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: q */
    public AbstractC8923a.AbstractC8925b mo9449q() {
        return this.f28529h;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: r */
    public boolean mo9448r() {
        return this.f28522a.contains(7);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: s */
    public String mo9447s() {
        return this.f28530i;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: t */
    public boolean mo9446t() {
        return this.f28522a.contains(8);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: u */
    public String mo9445u() {
        return this.f28531j;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: v */
    public boolean mo9444v() {
        return this.f28522a.contains(9);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: w */
    public int mo9443w() {
        return this.f28532k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8976a c8976a = CREATOR;
        C8976a.m9519a(this, parcel, i);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: x */
    public boolean mo9442x() {
        return this.f28522a.contains(12);
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: y */
    public String mo9441y() {
        return this.f28533l;
    }

    @Override // com.google.android.gms.plus.p249a.p250a.AbstractC8923a
    /* renamed from: z */
    public boolean mo9440z() {
        return this.f28522a.contains(14);
    }
}
