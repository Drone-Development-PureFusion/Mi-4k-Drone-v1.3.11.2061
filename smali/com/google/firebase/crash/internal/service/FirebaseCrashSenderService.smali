.class public final Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;
.super Landroid/app/IntentService;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;


# instance fields
.field private e:Lcom/google/firebase/crash/internal/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->c:Ljava/lang/String;

    const-class v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->d:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".SEND"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->a:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".API_KEY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation build Landroid/support/annotation/Keep;
    .end annotation

    const-class v0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crash/internal/g;->a()Lcom/google/firebase/crash/internal/g;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/crash/internal/g;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/firebase/crash/internal/g;->a()Lcom/google/firebase/crash/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crash/internal/g;->d()Lcom/google/firebase/crash/internal/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    invoke-static {p0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/crash/internal/f;->a(Lcom/google/android/gms/c/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/firebase/crash/internal/g$a; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    sget-object v1, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->c:Ljava/lang/String;

    const-string v2, "Unexpected failure remoting onCreate()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    invoke-interface {v0}, Lcom/google/firebase/crash/internal/f;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->c:Ljava/lang/String;

    const-string v2, "Unexpected failure remoting onDestroy()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->e:Lcom/google/firebase/crash/internal/f;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/crash/internal/f;->b(Lcom/google/android/gms/c/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/firebase/crash/internal/service/FirebaseCrashSenderService;->c:Ljava/lang/String;

    const-string v2, "Unexpected failure remoting onRunTask()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
