.class public Lcom/google/firebase/c/k;
.super Lcom/google/firebase/c/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/c/k$b;,
        Lcom/google/firebase/c/k$c;,
        Lcom/google/firebase/c/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/c/j",
        "<",
        "Lcom/google/firebase/c/k$b;",
        ">;"
    }
.end annotation


# instance fields
.field private b:Lcom/google/firebase/c/i;

.field private c:Lcom/google/android/gms/internal/nb;

.field private volatile d:Ljava/lang/Exception;

.field private volatile e:I

.field private f:Lcom/google/firebase/c/k$a;

.field private g:J

.field private h:J

.field private i:J

.field private j:Ljava/io/InputStream;

.field private k:Lcom/google/android/gms/internal/nk;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;)V
    .locals 4
    .param p1    # Lcom/google/firebase/c/i;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/firebase/c/j;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/c/k;->e:I

    iput-object p1, p0, Lcom/google/firebase/c/k;->b:Lcom/google/firebase/c/i;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/k;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/k;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/d;->b()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/k;->c:Lcom/google/android/gms/internal/nb;

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/c/k;)Lcom/google/android/gms/internal/nk;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    return-object v0
.end method

.method private a(J)V
    .locals 5

    iget-wide v0, p0, Lcom/google/firebase/c/k;->g:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/google/firebase/c/k;->g:J

    iget-wide v0, p0, Lcom/google/firebase/c/k;->i:J

    const-wide/32 v2, 0x40000

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/google/firebase/c/k;->g:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/c/k;->a(IZ)Z

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/firebase/c/k;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/c/k;->a(J)V

    return-void
.end method

.method private a(I)Z
    .locals 1

    const/16 v0, 0x134

    if-eq p1, v0, :cond_0

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_1

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/firebase/c/k;)Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/k;->j:Ljava/io/InputStream;

    return-object v0
.end method


# virtual methods
.method a(Lcom/google/firebase/c/k$a;)Lcom/google/firebase/c/k;
    .locals 1
    .param p1    # Lcom/google/firebase/c/k$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/k;->f:Lcom/google/firebase/c/k$a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    iput-object p1, p0, Lcom/google/firebase/c/k;->f:Lcom/google/firebase/c/k$a;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method k()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/k;->h:J

    return-wide v0
.end method

.method l()Lcom/google/firebase/c/i;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/k;->b:Lcom/google/firebase/c/i;

    return-object v0
.end method

.method protected m()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/c/k;->D()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/c/p;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method n()Lcom/google/firebase/c/k$b;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/firebase/c/k$b;

    iget-object v1, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    iget v2, p0, Lcom/google/firebase/c/k;->e:I

    invoke-static {v1, v2}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/firebase/c/k;->i:J

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/firebase/c/k$b;-><init>(Lcom/google/firebase/c/k;Ljava/lang/Exception;J)V

    return-object v0
.end method

.method o()V
    .locals 9

    const/4 v2, 0x1

    const/16 v1, 0x40

    const/4 v8, 0x4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/firebase/c/k;->c:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nb;->b()V

    iget-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/c/k;->a(IZ)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, v8, v3}, Lcom/google/firebase/c/k;->a(IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/k;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v4, p0, Lcom/google/firebase/c/k;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v4}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v4

    const-wide/16 v6, 0x0

    invoke-virtual {v0, v4, v6, v7}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;J)Lcom/google/android/gms/internal/nk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/firebase/c/k;->c:Lcom/google/android/gms/internal/nb;

    iget-object v4, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/nk;Z)V

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nk;->g()I

    move-result v0

    iput v0, p0, Lcom/google/firebase/c/k;->e:I

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nk;->f()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nk;->f()Ljava/lang/Exception;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    iget v0, p0, Lcom/google/firebase/c/k;->e:I

    invoke-direct {p0, v0}, Lcom/google/firebase/c/k;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/firebase/c/k;->v()I

    move-result v0

    if-ne v0, v8, :cond_5

    move v4, v2

    :goto_2
    if-eqz v4, :cond_2

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nk;->i()I

    move-result v0

    int-to-long v6, v0

    iput-wide v6, p0, Lcom/google/firebase/c/k;->h:J

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nk;->c()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v5, Lcom/google/firebase/c/k$c;

    invoke-direct {v5, p0, v0}, Lcom/google/firebase/c/k$c;-><init>(Lcom/google/firebase/c/k;Ljava/io/InputStream;)V

    iput-object v5, p0, Lcom/google/firebase/c/k;->j:Ljava/io/InputStream;

    iget-object v0, p0, Lcom/google/firebase/c/k;->f:Lcom/google/firebase/c/k$a;

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v5, p0, Lcom/google/firebase/c/k;->f:Lcom/google/firebase/c/k$a;

    invoke-virtual {p0}, Lcom/google/firebase/c/k;->x()Lcom/google/firebase/c/j$a;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/c/k$b;

    iget-object v6, p0, Lcom/google/firebase/c/k;->j:Ljava/io/InputStream;

    invoke-interface {v5, v0, v6}, Lcom/google/firebase/c/k$a;->a(Lcom/google/firebase/c/k$b;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/google/firebase/c/k;->j:Ljava/io/InputStream;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/c/k;->k:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nk;->b()V

    :cond_3
    if-eqz v4, :cond_7

    iget-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/firebase/c/k;->v()I

    move-result v0

    if-ne v0, v8, :cond_7

    move v0, v2

    :goto_4
    if-eqz v0, :cond_8

    invoke-virtual {p0, v8, v3}, Lcom/google/firebase/c/k;->a(IZ)Z

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/c/k;->a(IZ)Z

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v2, "StreamDownloadTask"

    const-string v4, "Unable to create firebase storage network request."

    invoke-static {v2, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/c/k;->a(IZ)Z

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    goto :goto_1

    :cond_5
    move v4, v3

    goto :goto_2

    :catch_1
    move-exception v0

    const-string v5, "StreamDownloadTask"

    const-string v6, "Exception occurred calling doInBackground."

    invoke-static {v5, v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v5, "Could not open resulting stream."

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/k;->d:Ljava/lang/Exception;

    goto :goto_3

    :cond_7
    move v0, v3

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/google/firebase/c/k;->v()I

    move-result v0

    const/16 v2, 0x20

    if-ne v0, v2, :cond_9

    const/16 v0, 0x100

    :goto_5
    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/c/k;->a(IZ)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "StreamDownloadTask"

    invoke-virtual {p0}, Lcom/google/firebase/c/k;->v()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x3e

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unable to change download task to final state from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_9
    move v0, v1

    goto :goto_5
.end method

.method protected p()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/k;->c:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nb;->a()V

    return-void
.end method

.method synthetic q()Lcom/google/firebase/c/j$a;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/k;->n()Lcom/google/firebase/c/k$b;

    move-result-object v0

    return-object v0
.end method

.method protected z()V
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/k;->g:J

    iput-wide v0, p0, Lcom/google/firebase/c/k;->i:J

    return-void
.end method
