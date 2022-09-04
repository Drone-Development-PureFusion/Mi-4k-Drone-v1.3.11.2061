.class public Lcom/baidu/tts/m/h;
.super Lcom/baidu/tts/n/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/baidu/tts/n/a",
        "<",
        "Lcom/baidu/tts/m/h;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/baidu/tts/f/e;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:[B

.field private h:Lcom/baidu/tts/f/a;

.field private i:Lcom/baidu/tts/m/i;

.field private j:Lcom/baidu/tts/aop/tts/TtsError;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/tts/n/a;-><init>()V

    return-void
.end method

.method public static a(Lcom/baidu/tts/m/i;Lcom/baidu/tts/aop/tts/TtsError;)Lcom/baidu/tts/m/h;
    .locals 1

    invoke-static {p0}, Lcom/baidu/tts/m/h;->b(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    return-object v0
.end method

.method public static b(Lcom/baidu/tts/aop/tts/TtsError;)Lcom/baidu/tts/m/h;
    .locals 1

    new-instance v0, Lcom/baidu/tts/m/h;

    invoke-direct {v0}, Lcom/baidu/tts/m/h;-><init>()V

    invoke-virtual {v0, p0}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    return-object v0
.end method

.method public static b(Lcom/baidu/tts/m/i;)Lcom/baidu/tts/m/h;
    .locals 1

    new-instance v0, Lcom/baidu/tts/m/h;

    invoke-direct {v0}, Lcom/baidu/tts/m/h;-><init>()V

    invoke-virtual {v0, p0}, Lcom/baidu/tts/m/h;->a(Lcom/baidu/tts/m/i;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/m/h;->c:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/tts/m/h;->c:I

    return-void
.end method

.method public a(Lcom/baidu/tts/aop/tts/TtsError;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/h;->j:Lcom/baidu/tts/aop/tts/TtsError;

    return-void
.end method

.method public a(Lcom/baidu/tts/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/h;->h:Lcom/baidu/tts/f/a;

    return-void
.end method

.method public a(Lcom/baidu/tts/f/e;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/h;->a:Lcom/baidu/tts/f/e;

    return-void
.end method

.method public a(Lcom/baidu/tts/m/i;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/h;->i:Lcom/baidu/tts/m/i;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/h;->d:Ljava/lang/String;

    return-void
.end method

.method public a([B)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/m/h;->g:[B

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/m/h;->e:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/tts/m/h;->e:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/m/h;->f:I

    return v0
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/tts/m/h;->f:I

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/tts/m/h;->b:I

    return-void
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/h;->g:[B

    return-object v0
.end method

.method public e()Lcom/baidu/tts/m/i;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/h;->i:Lcom/baidu/tts/m/i;

    return-object v0
.end method

.method public f()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/h;->j:Lcom/baidu/tts/aop/tts/TtsError;

    return-object v0
.end method

.method public g()Lcom/baidu/tts/f/e;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/m/h;->a:Lcom/baidu/tts/f/e;

    return-object v0
.end method
