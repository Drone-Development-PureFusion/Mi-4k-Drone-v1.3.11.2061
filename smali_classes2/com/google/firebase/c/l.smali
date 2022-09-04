.class public Lcom/google/firebase/c/l;
.super Lcom/google/firebase/c/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/c/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/c/j",
        "<",
        "Lcom/google/firebase/c/l$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/firebase/c/i;

.field private final c:Landroid/net/Uri;

.field private final d:[B

.field private final e:[B

.field private final f:J

.field private final g:Ljava/util/concurrent/atomic/AtomicLong;

.field private h:Lcom/google/android/gms/internal/nb;

.field private i:Ljava/io/InputStream;

.field private volatile j:Lcom/google/firebase/c/h;

.field private volatile k:Landroid/net/Uri;

.field private volatile l:Ljava/lang/Exception;

.field private volatile m:Ljava/lang/Exception;

.field private volatile n:I

.field private volatile o:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 11

    const-wide/16 v2, -0x1

    const/4 v6, 0x0

    invoke-direct {p0}, Lcom/google/firebase/c/j;-><init>()V

    const/high16 v0, 0x40000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/firebase/c/l;->e:[B

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v4, 0x0

    invoke-direct {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object v6, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    iput-object v6, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    iput-object v6, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/c/l;->n:I

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v6, p0, Lcom/google/firebase/c/l;->d:[B

    iput-object p1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    iput-object p3, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v4, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v4}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/firebase/c/d;->c()J

    move-result-wide v4

    invoke-direct {v0, v1, v4, v5}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/c/d;->f()Lcom/google/firebase/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v7

    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    const-string v1, "r"

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor;->getStatSize()J
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-wide v0

    :try_start_2
    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4

    :goto_0
    move-wide v2, v0

    :goto_1
    :try_start_3
    iget-object v0, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    invoke-virtual {v7, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v1

    if-eqz v1, :cond_2

    :try_start_4
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_5

    :goto_2
    move-wide v9, v2

    move-object v2, v0

    move-wide v0, v9

    :goto_3
    iput-wide v0, p0, Lcom/google/firebase/c/l;->f:J

    iput-object v2, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    iput-object p4, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    return-void

    :catch_0
    move-exception v0

    move-wide v4, v2

    :goto_4
    :try_start_5
    const-string v1, "UploadTask"

    const-string v8, "NullPointerException during file size calculation."

    invoke-static {v1, v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    move-wide v2, v4

    move-object v1, v6

    move-object v4, v0

    :goto_5
    const-string v5, "UploadTask"

    const-string v6, "could not locate file for uploading:"

    iget-object v0, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iput-object v4, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    move-wide v9, v2

    move-object v2, v1

    move-wide v0, v9

    goto :goto_3

    :catch_2
    move-exception v0

    :goto_7
    :try_start_6
    const-string v1, "UploadTask"

    const-string v4, "could not retrieve file size for upload "

    iget-object v0, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_8
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_3
    move-exception v0

    move-object v4, v0

    move-object v1, v6

    goto :goto_5

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_8

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :catch_4
    move-exception v2

    move-object v4, v2

    move-wide v2, v0

    move-object v1, v6

    goto :goto_5

    :catch_5
    move-exception v0

    move-object v4, v0

    goto :goto_5

    :catch_6
    move-exception v2

    move-wide v2, v0

    goto :goto_7

    :catch_7
    move-exception v4

    move-object v9, v4

    move-wide v4, v0

    move-object v0, v9

    goto :goto_4

    :cond_2
    move-object v0, v1

    goto :goto_2

    :cond_3
    move-wide v0, v2

    goto/16 :goto_0
.end method

.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Ljava/io/InputStream;)V
    .locals 6

    const/high16 v5, 0x40000

    const/4 v4, 0x0

    invoke-direct {p0}, Lcom/google/firebase/c/j;-><init>()V

    new-array v0, v5, [B

    iput-object v0, p0, Lcom/google/firebase/c/l;->e:[B

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object v4, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    iput-object v4, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    iput-object v4, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/c/l;->n:I

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/firebase/c/l;->f:J

    iput-object v4, p0, Lcom/google/firebase/c/l;->d:[B

    iput-object p1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p3, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    iput-object v4, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/d;->c()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;[B)V
    .locals 6

    const/high16 v5, 0x40000

    const/4 v4, 0x0

    invoke-direct {p0}, Lcom/google/firebase/c/j;-><init>()V

    new-array v0, v5, [B

    iput-object v0, p0, Lcom/google/firebase/c/l;->e:[B

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object v4, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    iput-object v4, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    iput-object v4, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/c/l;->n:I

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/c/l;->d:[B

    iget-object v0, p0, Lcom/google/firebase/c/l;->d:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/google/firebase/c/l;->f:J

    iput-object p1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    iput-object v4, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    iget-object v2, p0, Lcom/google/firebase/c/l;->d:[B

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/d;->c()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    return-void
.end method

.method private E()V
    .locals 5

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    invoke-virtual {v0}, Lcom/google/firebase/c/h;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    if-eqz v2, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/c/d;->f()Lcom/google/firebase/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/c/l;->c:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "application/octet-stream"

    :cond_1
    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v3}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    if-eqz v4, :cond_2

    iget-object v1, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    invoke-virtual {v1}, Lcom/google/firebase/c/h;->s()Lorg/json/JSONObject;

    move-result-object v1

    :cond_2
    invoke-virtual {v2, v3, v1, v0}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/c/l;->b(Lcom/google/android/gms/internal/nk;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    :goto_1
    return-void

    :catch_0
    move-exception v0

    :goto_2
    const-string v1, "UploadTask"

    const-string v2, "Unable to create a network request from metadata"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    goto :goto_1

    :cond_4
    const-string v1, "X-Goog-Upload-URL"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_0
.end method

.method private F()Z
    .locals 5

    const/4 v1, 0x1

    const/16 v4, 0x40

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/firebase/c/l;->v()I

    move-result v2

    const/16 v3, 0x80

    if-ne v2, v3, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v1, Ljava/lang/InterruptedException;

    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    iput-object v1, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    invoke-virtual {p0, v4, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/firebase/c/l;->v()I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_3

    const/16 v1, 0x100

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/firebase/c/l;->v()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_4

    const/16 v1, 0x10

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lcom/google/firebase/c/l;->G()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    if-nez v2, :cond_6

    iget-object v1, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to obtain an upload URL."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    :cond_5
    invoke-virtual {p0, v4, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    if-eqz v2, :cond_7

    invoke-virtual {p0, v4, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    if-nez v2, :cond_8

    iget v2, p0, Lcom/google/firebase/c/l;->n:I

    const/16 v3, 0xc8

    if-lt v2, v3, :cond_8

    iget v2, p0, Lcom/google/firebase/c/l;->n:I

    const/16 v3, 0x12c

    if-lt v2, v3, :cond_9

    :cond_8
    move v2, v1

    :goto_1
    if-eqz v2, :cond_a

    invoke-direct {p0, v1}, Lcom/google/firebase/c/l;->a(Z)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-direct {p0}, Lcom/google/firebase/c/l;->G()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v4, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_0

    :cond_9
    move v2, v0

    goto :goto_1

    :cond_a
    move v0, v1

    goto :goto_0
.end method

.method private G()Z
    .locals 3

    const/4 v0, 0x0

    const-string v1, "final"

    iget-object v2, p0, Lcom/google/firebase/c/l;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    if-nez v1, :cond_0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "The server has terminated the upload session"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    :cond_0
    const/16 v1, 0x40

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/l;->a(IZ)Z

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private H()V
    .locals 14

    const-wide/32 v12, 0x40000

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/google/firebase/c/l;->e:[B

    array-length v1, v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/io/InputStream;->mark(I)V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/google/firebase/c/l;->e:[B

    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/c/l;->e:[B

    iget-object v4, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    int-to-long v10, v6

    cmp-long v7, v10, v12

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    :goto_0
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;Ljava/lang/String;[BJIZ)Lcom/google/android/gms/internal/nk;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/firebase/c/l;->a(Lcom/google/android/gms/internal/nk;)Z

    move-result v0

    if-nez v0, :cond_2

    :try_start_2
    iget-object v0, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_0
    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "UploadTask"

    const-string v2, "Unable to read bytes for uploading"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    goto :goto_1

    :cond_1
    move v7, v8

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "UploadTask"

    const-string v2, "Unable to create chunk upload request"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v1, "UploadTask"

    const-string v2, "Unable to reset the stream for error recovery."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    if-eq v6, v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    int-to-long v2, v6

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndAdd(J)J

    :cond_3
    int-to-long v2, v6

    cmp-long v0, v2, v12

    if-eqz v0, :cond_0

    :try_start_3
    new-instance v0, Lcom/google/firebase/c/h$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nk;->d()Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-direct {v0, v2, v3}, Lcom/google/firebase/c/h$a;-><init>(Lorg/json/JSONObject;Lcom/google/firebase/c/i;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/h$a;->a()Lcom/google/firebase/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v0, 0x4

    invoke-virtual {p0, v0, v8}, Lcom/google/firebase/c/l;->a(IZ)Z

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v8}, Lcom/google/firebase/c/l;->a(IZ)Z

    goto :goto_1

    :catch_3
    move-exception v0

    :goto_2
    const-string v2, "UploadTask"

    const-string v3, "Unable to parse resulting metadata from upload:"

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nk;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/firebase/c/l;)Lcom/google/firebase/c/i;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    return-object v0
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

.method private a(Lcom/google/android/gms/internal/nk;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ng;->a(Lcom/google/firebase/b;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/c/l;->c(Lcom/google/android/gms/internal/nk;)Z

    move-result v0

    return v0
.end method

.method private a(Z)Z
    .locals 10

    const/4 v2, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v1

    iget-object v3, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/nj;->b(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const-string v1, "final"

    iget-object v3, p0, Lcom/google/firebase/c/l;->o:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v0, v2

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v1, "UploadTask"

    const-string v3, "Unable to recover status during resumable upload"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    move v0, v2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, Lcom/google/firebase/c/l;->b(Lcom/google/android/gms/internal/nk;)Z

    move-result v1

    if-nez v1, :cond_2

    move v0, v2

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/firebase/c/l;->a(Lcom/google/android/gms/internal/nk;)Z

    move-result v1

    if-nez v1, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    const-string v1, "final"

    const-string v3, "X-Goog-Upload-Status"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Ljava/io/IOException;

    const-string v1, "The server has terminated the upload session"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    move v0, v2

    goto :goto_0

    :cond_3
    const-string v1, "X-Goog-Upload-Size-Received"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_1
    iget-object v3, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    cmp-long v3, v4, v0

    if-lez v3, :cond_5

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected error. The server lost a chunk update."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    move v0, v2

    goto :goto_0

    :cond_4
    const-wide/16 v0, 0x0

    goto :goto_1

    :cond_5
    cmp-long v3, v4, v0

    if-gez v3, :cond_7

    :try_start_1
    iget-object v3, p0, Lcom/google/firebase/c/l;->i:Ljava/io/InputStream;

    sub-long v6, v0, v4

    invoke-virtual {v3, v6, v7}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v6

    sub-long v8, v0, v4

    cmp-long v3, v6, v8

    if-eqz v3, :cond_6

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected end of stream encountered."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    move v0, v2

    goto :goto_0

    :cond_6
    iget-object v3, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3, v4, v5, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "UploadTask"

    const-string v1, "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "uploaded bytes changed unexpectedly."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move v0, v2

    goto/16 :goto_0

    :catch_1
    move-exception v0

    const-string v1, "UploadTask"

    const-string v3, "Unable to recover position in Stream during resumable upload"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    move v0, v2

    goto/16 :goto_0

    :cond_7
    const/4 v0, 0x1

    goto/16 :goto_0
.end method

.method private b(Lcom/google/android/gms/internal/nk;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/nk;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/c/l;->c(Lcom/google/android/gms/internal/nk;)Z

    move-result v0

    return v0
.end method

.method private c(Lcom/google/android/gms/internal/nk;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/nk;->g()I

    move-result v0

    iget-object v1, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/nb;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x2

    :cond_0
    iput v0, p0, Lcom/google/firebase/c/l;->n:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/nk;->f()Ljava/lang/Exception;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    const-string v0, "X-Goog-Upload-Status"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/l;->o:Ljava/lang/String;

    iget v0, p0, Lcom/google/firebase/c/l;->n:I

    invoke-direct {p0, v0}, Lcom/google/firebase/c/l;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    if-nez v0, :cond_1

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

    iget-wide v0, p0, Lcom/google/firebase/c/l;->f:J

    return-wide v0
.end method

.method l()Lcom/google/firebase/c/i;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    return-object v0
.end method

.method protected m()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/c/l;->D()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/c/p;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method n()Lcom/google/firebase/c/l$a;
    .locals 8
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    :goto_0
    new-instance v1, Lcom/google/firebase/c/l$a;

    iget v2, p0, Lcom/google/firebase/c/l;->n:I

    invoke-static {v0, v2}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;

    move-result-object v3

    iget-object v0, p0, Lcom/google/firebase/c/l;->g:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    iget-object v7, p0, Lcom/google/firebase/c/l;->j:Lcom/google/firebase/c/h;

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/google/firebase/c/l$a;-><init>(Lcom/google/firebase/c/l;Ljava/lang/Exception;JLandroid/net/Uri;Lcom/google/firebase/c/h;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    goto :goto_0
.end method

.method o()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nb;->b()V

    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->a()Lcom/google/firebase/c/i;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot upload to getRoot. You should upload to a storage location such as .getReference(\'image.png\').putFile..."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    if-eqz v0, :cond_2

    const/16 v0, 0x40

    invoke-virtual {p0, v0, v2}, Lcom/google/firebase/c/l;->a(IZ)Z

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/google/firebase/c/l;->E()V

    :goto_0
    invoke-direct {p0}, Lcom/google/firebase/c/l;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, v2}, Lcom/google/firebase/c/l;->a(IZ)Z

    invoke-direct {p0}, Lcom/google/firebase/c/l;->H()V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v2}, Lcom/google/firebase/c/l;->a(Z)Z

    goto :goto_0
.end method

.method protected p()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/c/l;->h:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nb;->a()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/c/l;->b:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/c/l;->k:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/c/l$1;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/c/l$1;-><init>(Lcom/google/firebase/c/l;Lcom/google/android/gms/internal/nk;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/c/p;->a(Ljava/lang/Runnable;)V

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lcom/google/firebase/c/g;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    invoke-super {p0}, Lcom/google/firebase/c/j;->p()V

    return-void

    :catch_0
    move-exception v0

    const-string v2, "UploadTask"

    const-string v3, "Unable to create chunk upload request"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    goto :goto_0
.end method

.method synthetic q()Lcom/google/firebase/c/j$a;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/l;->n()Lcom/google/firebase/c/l$a;

    move-result-object v0

    return-object v0
.end method

.method protected s()V
    .locals 2

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/firebase/c/l;->l:Ljava/lang/Exception;

    iput-object v1, p0, Lcom/google/firebase/c/l;->m:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/c/l;->n:I

    iput-object v1, p0, Lcom/google/firebase/c/l;->o:Ljava/lang/String;

    return-void
.end method
