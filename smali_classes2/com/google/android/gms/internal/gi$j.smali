.class public final Lcom/google/android/gms/internal/gi$j;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/gi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/gi$j;",
        ">;"
    }
.end annotation


# instance fields
.field public a:[Lcom/google/android/gms/internal/gi$i;

.field public b:Lcom/google/android/gms/internal/gi$f;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gi$j;->b()Lcom/google/android/gms/internal/gi$j;

    return-void
.end method

.method public static a([B)Lcom/google/android/gms/internal/gi$j;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gi$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gi$j;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;[B)Lcom/google/android/gms/internal/rd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gi$j;

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v1

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_3
    return v1
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/gi$j;
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

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/gi$i;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/google/android/gms/internal/gi$i;

    invoke-direct {v3}, Lcom/google/android/gms/internal/gi$i;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/gi$i;

    invoke-direct {v3}, Lcom/google/android/gms/internal/gi$i;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/gi$f;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gi$f;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_3
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/gi$j;
    .locals 2

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/gi$i;->b()[Lcom/google/android/gms/internal/gi$i;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    iput-object v1, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/gi$j;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gi$j;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/gi$j;

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
    instance-of v2, p1, Lcom/google/android/gms/internal/gi$j;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/gi$j;

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    if-nez v2, :cond_7

    iget-object v2, p1, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_4
    iget-object v2, p1, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_5

    iget-object v2, p1, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_5
    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/gi$f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    invoke-static {v2}, Lcom/google/android/gms/internal/rb;->a([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    :goto_2
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gi$f;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/gi$j;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v1

    goto :goto_2
.end method
