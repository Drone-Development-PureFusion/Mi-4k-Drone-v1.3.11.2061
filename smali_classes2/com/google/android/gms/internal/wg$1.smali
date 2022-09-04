.class Lcom/google/android/gms/internal/wg$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wg;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wg$1;->a:Lcom/google/android/gms/internal/wg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->B()Lcom/google/android/gms/internal/wh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/wg$1;->a:Lcom/google/android/gms/internal/wg;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wh;->b(Lcom/google/android/gms/internal/wg;)V

    return-void
.end method
