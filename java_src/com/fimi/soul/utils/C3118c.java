package com.fimi.soul.utils;

import android.content.Context;
import android.widget.ImageView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.module.setting.C2932i;
import com.fimi.soul.service.CameraSocketService;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: com.fimi.soul.utils.c */
/* loaded from: classes.dex */
public class C3118c {

    /* renamed from: a */
    public static final int f11629a = 58880;

    /* renamed from: b */
    public static final int f11630b = 58885;

    /* renamed from: c */
    public static final int f11631c = 58887;

    /* renamed from: d */
    public static Object f11632d = new Object();

    /* renamed from: a */
    public static int m29118a(byte[] bArr, int i) {
        return (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8);
    }

    /* renamed from: a */
    public static WifiDistanceFile m29123a(File file) {
        String replace;
        if (file.exists()) {
            HashMap hashMap = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String str = "/media";
                WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(str);
                wifiDistanceFile.setType(0);
                wifiDistanceFile.setParentStrDir("/");
                hashMap.put(str, wifiDistanceFile);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return wifiDistanceFile;
                    }
                    C1756a.m34261a("line=" + readLine, C3118c.class);
                    String[] m29122a = m29122a(readLine);
                    if (m29122a.length <= 1 || readLine.startsWith("/")) {
                        replace = "/media/:".equalsIgnoreCase(readLine) ? "/media" : readLine.replace(":", "");
                    } else {
                        WifiDistanceFile wifiDistanceFile2 = new WifiDistanceFile(m29122a[2]);
                        wifiDistanceFile2.setSize(Long.parseLong(m29122a[1]));
                        wifiDistanceFile2.setParentStrDir(str);
                        if (m29122a[0].startsWith(C0612f.f1063a)) {
                            wifiDistanceFile.setType(0);
                            hashMap.put(str + "/" + m29122a[2], wifiDistanceFile2);
                        } else {
                            wifiDistanceFile.setType(0);
                        }
                        WifiDistanceFile wifiDistanceFile3 = (WifiDistanceFile) hashMap.get(str);
                        if (wifiDistanceFile3 != null) {
                            wifiDistanceFile3.addFile(wifiDistanceFile2);
                            wifiDistanceFile2.setParentDir(wifiDistanceFile3);
                        } else {
                            wifiDistanceFile2.setParentDir(null);
                        }
                        replace = str;
                    }
                    str = replace;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m29126a(Context context, String str, ImageView imageView) {
        if (C3103au.m29225a(str, context.getResources().getStringArray(C1704R.array.fileEndingImage))) {
            imageView.setImageResource(C1704R.C1705drawable.file_icon_picture);
        } else if (C3103au.m29225a(str, context.getResources().getStringArray(C1704R.array.fileEndingAudio))) {
            imageView.setImageResource(C1704R.C1705drawable.file_icon_mp3);
        } else if (C3103au.m29225a(str, context.getResources().getStringArray(C1704R.array.fileEndingVideo))) {
            imageView.setImageResource(C1704R.C1705drawable.file_icon_video);
        } else {
            imageView.setImageResource(C1704R.C1705drawable.file);
        }
    }

    /* renamed from: a */
    public static void m29125a(DataOutputStream dataOutputStream, String str) {
        m29124a(dataOutputStream, str.getBytes());
    }

    /* renamed from: a */
    public static void m29124a(DataOutputStream dataOutputStream, byte[] bArr) {
        synchronized (f11632d) {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m29121a(String str, long j, DataInputStream dataInputStream, CameraSocketService cameraSocketService, boolean z) {
        C1756a.m34261a("localFile=" + str + "fileLenth=" + j, C3118c.class);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        byte[] bArr = new byte[8192];
        long j2 = 0;
        long currentTimeMillis = System.currentTimeMillis();
        cameraSocketService.m29520a(4, z, "0");
        while (true) {
            int read = dataInputStream.read(bArr);
            if (read < 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
            fileOutputStream.flush();
            j2 += read;
            long j3 = (100 * j2) / j;
            if (j2 >= j) {
                cameraSocketService.m29520a(4, z, C2932i.f10540b);
                break;
            } else if (System.currentTimeMillis() - currentTimeMillis > 2000 && cameraSocketService != null) {
                currentTimeMillis = System.currentTimeMillis();
                cameraSocketService.m29520a(4, z, j3 + "");
            }
        }
        fileOutputStream.close();
        C1756a.m34261a("receiveFileName readlen" + j2, CameraSocketService.class);
    }

    /* renamed from: a */
    public static void m29119a(byte[] bArr) {
        MulticastSocket multicastSocket;
        try {
            multicastSocket = new MulticastSocket();
        } catch (IOException e) {
            e.printStackTrace();
            multicastSocket = null;
        }
        try {
            InetAddress byName = InetAddress.getByName("224.0.0.1");
            if (!byName.isMulticastAddress()) {
                return;
            }
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, byName, (int) f11629a);
            if (multicastSocket == null) {
                return;
            }
            try {
                multicastSocket.send(datagramPacket);
                multicastSocket.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (UnknownHostException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    private static String[] m29122a(String str) {
        String[] strArr = new String[3];
        String[] split = str.split(" ");
        if (split.length > 9) {
            String str2 = "";
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                if (!"".equalsIgnoreCase(split[i2])) {
                    i++;
                    if (i == 1) {
                        strArr[0] = split[i2];
                    } else if (i == 5) {
                        strArr[1] = split[i2];
                    } else if (i >= 9) {
                        str2 = "".equalsIgnoreCase(str2) ? str2 + split[i2] : str2 + " " + split[i2];
                    }
                }
            }
            strArr[2] = str2;
            return strArr;
        }
        return split;
    }

    /* renamed from: b */
    public static int m29117b(byte[] bArr, int i) {
        return (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | ((bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((bArr[i + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24);
    }

    /* renamed from: a */
    public void m29120a(String str, String str2, int i) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket((int) f11630b);
            InetAddress byName = InetAddress.getByName(str2);
            byte[] bytes = str.getBytes();
            datagramSocket.send(new DatagramPacket(bytes, bytes.length, byName, i));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
