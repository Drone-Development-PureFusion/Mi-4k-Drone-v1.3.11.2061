.class public final Lcom/google/android/gms/measurement/internal/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/measurement/internal/f$a;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/Boolean;

.field private static e:Ljava/lang/Boolean;


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/measurement/internal/f$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/f$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/google/android/gms/measurement/internal/f$a;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/f;->c:Lcom/google/android/gms/measurement/internal/f$a;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->a:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/measurement/internal/f;)Lcom/google/android/gms/measurement/internal/f$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->c:Lcom/google/android/gms/measurement/internal/f$a;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Z)Z
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/measurement/internal/f;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    sget-object v0, Lcom/google/android/gms/measurement/internal/f;->d:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/measurement/internal/f;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    sget-object v0, Lcom/google/android/gms/measurement/internal/f;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const-string v0, "com.google.android.gms.measurement.PackageMeasurementService"

    :goto_1
    invoke-static {p0, v0}, Lcom/google/android/gms/measurement/internal/m;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz p1, :cond_3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/measurement/internal/f;->e:Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    const-string v0, "com.google.android.gms.measurement.AppMeasurementService"

    goto :goto_1

    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/measurement/internal/f;->d:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/measurement/internal/f;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private c()Lcom/google/android/gms/measurement/internal/ab;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Intent;II)I
    .locals 7
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    const/4 v6, 0x2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    if-nez p1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "AppMeasurementService started with null intent"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return v6

    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Device PackageMeasurementService called. startId, action"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    const-string v3, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->h()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/measurement/internal/f$1;

    invoke-direct {v3, p0, v0, p3, v1}, Lcom/google/android/gms/measurement/internal/f$1;-><init>(Lcom/google/android/gms/measurement/internal/f;Lcom/google/android/gms/measurement/internal/aj;ILcom/google/android/gms/measurement/internal/ab;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/ai;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Local AppMeasurementService called. startId, action"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public a(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/f;->c()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "onBind called with null intent"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.START"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/google/android/gms/measurement/internal/ak;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/aj;->a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/ak;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/f;->c()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "onBind received unknown action"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a()V
    .locals 2
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Device PackageMeasurementService is starting up"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Local AppMeasurementService is starting up"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()V
    .locals 2
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Device PackageMeasurementService is shutting down"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Local AppMeasurementService is shutting down"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Landroid/content/Intent;)Z
    .locals 4
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    const/4 v3, 0x1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/f;->c()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "onUnbind called with null intent"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return v3

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/f;->c()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "onUnbind called for intent. action"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public c(Landroid/content/Intent;)V
    .locals 3
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/f;->c()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "onRebind called with null intent"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/f;->c()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "onRebind called. action"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method
