.class public final Lcom/google/android/gms/internal/df$e;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/df;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/df$e;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/String;

.field public c:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/df$e;->a:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/df$e;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/df$e;->c:[B

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/df$e;->ah:I

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/df$e;->a:Ljava/lang/Long;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/df$e;->a:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/df$e;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/df$e;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/df$e;->c:[B

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/df$e;->c:[B

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/df$e;
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

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/df$e;->a:Ljava/lang/Long;

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/df$e;->b:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->k()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/df$e;->c:[B

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x1a -> :sswitch_2
        0x22 -> :sswitch_3
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/df$e;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/df$e;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/df$e;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/df$e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/df$e;->c:[B

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/df$e;->c:[B

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(I[B)V

    :cond_2
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/df$e;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/df$e;

    move-result-object v0

    return-object v0
.end method
