.class public Lcom/baidu/tts/client/SynthesizerTool;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getEngineInfo()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSGetEngineParam()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getEngineVersion()I
    .locals 1

    invoke-static {}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->getEngineMinVersion()I

    move-result v0

    return v0
.end method

.method public static getModelInfo(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/baidu/tts/tools/StringTool;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSGetDatParam(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static verifyModelFile(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    invoke-static {p0}, Lcom/baidu/tts/tools/StringTool;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {p0}, Lcom/baidu/tts/tools/ResourceTools;->stringToByteArrayAddNull(Ljava/lang/String;)[B

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSVerifyDataFile([B)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-ltz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
