.class Lcom/google/android/gms/measurement/internal/ab$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/ab;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/ab$1;->b:Lcom/google/android/gms/measurement/internal/ab;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/ab$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab$1;->b:Lcom/google/android/gms/measurement/internal/ab;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/ab;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab$1;->b:Lcom/google/android/gms/measurement/internal/ab;

    const/4 v1, 0x6

    const-string v2, "Persisted config not initialized . Not logging error/warn."

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->b:Lcom/google/android/gms/measurement/internal/af$c;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/ab$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/af$c;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
