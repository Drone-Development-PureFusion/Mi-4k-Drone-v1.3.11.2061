.class Lcom/google/android/gms/internal/zv$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/vt;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zv;->a(Lcom/google/android/gms/internal/acy;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zv$2;->a:Lcom/google/android/gms/internal/zv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/acy;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/acy;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zv$2;->a:Lcom/google/android/gms/internal/zv;

    invoke-static {v0}, Lcom/google/android/gms/internal/zv;->a(Lcom/google/android/gms/internal/zv;)Lcom/google/android/gms/ads/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/q;->E()V

    return-void
.end method
