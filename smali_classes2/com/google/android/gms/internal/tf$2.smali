.class Lcom/google/android/gms/internal/tf$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/vt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/tf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/tf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/tf$2;->a:Lcom/google/android/gms/internal/tf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/acy;Ljava/util/Map;)V
    .locals 2
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

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$2;->a:Lcom/google/android/gms/internal/tf;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/tf;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/tf$2;->a:Lcom/google/android/gms/internal/tf;

    invoke-interface {p1}, Lcom/google/android/gms/internal/acy;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/tf;->a(Landroid/view/View;Ljava/util/Map;)V

    goto :goto_0
.end method
