.class Lcom/google/android/gms/analytics/internal/l$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/analytics/internal/l$1;->a(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/analytics/internal/l$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/l$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/l$1$1;->a:Lcom/google/android/gms/analytics/internal/l$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/l$1$1;->a:Lcom/google/android/gms/analytics/internal/l$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/internal/l$1;->d:Lcom/google/android/gms/analytics/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/l;->a(Lcom/google/android/gms/analytics/internal/l;)Lcom/google/android/gms/analytics/internal/l$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/l$1$1;->a:Lcom/google/android/gms/analytics/internal/l$1;

    iget v1, v1, Lcom/google/android/gms/analytics/internal/l$1;->a:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/analytics/internal/l$a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/l$1$1;->a:Lcom/google/android/gms/analytics/internal/l$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/internal/l$1;->b:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->e()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/l$1$1;->a:Lcom/google/android/gms/analytics/internal/l$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/internal/l$1;->c:Lcom/google/android/gms/analytics/internal/g;

    const-string v1, "Device AnalyticsService processed last dispatch request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/g;->q(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/l$1$1;->a:Lcom/google/android/gms/analytics/internal/l$1;

    iget-object v0, v0, Lcom/google/android/gms/analytics/internal/l$1;->c:Lcom/google/android/gms/analytics/internal/g;

    const-string v1, "Local AnalyticsService processed last dispatch request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/g;->q(Ljava/lang/String;)V

    goto :goto_0
.end method
