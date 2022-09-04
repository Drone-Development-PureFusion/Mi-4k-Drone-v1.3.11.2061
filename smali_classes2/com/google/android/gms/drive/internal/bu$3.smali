.class Lcom/google/android/gms/drive/internal/bu$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bu;->b(Lcom/google/android/gms/common/api/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/n",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/bu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/bu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bu$3;->a:Lcom/google/android/gms/drive/internal/bu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DriveContentsImpl"

    const-string v1, "Error discarding contents"

    invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/by;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "DriveContentsImpl"

    const-string v1, "Contents discarded"

    invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/by;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public synthetic a(Lcom/google/android/gms/common/api/m;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bu$3;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
