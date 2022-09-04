.class public Lcom/baidu/tts/o/a/b;
.super Lcom/baidu/tts/o/a/a;


# direct methods
.method public constructor <init>(Lcom/baidu/tts/o/a/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/tts/o/a/a;-><init>(Lcom/baidu/tts/o/a/c;)V

    return-void
.end method


# virtual methods
.method public b()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/c;->i()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/c;->j()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/c;->k()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/c;->l()V

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/c;->a()Lcom/baidu/tts/o/a/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/baidu/tts/o/a/b;->a(Lcom/baidu/tts/o/a/a;)V

    return-void
.end method

.method public freeCustomResource(Lcom/baidu/tts/m/e;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->b(Lcom/baidu/tts/m/e;)I

    move-result v0

    return v0
.end method

.method public loadCustomResource(Lcom/baidu/tts/m/e;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->a(Lcom/baidu/tts/m/e;)I

    move-result v0

    return v0
.end method

.method public loadEnglishModel(Lcom/baidu/tts/m/f;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->a(Lcom/baidu/tts/m/f;)I

    move-result v0

    return v0
.end method

.method public loadModel(Lcom/baidu/tts/m/g;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->a(Lcom/baidu/tts/m/g;)I

    move-result v0

    return v0
.end method

.method public setAudioStreamType(I)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->a(I)I

    move-result v0

    return v0
.end method

.method public setStereoVolume(FF)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/tts/o/a/c;->a(FF)I

    move-result v0

    return v0
.end method

.method public speak(Lcom/baidu/tts/m/i;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->a(Lcom/baidu/tts/m/i;)V

    return-void
.end method

.method public synthesize(Lcom/baidu/tts/m/i;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/b;->a:Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/c;->b(Lcom/baidu/tts/m/i;)V

    return-void
.end method
