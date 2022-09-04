.class public Lcom/google/firebase/crash/internal/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/crash/internal/g$a;
    }
.end annotation


# static fields
.field private static b:Lcom/google/firebase/crash/internal/g;


# instance fields
.field private a:Lcom/google/android/gms/internal/akb;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/firebase/crash/internal/g;
    .locals 2

    const-class v1, Lcom/google/firebase/crash/internal/g;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/crash/internal/g;->b:Lcom/google/firebase/crash/internal/g;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/crash/internal/g;->b:Lcom/google/firebase/crash/internal/g;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/firebase/crash/internal/g;

    invoke-direct {v0}, Lcom/google/firebase/crash/internal/g;-><init>()V

    sput-object v0, Lcom/google/firebase/crash/internal/g;->b:Lcom/google/firebase/crash/internal/g;

    sget-object v0, Lcom/google/firebase/crash/internal/g;->b:Lcom/google/firebase/crash/internal/g;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    const-class v1, Lcom/google/firebase/crash/internal/g;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    if-eqz v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/akb;->c:Lcom/google/android/gms/internal/akb$b;

    const-string v2, "com.google.android.gms.crash"

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/akb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;
    :try_end_1
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    new-instance v2, Lcom/google/firebase/crash/internal/g$a;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/firebase/crash/internal/g$a;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/g$1;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method

.method public b()Lcom/google/firebase/crash/internal/d;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    const-string v1, "com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/internal/d$a;->a(Landroid/os/IBinder;)Lcom/google/firebase/crash/internal/d;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/firebase/crash/internal/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/crash/internal/g$a;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/g$1;)V

    throw v1
.end method

.method public c()Lcom/google/firebase/crash/internal/e;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    const-string v1, "com.google.firebase.crash.internal.service.FirebaseCrashReceiverServiceImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/internal/e$a;->a(Landroid/os/IBinder;)Lcom/google/firebase/crash/internal/e;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/firebase/crash/internal/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/crash/internal/g$a;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/g$1;)V

    throw v1
.end method

.method public d()Lcom/google/firebase/crash/internal/f;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/g;->a:Lcom/google/android/gms/internal/akb;

    const-string v1, "com.google.firebase.crash.internal.service.FirebaseCrashSenderServiceImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/internal/f$a;->a(Landroid/os/IBinder;)Lcom/google/firebase/crash/internal/f;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/firebase/crash/internal/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/firebase/crash/internal/g$a;-><init>(Ljava/lang/Throwable;Lcom/google/firebase/crash/internal/g$1;)V

    throw v1
.end method
