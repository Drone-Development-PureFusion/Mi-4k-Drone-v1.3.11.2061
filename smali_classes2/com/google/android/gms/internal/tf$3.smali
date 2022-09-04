.class Lcom/google/android/gms/internal/tf$3;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/tf$3;->a:Lcom/google/android/gms/internal/tf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/acy;Ljava/util/Map;)V
    .locals 3
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

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$3;->a:Lcom/google/android/gms/internal/tf;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/tf;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const-string v1, "Received request to untrack: "

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$3;->a:Lcom/google/android/gms/internal/tf;

    iget-object v0, v0, Lcom/google/android/gms/internal/tf;->b:Lcom/google/android/gms/internal/th;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/th;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$3;->a:Lcom/google/android/gms/internal/tf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tf;->c()V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method
