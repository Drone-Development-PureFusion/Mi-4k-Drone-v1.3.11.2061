.class public final Lcom/google/android/gms/analytics/AnalyticsReceiver;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field private a:Lcom/google/android/gms/analytics/internal/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a()Lcom/google/android/gms/analytics/internal/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsReceiver;->a:Lcom/google/android/gms/analytics/internal/k;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/internal/k;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/internal/k;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsReceiver;->a:Lcom/google/android/gms/analytics/internal/k;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/AnalyticsReceiver;->a:Lcom/google/android/gms/analytics/internal/k;

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        allOf = {
            "android.permission.INTERNET",
            "android.permission.ACCESS_NETWORK_STATE"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/analytics/AnalyticsReceiver;->a()Lcom/google/android/gms/analytics/internal/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/analytics/internal/k;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
