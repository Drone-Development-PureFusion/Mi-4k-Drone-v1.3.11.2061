.class public final Lcom/google/android/gms/internal/el$a;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/el;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/el$a;",
        ">;"
    }
.end annotation


# instance fields
.field public a:J

.field public b:Lcom/google/android/gms/internal/gi$f;

.field public c:Lcom/google/android/gms/internal/gi$j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/el$a;->b()Lcom/google/android/gms/internal/el$a;

    return-void
.end method

.method public static a([B)Lcom/google/android/gms/internal/el$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/el$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/el$a;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;[B)Lcom/google/android/gms/internal/rd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/el$a;

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/el$a;->a:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/el$a;
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
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/el$a;->a:J

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/gi$f;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gi$f;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/gi$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gi$j;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 4

    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/el$a;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/el$a;
    .locals 3

    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/el$a;->a:J

    iput-object v2, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    iput-object v2, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    iput-object v2, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/el$a;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/el$a;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/el$a;

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
    instance-of v2, p1, Lcom/google/android/gms/internal/el$a;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/el$a;

    iget-wide v2, p0, Lcom/google/android/gms/internal/el$a;->a:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/el$a;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-nez v2, :cond_7

    iget-object v2, p1, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_4
    iget-object v2, p1, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_5

    iget-object v2, p1, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_5
    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    iget-object v3, p1, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/gi$f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    iget-object v3, p1, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/gi$j;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/el$a;->a:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/el$a;->a:J

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    :goto_2
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gi$f;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gi$j;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/el$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v1

    goto :goto_2
.end method
