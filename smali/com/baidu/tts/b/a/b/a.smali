.class public abstract Lcom/baidu/tts/b/a/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/tts/b/a/b/b;


# instance fields
.field protected a:Lcom/baidu/tts/b/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/tts/m/e;)I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Lcom/baidu/tts/m/g;)I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/baidu/tts/b/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/a;->a:Lcom/baidu/tts/b/a/b;

    return-void
.end method

.method protected a(Lcom/baidu/tts/m/h;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/a;->a:Lcom/baidu/tts/b/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/b/a/b/a;->a:Lcom/baidu/tts/b/a/b;

    invoke-interface {v0, p1}, Lcom/baidu/tts/b/a/b;->c(Lcom/baidu/tts/m/h;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public b(Lcom/baidu/tts/m/e;)I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
