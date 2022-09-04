.class public final Lcom/google/android/gms/internal/ql;
.super Lcom/google/android/gms/internal/rd;


# instance fields
.field public a:I

.field public b:J

.field public c:[I

.field public d:[Ljava/lang/String;

.field public e:J

.field public f:[Ljava/lang/String;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/rd;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ql;->b()Lcom/google/android/gms/internal/ql;

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v2, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/rd;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ql;->a:I

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/ql;->a:I

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-wide v4, p0, Lcom/google/android/gms/internal/ql;->b:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/internal/ql;->b:J

    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->c:[I

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v1, v1

    if-lez v1, :cond_3

    move v1, v2

    move v3, v2

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v4, v4

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/ql;->c:[I

    aget v4, v4, v1

    invoke-static {v4}, Lcom/google/android/gms/internal/qw;->c(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr v0, v3

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_6

    move v1, v2

    move v3, v2

    move v4, v2

    :goto_1
    iget-object v5, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    array-length v5, v5

    if-ge v1, v5, :cond_5

    iget-object v5, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    aget-object v5, v5, v1

    if-eqz v5, :cond_4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5}, Lcom/google/android/gms/internal/qw;->b(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v3, v5

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    add-int/2addr v0, v3

    mul-int/lit8 v1, v4, 0x1

    add-int/2addr v0, v1

    :cond_6
    iget-wide v4, p0, Lcom/google/android/gms/internal/ql;->e:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_7

    const/4 v1, 0x5

    iget-wide v4, p0, Lcom/google/android/gms/internal/ql;->e:J

    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_a

    move v1, v2

    move v3, v2

    :goto_2
    iget-object v4, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    array-length v4, v4

    if-ge v2, v4, :cond_9

    iget-object v4, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    aget-object v4, v4, v2

    if-eqz v4, :cond_8

    add-int/lit8 v3, v3, 0x1

    invoke-static {v4}, Lcom/google/android/gms/internal/qw;->b(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    add-int/2addr v0, v1

    mul-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/ql;
    .locals 5

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->a(Lcom/google/android/gms/internal/qv;I)Z

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
    iput v0, p0, Lcom/google/android/gms/internal/ql;->a:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/ql;->b:J

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x18

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->c:[I

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [I

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ql;->c:[I

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v0, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v3

    aput v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/ql;->c:[I

    goto :goto_0

    :sswitch_4
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

    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->c:[I

    if-nez v2, :cond_6

    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/internal/ql;->c:[I

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
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v2, v2

    goto :goto_4

    :cond_7
    iput-object v0, p0, Lcom/google/android/gms/internal/ql;->c:[I

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->e(I)V

    goto/16 :goto_0

    :sswitch_5
    const/16 v0, 0x22

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    if-nez v0, :cond_9

    move v0, v1

    :goto_6
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v3, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_6

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/ql;->e:J

    goto/16 :goto_0

    :sswitch_7
    const/16 v0, 0x32

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    if-nez v0, :cond_c

    move v0, v1

    :goto_8
    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object v3, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_b
    :goto_9
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_d

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_8

    :cond_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x1a -> :sswitch_4
        0x22 -> :sswitch_5
        0x28 -> :sswitch_6
        0x32 -> :sswitch_7
        0x3a -> :sswitch_8
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    iget v0, p0, Lcom/google/android/gms/internal/ql;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/ql;->a:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->b:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->b:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->c:[I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v0, v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->c:[I

    array-length v2, v2

    if-ge v0, v2, :cond_2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/google/android/gms/internal/ql;->c:[I

    aget v3, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/qw;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    aget-object v2, v2, v0

    if-eqz v2, :cond_3

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->e:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_5

    const/4 v0, 0x5

    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->e:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_7

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    aget-object v0, v0, v1

    if-eqz v0, :cond_6

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_8
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/ql;
    .locals 4

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ql;->a:I

    iput-wide v2, p0, Lcom/google/android/gms/internal/ql;->b:J

    sget-object v0, Lcom/google/android/gms/internal/rg;->a:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/ql;->c:[I

    sget-object v0, Lcom/google/android/gms/internal/rg;->f:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    iput-wide v2, p0, Lcom/google/android/gms/internal/ql;->e:J

    sget-object v0, Lcom/google/android/gms/internal/rg;->f:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ql;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ql;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/ql;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/ql;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/ql;

    iget v2, p0, Lcom/google/android/gms/internal/ql;->a:I

    iget v3, p1, Lcom/google/android/gms/internal/ql;->a:I

    if-eq v2, v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->b:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ql;->b:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->c:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/ql;->c:[I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([I[I)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->e:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ql;->e:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_7

    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    if-nez v2, :cond_9

    iget-object v2, p1, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

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

    iget v1, p0, Lcom/google/android/gms/internal/ql;->a:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->b:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ql;->b:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->c:[I

    invoke-static {v1}, Lcom/google/android/gms/internal/rb;->a([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->d:[Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/ql;->e:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ql;->e:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ql;->f:[Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ql;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method
