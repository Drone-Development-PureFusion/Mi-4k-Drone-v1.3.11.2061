.class public final Lcom/google/android/gms/internal/qf$d;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/qf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/qf$d;",
        ">;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:[B

.field public g:[I

.field public h:[Ljava/lang/String;

.field public i:J

.field public j:I

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/qf$d;->b()Lcom/google/android/gms/internal/qf$d;

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 8

    const/4 v2, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-wide v4, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget v1, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget v3, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x4

    iget-object v3, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x5

    iget-object v3, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    sget-object v3, Lcom/google/android/gms/internal/rg;->h:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x6

    iget-object v3, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v1, v1

    if-lez v1, :cond_7

    move v1, v2

    move v3, v2

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v4, v4

    if-ge v1, v4, :cond_6

    iget-object v4, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    aget v4, v4, v1

    invoke-static {v4}, Lcom/google/android/gms/internal/qw;->c(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    add-int/2addr v0, v3

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_a

    move v1, v2

    move v3, v2

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    array-length v4, v4

    if-ge v2, v4, :cond_9

    iget-object v4, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    aget-object v4, v4, v2

    if-eqz v4, :cond_8

    add-int/lit8 v3, v3, 0x1

    invoke-static {v4}, Lcom/google/android/gms/internal/qw;->b(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_9
    add-int/2addr v0, v1

    mul-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    :cond_a
    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-eqz v1, :cond_b

    const/16 v1, 0x9

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget v1, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    if-eqz v1, :cond_c

    const/16 v1, 0xa

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/qf$d;
    .locals 5

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
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iput v0, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_0

    :sswitch_4
    iput v0, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    goto :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    goto :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    goto :goto_0

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->k()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    goto :goto_0

    :sswitch_8
    const/16 v0, 0x38

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [I

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v3

    aput v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v0, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v3

    aput v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    goto :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->n()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->d(I)I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->t()I

    move-result v2

    move v0, v1

    :goto_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->r()I

    move-result v4

    if-lez v4, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/qv;->f(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    if-nez v2, :cond_6

    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_5
    array-length v4, v0

    if-ge v2, v4, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v4

    aput v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v2, v2

    goto :goto_4

    :cond_7
    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->e(I)V

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x42

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    if-nez v0, :cond_9

    move v0, v1

    :goto_6
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v3, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_8
    :goto_7
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_a

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_6

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_5
        0x2a -> :sswitch_6
        0x32 -> :sswitch_7
        0x38 -> :sswitch_8
        0x3a -> :sswitch_9
        0x42 -> :sswitch_a
        0x48 -> :sswitch_b
        0x50 -> :sswitch_c
        0x5a -> :sswitch_d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_4
        0x64 -> :sswitch_4
        0x66 -> :sswitch_4
        0x68 -> :sswitch_4
        0x69 -> :sswitch_4
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 6

    const/4 v1, 0x0

    iget v0, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    sget-object v2, Lcom/google/android/gms/internal/rg;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(I[B)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v0, v0

    if-lez v0, :cond_6

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    array-length v2, v2

    if-ge v0, v2, :cond_6

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    aget v3, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/qw;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_8

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    aget-object v0, v0, v1

    if-eqz v0, :cond_7

    const/16 v2, 0x8

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_8
    iget-wide v0, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_9

    const/16 v0, 0x9

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    :cond_9
    iget v0, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    if-eqz v0, :cond_a

    const/16 v0, 0xa

    iget v1, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const/16 v0, 0xb

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_b
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/qf$d;
    .locals 3

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    iput v2, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/rg;->h:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    sget-object v0, Lcom/google/android/gms/internal/rg;->a:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    sget-object v0, Lcom/google/android/gms/internal/rg;->f:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    iput v2, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/qf$d;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qf$d;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/qf$d;

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
    instance-of v2, p1, Lcom/google/android/gms/internal/qf$d;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/qf$d;

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    iget v3, p1, Lcom/google/android/gms/internal/qf$d;->a:I

    if-ne v2, v3, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/qf$d;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    iget v3, p1, Lcom/google/android/gms/internal/qf$d;->c:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    if-nez v2, :cond_7

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$d;->f:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$d;->g:[I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([I[I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/qf$d;->i:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    iget v3, p1, Lcom/google/android/gms/internal/qf$d;->j:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    if-nez v2, :cond_9

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_a

    :cond_5
    iget-object v2, p1, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_6

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_6
    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_8
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->a:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/qf$d;->b:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->c:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->f:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->g:[I

    invoke-static {v2}, Lcom/google/android/gms/internal/rb;->a([I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->h:[Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/qf$d;->i:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/internal/qf$d;->j:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_0
    :goto_3
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$d;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v1

    goto :goto_3
.end method
