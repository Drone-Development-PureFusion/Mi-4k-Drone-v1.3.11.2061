.class Lcom/google/android/gms/internal/ahv$2;
.super Lcom/google/android/gms/internal/aia$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ahv;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ahv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahv;Lcom/google/android/gms/internal/ahz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahv$2;->a:Lcom/google/android/gms/internal/ahv;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aia$a;-><init>(Lcom/google/android/gms/internal/ahz;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahv$2;->a:Lcom/google/android/gms/internal/ahv;

    invoke-static {v0}, Lcom/google/android/gms/internal/ahv;->a(Lcom/google/android/gms/internal/ahv;)Lcom/google/android/gms/internal/aia;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/aia;->j:Lcom/google/android/gms/internal/aig$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/aig$a;->a(Landroid/os/Bundle;)V

    return-void
.end method
