package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.C0831d;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import java.io.File;
import p005b.p006a.p007a.p029b.p052m.C0636h;
/* loaded from: classes.dex */
public class WXFileObject implements WXMediaMessage.IMediaObject {
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
        this.fileData = null;
        this.filePath = null;
    }

    public WXFileObject(String str) {
        this.filePath = str;
    }

    public WXFileObject(byte[] bArr) {
        this.fileData = bArr;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        if ((this.fileData == null || this.fileData.length == 0) && (this.filePath == null || this.filePath.length() == 0)) {
            C0831d.m37772a().m6200d("checkArgs fail, both arguments is null", new Object[0]);
            return false;
        } else if (this.fileData != null && this.fileData.length > 10485760) {
            C0831d.m37772a().m6200d("checkArgs fail, fileData is too large", new Object[0]);
            return false;
        } else if (this.filePath == null || new File(this.filePath).length() <= C0636h.f1132b) {
            return true;
        } else {
            C0831d.m37772a().m6200d("checkArgs fail, fileSize is too large", new Object[0]);
            return false;
        }
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public int type() {
        return 6;
    }

    @Override // cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}
