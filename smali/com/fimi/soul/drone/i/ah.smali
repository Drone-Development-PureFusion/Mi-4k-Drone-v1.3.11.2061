.class public Lcom/fimi/soul/drone/i/ah;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field private b:D

.field private c:D

.field private d:D

.field private e:I

.field private f:F

.field private g:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/drone/e;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/i/ah;->f:F

    return v0
.end method

.method public a(D)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/drone/i/ah;->b:D

    return-void
.end method

.method public a(DDDIBBBBB)V
    .locals 7

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p3, p4, p1, p2}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/fimi/soul/drone/i/ah;->c:D

    invoke-virtual {v2}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/drone/i/ah;->b:D

    :goto_0
    iput-wide p5, p0, Lcom/fimi/soul/drone/i/ah;->d:D

    iput p7, p0, Lcom/fimi/soul/drone/i/ah;->e:I

    move/from16 v0, p12

    iput-byte v0, p0, Lcom/fimi/soul/drone/i/ah;->g:B

    return-void

    :cond_0
    iput-wide p1, p0, Lcom/fimi/soul/drone/i/ah;->c:D

    iput-wide p3, p0, Lcom/fimi/soul/drone/i/ah;->b:D

    goto :goto_0
.end method

.method public a(DDDIFB)V
    .locals 5

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3, p4, p1, p2}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/drone/i/ah;->c:D

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/soul/drone/i/ah;->b:D

    :goto_0
    iput-wide p5, p0, Lcom/fimi/soul/drone/i/ah;->d:D

    iput p7, p0, Lcom/fimi/soul/drone/i/ah;->e:I

    iput p8, p0, Lcom/fimi/soul/drone/i/ah;->f:F

    iput-byte p9, p0, Lcom/fimi/soul/drone/i/ah;->g:B

    iget-object v0, p0, Lcom/fimi/soul/drone/i/ah;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->O:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void

    :cond_0
    iput-wide p1, p0, Lcom/fimi/soul/drone/i/ah;->c:D

    iput-wide p3, p0, Lcom/fimi/soul/drone/i/ah;->b:D

    goto :goto_0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/i/ah;->b:D

    return-wide v0
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/i/ah;->c:D

    return-wide v0
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/i/ah;->d:D

    return-wide v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/i/ah;->e:I

    return v0
.end method

.method public f()Z
    .locals 2

    const/4 v0, 0x1

    iget-byte v1, p0, Lcom/fimi/soul/drone/i/ah;->g:B

    and-int/lit8 v1, v1, 0xf

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Z
    .locals 2

    const/4 v0, 0x1

    iget-byte v1, p0, Lcom/fimi/soul/drone/i/ah;->g:B

    and-int/lit16 v1, v1, 0xf0

    shr-int/lit8 v1, v1, 0x4

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
