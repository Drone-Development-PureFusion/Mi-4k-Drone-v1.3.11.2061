.class public Lcom/fimi/d/b/a;
.super Lcom/fimi/a/e/b;


# static fields
.field public static final a:I = 0x19


# instance fields
.field private b:I

.field private c:B

.field private d:B

.field private e:B

.field private f:B

.field private g:B

.field private h:B

.field private i:B

.field private j:B

.field private k:B

.field private l:B

.field private m:B

.field private n:B

.field private o:B

.field private p:B

.field private q:B

.field private r:B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/a/e/b;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Lcom/fimi/d/b/a;->b:I

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/a/e/d;)V
    .locals 0

    return-void
.end method

.method public b(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->m:B

    return-void
.end method

.method public c(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->n:B

    return-void
.end method

.method public d(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->o:B

    return-void
.end method

.method public e(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->p:B

    return-void
.end method

.method public f(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->q:B

    return-void
.end method

.method public g()Lcom/fimi/a/e/c;
    .locals 6

    new-instance v0, Lcom/fimi/a/e/c;

    invoke-direct {v0}, Lcom/fimi/a/e/c;-><init>()V

    iget v1, p0, Lcom/fimi/d/b/a;->b:I

    invoke-virtual {p0}, Lcom/fimi/d/b/a;->e()I

    move-result v2

    invoke-virtual {p0}, Lcom/fimi/d/b/a;->f()I

    move-result v3

    invoke-virtual {p0}, Lcom/fimi/d/b/a;->c()I

    move-result v4

    invoke-virtual {p0}, Lcom/fimi/d/b/a;->d()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lcom/fimi/a/e/c;->a(IIIII)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->c:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->d:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->e:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->f:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->g:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->h:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->i:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/a/e/c;->b:Lcom/fimi/a/e/d;

    iget-byte v2, p0, Lcom/fimi/d/b/a;->l:B

    invoke-virtual {v1, v2}, Lcom/fimi/a/e/d;->b(B)V

    return-object v0
.end method

.method public g(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->r:B

    return-void
.end method

.method public h()B
    .locals 2

    iget-byte v0, p0, Lcom/fimi/d/b/a;->m:B

    iget-byte v1, p0, Lcom/fimi/d/b/a;->n:B

    shl-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iget-byte v1, p0, Lcom/fimi/d/b/a;->o:B

    shl-int/lit8 v1, v1, 0x2

    or-int/2addr v0, v1

    int-to-byte v0, v0

    return v0
.end method

.method public h(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->c:B

    return-void
.end method

.method public i()B
    .locals 2

    iget-byte v0, p0, Lcom/fimi/d/b/a;->p:B

    iget-byte v1, p0, Lcom/fimi/d/b/a;->q:B

    shl-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    iget-byte v1, p0, Lcom/fimi/d/b/a;->r:B

    shl-int/lit8 v1, v1, 0x2

    or-int/2addr v0, v1

    int-to-byte v0, v0

    return v0
.end method

.method public i(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->d:B

    return-void
.end method

.method public j()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->m:B

    return v0
.end method

.method public j(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->e:B

    return-void
.end method

.method public k()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->n:B

    return v0
.end method

.method public k(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->f:B

    return-void
.end method

.method public l()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->o:B

    return v0
.end method

.method public l(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->g:B

    return-void
.end method

.method public m()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->p:B

    return v0
.end method

.method public m(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->h:B

    return-void
.end method

.method public n()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->q:B

    return v0
.end method

.method public n(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->i:B

    return-void
.end method

.method public o()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->r:B

    return v0
.end method

.method public o(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->j:B

    return-void
.end method

.method public p()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->c:B

    return v0
.end method

.method public p(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->k:B

    return-void
.end method

.method public q()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->d:B

    return v0
.end method

.method public q(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/d/b/a;->l:B

    return-void
.end method

.method public r()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->e:B

    return v0
.end method

.method public s()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->f:B

    return v0
.end method

.method public t()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->g:B

    return v0
.end method

.method public u()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->h:B

    return v0
.end method

.method public v()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->i:B

    return v0
.end method

.method public w()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->j:B

    return v0
.end method

.method public x()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->k:B

    return v0
.end method

.method public y()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/d/b/a;->l:B

    return v0
.end method
