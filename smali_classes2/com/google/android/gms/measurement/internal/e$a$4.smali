.class Lcom/google/android/gms/measurement/internal/e$a$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/measurement/internal/e$a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/e$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/e$a$4;->a:Lcom/google/android/gms/measurement/internal/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e$a$4;->a:Lcom/google/android/gms/measurement/internal/e$a;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/e$a;->a:Lcom/google/android/gms/measurement/internal/e;

    new-instance v2, Landroid/content/ComponentName;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e$a$4;->a:Lcom/google/android/gms/measurement/internal/e$a;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/e$a;->a:Lcom/google/android/gms/measurement/internal/e;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/e;->q()Landroid/content/Context;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e$a$4;->a:Lcom/google/android/gms/measurement/internal/e$a;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/e$a;->a:Lcom/google/android/gms/measurement/internal/e;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/e;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e$a$4;->a:Lcom/google/android/gms/measurement/internal/e$a;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/e$a;->a:Lcom/google/android/gms/measurement/internal/e;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/e;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.google.android.gms.measurement.PackageMeasurementService"

    :goto_0
    invoke-direct {v2, v3, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/measurement/internal/e;->a(Lcom/google/android/gms/measurement/internal/e;Landroid/content/ComponentName;)V

    return-void

    :cond_0
    const-string v0, "com.google.android.gms.measurement.AppMeasurementService"

    goto :goto_0
.end method
