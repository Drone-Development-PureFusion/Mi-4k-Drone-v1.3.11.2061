package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.C0831d;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import java.io.File;
import p005b.p006a.p007a.p029b.p052m.C0636h;
/* loaded from: classes.dex */
public class WXAppExtendObject implements WXMediaMessage.IMediaObject {
    public String extInfo;
    public byte[] fileData;
    public String filePath;

    public WXAppExtendObject() {
    }

    public WXAppExtendObject(String str, String str2) {
        this.extInfo = str;
        this.filePath = str2;
    }

    public WXAppExtendObject(String str, byte[] bArr) {
        this.extInfo = str;
        this.fileData = bArr;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        if ((this.extInfo == null || this.extInfo.length() == 0) && ((this.filePath == null || this.filePath.length() == 0) && (this.fileData == null || this.fileData.length == 0))) {
            C0831d.m37772a().m6200d("checkArgs fail, all arguments is null", new Object[0]);
            return false;
        } else if (this.extInfo != null && this.extInfo.length() > 2048) {
            C0831d.m37772a().m6200d("checkArgs fail, extInfo is invalid", new Object[0]);
            return false;
        } else if (this.filePath != null && this.filePath.length() > 10240) {
            C0831d.m37772a().m6200d("checkArgs fail, filePath is invalid", new Object[0]);
            return false;
        } else if (this.filePath != null && new File(this.filePath).length() > C0636h.f1132b) {
            C0831d.m37772a().m6200d("checkArgs fail, fileSize is too large", new Object[0]);
            return false;
        } else if (this.fileData == null || this.fileData.length <= 10485760) {
            return true;
        } else {
            C0831d.m37772a().m6200d("checkArgs fail, fileData is too large", new Object[0]);
            return false;
        }
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxappextendobject_extInfo", this.extInfo);
        bundle.putByteArray("_wxappextendobject_fileData", this.fileData);
        bundle.putString("_wxappextendobject_filePath", this.filePath);
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
        return 7;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.extInfo = bundle.getString("_wxappextendobject_extInfo");
        this.fileData = bundle.getByteArray("_wxappextendobject_fileData");
        this.filePath = bundle.getString("_wxappextendobject_filePath");
    }
}
