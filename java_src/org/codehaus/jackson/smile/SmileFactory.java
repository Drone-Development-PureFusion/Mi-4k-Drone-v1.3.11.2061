package org.codehaus.jackson.smile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.format.InputAccessor;
import org.codehaus.jackson.format.MatchStrength;
import org.codehaus.jackson.p354io.IOContext;
import org.codehaus.jackson.smile.SmileGenerator;
import org.codehaus.jackson.smile.SmileParser;
/* loaded from: classes3.dex */
public class SmileFactory extends JsonFactory {
    public static final String FORMAT_NAME_SMILE = "Smile";
    protected boolean _cfgDelegateToTextual;
    protected int _smileGeneratorFeatures;
    protected int _smileParserFeatures;
    static final int DEFAULT_SMILE_PARSER_FEATURE_FLAGS = SmileParser.Feature.collectDefaults();
    static final int DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS = SmileGenerator.Feature.collectDefaults();

    public SmileFactory() {
        this(null);
    }

    public SmileFactory(ObjectCodec objectCodec) {
        super(objectCodec);
        this._smileParserFeatures = DEFAULT_SMILE_PARSER_FEATURE_FLAGS;
        this._smileGeneratorFeatures = DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.jackson.JsonFactory
    public JsonGenerator _createJsonGenerator(Writer writer, IOContext iOContext) {
        if (this._cfgDelegateToTextual) {
            return super._createJsonGenerator(writer, iOContext);
        }
        throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
    }

    protected SmileGenerator _createJsonGenerator(OutputStream outputStream, IOContext iOContext) {
        int i = this._smileGeneratorFeatures;
        SmileGenerator smileGenerator = new SmileGenerator(iOContext, this._generatorFeatures, i, this._objectCodec, outputStream);
        if ((SmileGenerator.Feature.WRITE_HEADER.getMask() & i) != 0) {
            smileGenerator.writeHeader();
        } else if ((SmileGenerator.Feature.CHECK_SHARED_STRING_VALUES.getMask() & i) != 0) {
            throw new JsonGenerationException("Inconsistent settings: WRITE_HEADER disabled, but CHECK_SHARED_STRING_VALUES enabled; can not construct generator due to possible data loss (either enable WRITE_HEADER, or disable CHECK_SHARED_STRING_VALUES to resolve)");
        } else {
            if ((SmileGenerator.Feature.ENCODE_BINARY_AS_7BIT.getMask() & i) == 0) {
                throw new JsonGenerationException("Inconsistent settings: WRITE_HEADER disabled, but ENCODE_BINARY_AS_7BIT disabled; can not construct generator due to possible data loss (either enable WRITE_HEADER, or ENCODE_BINARY_AS_7BIT to resolve)");
            }
        }
        return smileGenerator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.jackson.JsonFactory
    public JsonParser _createJsonParser(Reader reader, IOContext iOContext) {
        if (this._cfgDelegateToTextual) {
            return super._createJsonParser(reader, iOContext);
        }
        throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: _createJsonParser  reason: collision with other method in class */
    public SmileParser mo40295_createJsonParser(InputStream inputStream, IOContext iOContext) {
        return new SmileParserBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._smileParserFeatures, this._objectCodec, this._rootByteSymbols);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: _createJsonParser  reason: collision with other method in class */
    public SmileParser mo40296_createJsonParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        return new SmileParserBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._smileParserFeatures, this._objectCodec, this._rootByteSymbols);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.codehaus.jackson.JsonFactory
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) {
        if (this._cfgDelegateToTextual) {
            return super._createWriter(outputStream, jsonEncoding, iOContext);
        }
        throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
    }

    public final SmileFactory configure(SmileGenerator.Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public final SmileFactory configure(SmileParser.Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonGenerator  reason: collision with other method in class */
    public SmileGenerator mo40297createJsonGenerator(OutputStream outputStream) {
        return _createJsonGenerator(outputStream, _createContext(outputStream, false));
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonGenerator  reason: collision with other method in class */
    public SmileGenerator mo40298createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        return mo40297createJsonGenerator(outputStream);
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonParser  reason: collision with other method in class */
    public SmileParser mo40299createJsonParser(File file) {
        return mo40295_createJsonParser((InputStream) new FileInputStream(file), _createContext(file, true));
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonParser  reason: collision with other method in class */
    public SmileParser mo40300createJsonParser(InputStream inputStream) {
        return mo40295_createJsonParser(inputStream, _createContext(inputStream, false));
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonParser  reason: collision with other method in class */
    public SmileParser mo40301createJsonParser(URL url) {
        return mo40295_createJsonParser(_optimizedStreamFromURL(url), _createContext(url, true));
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonParser  reason: collision with other method in class */
    public SmileParser mo40302createJsonParser(byte[] bArr) {
        return mo40296_createJsonParser(bArr, 0, bArr.length, _createContext(bArr, true));
    }

    @Override // org.codehaus.jackson.JsonFactory
    /* renamed from: createJsonParser  reason: collision with other method in class */
    public SmileParser mo40303createJsonParser(byte[] bArr, int i, int i2) {
        return mo40296_createJsonParser(bArr, i, i2, _createContext(bArr, true));
    }

    public void delegateToTextual(boolean z) {
        this._cfgDelegateToTextual = z;
    }

    public SmileFactory disable(SmileGenerator.Feature feature) {
        this._smileGeneratorFeatures &= feature.getMask() ^ (-1);
        return this;
    }

    public SmileFactory disable(SmileParser.Feature feature) {
        this._smileParserFeatures &= feature.getMask() ^ (-1);
        return this;
    }

    public SmileFactory enable(SmileGenerator.Feature feature) {
        this._smileGeneratorFeatures |= feature.getMask();
        return this;
    }

    public SmileFactory enable(SmileParser.Feature feature) {
        this._smileParserFeatures |= feature.getMask();
        return this;
    }

    @Override // org.codehaus.jackson.JsonFactory
    public String getFormatName() {
        return FORMAT_NAME_SMILE;
    }

    @Override // org.codehaus.jackson.JsonFactory
    public MatchStrength hasFormat(InputAccessor inputAccessor) {
        return SmileParserBootstrapper.hasSmileFormat(inputAccessor);
    }

    public final boolean isEnabled(SmileGenerator.Feature feature) {
        return (this._smileGeneratorFeatures & feature.getMask()) != 0;
    }

    public final boolean isEnabled(SmileParser.Feature feature) {
        return (this._smileParserFeatures & feature.getMask()) != 0;
    }
}
