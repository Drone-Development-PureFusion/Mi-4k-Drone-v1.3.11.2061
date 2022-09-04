.class Lcom/baidu/tts/b/a/b/e$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine$OnNewDataListener;
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/tts/b/a/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine$OnNewDataListener;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/baidu/tts/aop/tts/TtsError;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/tts/b/a/b/e;

.field private b:Lcom/baidu/tts/m/i;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/baidu/tts/b/a/b/e;Lcom/baidu/tts/m/i;)V
    .locals 1

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/tts/b/a/b/e$c;->c:I

    iput-object p2, p0, Lcom/baidu/tts/b/a/b/e$c;->b:Lcom/baidu/tts/m/i;

    return-void
.end method


# virtual methods
.method public a()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 7

    const/4 v6, 0x0

    invoke-static {}, Lcom/baidu/tts/auth/a;->a()Lcom/baidu/tts/auth/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v1}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baidu/tts/auth/a;->a(Lcom/baidu/tts/b/a/b/e$b;)Lcom/baidu/tts/auth/b$a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/baidu/tts/auth/b$a;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v6, v2, v3}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    move-result v0

    const-string v1, "OfflineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "engineResult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->x()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->y()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->z()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/16 v2, 0x11

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->a()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/16 v2, 0x12

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->b()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/16 v2, 0x13

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->c()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v0}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v0

    aget-wide v0, v0, v6

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v3}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/b/a/b/e;)Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/tts/b/a/b/e$b;->t()J

    move-result-wide v4

    invoke-static {v0, v1, v2, v4, v5}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSetParam(JIJ)I

    invoke-static {p0}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->setOnNewDataListener(Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine$OnNewDataListener;)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->b:Lcom/baidu/tts/m/i;

    sget-object v1, Lcom/baidu/tts/f/d;->d:Lcom/baidu/tts/f/d;

    invoke-virtual {v1}, Lcom/baidu/tts/f/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baidu/tts/m/i;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->b:Lcom/baidu/tts/m/i;

    invoke-virtual {v0}, Lcom/baidu/tts/m/i;->e()[B

    move-result-object v0

    const-string v1, "OfflineSynthesizer"

    const-string v2, "before bdttssynthesis"

    invoke-static {v1, v2}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-static {v1}, Lcom/baidu/tts/b/a/b/e;->b(Lcom/baidu/tts/b/a/b/e;)[J

    move-result-object v1

    aget-wide v2, v1, v6

    array-length v1, v0

    invoke-static {v2, v3, v0, v1}, Lcom/baidu/tts/jni/EmbeddedSynthesizerEngine;->bdTTSSynthesis(J[BI)I

    move-result v1

    const-string v0, "OfflineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "after bdttssynthesis result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lcom/baidu/tts/b/a/b/e$a;

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-direct {v0, v2, v1}, Lcom/baidu/tts/b/a/b/e$a;-><init>(Lcom/baidu/tts/b/a/b/e;I)V

    invoke-virtual {v0}, Lcom/baidu/tts/b/a/b/e$a;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const-string v2, "OfflineSynthesizer"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AddPVResultsToDB start exception="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v0

    sget-object v2, Lcom/baidu/tts/f/n;->B:Lcom/baidu/tts/f/n;

    invoke-virtual {v0, v2, v1}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;I)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/baidu/tts/auth/b$a;->b()Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/n;->u:Lcom/baidu/tts/f/n;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_1
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/tts/b/a/b/e$c;->a()Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    return-object v0
.end method

.method public onNewData([BI)I
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/e$c;->b:Lcom/baidu/tts/m/i;

    invoke-static {v0}, Lcom/baidu/tts/m/h;->b(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/f;->b:Lcom/baidu/tts/f/f;

    invoke-virtual {v1}, Lcom/baidu/tts/f/f;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/baidu/tts/m/h;->d(I)V

    sget-object v1, Lcom/baidu/tts/f/a;->a:Lcom/baidu/tts/f/a;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/f/a;)V

    invoke-virtual {v0, p1}, Lcom/baidu/tts/m/h;->a([B)V

    invoke-virtual {v0, p2}, Lcom/baidu/tts/m/h;->c(I)V

    iget v1, p0, Lcom/baidu/tts/b/a/b/e$c;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/baidu/tts/b/a/b/e$c;->c:I

    iget v1, p0, Lcom/baidu/tts/b/a/b/e$c;->c:I

    invoke-virtual {v0, v1}, Lcom/baidu/tts/m/h;->b(I)V

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/e$c;->a:Lcom/baidu/tts/b/a/b/e;

    invoke-virtual {v1, v0}, Lcom/baidu/tts/b/a/b/e;->a(Lcom/baidu/tts/m/h;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "OfflineSynthesizer"

    const-string v1, "interrupted to interrupt syn"

    invoke-static {v0, v1}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
