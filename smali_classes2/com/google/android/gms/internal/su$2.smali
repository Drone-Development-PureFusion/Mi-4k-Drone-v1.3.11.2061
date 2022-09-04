.class Lcom/google/android/gms/internal/su$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/su;->a(Lcom/google/android/gms/common/api/n;JLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/n",
        "<TT2;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/n;

.field final synthetic b:Lcom/google/android/gms/internal/su;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/su;Lcom/google/android/gms/common/api/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/su$2;->b:Lcom/google/android/gms/internal/su;

    iput-object p2, p0, Lcom/google/android/gms/internal/su$2;->a:Lcom/google/android/gms/common/api/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/m;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/m;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT2;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/su$2;->a:Lcom/google/android/gms/common/api/n;

    iget-object v1, p0, Lcom/google/android/gms/internal/su$2;->b:Lcom/google/android/gms/internal/su;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/su;->a(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/n;->a(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
