.class Lcom/google/android/gms/internal/gw$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/hn;Lcom/google/android/gms/internal/hp;Lcom/google/android/gms/internal/hr$a;)Lcom/google/android/gms/internal/hr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hr;

.field final synthetic b:Lcom/google/android/gms/internal/gw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gw;Lcom/google/android/gms/internal/hr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gw$2;->b:Lcom/google/android/gms/internal/gw;

    iput-object p2, p0, Lcom/google/android/gms/internal/gw$2;->a:Lcom/google/android/gms/internal/hr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gw$2;->a:Lcom/google/android/gms/internal/hr;

    const-string v1, "app_in_background"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hr;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gw$2;->a:Lcom/google/android/gms/internal/hr;

    const-string v1, "app_in_background"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hr;->e(Ljava/lang/String;)V

    goto :goto_0
.end method
