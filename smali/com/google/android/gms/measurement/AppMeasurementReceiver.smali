.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super Landroid/support/v4/content/WakefulBroadcastReceiver;

# interfaces
.implements Lcom/google/android/gms/measurement/internal/ag$a;


# instance fields
.field private a:Lcom/google/android/gms/measurement/internal/ag;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/content/WakefulBroadcastReceiver;-><init>()V

    return-void
.end method

.method private a()Lcom/google/android/gms/measurement/internal/ag;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->a:Lcom/google/android/gms/measurement/internal/ag;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/measurement/internal/ag;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/ag;-><init>(Lcom/google/android/gms/measurement/internal/ag$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->a:Lcom/google/android/gms/measurement/internal/ag;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->a:Lcom/google/android/gms/measurement/internal/ag;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    invoke-static {p1, p2}, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->startWakefulService(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->a()Lcom/google/android/gms/measurement/internal/ag;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/ag;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
