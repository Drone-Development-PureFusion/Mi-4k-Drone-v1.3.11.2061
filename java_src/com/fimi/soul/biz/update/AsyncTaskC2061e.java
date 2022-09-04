package com.fimi.soul.biz.update;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.util.Log;
import com.fimi.overseas.soul.C1704R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
/* renamed from: com.fimi.soul.biz.update.e */
/* loaded from: classes.dex */
public class AsyncTaskC2061e extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    Context f5782a;

    /* renamed from: b */
    String f5783b;

    /* renamed from: c */
    String f5784c;

    public AsyncTaskC2061e(Context context, String str) {
        this.f5782a = context;
        this.f5784c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33103a() {
        String packageName = this.f5782a.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + packageName));
        this.f5782a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0 A[Catch: IOException -> 0x00e4, TRY_LEAVE, TryCatch #4 {IOException -> 0x00e4, blocks: (B:67:0x00db, B:61:0x00e0), top: B:66:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean doInBackground(String... strArr) {
        BufferedReader bufferedReader;
        ClientProtocolException e;
        IOException e2;
        boolean z = true;
        BufferedReader httpPost = new HttpPost(strArr[0]);
        AndroidHttpClient newInstance = AndroidHttpClient.newInstance(SystemMediaRouteProvider.PACKAGE_NAME);
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(newInstance.execute(httpPost).getEntity().getContent()));
                try {
                    String str = "";
                    Pattern compile = Pattern.compile("\"softwareVersion\"\\W*([\\d\\.]+)");
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            try {
                                break;
                            } catch (ClientProtocolException e3) {
                                e = e3;
                                e.printStackTrace();
                                Log.v("ids", "close reader");
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (newInstance != null) {
                                    newInstance.close();
                                }
                                return Boolean.valueOf(z);
                            } catch (IOException e5) {
                                e2 = e5;
                                e2.printStackTrace();
                                Log.v("ids", "close reader");
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (newInstance != null) {
                                    newInstance.close();
                                }
                                return Boolean.valueOf(z);
                            }
                        }
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.find()) {
                            Log.v("ids", "ver.:" + matcher.group(1));
                            this.f5783b = matcher.group(1);
                        }
                        str = str + readLine;
                    }
                    Log.v("ids", str);
                    Log.v("ids", "close reader");
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    if (newInstance != null) {
                        newInstance.close();
                    }
                } catch (ClientProtocolException e8) {
                    e = e8;
                    z = false;
                } catch (IOException e9) {
                    e2 = e9;
                    z = false;
                }
            } catch (Throwable th) {
                th = th;
                Log.v("ids", "close reader");
                if (httpPost != null) {
                    try {
                        httpPost.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        throw th;
                    }
                }
                if (newInstance != null) {
                    newInstance.close();
                }
                throw th;
            }
        } catch (IOException e11) {
            bufferedReader = null;
            e2 = e11;
            z = false;
        } catch (ClientProtocolException e12) {
            bufferedReader = null;
            e = e12;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            httpPost = null;
            Log.v("ids", "close reader");
            if (httpPost != null) {
            }
            if (newInstance != null) {
            }
            throw th;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            new AlertDialog.Builder(this.f5782a, C1704R.style.MyDialog).setTitle("Update").setMessage("App have update,please update!").setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.fimi.soul.biz.update.e.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                }
            }).setNegativeButton("cancel", new DialogInterface.OnClickListener() { // from class: com.fimi.soul.biz.update.e.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).setPositiveButton("update", new DialogInterface.OnClickListener() { // from class: com.fimi.soul.biz.update.e.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    AsyncTaskC2061e.this.m33103a();
                }
            }).create().show();
        }
    }
}
