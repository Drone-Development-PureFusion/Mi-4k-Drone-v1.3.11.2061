.class public Lcom/baidu/tts/b/a/b/f;
.super Lcom/baidu/tts/b/a/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/tts/b/a/b/f$b;,
        Lcom/baidu/tts/b/a/b/f$a;,
        Lcom/baidu/tts/b/a/b/f$d;,
        Lcom/baidu/tts/b/a/b/f$c;
    }
.end annotation


# instance fields
.field private b:Lcom/baidu/tts/b/a/b/f$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/tts/b/a/b/a;-><init>()V

    return-void
.end method

.method private a(ILcom/baidu/tts/b/a/b/f$c;Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;
    .locals 10

    const/4 v9, 0x1

    invoke-static {p3}, Lcom/baidu/tts/m/h;->b(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;

    move-result-object v8

    iget-object v2, p0, Lcom/baidu/tts/b/a/b/f;->b:Lcom/baidu/tts/b/a/b/f$b;

    invoke-virtual {v2}, Lcom/baidu/tts/b/a/b/f$b;->A()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/baidu/tts/b/a/b/f$b;

    new-instance v2, Lcom/baidu/tts/b/a/b/f$a;

    move-object v3, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v8}, Lcom/baidu/tts/b/a/b/f$a;-><init>(Lcom/baidu/tts/b/a/b/f;ILcom/baidu/tts/b/a/b/f$c;Lcom/baidu/tts/m/i;Lcom/baidu/tts/b/a/b/f$b;Lcom/baidu/tts/m/h;)V

    new-instance v4, Ljava/util/concurrent/FutureTask;

    invoke-direct {v4, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v3, Ljava/lang/Thread;

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    invoke-virtual {v7}, Lcom/baidu/tts/b/a/b/f$b;->o()I

    move-result v3

    int-to-long v6, v3

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v6, v7, v3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Lcom/baidu/tts/m/h;

    move-object v2, v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v8, v2

    :goto_0
    return-object v8

    :catch_0
    move-exception v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    invoke-virtual {v4, v9}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    invoke-virtual {v2}, Lcom/baidu/tts/b/a/b/f$a;->b()V

    throw v3

    :catch_1
    move-exception v2

    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v3

    sget-object v4, Lcom/baidu/tts/f/n;->n:Lcom/baidu/tts/f/n;

    invoke-virtual {v2}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v5, "OnlineSynthesizer"

    const-string v6, "startOnceHttpRequest timeout"

    invoke-static {v5, v6}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v9}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    invoke-virtual {v2}, Lcom/baidu/tts/b/a/b/f$a;->b()V

    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v2

    sget-object v4, Lcom/baidu/tts/f/n;->o:Lcom/baidu/tts/f/n;

    invoke-virtual {v2, v4, v3}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/baidu/tts/b/a/b/f;ILcom/baidu/tts/b/a/b/f$c;Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/baidu/tts/b/a/b/f;->a(ILcom/baidu/tts/b/a/b/f$c;Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;

    move-result-object v0

    return-object v0
.end method

.method private a(ILjava/lang/String;Lcom/baidu/tts/m/i;Lcom/baidu/tts/b/a/b/f$b;)Lorg/apache/http/HttpEntity;
    .locals 8

    const/4 v1, 0x0

    if-nez p4, :cond_0

    :goto_0
    return-object v1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->W:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->V:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->B:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Android"

    invoke-direct {v0, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/baidu/tts/h/b/b;->a()Lcom/baidu/tts/h/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/h/b/b;->j()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v5, Lcom/baidu/tts/f/g;->aa:Lcom/baidu/tts/f/g;

    invoke-virtual {v5}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/baidu/tts/tools/StringTool;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v5, Lcom/baidu/tts/f/g;->N:Lcom/baidu/tts/f/g;

    invoke-virtual {v5}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Lcom/baidu/tts/m/i;->c(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/baidu/tts/m/i;->d()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    if-ne p1, v5, :cond_4

    :try_start_0
    invoke-virtual {p3}, Lcom/baidu/tts/m/i;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v7, Lcom/baidu/tts/f/g;->X:Lcom/baidu/tts/f/g;

    invoke-virtual {v7}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lcom/baidu/tts/f/g;->Y:Lcom/baidu/tts/f/g;

    invoke-virtual {v5}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/baidu/tts/h/b/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v7, Lcom/baidu/tts/f/g;->Y:Lcom/baidu/tts/f/g;

    invoke-virtual {v7}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/baidu/tts/h/b/b;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v5, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v6, Lcom/baidu/tts/f/g;->Z:Lcom/baidu/tts/f/g;

    invoke-virtual {v6}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {v3}, Lcom/baidu/tts/tools/StringTool;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "OnlineSynthesizer"

    const-string v3, "before online auth"

    invoke-static {v0, v3}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/tts/auth/a;->a()Lcom/baidu/tts/auth/a;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/baidu/tts/auth/a;->a(Lcom/baidu/tts/b/a/b/f$b;)Lcom/baidu/tts/auth/c$a;

    move-result-object v0

    const-string v3, "OnlineSynthesizer"

    const-string v5, "after online auth"

    invoke-static {v3, v5}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/baidu/tts/auth/c$a;->g()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lcom/baidu/tts/auth/c$a;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v5, Lcom/baidu/tts/f/g;->ai:Lcom/baidu/tts/f/g;

    invoke-virtual {v5}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->G:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->q()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->I:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->J:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->e()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->K:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->f()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->ab:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->ac:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->h()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->L:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->i()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->M:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->j()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->ad:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->k()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->ae:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->l()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->F:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->r()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->C:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->u()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->E:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->v()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->D:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->w()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    sget-object v3, Lcom/baidu/tts/f/g;->S:Lcom/baidu/tts/f/g;

    invoke-virtual {v3}, Lcom/baidu/tts/f/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/baidu/tts/b/a/b/f$b;->s()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_4
    :goto_1
    :try_start_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, "="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    move-object v0, v1

    :goto_3
    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    :try_start_2
    new-instance v0, Lcom/baidu/tts/q/a;

    invoke-direct {v0}, Lcom/baidu/tts/q/a;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_1

    :cond_6
    :try_start_3
    const-string v0, "OnlineSynthesizer"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "request params: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/baidu/tts/chainofresponsibility/logger/LoggerProxy;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v0, v2, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3
.end method

.method static synthetic a(Lcom/baidu/tts/b/a/b/f;ILjava/lang/String;Lcom/baidu/tts/m/i;Lcom/baidu/tts/b/a/b/f$b;)Lorg/apache/http/HttpEntity;
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/baidu/tts/b/a/b/f;->a(ILjava/lang/String;Lcom/baidu/tts/m/i;Lcom/baidu/tts/b/a/b/f$b;)Lorg/apache/http/HttpEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/baidu/tts/m/e;)I
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/n;->k:Lcom/baidu/tts/f/n;

    invoke-virtual {v0}, Lcom/baidu/tts/f/n;->b()I

    move-result v0

    return v0
.end method

.method public a(Lcom/baidu/tts/m/f;)I
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/n;->k:Lcom/baidu/tts/f/n;

    invoke-virtual {v0}, Lcom/baidu/tts/f/n;->b()I

    move-result v0

    return v0
.end method

.method public a(Lcom/baidu/tts/m/g;)I
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/n;->k:Lcom/baidu/tts/f/n;

    invoke-virtual {v0}, Lcom/baidu/tts/f/n;->b()I

    move-result v0

    return v0
.end method

.method public a(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/baidu/tts/b/a/b/f$d;

    invoke-direct {v0, p0, p1}, Lcom/baidu/tts/b/a/b/f$d;-><init>(Lcom/baidu/tts/b/a/b/f;Lcom/baidu/tts/m/i;)V

    invoke-virtual {v0}, Lcom/baidu/tts/b/a/b/f$d;->a()Lcom/baidu/tts/aop/tts/TtsError;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v1

    sget-object v2, Lcom/baidu/tts/f/n;->j:Lcom/baidu/tts/f/n;

    invoke-virtual {v1, v2, v0}, Lcom/baidu/tts/h/a/c;->a(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<OnlineSynthesizerParams:",
            "Ljava/lang/Object;",
            ">(TOnlineSynthesizerParams;)V"
        }
    .end annotation

    check-cast p1, Lcom/baidu/tts/b/a/b/f$b;

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/f;->b:Lcom/baidu/tts/b/a/b/f$b;

    return-void
.end method

.method public b(Lcom/baidu/tts/m/e;)I
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/n;->k:Lcom/baidu/tts/f/n;

    invoke-virtual {v0}, Lcom/baidu/tts/f/n;->b()I

    move-result v0

    return v0
.end method
