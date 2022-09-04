.class Lcom/baidu/tts/b/a/b/f$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/tts/b/a/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/baidu/tts/m/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/tts/b/a/b/f;

.field private b:I

.field private c:Lcom/baidu/tts/b/a/b/f$c;

.field private d:Lcom/baidu/tts/m/i;

.field private e:Lcom/baidu/tts/b/a/b/f$b;

.field private f:Lcom/baidu/tts/m/h;

.field private g:Lcom/baidu/tts/loopj/SyncHttpClient;


# direct methods
.method public constructor <init>(Lcom/baidu/tts/b/a/b/f;ILcom/baidu/tts/b/a/b/f$c;Lcom/baidu/tts/m/i;Lcom/baidu/tts/b/a/b/f$b;Lcom/baidu/tts/m/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/f$a;->a:Lcom/baidu/tts/b/a/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/baidu/tts/b/a/b/f$a;->b:I

    iput-object p3, p0, Lcom/baidu/tts/b/a/b/f$a;->c:Lcom/baidu/tts/b/a/b/f$c;

    iput-object p4, p0, Lcom/baidu/tts/b/a/b/f$a;->d:Lcom/baidu/tts/m/i;

    iput-object p5, p0, Lcom/baidu/tts/b/a/b/f$a;->e:Lcom/baidu/tts/b/a/b/f$b;

    iput-object p6, p0, Lcom/baidu/tts/b/a/b/f$a;->f:Lcom/baidu/tts/m/h;

    return-void
.end method


# virtual methods
.method public a()Lcom/baidu/tts/m/h;
    .locals 6

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->a:Lcom/baidu/tts/b/a/b/f;

    iget v2, p0, Lcom/baidu/tts/b/a/b/f$a;->b:I

    iget-object v3, p0, Lcom/baidu/tts/b/a/b/f$a;->c:Lcom/baidu/tts/b/a/b/f$c;

    iget-object v3, v3, Lcom/baidu/tts/b/a/b/f$c;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/baidu/tts/b/a/b/f$a;->d:Lcom/baidu/tts/m/i;

    iget-object v5, p0, Lcom/baidu/tts/b/a/b/f$a;->e:Lcom/baidu/tts/b/a/b/f$b;

    invoke-static {v0, v2, v3, v4, v5}, Lcom/baidu/tts/b/a/b/f;->a(Lcom/baidu/tts/b/a/b/f;ILjava/lang/String;Lcom/baidu/tts/m/i;Lcom/baidu/tts/b/a/b/f$b;)Lorg/apache/http/HttpEntity;
    :try_end_0
    .catch Lcom/baidu/tts/q/a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    new-instance v0, Lcom/baidu/tts/loopj/SyncHttpClient;

    invoke-direct {v0}, Lcom/baidu/tts/loopj/SyncHttpClient;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->g:Lcom/baidu/tts/loopj/SyncHttpClient;

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->e:Lcom/baidu/tts/b/a/b/f$b;

    invoke-virtual {v0}, Lcom/baidu/tts/b/a/b/f$b;->m()I

    move-result v0

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/f$a;->e:Lcom/baidu/tts/b/a/b/f$b;

    invoke-virtual {v2}, Lcom/baidu/tts/b/a/b/f$b;->n()I

    move-result v2

    iget-object v4, p0, Lcom/baidu/tts/b/a/b/f$a;->g:Lcom/baidu/tts/loopj/SyncHttpClient;

    invoke-virtual {v4, v0, v2}, Lcom/baidu/tts/loopj/SyncHttpClient;->setMaxRetriesAndTimeout(II)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->e:Lcom/baidu/tts/b/a/b/f$b;

    invoke-virtual {v0}, Lcom/baidu/tts/b/a/b/f$b;->o()I

    move-result v0

    const-string v2, "OnlineSynthesizer"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "timeout="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/f$a;->g:Lcom/baidu/tts/loopj/SyncHttpClient;

    invoke-virtual {v2, v0}, Lcom/baidu/tts/loopj/SyncHttpClient;->setTimeout(I)V

    new-instance v5, Lcom/baidu/tts/b/a/b/h;

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->f:Lcom/baidu/tts/m/h;

    invoke-direct {v5, v0}, Lcom/baidu/tts/b/a/b/h;-><init>(Lcom/baidu/tts/m/h;)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->e:Lcom/baidu/tts/b/a/b/f$b;

    invoke-virtual {v5, v0}, Lcom/baidu/tts/b/a/b/h;->a(Lcom/baidu/tts/b/a/b/f$b;)V

    iget v0, p0, Lcom/baidu/tts/b/a/b/f$a;->b:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->c:Lcom/baidu/tts/b/a/b/f$c;

    sget-object v2, Lcom/baidu/tts/f/o;->a:Lcom/baidu/tts/f/o;

    invoke-virtual {v2}, Lcom/baidu/tts/f/o;->b()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/baidu/tts/b/a/b/f$c;->b:Ljava/lang/String;

    const-string v0, "OnlineSynthesizer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "serverIp="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, p0, Lcom/baidu/tts/b/a/b/f$a;->c:Lcom/baidu/tts/b/a/b/f$c;

    iget-object v4, v4, Lcom/baidu/tts/b/a/b/f$c;->b:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->c:Lcom/baidu/tts/b/a/b/f$c;

    iget-object v0, v0, Lcom/baidu/tts/b/a/b/f$c;->b:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/n;->q:Lcom/baidu/tts/f/n;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/f$a;->f:Lcom/baidu/tts/m/h;

    invoke-virtual {v1, v0}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->f:Lcom/baidu/tts/m/h;

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/n;->h:Lcom/baidu/tts/f/n;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/b/a/b/f$a;->f:Lcom/baidu/tts/m/h;

    invoke-virtual {v1, v0}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->f:Lcom/baidu/tts/m/h;

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "OnlineSynthesizer"

    const-string v2, "before post"

    invoke-static {v0, v2}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->g:Lcom/baidu/tts/loopj/SyncHttpClient;

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/f$a;->c:Lcom/baidu/tts/b/a/b/f$c;

    iget-object v2, v2, Lcom/baidu/tts/b/a/b/f$c;->b:Ljava/lang/String;

    move-object v4, v1

    invoke-virtual/range {v0 .. v5}, Lcom/baidu/tts/loopj/SyncHttpClient;->post(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/HttpEntity;Ljava/lang/String;Lcom/baidu/tts/loopj/ResponseHandlerInterface;)Lcom/baidu/tts/loopj/RequestHandle;

    const-string v0, "OnlineSynthesizer"

    const-string v1, "after post"

    invoke-static {v0, v1}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->g:Lcom/baidu/tts/loopj/SyncHttpClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/f$a;->g:Lcom/baidu/tts/loopj/SyncHttpClient;

    invoke-virtual {v0}, Lcom/baidu/tts/loopj/SyncHttpClient;->stop()V

    :cond_0
    return-void
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/tts/b/a/b/f$a;->a()Lcom/baidu/tts/m/h;

    move-result-object v0

    return-object v0
.end method
