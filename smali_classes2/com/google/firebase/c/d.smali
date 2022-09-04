.class public Lcom/google/firebase/c/d;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/firebase/b;",
            "Lcom/google/firebase/c/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/google/firebase/b;

.field private d:J

.field private e:J

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/firebase/c/d;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/firebase/c/d;->a:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/c/d;->b:Ljava/util/Map;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/firebase/b;)V
    .locals 2
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-wide/32 v0, 0x927c0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lcom/google/firebase/c/d;->d:J

    iput-wide v0, p0, Lcom/google/firebase/c/d;->e:J

    const-wide/32 v0, 0x1d4c0

    iput-wide v0, p0, Lcom/google/firebase/c/d;->f:J

    iput-object p1, p0, Lcom/google/firebase/c/d;->c:Lcom/google/firebase/b;

    return-void
.end method

.method public static a()Lcom/google/firebase/c/d;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {}, Lcom/google/firebase/b;->d()Lcom/google/firebase/b;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "You must call FirebaseApp.initialize() first."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    sget-boolean v0, Lcom/google/firebase/c/d;->a:Z

    if-nez v0, :cond_1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lcom/google/firebase/c/d;->a(Lcom/google/firebase/b;)Lcom/google/firebase/c/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/firebase/b;)Lcom/google/firebase/c/d;
    .locals 3
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Null is not a valid value for the FirebaseApp."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    sget-object v1, Lcom/google/firebase/c/d;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/c/d;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/c/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/c/d;

    invoke-direct {v0, p0}, Lcom/google/firebase/c/d;-><init>(Lcom/google/firebase/b;)V

    sget-object v2, Lcom/google/firebase/c/d;->b:Ljava/util/Map;

    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Landroid/net/Uri;)Lcom/google/firebase/c/i;
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "uri must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/c/d;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "The supplied bucketname is not available to this project."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/firebase/c/i;

    invoke-direct {v0, p1, p0}, Lcom/google/firebase/c/i;-><init>(Landroid/net/Uri;Lcom/google/firebase/c/d;)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/d;->c:Lcom/google/firebase/b;

    invoke-virtual {v0}, Lcom/google/firebase/b;->c()Lcom/google/firebase/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/e;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
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

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "location must not be null or empty"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gs://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/d;->c:Lcom/google/firebase/b;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ng;->a(Lcom/google/firebase/b;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The storage Uri could not be parsed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object v1, v0

    const-string v2, "FirebaseStorage"

    const-string v3, "Unable to parse location:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The storage Uri could not be parsed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    :try_start_1
    invoke-direct {p0, v0}, Lcom/google/firebase/c/d;->a(Landroid/net/Uri;)Lcom/google/firebase/c/i;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The storage Uri could not be parsed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/firebase/c/d;->e:J

    return-void
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/d;->e:J

    return-wide v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/c/i;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "location must not be null or empty"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gs://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "location should not be a full URL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/firebase/c/d;->e()Lcom/google/firebase/c/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/i;->a(Ljava/lang/String;)Lcom/google/firebase/c/i;

    move-result-object v0

    return-object v0
.end method

.method public b(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/firebase/c/d;->d:J

    return-void
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/d;->d:J

    return-wide v0
.end method

.method public c(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/firebase/c/d;->f:J

    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/d;->f:J

    return-wide v0
.end method

.method public e()Lcom/google/firebase/c/i;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/c/d;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FirebaseApp was not initialized with a bucket name."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "gs"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/c/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/c/d;->a(Landroid/net/Uri;)Lcom/google/firebase/c/i;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/firebase/b;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/d;->c:Lcom/google/firebase/b;

    return-object v0
.end method
