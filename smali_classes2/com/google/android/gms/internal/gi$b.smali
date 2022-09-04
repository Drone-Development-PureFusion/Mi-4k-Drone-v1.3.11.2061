.class public final Lcom/google/android/gms/internal/gi$b;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/gi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/gi$b;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile f:[Lcom/google/android/gms/internal/gi$b;


# instance fields
.field public a:[I

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gi$b;->c()Lcom/google/android/gms/internal/gi$b;

    return-void
.end method

.method public static b()[Lcom/google/android/gms/internal/gi$b;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/gi$b;->f:[Lcom/google/android/gms/internal/gi$b;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/rb;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/gi$b;->f:[Lcom/google/android/gms/internal/gi$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/internal/gi$b;

    sput-object v0, Lcom/google/android/gms/internal/gi$b;->f:[Lcom/google/android/gms/internal/gi$b;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/gi$b;->f:[Lcom/google/android/gms/internal/gi$b;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected a()I
    .locals 4

    const/4 v1, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    iget-boolean v3, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/qw;->b(IZ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    const/4 v2, 0x2

    iget v3, p0, Lcom/google/android/gms/internal/gi$b;->b:I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v2

    add-int/2addr v2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v3, v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    aget v3, v3, v0

    invoke-static {v3}, Lcom/google/android/gms/internal/qw;->c(I)I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int v0, v2, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    iget v2, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-boolean v1, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->b(IZ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    return v0

    :cond_4
    move v0, v2

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/gi$b;
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
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/gi$b;->b:I

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x18

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/rg;->b(Lcom/google/android/gms/internal/qv;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [I

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

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
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v0, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v3

    aput v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

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

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    if-nez v2, :cond_6

    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

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
    iget-object v2, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v2, v2

    goto :goto_4

    :cond_7
    iput-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/qv;->e(I)V

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x18 -> :sswitch_3
        0x1a -> :sswitch_4
        0x20 -> :sswitch_5
        0x30 -> :sswitch_6
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(IZ)V

    :cond_0
    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/gi$b;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    aget v2, v2, v0

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/qw;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(IZ)V

    :cond_3
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gi$b;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/gi$b;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/gi$b;
    .locals 2

    const/4 v1, 0x0

    sget-object v0, Lcom/google/android/gms/internal/rg;->a:[I

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    iput v1, p0, Lcom/google/android/gms/internal/gi$b;->b:I

    iput v1, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/gi$b;->ah:I

    return-object p0
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
    instance-of v2, p1, Lcom/google/android/gms/internal/gi$b;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/gi$b;

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/gi$b;->a:[I

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/rb;->a([I[I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/gi$b;->b:I

    iget v3, p1, Lcom/google/android/gms/internal/gi$b;->b:I

    if-ne v2, v3, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    iget v3, p1, Lcom/google/android/gms/internal/gi$b;->c:I

    if-ne v2, v3, :cond_0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/gi$b;->d:Z

    if-ne v2, v3, :cond_0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/gi$b;->e:Z

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    iget-object v2, p1, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    const/16 v2, 0x4d5

    const/16 v1, 0x4cf

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, Lcom/google/android/gms/internal/gi$b;->a:[I

    invoke-static {v3}, Lcom/google/android/gms/internal/rb;->a([I)I

    move-result v3

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/google/android/gms/internal/gi$b;->b:I

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget v3, p0, Lcom/google/android/gms/internal/gi$b;->c:I

    add-int/2addr v0, v3

    mul-int/lit8 v3, v0, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gi$b;->d:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Lcom/google/android/gms/internal/gi$b;->e:Z

    if-eqz v3, :cond_2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    const/4 v0, 0x0

    :goto_2
    add-int/2addr v0, v1

    return v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/gi$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v0

    goto :goto_2
.end method
