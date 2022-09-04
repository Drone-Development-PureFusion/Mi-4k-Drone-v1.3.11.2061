.class public Lcom/fimi/d/b/f;
.super Lcom/fimi/a/e/b;


# static fields
.field public static final a:I = 0xcb


# instance fields
.field private final b:I

.field private c:B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/a/e/b;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/fimi/d/b/f;->b:I

    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/fimi/d/b/f;->c:B

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/a/e/d;)V
    .locals 0

    invoke-virtual {p1}, Lcom/fimi/a/e/d;->c()V

    return-void
.end method

.method public b(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/f;->c:B

    return-void
.end method

.method public g()Lcom/fimi/a/e/c;
    .locals 6

    new-instance v0, Lcom/fimi/a/e/c;

    invoke-direct {v0}, Lcom/fimi/a/e/c;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/fimi/d/b/f;->e()I

    move-result v2

    invoke-virtual {p0}, Lcom/fimi/d/b/f;->f()I

    move-result v3

    invoke-virtual {p0}, Lcom/fimi/d/b/f;->c()I

    move-result v4

    invoke-virtual {p0}, Lcom/fimi/d/b/f;->d()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lcom/fimi/a/e/c;->a(IIIII)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    invoke-virtual {p0}, Lcom/fimi/d/b/f;->b()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    invoke-virtual {p0}, Lcom/fimi/d/b/f;->h()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    return-object v0
.end method

.method public h()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/f;->c:B

    return v0
.end method
