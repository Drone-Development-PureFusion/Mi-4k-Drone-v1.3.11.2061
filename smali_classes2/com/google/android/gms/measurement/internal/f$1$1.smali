.class Lcom/google/android/gms/measurement/internal/f$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/measurement/internal/f$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/f$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/f$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/f$1$1;->a:Lcom/google/android/gms/measurement/internal/f$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1$1;->a:Lcom/google/android/gms/measurement/internal/f$1;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/f$1;->d:Lcom/google/android/gms/measurement/internal/f;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/f;->a(Lcom/google/android/gms/measurement/internal/f;)Lcom/google/android/gms/measurement/internal/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/f$1$1;->a:Lcom/google/android/gms/measurement/internal/f$1;

    iget v1, v1, Lcom/google/android/gms/measurement/internal/f$1;->b:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/f$a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1$1;->a:Lcom/google/android/gms/measurement/internal/f$1;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/f$1;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1$1;->a:Lcom/google/android/gms/measurement/internal/f$1;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/f$1;->c:Lcom/google/android/gms/measurement/internal/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Device PackageMeasurementService processed last upload request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1$1;->a:Lcom/google/android/gms/measurement/internal/f$1;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/f$1;->c:Lcom/google/android/gms/measurement/internal/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Local AppMeasurementService processed last upload request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
