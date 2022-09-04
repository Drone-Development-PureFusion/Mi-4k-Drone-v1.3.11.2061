.class public final Lcom/google/android/gms/internal/qf$b;
.super Lcom/google/android/gms/internal/qx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/qf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/qf$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/qx",
        "<",
        "Lcom/google/android/gms/internal/qf$b;",
        ">;"
    }
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public c:Lcom/google/android/gms/internal/qf$c;

.field public d:Lcom/google/android/gms/internal/qf$d;

.field public e:Lcom/google/android/gms/internal/qf$e;

.field public f:Lcom/google/android/gms/internal/qf$a;

.field public g:Lcom/google/android/gms/internal/qf$b$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/qx;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/qf$b;->b()Lcom/google/android/gms/internal/qf$b;

    return-void
.end method

.method public static a([B)Lcom/google/android/gms/internal/qf$b;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/qf$b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qf$b;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;[B)Lcom/google/android/gms/internal/rd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/qf$b;

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 6

    invoke-super {p0}, Lcom/google/android/gms/internal/qx;->a()I

    move-result v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/qw;->f(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    if-eqz v1, :cond_4

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    if-eqz v1, :cond_5

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    if-eqz v1, :cond_6

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/qw;->c(ILcom/google/android/gms/internal/rd;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/qf$b;
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

    iput-wide v0, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->g()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_0

    :sswitch_3
    iput v0, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/qf$c;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qf$c;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/qf$d;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qf$d;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/qf$e;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qf$e;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/qf$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qf$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    :sswitch_8
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/qf$b$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qf$b$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/qv;->a(Lcom/google/android/gms/internal/rd;)V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
        0x1a -> :sswitch_4
        0x22 -> :sswitch_5
        0x2a -> :sswitch_6
        0x32 -> :sswitch_7
        0x3a -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_3
        0x2 -> :sswitch_3
        0x3 -> :sswitch_3
        0x4 -> :sswitch_3
        0x5 -> :sswitch_3
        0x6 -> :sswitch_3
        0x7 -> :sswitch_3
        0x8 -> :sswitch_3
        0x9 -> :sswitch_3
        0xa -> :sswitch_3
        0xb -> :sswitch_3
        0xc -> :sswitch_3
        0xd -> :sswitch_3
        0xe -> :sswitch_3
        0xf -> :sswitch_3
        0x10 -> :sswitch_3
        0x11 -> :sswitch_3
        0x12 -> :sswitch_3
        0x13 -> :sswitch_3
        0x14 -> :sswitch_3
        0x15 -> :sswitch_3
        0x16 -> :sswitch_3
        0x17 -> :sswitch_3
        0x18 -> :sswitch_3
        0x19 -> :sswitch_3
        0x1a -> :sswitch_3
        0x1b -> :sswitch_3
        0x1c -> :sswitch_3
        0x1d -> :sswitch_3
        0x1e -> :sswitch_3
        0x1f -> :sswitch_3
        0x20 -> :sswitch_3
        0x21 -> :sswitch_3
        0x22 -> :sswitch_3
        0x23 -> :sswitch_3
        0x24 -> :sswitch_3
        0x25 -> :sswitch_3
        0x26 -> :sswitch_3
        0x27 -> :sswitch_3
        0x28 -> :sswitch_3
        0x29 -> :sswitch_3
        0x2710 -> :sswitch_3
        0x2711 -> :sswitch_3
        0x2712 -> :sswitch_3
        0x2713 -> :sswitch_3
        0x2714 -> :sswitch_3
        0x2715 -> :sswitch_3
        0x2716 -> :sswitch_3
        0x2717 -> :sswitch_3
        0x2718 -> :sswitch_3
        0x2719 -> :sswitch_3
        0x1869f -> :sswitch_3
    .end sparse-switch
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/qw;->b(IJ)V

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(II)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    if-eqz v0, :cond_6

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qw;->a(ILcom/google/android/gms/internal/rd;)V

    :cond_6
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/qx;->a(Lcom/google/android/gms/internal/qw;)V

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/qf$b;
    .locals 3

    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    iput-object v2, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/qf$b;->ah:I

    return-object p0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qf$b;->a(Lcom/google/android/gms/internal/qv;)Lcom/google/android/gms/internal/qf$b;

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
    instance-of v2, p1, Lcom/google/android/gms/internal/qf$b;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/qf$b;

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/qf$b;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    iget v3, p1, Lcom/google/android/gms/internal/qf$b;->b:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    if-nez v2, :cond_9

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    if-nez v2, :cond_a

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    if-nez v2, :cond_b

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    if-nez v2, :cond_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    if-nez v2, :cond_c

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    if-nez v2, :cond_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    if-nez v2, :cond_d

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    if-nez v2, :cond_0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_e

    :cond_7
    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_8

    iget-object v2, p1, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_8
    move v0, v1

    goto :goto_0

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/qf$c;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_a
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/qf$d;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/qf$e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/qf$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_d
    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    iget-object v3, p1, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/qf$b$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    iget-object v1, p1, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_0
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

    iget-wide v2, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/qf$b;->a:J

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/internal/qf$b;->b:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    if-nez v0, :cond_4

    move v0, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    if-nez v0, :cond_5

    move v0, v1

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_0
    :goto_5
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->c:Lcom/google/android/gms/internal/qf$c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qf$c;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->d:Lcom/google/android/gms/internal/qf$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qf$d;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->e:Lcom/google/android/gms/internal/qf$e;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qf$e;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->f:Lcom/google/android/gms/internal/qf$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qf$a;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/qf$b;->g:Lcom/google/android/gms/internal/qf$b$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qf$b$a;->hashCode()I

    move-result v0

    goto :goto_4

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/qf$b;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/qz;->hashCode()I

    move-result v1

    goto :goto_5
.end method
