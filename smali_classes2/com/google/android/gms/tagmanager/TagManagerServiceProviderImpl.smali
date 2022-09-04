.class public Lcom/google/android/gms/tagmanager/TagManagerServiceProviderImpl;
.super Lcom/google/android/gms/tagmanager/al$a;


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# static fields
.field private static volatile a:Lcom/google/android/gms/internal/apy;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/al$a;-><init>()V

    return-void
.end method


# virtual methods
.method public getService(Lcom/google/android/gms/c/e;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/internal/apf;
    .locals 3

    sget-object v0, Lcom/google/android/gms/tagmanager/TagManagerServiceProviderImpl;->a:Lcom/google/android/gms/internal/apy;

    if-nez v0, :cond_1

    const-class v2, Lcom/google/android/gms/tagmanager/TagManagerServiceProviderImpl;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/google/android/gms/tagmanager/TagManagerServiceProviderImpl;->a:Lcom/google/android/gms/internal/apy;

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/apy;

    invoke-direct {v1, v0, p2, p3}, Lcom/google/android/gms/internal/apy;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V

    sput-object v1, Lcom/google/android/gms/tagmanager/TagManagerServiceProviderImpl;->a:Lcom/google/android/gms/internal/apy;

    move-object v0, v1

    :cond_0
    monitor-exit v2

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
