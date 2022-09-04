.class public Lcom/baidu/tts/m/d;
.super Lcom/baidu/tts/n/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/baidu/tts/n/a",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/baidu/tts/f/h;

.field private e:Lcom/baidu/tts/f/d;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/tts/n/a;-><init>()V

    const-string v0, "5"

    iput-object v0, p0, Lcom/baidu/tts/m/d;->a:Ljava/lang/String;

    const-string v0, "5"

    iput-object v0, p0, Lcom/baidu/tts/m/d;->b:Ljava/lang/String;

    const-string v0, "5"

    iput-object v0, p0, Lcom/baidu/tts/m/d;->c:Ljava/lang/String;

    sget-object v0, Lcom/baidu/tts/f/h;->a:Lcom/baidu/tts/f/h;

    iput-object v0, p0, Lcom/baidu/tts/m/d;->d:Lcom/baidu/tts/f/h;

    sget-object v0, Lcom/baidu/tts/f/d;->c:Lcom/baidu/tts/f/d;

    iput-object v0, p0, Lcom/baidu/tts/m/d;->e:Lcom/baidu/tts/f/d;

    const-string v0, "0"

    iput-object v0, p0, Lcom/baidu/tts/m/d;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/tts/f/d;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/d;->e:Lcom/baidu/tts/f/d;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lcom/baidu/tts/f/h;->a(Ljava/lang/String;)Lcom/baidu/tts/f/h;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/m/d;->d:Lcom/baidu/tts/f/h;

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/d;->f:Ljava/lang/String;

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/d;->a:Ljava/lang/String;

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/d;->b:Ljava/lang/String;

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/d;->c:Ljava/lang/String;

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->e:Lcom/baidu/tts/f/d;

    invoke-virtual {v0}, Lcom/baidu/tts/f/d;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->e:Lcom/baidu/tts/f/d;

    invoke-virtual {v0}, Lcom/baidu/tts/f/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->d:Lcom/baidu/tts/f/h;

    invoke-virtual {v0}, Lcom/baidu/tts/f/h;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->f:Ljava/lang/String;

    return-object v0
.end method

.method public t()J
    .locals 3

    const-wide/16 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/baidu/tts/m/d;->f:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public x()J
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/m/d;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public y()J
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/m/d;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public z()J
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/m/d;->b:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method
