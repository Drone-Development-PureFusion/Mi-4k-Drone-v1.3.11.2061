.class public Lcom/google/firebase/c/c;
.super Lcom/google/firebase/c/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/c/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/c/j",
        "<",
        "Lcom/google/firebase/c/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Landroid/net/Uri;

.field private c:J

.field private d:Lcom/google/firebase/c/i;

.field private e:Lcom/google/android/gms/internal/nb;

.field private f:J

.field private g:Ljava/lang/String;

.field private volatile h:Ljava/lang/Exception;

.field private i:J

.field private j:I


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;Landroid/net/Uri;)V
    .locals 4
    .param p1    # Lcom/google/firebase/c/i;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/firebase/c/j;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/firebase/c/c;->f:J

    iput-object v2, p0, Lcom/google/firebase/c/c;->g:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/firebase/c/c;->i:J

    iput-object p1, p0, Lcom/google/firebase/c/c;->d:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/c;->b:Landroid/net/Uri;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/c;->d:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/c/d;->f()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/c;->d:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/d;->b()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/c;->e:Lcom/google/android/gms/internal/nb;

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


# virtual methods
.method k()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/c;->f:J

    return-wide v0
.end method

.method l()Lcom/google/firebase/c/i;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/c;->d:Lcom/google/firebase/c/i;

    return-object v0
.end method

.method protected m()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/c/c;->D()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/c/p;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method n()Lcom/google/firebase/c/c$a;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/firebase/c/c$a;

    iget-object v1, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    iget v2, p0, Lcom/google/firebase/c/c;->j:I

    invoke-static {v1, v2}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/firebase/c/c;->c:J

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/firebase/c/c$a;-><init>(Lcom/google/firebase/c/c;Ljava/lang/Exception;J)V

    return-object v0
.end method

.method o()V
    .locals 10

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/c/c;->a(IZ)Z

    iget-object v0, p0, Lcom/google/firebase/c/c;->e:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nb;->b()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/c;->d:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/c;->d:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/firebase/c/c;->i:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;J)Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    iget-object v0, p0, Lcom/google/firebase/c/c;->e:Lcom/google/android/gms/internal/nb;

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/nk;Z)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->g()I

    move-result v0

    iput v0, p0, Lcom/google/firebase/c/c;->j:I

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->f()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->f()Ljava/lang/Exception;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    iget v0, p0, Lcom/google/firebase/c/c;->j:I

    invoke-direct {p0, v0}, Lcom/google/firebase/c/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/c/c;->v()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    move v1, v0

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->i()I

    move-result v0

    int-to-long v4, v0

    iput-wide v4, p0, Lcom/google/firebase/c/c;->f:J

    const-string v0, "ETag"

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/google/firebase/c/c;->g:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/google/firebase/c/c;->g:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v0, "FileDownloadTask"

    const-string v1, "The file at the server has changed.  Restarting from the beginning."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/firebase/c/c;->i:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/c/c;->g:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->b()V

    invoke-virtual {p0}, Lcom/google/firebase/c/c;->m()V

    :cond_0
    :goto_2
    return-void

    :catch_0
    move-exception v0

    const-string v1, "FileDownloadTask"

    const-string v2, "Unable to create firebase storage network request."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    const/16 v0, 0x40

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/c/c;->a(IZ)Z

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    move v1, v0

    goto :goto_1

    :cond_3
    iput-object v0, p0, Lcom/google/firebase/c/c;->g:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->c()Ljava/io/InputStream;

    move-result-object v3

    if-eqz v3, :cond_d

    :try_start_1
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/google/firebase/c/c;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_7

    iget-wide v6, p0, Lcom/google/firebase/c/c;->i:J

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-lez v0, :cond_6

    const-string v3, "FileDownloadTask"

    const-string v5, "The file downloading to has been deleted:"

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "expected a file to resume from."

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-exception v0

    const-string v3, "FileDownloadTask"

    const-string v4, "Exception occurred during file download"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    :cond_4
    :goto_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/nk;->b()V

    if-eqz v1, :cond_e

    iget-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    if-nez v0, :cond_e

    invoke-virtual {p0}, Lcom/google/firebase/c/c;->v()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    const/4 v0, 0x1

    :goto_5
    if-eqz v0, :cond_f

    const/16 v0, 0x80

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/c/c;->a(IZ)Z

    goto :goto_2

    :cond_5
    :try_start_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_7

    const-string v5, "FileDownloadTask"

    const-string v6, "unable to create file:"

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    iget-wide v6, p0, Lcom/google/firebase/c/c;->i:J

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-lez v0, :cond_c

    const-string v5, "FileDownloadTask"

    const-string v6, "Resuming download file "

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_b

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v5, 0x1

    invoke-direct {v0, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    :goto_8
    const/high16 v4, 0x40000

    new-array v4, v4, [B

    :cond_8
    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_9

    const/4 v6, 0x0

    invoke-virtual {v0, v4, v6, v5}, Ljava/io/OutputStream;->write([BII)V

    iget-wide v6, p0, Lcom/google/firebase/c/c;->c:J

    int-to-long v8, v5

    add-long/2addr v6, v8

    iput-wide v6, p0, Lcom/google/firebase/c/c;->c:J

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-virtual {p0, v5, v6}, Lcom/google/firebase/c/c;->a(IZ)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_9
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    goto/16 :goto_4

    :cond_a
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :cond_b
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_c
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Unable to open Firebase Storage stream."

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/c;->h:Ljava/lang/Exception;

    goto/16 :goto_4

    :cond_e
    const/4 v0, 0x0

    goto/16 :goto_5

    :cond_f
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/google/firebase/c/c;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/firebase/c/c;->i:J

    :goto_9
    invoke-virtual {p0}, Lcom/google/firebase/c/c;->v()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_11

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/c/c;->a(IZ)Z

    goto/16 :goto_2

    :cond_10
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/firebase/c/c;->i:J

    goto :goto_9

    :cond_11
    invoke-virtual {p0}, Lcom/google/firebase/c/c;->v()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_12

    const/16 v0, 0x100

    :goto_a
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/c/c;->a(IZ)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "FileDownloadTask"

    invoke-virtual {p0}, Lcom/google/firebase/c/c;->v()I

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

    goto/16 :goto_2

    :cond_12
    const/16 v0, 0x40

    goto :goto_a
.end method

.method protected p()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/c;->e:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nb;->a()V

    return-void
.end method

.method synthetic q()Lcom/google/firebase/c/j$a;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/c;->n()Lcom/google/firebase/c/c$a;

    move-result-object v0

    return-object v0
.end method
