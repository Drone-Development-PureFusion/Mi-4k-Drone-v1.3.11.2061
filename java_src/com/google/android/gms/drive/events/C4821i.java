package com.google.android.gms.drive.events;

import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.events.i */
/* loaded from: classes2.dex */
public class C4821i {
    /* renamed from: a */
    public static boolean m22651a(int i, DriveId driveId) {
        switch (i) {
            case 1:
            case 8:
                return driveId != null;
            case 2:
            case 3:
            case 5:
            case 6:
            default:
                return false;
            case 4:
            case 7:
                return driveId == null;
        }
    }
}
