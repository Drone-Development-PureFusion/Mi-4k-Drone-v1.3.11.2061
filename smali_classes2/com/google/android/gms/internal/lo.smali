.class public Lcom/google/android/gms/internal/lo;
.super Lcom/google/android/gms/internal/le;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/le",
        "<",
        "Lcom/google/android/gms/internal/lo;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/le;-><init>(Lcom/google/android/gms/internal/lh;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/internal/le;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lo;->a(Lcom/google/android/gms/internal/lo;)I

    move-result v0

    return v0
.end method

.method protected a(Lcom/google/android/gms/internal/lo;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lo;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/lo;

    iget-object v1, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/lo;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/lh;)V

    return-object v0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;
    .locals 5

    sget-object v0, Lcom/google/android/gms/internal/lo$1;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lh$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x26

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Invalid hash version for string node: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lo;->b(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x7

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "string:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lo;->b(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/mk;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x7

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "string:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lo;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lo;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/google/android/gms/internal/lo;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/lo;

    iget-object v1, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/lo;->b:Lcom/google/android/gms/internal/lh;

    iget-object v2, p1, Lcom/google/android/gms/internal/lo;->b:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lo;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lo;->b:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method protected u_()Lcom/google/android/gms/internal/le$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/le$a;->d:Lcom/google/android/gms/internal/le$a;

    return-object v0
.end method
