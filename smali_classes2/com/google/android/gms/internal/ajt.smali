.class public final Lcom/google/android/gms/internal/ajt;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/ajt;",
        ">;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ajt;->b()Lcom/google/android/gms/internal/ajt;

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/ajt;->a:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->b:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->h(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->c:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->h(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->d:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->h(IJ)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/ajt;
    .locals 2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qv;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ajt;->a:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->m()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ajt;->b:J

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->m()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ajt;->c:J

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->m()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ajt;->d:J

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 4

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/ajt;->a:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->b:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->d(IJ)V

    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->c:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->d(IJ)V

    const/4 v0, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->d:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->d(IJ)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/ajt;
    .locals 4

    const-wide/16 v2, -0x1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ajt;->a:I

    iput-wide v2, p0, Lcom/google/android/gms/internal/ajt;->b:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ajt;->c:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ajt;->d:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ajt;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ajt;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/ajt;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/ajt;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ajt;

    iget v2, p0, Lcom/google/android/gms/internal/ajt;->a:I

    iget v3, p1, Lcom/google/android/gms/internal/ajt;->a:I

    if-ne v2, v3, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->b:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ajt;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->c:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ajt;->c:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->d:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ajt;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    iget-object v2, p1, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/gms/internal/ajt;->a:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->b:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ajt;->b:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->c:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ajt;->c:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/ajt;->d:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ajt;->d:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ajt;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v0

    goto :goto_0
.end method
