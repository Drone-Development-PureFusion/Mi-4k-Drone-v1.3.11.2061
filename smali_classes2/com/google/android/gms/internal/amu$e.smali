.class public final Lcom/google/android/gms/internal/amu$e;
.super Lcom/google/android/gms/internal/rd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/amu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static volatile d:[Lcom/google/android/gms/internal/amu$e;


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/String;

.field public c:Lcom/google/android/gms/internal/amu$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/rd;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/amu$e;->c()Lcom/google/android/gms/internal/amu$e;

    return-void
.end method

.method public static b()[Lcom/google/android/gms/internal/amu$e;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/amu$e;->d:[Lcom/google/android/gms/internal/amu$e;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/rb;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/amu$e;->d:[Lcom/google/android/gms/internal/amu$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/internal/amu$e;

    sput-object v0, Lcom/google/android/gms/internal/amu$e;->d:[Lcom/google/android/gms/internal/amu$e;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/amu$e;->d:[Lcom/google/android/gms/internal/amu$e;

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
    .locals 3

    invoke-super {p0}, Lcom/google/android/gms/internal/rd;->a()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/amu$e;
    .locals 1

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

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/amu$c;

    invoke-direct {v0}, Lcom/google/android/gms/internal/amu$c;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

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
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_2
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/amu$e;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/amu$e;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/amu$e;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/amu$e;->ah:I

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/amu$e;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/amu$e;

    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    if-nez v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    if-nez v2, :cond_5

    iget-object v2, p1, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    if-eqz v2, :cond_6

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    if-nez v2, :cond_7

    iget-object v2, p1, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    iget-object v3, p1, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/amu$c;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

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

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    if-nez v2, :cond_2

    :goto_2
    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/amu$e;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/amu$e;->c:Lcom/google/android/gms/internal/amu$c;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/amu$c;->hashCode()I

    move-result v1

    goto :goto_2
.end method
