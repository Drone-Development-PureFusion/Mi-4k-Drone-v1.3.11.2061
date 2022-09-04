.class Lcom/google/android/gms/common/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/k$d;,
        Lcom/google/android/gms/common/k$c;,
        Lcom/google/android/gms/common/k$b;,
        Lcom/google/android/gms/common/k$a;
    }
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/common/internal/ah;

.field private static b:Landroid/content/Context;

.field private static c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/internal/ae;",
            ">;"
        }
    .end annotation
.end field

.field private static d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/internal/ae;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static declared-synchronized a()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/internal/ae;",
            ">;"
        }
    .end annotation

    const-class v1, Lcom/google/android/gms/common/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v1

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/common/k;->a:Lcom/google/android/gms/common/internal/ah;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/k;->c()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_2
    sget-object v0, Lcom/google/android/gms/common/k;->a:Lcom/google/android/gms/common/internal/ah;

    invoke-interface {v0}, Lcom/google/android/gms/common/internal/ah;->a()Lcom/google/android/gms/c/e;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "GoogleCertificates"

    const-string v2, "Failed to get google certificates from remote"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/common/k;->a([Landroid/os/IBinder;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;

    const/4 v0, 0x0

    :goto_1
    sget-object v2, Lcom/google/android/gms/common/k$d;->a:[Lcom/google/android/gms/common/k$a;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    sget-object v2, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;

    sget-object v3, Lcom/google/android/gms/common/k$d;->a:[Lcom/google/android/gms/common/k$a;

    aget-object v3, v3, v0

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    :try_start_3
    sget-object v0, Lcom/google/android/gms/common/k;->c:Ljava/util/Set;

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GoogleCertificates"

    const-string v2, "Failed to retrieve google certificates"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static a([Landroid/os/IBinder;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/os/IBinder;",
            ")",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/internal/ae;",
            ">;"
        }
    .end annotation

    array-length v1, p0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v3, p0, v0

    invoke-static {v3}, Lcom/google/android/gms/common/internal/ae$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/ae;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "GoogleCertificates"

    const-string v4, "iCertData is null, skipping"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method static declared-synchronized a(Landroid/content/Context;)V
    .locals 3

    const-class v1, Lcom/google/android/gms/common/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/common/k;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/k;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    :try_start_1
    const-string v0, "GoogleCertificates"

    const-string v2, "GoogleCertificates has been initialized already"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static declared-synchronized b()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/internal/ae;",
            ">;"
        }
    .end annotation

    const-class v1, Lcom/google/android/gms/common/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v1

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/common/k;->a:Lcom/google/android/gms/common/internal/ah;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/k;->c()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_2
    sget-object v0, Lcom/google/android/gms/common/k;->a:Lcom/google/android/gms/common/internal/ah;

    invoke-interface {v0}, Lcom/google/android/gms/common/internal/ah;->b()Lcom/google/android/gms/c/e;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "GoogleCertificates"

    const-string v2, "Failed to get google release certificates from remote"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/common/k;->a([Landroid/os/IBinder;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;

    sget-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;

    sget-object v2, Lcom/google/android/gms/common/k$d;->a:[Lcom/google/android/gms/common/k$a;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    :try_start_3
    sget-object v0, Lcom/google/android/gms/common/k;->d:Ljava/util/Set;

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GoogleCertificates"

    const-string v2, "Failed to retrieve google release certificates"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static c()Z
    .locals 4

    sget-object v0, Lcom/google/android/gms/common/k;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/common/k;->a:Lcom/google/android/gms/common/internal/ah;

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/common/k;->b:Landroid/content/Context;

    sget-object v1, Lcom/google/android/gms/internal/akb;->e:Lcom/google/android/gms/internal/akb$b;

    const-string v2, "com.google.android.gms.googlecertificates"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/akb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;

    move-result-object v0

    const-string v1, "GoogleCertificates"

    const-string v2, "com.google.android.gms.googlecertificates module is loaded"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "com.google.android.gms.common.GoogleCertificatesImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/ah$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/ah;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/common/k;->a:Lcom/google/android/gms/common/internal/ah;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v1, "GoogleCertificates"

    const-string v2, "Failed to load com.google.android.gms.googlecertificates: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/akb$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method
