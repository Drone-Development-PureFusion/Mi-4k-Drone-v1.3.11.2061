.class Lcom/google/android/gms/internal/apx$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/apx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/internal/apx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/apx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/apx$4;->d:Lcom/google/android/gms/internal/apx;

    iput-object p2, p0, Lcom/google/android/gms/internal/apx$4;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/apx$4;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/apx$4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$4;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1c

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Starting to load container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$4;->d:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->a(Lcom/google/android/gms/internal/apx;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const-string v0, "Unexpected state - container loading already initiated."

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->b(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apx$4;->d:Lcom/google/android/gms/internal/apx;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/apx;->a(Lcom/google/android/gms/internal/apx;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$4;->d:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->b(Lcom/google/android/gms/internal/apx;)Lcom/google/android/gms/internal/aqa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/apx$4;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/apx$4;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/apx$4;->c:Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/internal/apx$b;

    iget-object v5, p0, Lcom/google/android/gms/internal/apx$4;->d:Lcom/google/android/gms/internal/apx;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lcom/google/android/gms/internal/apx$b;-><init>(Lcom/google/android/gms/internal/apx;Lcom/google/android/gms/internal/apx$1;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/aqa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ape;)V

    goto :goto_0
.end method
