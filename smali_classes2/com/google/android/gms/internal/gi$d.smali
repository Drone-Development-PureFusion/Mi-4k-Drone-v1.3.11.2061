.class public final Lcom/google/android/gms/internal/gi$d;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/gi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/gi$d;",
        ">;"
    }
.end annotation


# instance fields
.field public a:[Lcom/google/android/gms/internal/hj$a;

.field public b:[Lcom/google/android/gms/internal/hj$a;

.field public c:[Lcom/google/android/gms/internal/gi$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gi$d;->b()Lcom/google/android/gms/internal/gi$d;

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 5

    const/4 v1, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    array-length v2, v2

    if-lez v2, :cond_2

    move v2, v0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    aget-object v3, v3, v0

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    array-length v2, v2

    if-lez v2, :cond_5

    move v2, v0

    move v0, v1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    array-length v3, v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    aget-object v3, v3, v0

    if-eqz v3, :cond_3

    const/4 v4, 0x2

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    move v0, v2

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    array-length v2, v2

    if-lez v2, :cond_7

    :goto_2
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    array-length v2, v2

    if-ge v1, v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    aget-object v2, v2, v1

    if-eqz v2, :cond_6

    const/4 v3, 0x3

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/gi$d;
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
    const/16 v0, 0xa

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/hj$a;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/google/android/gms/internal/hj$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/hj$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/hj$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/hj$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x12

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    if-nez v0, :cond_5

    move v0, v1

    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/hj$a;

    if-eqz v0, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_6

    new-instance v3, Lcom/google/android/gms/internal/hj$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/hj$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    goto :goto_3

    :cond_6
    new-instance v3, Lcom/google/android/gms/internal/hj$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/hj$a;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    goto/16 :goto_0

    :sswitch_3
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    if-nez v0, :cond_8

    move v0, v1

    :goto_5
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/gi$c;

    if-eqz v0, :cond_7

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    :goto_6
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_9

    new-instance v3, Lcom/google/android/gms/internal/gi$c;

    invoke-direct {v3}, Lcom/google/android/gms/internal/gi$c;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    array-length v0, v0

    goto :goto_5

    :cond_9
    new-instance v3, Lcom/google/android/gms/internal/gi$c;

    invoke-direct {v3}, Lcom/google/android/gms/internal/gi$c;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 4

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    array-length v0, v0

    if-lez v0, :cond_5

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    array-length v0, v0

    if-ge v1, v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/gi$d;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/hj$a;->b()[Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {}, Lcom/google/android/gms/internal/hj$a;->b()[Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {}, Lcom/google/android/gms/internal/gi$c;->b()[Lcom/google/android/gms/internal/gi$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/gi$d;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gi$d;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/gi$d;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/gi$d;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/gi$d;

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    iget-object v2, p1, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$d;->a:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$d;->b:[Lcom/google/android/gms/internal/hj$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$d;->c:[Lcom/google/android/gms/internal/gi$c;

    invoke-static {v1}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$d;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v0

    goto :goto_0
.end method
