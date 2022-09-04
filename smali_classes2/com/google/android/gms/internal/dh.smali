.class public abstract Lcom/google/android/gms/internal/dh;
.super Ljava/lang/Object;


# instance fields
.field protected final a:Lcom/google/android/gms/internal/dl;

.field protected final b:Lcom/google/android/gms/internal/dj;

.field protected final c:Lcom/google/android/gms/common/util/e;

.field protected final d:Lcom/google/android/gms/internal/aos;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:I


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/aos;)V
    .locals 6
    .param p4    # Lcom/google/android/gms/internal/aos;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dh;-><init>(ILcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/aos;Lcom/google/android/gms/common/util/e;)V

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/aos;Lcom/google/android/gms/common/util/e;)V
    .locals 1
    .param p4    # Lcom/google/android/gms/internal/aos;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/dl;

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->a:Lcom/google/android/gms/internal/dl;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput p1, p0, Lcom/google/android/gms/internal/dh;->e:I

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/dj;

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->b:Lcom/google/android/gms/internal/dj;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/util/e;

    iput-object v0, p0, Lcom/google/android/gms/internal/dh;->c:Lcom/google/android/gms/common/util/e;

    iput-object p4, p0, Lcom/google/android/gms/internal/dh;->d:Lcom/google/android/gms/internal/aos;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1

    packed-switch p1, :pswitch_data_0

    const-string v0, "Unknown reason"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "Resource not available"

    goto :goto_0

    :pswitch_1
    const-string v0, "IOError"

    goto :goto_0

    :pswitch_2
    const-string v0, "Server error"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(II)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/dh;->d:Lcom/google/android/gms/internal/aos;

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dh;->d:Lcom/google/android/gms/internal/aos;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aos;->e()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dh;->a:Lcom/google/android/gms/internal/dl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/dh;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x3d

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Failed to fetch the container resource for the container \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/dm;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dh;->a(Lcom/google/android/gms/internal/dm;)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/internal/dm;)V
.end method

.method public a([B)V
    .locals 7

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/dh;->b([B)Lcom/google/android/gms/internal/dm;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/dh;->d:Lcom/google/android/gms/internal/aos;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/dh;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dh;->d:Lcom/google/android/gms/internal/aos;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aos;->f()V

    :cond_0
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/google/android/gms/internal/dm;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v1, :cond_1

    invoke-virtual {v6}, Lcom/google/android/gms/internal/dm;->b()Lcom/google/android/gms/internal/dm$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm$a;->c()Lcom/google/android/gms/internal/dv;

    move-result-object v3

    new-instance v0, Lcom/google/android/gms/internal/dm$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/dh;->a:Lcom/google/android/gms/internal/dl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/dh;->c:Lcom/google/android/gms/common/util/e;

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dm$a;-><init>(Lcom/google/android/gms/internal/dd;[BLcom/google/android/gms/internal/dv;J)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/dm;->c()Lcom/google/android/gms/internal/dy;

    move-result-object v2

    new-instance v1, Lcom/google/android/gms/internal/dm;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    iget v4, p0, Lcom/google/android/gms/internal/dh;->e:I

    invoke-direct {v1, v3, v4, v0, v2}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/common/api/Status;ILcom/google/android/gms/internal/dm$a;Lcom/google/android/gms/internal/dy;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dh;->a(Lcom/google/android/gms/internal/dm;)V

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/dm;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    iget v2, p0, Lcom/google/android/gms/internal/dh;->e:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    goto :goto_0
.end method

.method protected b([B)Lcom/google/android/gms/internal/dm;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/dh;->b:Lcom/google/android/gms/internal/dj;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/dj;->a([B)Lcom/google/android/gms/internal/dm;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, "Parsed resource from is null"

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/de; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    const-string v1, "Resource data is corrupted"

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->c(Ljava/lang/String;)V

    goto :goto_0
.end method
