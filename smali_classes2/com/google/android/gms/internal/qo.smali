.class public final Lcom/google/android/gms/internal/qo;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/qo;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Lcom/google/android/gms/internal/qb;

.field public d:[Ljava/lang/String;

.field public e:[Ljava/lang/String;

.field public f:Lcom/google/android/gms/internal/qr;

.field public g:Lcom/google/android/gms/internal/qg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/qo;->b()Lcom/google/android/gms/internal/qo;

    return-void
.end method

.method public static a([B)Lcom/google/android/gms/internal/qo;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/qo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qo;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;[B)Lcom/google/android/gms/internal/rd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/qo;

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 6

    const/4 v4, 0x1

    const/4 v2, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->a:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->a:Ljava/lang/String;

    invoke-static {v4, v1}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/qo;->b:I

    if-eq v1, v4, :cond_1

    const/4 v1, 0x2

    iget v3, p0, Lcom/google/android/gms/internal/qo;->b:I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_5

    move v1, v2

    move v3, v2

    move v4, v2

    :goto_0
    iget-object v5, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    array-length v5, v5

    if-ge v1, v5, :cond_4

    iget-object v5, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    aget-object v5, v5, v1

    if-eqz v5, :cond_3

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5}, Lcom/google/android/gms/internal/qw;->b(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v3, v5

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    add-int/2addr v0, v3

    mul-int/lit8 v1, v4, 0x1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_8

    move v1, v2

    move v3, v2

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    array-length v4, v4

    if-ge v2, v4, :cond_7

    iget-object v4, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    aget-object v4, v4, v2

    if-eqz v4, :cond_6

    add-int/lit8 v3, v3, 0x1

    invoke-static {v4}, Lcom/google/android/gms/internal/qw;->b(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    add-int/2addr v0, v1

    mul-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    if-eqz v1, :cond_9

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    if-eqz v1, :cond_a

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/qo;
    .locals 4

    const/4 v1, 0x0

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
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->a:Ljava/lang/String;

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iput v0, p0, Lcom/google/android/gms/internal/qo;->b:I

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/qb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x22

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x2a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v1

    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_6
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    if-nez v0, :cond_8

    new-instance v0, Lcom/google/android/gms/internal/qr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    if-nez v0, :cond_9

    new-instance v0, Lcom/google/android/gms/internal/qg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qg;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x42 -> :sswitch_7
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->a:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->a:Ljava/lang/String;

    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/qo;->b:I

    if-eq v0, v3, :cond_1

    const/4 v0, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/qo;->b:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-eqz v2, :cond_3

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_6

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    aget-object v0, v0, v1

    if-eqz v0, :cond_5

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    if-eqz v0, :cond_7

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    if-eqz v0, :cond_8

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_8
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/qo;
    .locals 2

    const/4 v1, 0x0

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->a:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/qo;->b:I

    iput-object v1, p0, Lcom/google/android/gms/internal/qo;->c:Lcom/google/android/gms/internal/qb;

    sget-object v0, Lcom/google/android/gms/internal/rg;->f:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->d:[Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/rg;->f:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/qo;->e:[Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/qo;->f:Lcom/google/android/gms/internal/qr;

    iput-object v1, p0, Lcom/google/android/gms/internal/qo;->g:Lcom/google/android/gms/internal/qg;

    iput-object v1, p0, Lcom/google/android/gms/internal/qo;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/qo;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qo;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/qo;

    move-result-object v0

    return-object v0
.end method
