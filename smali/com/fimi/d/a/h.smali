.class public Lcom/fimi/d/a/h;
.super Lcom/fimi/a/e/b;


# instance fields
.field private a:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/a/e/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/a/e/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/a/e/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/a/e/d;->d()B

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fimi/d/a/h;->a(B)V

    invoke-virtual {p1}, Lcom/fimi/a/e/d;->d()B

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fimi/d/a/h;->b(B)V

    invoke-virtual {p1}, Lcom/fimi/a/e/d;->d()B

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/fimi/d/a/h;->a(Z)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/a/h;->a:B

    return-void
.end method

.method public g()Lcom/fimi/a/e/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/a/h;->a:B

    return v0
.end method
