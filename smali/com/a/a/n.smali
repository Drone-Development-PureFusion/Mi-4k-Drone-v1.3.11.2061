.class public Lcom/a/a/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c;


# instance fields
.field private a:Lcom/a/a/ab;

.field private b:[B

.field private c:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/a/a/ab;
    .locals 1

    iget-object v0, p0, Lcom/a/a/n;->a:Lcom/a/a/ab;

    return-object v0
.end method

.method public a(Lcom/a/a/ab;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/n;->a:Lcom/a/a/ab;

    return-void
.end method

.method public a([B)V
    .locals 1

    invoke-static {p1}, Lcom/a/a/ac;->a([B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/n;->b:[B

    return-void
.end method

.method public a([BII)V
    .locals 2

    new-array v0, p3, [B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, v0}, Lcom/a/a/n;->a([B)V

    return-void
.end method

.method public b([B)V
    .locals 1

    invoke-static {p1}, Lcom/a/a/ac;->a([B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/n;->c:[B

    return-void
.end method

.method public b([BII)V
    .locals 2

    new-array v0, p3, [B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, v0}, Lcom/a/a/n;->b([B)V

    iget-object v1, p0, Lcom/a/a/n;->b:[B

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/a/a/n;->a([B)V

    :cond_0
    return-void
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lcom/a/a/n;->c:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/n;->c:[B

    invoke-static {v0}, Lcom/a/a/ac;->a([B)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/a/a/n;->e()[B

    move-result-object v0

    goto :goto_0
.end method

.method public d()Lcom/a/a/ab;
    .locals 2

    iget-object v0, p0, Lcom/a/a/n;->c:[B

    if-eqz v0, :cond_0

    new-instance v0, Lcom/a/a/ab;

    iget-object v1, p0, Lcom/a/a/n;->c:[B

    array-length v1, v1

    invoke-direct {v0, v1}, Lcom/a/a/ab;-><init>(I)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/a/a/n;->f()Lcom/a/a/ab;

    move-result-object v0

    goto :goto_0
.end method

.method public e()[B
    .locals 1

    iget-object v0, p0, Lcom/a/a/n;->b:[B

    invoke-static {v0}, Lcom/a/a/ac;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/a/a/ab;
    .locals 2

    new-instance v0, Lcom/a/a/ab;

    iget-object v1, p0, Lcom/a/a/n;->b:[B

    array-length v1, v1

    invoke-direct {v0, v1}, Lcom/a/a/ab;-><init>(I)V

    return-object v0
.end method
