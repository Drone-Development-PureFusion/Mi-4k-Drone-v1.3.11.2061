.class public Lcom/google/firebase/c/i;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Landroid/net/Uri;

.field private final c:Lcom/google/firebase/c/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/firebase/c/i;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Landroid/net/Uri;Lcom/google/firebase/c/d;)V
    .locals 4
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "storageUri cannot be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "FirebaseApp cannot be null"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    iput-object p2, p0, Lcom/google/firebase/c/i;->c:Lcom/google/firebase/c/d;

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method


# virtual methods
.method public a(J)Lcom/google/android/gms/g/f;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/android/gms/g/f",
            "<[B>;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/g/g;

    invoke-direct {v1}, Lcom/google/android/gms/g/g;-><init>()V

    new-instance v2, Lcom/google/firebase/c/k;

    invoke-direct {v2, p0}, Lcom/google/firebase/c/k;-><init>(Lcom/google/firebase/c/i;)V

    new-instance v0, Lcom/google/firebase/c/i$5;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/firebase/c/i$5;-><init>(Lcom/google/firebase/c/i;JLcom/google/android/gms/g/g;)V

    invoke-virtual {v2, v0}, Lcom/google/firebase/c/k;->a(Lcom/google/firebase/c/k$a;)Lcom/google/firebase/c/k;

    move-result-object v0

    new-instance v3, Lcom/google/firebase/c/i$4;

    invoke-direct {v3, p0, v1}, Lcom/google/firebase/c/i$4;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v0, v3}, Lcom/google/firebase/c/j;->a(Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/c/j;

    new-instance v3, Lcom/google/firebase/c/i$3;

    invoke-direct {v3, p0, v1}, Lcom/google/firebase/c/i$3;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v0, v3}, Lcom/google/firebase/c/j;->a(Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/c/j;

    invoke-virtual {v2}, Lcom/google/firebase/c/k;->r()Z

    invoke-virtual {v1}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/c/h;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Lcom/google/firebase/c/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/h;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/c/h;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/c/r;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/firebase/c/r;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;Lcom/google/firebase/c/h;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/c/p;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/io/File;)Lcom/google/firebase/c/c;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/c/i;->b(Landroid/net/Uri;)Lcom/google/firebase/c/c;

    move-result-object v0

    return-object v0
.end method

.method public a()Lcom/google/firebase/c/i;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    const-string v0, "/"

    :goto_1
    iget-object v1, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    new-instance v0, Lcom/google/firebase/c/i;

    iget-object v2, p0, Lcom/google/firebase/c/i;->c:Lcom/google/firebase/c/d;

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/c/i;-><init>(Landroid/net/Uri;Lcom/google/firebase/c/d;)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Lcom/google/firebase/c/i;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "childName cannot be null or empty"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/nc;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-static {v2}, Lcom/google/android/gms/internal/nc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    new-instance v1, Lcom/google/firebase/c/i;

    iget-object v2, p0, Lcom/google/firebase/c/i;->c:Lcom/google/firebase/c/d;

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/c/i;-><init>(Landroid/net/Uri;Lcom/google/firebase/c/d;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    const-string v3, "StorageReference"

    const-string v4, "Unable to create a valid default Uri. "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v3, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "childName"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/firebase/c/k$a;)Lcom/google/firebase/c/k;
    .locals 1
    .param p1    # Lcom/google/firebase/c/k$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/firebase/c/k;

    invoke-direct {v0, p0}, Lcom/google/firebase/c/k;-><init>(Lcom/google/firebase/c/i;)V

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/k;->a(Lcom/google/firebase/c/k$a;)Lcom/google/firebase/c/k;

    invoke-virtual {v0}, Lcom/google/firebase/c/k;->r()Z

    return-object v0
.end method

.method public a(Landroid/net/Uri;)Lcom/google/firebase/c/l;
    .locals 3
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "uri cannot be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    invoke-direct {v0, p0, v2, p1, v2}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/net/Uri;Lcom/google/firebase/c/h;)Lcom/google/firebase/c/l;
    .locals 4
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "uri cannot be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "metadata cannot be null"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p1, v1}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a(Landroid/net/Uri;Lcom/google/firebase/c/h;Landroid/net/Uri;)Lcom/google/firebase/c/l;
    .locals 4
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/h;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "uri cannot be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "metadata cannot be null"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a(Ljava/io/InputStream;)Lcom/google/firebase/c/l;
    .locals 2
    .param p1    # Ljava/io/InputStream;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "stream cannot be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/io/InputStream;Lcom/google/firebase/c/h;)Lcom/google/firebase/c/l;
    .locals 4
    .param p1    # Ljava/io/InputStream;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "stream cannot be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "metadata cannot be null"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a([B)Lcom/google/firebase/c/l;
    .locals 2
    .param p1    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "bytes cannot be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;[B)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a([BLcom/google/firebase/c/h;)Lcom/google/firebase/c/l;
    .locals 4
    .param p1    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "bytes cannot be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "metadata cannot be null"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/l;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/firebase/c/l;-><init>(Lcom/google/firebase/c/i;Lcom/google/firebase/c/h;[B)V

    invoke-virtual {v0}, Lcom/google/firebase/c/l;->r()Z

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public b(Landroid/net/Uri;)Lcom/google/firebase/c/c;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/firebase/c/c;

    invoke-direct {v0, p0, p1}, Lcom/google/firebase/c/c;-><init>(Lcom/google/firebase/c/i;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/c;->r()Z

    return-object v0
.end method

.method public b()Lcom/google/firebase/c/i;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/c/i;

    iget-object v2, p0, Lcom/google/firebase/c/i;->c:Lcom/google/firebase/c/d;

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/c/i;-><init>(Landroid/net/Uri;Lcom/google/firebase/c/d;)V

    return-object v1
.end method

.method public c()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Lcom/google/firebase/c/i;->a:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Lcom/google/firebase/c/i;->a:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/firebase/c/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Lcom/google/firebase/c/i;

    invoke-virtual {p1}, Lcom/google/firebase/c/i;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/c/i;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public f()Lcom/google/firebase/c/d;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->c:Lcom/google/firebase/c/d;

    return-object v0
.end method

.method g()Lcom/google/firebase/b;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/c/d;->f()Lcom/google/firebase/b;

    move-result-object v0

    return-object v0
.end method

.method h()Lcom/google/android/gms/internal/nj;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/nj;->a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/nj;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/c/i;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/c/l;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/firebase/c/o;->a()Lcom/google/firebase/c/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/c/o;->a(Lcom/google/firebase/c/i;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/c/c;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/firebase/c/o;->a()Lcom/google/firebase/c/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/c/o;->b(Lcom/google/firebase/c/i;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public k()Lcom/google/android/gms/g/f;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/c/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/c/n;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/c/n;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/c/p;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcom/google/android/gms/g/f;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/c/i;->k()Lcom/google/android/gms/g/f;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/c/i$1;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/c/i$1;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/g/f;->a(Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;

    new-instance v2, Lcom/google/firebase/c/i$2;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/c/i$2;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/g/f;->a(Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public m()Lcom/google/firebase/c/k;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/firebase/c/k;

    invoke-direct {v0, p0}, Lcom/google/firebase/c/k;-><init>(Lcom/google/firebase/c/i;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/k;->r()Z

    return-object v0
.end method

.method public n()Lcom/google/android/gms/g/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/c/m;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/c/m;-><init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/c/p;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method o()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/i;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x5

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "gs://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
