.class Lcom/google/android/gms/internal/im$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hy$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$4;->a:Lcom/google/android/gms/internal/im;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/im$4;->a:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    const-string v1, "Auth token changed, triggering auth token refresh"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im$4;->a:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im;->c(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/hr;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/hr;->c(Ljava/lang/String;)V

    return-void
.end method
