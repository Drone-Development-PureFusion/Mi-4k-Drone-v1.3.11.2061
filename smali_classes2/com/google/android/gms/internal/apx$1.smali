.class final Lcom/google/android/gms/internal/apx$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/apx$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/apx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/internal/apx;
    .locals 9

    new-instance v0, Lcom/google/android/gms/internal/apx;

    new-instance v4, Lcom/google/android/gms/internal/aqa;

    invoke-direct {v4, p1}, Lcom/google/android/gms/internal/aqa;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/apz;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/apz;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/apn;->a()Lcom/google/android/gms/internal/apn;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/apx$a;

    invoke-direct {v8, p1}, Lcom/google/android/gms/internal/apx$a;-><init>(Landroid/content/Context;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/apx;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;Lcom/google/android/gms/internal/aqa;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/apn;Lcom/google/android/gms/internal/apx$a;)V

    return-object v0
.end method
