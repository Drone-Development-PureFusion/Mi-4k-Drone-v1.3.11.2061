package org.codehaus.jackson.smile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.smile.SmileGenerator;
import org.codehaus.jackson.smile.SmileParser;
/* loaded from: classes3.dex */
public class Tool {
    public static final String SUFFIX = ".lzf";
    public final JsonFactory jsonFactory = new JsonFactory();
    public final SmileFactory smileFactory = new SmileFactory();

    public Tool() {
        this.smileFactory.configure(SmileGenerator.Feature.CHECK_SHARED_NAMES, true);
        this.smileFactory.configure(SmileGenerator.Feature.CHECK_SHARED_STRING_VALUES, true);
        this.smileFactory.configure(SmileGenerator.Feature.ENCODE_BINARY_AS_7BIT, true);
        this.smileFactory.configure(SmileGenerator.Feature.WRITE_HEADER, true);
        this.smileFactory.configure(SmileGenerator.Feature.WRITE_END_MARKER, false);
        this.smileFactory.configure(SmileParser.Feature.REQUIRE_HEADER, false);
    }

    private void decode(InputStream inputStream) {
        SmileParser mo40300createJsonParser = this.smileFactory.mo40300createJsonParser(inputStream);
        JsonGenerator mo40298createJsonGenerator = this.jsonFactory.mo40298createJsonGenerator(System.out, JsonEncoding.UTF8);
        while (true) {
            if (mo40300createJsonParser.nextToken() == null && mo40300createJsonParser.nextToken() == null) {
                mo40300createJsonParser.close();
                mo40298createJsonGenerator.close();
                return;
            }
            mo40298createJsonGenerator.copyCurrentEvent(mo40300createJsonParser);
        }
    }

    private void encode(InputStream inputStream) {
        JsonParser mo40300createJsonParser = this.jsonFactory.mo40300createJsonParser(inputStream);
        SmileGenerator mo40298createJsonGenerator = this.smileFactory.mo40298createJsonGenerator((OutputStream) System.out, JsonEncoding.UTF8);
        while (mo40300createJsonParser.nextToken() != null) {
            mo40298createJsonGenerator.copyCurrentEvent(mo40300createJsonParser);
        }
        mo40300createJsonParser.close();
        mo40298createJsonGenerator.close();
    }

    private InputStream inputStream(String str) {
        if (str == null) {
            return System.in;
        }
        File file = new File(str);
        if (!file.exists()) {
            System.err.println("File '" + str + "' does not exist.");
            System.exit(1);
        }
        return new FileInputStream(file);
    }

    public static void main(String[] strArr) {
        new Tool().process(strArr);
    }

    private void process(String[] strArr) {
        String str;
        String str2 = null;
        if (strArr.length == 2) {
            str = strArr[0];
            str2 = strArr[1];
        } else if (strArr.length == 1) {
            str = strArr[0];
        } else {
            showUsage();
            str = null;
        }
        if ("-e".equals(str)) {
            encode(inputStream(str2));
        } else if ("-d".equals(str)) {
            decode(inputStream(str2));
        } else if ("-v".equals(str)) {
            verify(inputStream(str2), inputStream(str2));
        } else {
            showUsage();
        }
    }

    private void verify(InputStream inputStream, InputStream inputStream2) {
        String text;
        String text2;
        JsonParser mo40300createJsonParser = this.jsonFactory.mo40300createJsonParser(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4000);
        SmileGenerator mo40298createJsonGenerator = this.smileFactory.mo40298createJsonGenerator((OutputStream) byteArrayOutputStream, JsonEncoding.UTF8);
        while (mo40300createJsonParser.nextToken() != null) {
            mo40298createJsonGenerator.copyCurrentEvent(mo40300createJsonParser);
        }
        mo40300createJsonParser.close();
        mo40298createJsonGenerator.close();
        JsonParser mo40300createJsonParser2 = this.jsonFactory.mo40300createJsonParser(inputStream2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        SmileParser mo40302createJsonParser = this.smileFactory.mo40302createJsonParser(byteArray);
        int i = 0;
        do {
            JsonToken nextToken = mo40300createJsonParser2.nextToken();
            if (nextToken == null) {
                System.out.println("OK: verified " + i + " tokens (from " + byteArray.length + " bytes of Smile encoded data), input and encoded contents are identical");
                return;
            }
            JsonToken nextToken2 = mo40302createJsonParser.nextToken();
            i++;
            if (nextToken != nextToken2) {
                throw new IOException("Input and encoded differ, token #" + i + "; expected " + nextToken + ", got " + nextToken2);
            }
            text = mo40300createJsonParser2.getText();
            text2 = mo40302createJsonParser.getText();
        } while (text.equals(text2));
        throw new IOException("Input and encoded differ, token #" + i + "; expected text '" + text + "', got '" + text2 + "'");
    }

    protected void showUsage() {
        System.err.println("Usage: java " + getClass().getName() + " -e/-d [file]");
        System.err.println(" (if no file given, reads from stdin -- always writes to stdout)");
        System.err.println(" -d: decode Smile encoded input as JSON");
        System.err.println(" -e: encode JSON (text) input as Smile");
        System.err.println(" -v: encode JSON (text) input as Smile; read back, verify, do not write out");
        System.exit(1);
    }
}
