.class public final Lcom/google/android/gms/internal/ff$a$a;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ff$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ff$a$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/ff$a$a;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile c:[Lcom/google/android/gms/internal/ff$a$a;


# instance fields
.field public a:I

.field public b:Lcom/google/android/gms/internal/ff$a$a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ff$a$a;->c()Lcom/google/android/gms/internal/ff$a$a;

    return-void
.end method

.method public static b()[Lcom/google/android/gms/internal/ff$a$a;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ff$a$a;->c:[Lcom/google/android/gms/internal/ff$a$a;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/rb;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ff$a$a;->c:[Lcom/google/android/gms/internal/ff$a$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/internal/ff$a$a;

    sput-object v0, Lcom/google/android/gms/internal/ff$a$a;->c:[Lcom/google/android/gms/internal/ff$a$a;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ff$a$a;->c:[Lcom/google/android/gms/internal/ff$a$a;

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

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/ff$a$a;
    .locals 1

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
    iput v0, p0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ff$a$a$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
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
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ff$a$a;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/ff$a$a;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/ff$a$a;
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iput-object v1, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iput-object v1, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ff$a$a;->ah:I

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
    instance-of v2, p1, Lcom/google/android/gms/internal/ff$a$a;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ff$a$a;

    iget v2, p0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget v3, p1, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    if-nez v2, :cond_5

    iget-object v2, p1, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_3
    iget-object v2, p1, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_4

    iget-object v2, p1, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ff$a$a$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

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

    iget v2, p0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    :goto_1
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ff$a$a$a;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ff$a$a;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v1

    goto :goto_1
.end method
