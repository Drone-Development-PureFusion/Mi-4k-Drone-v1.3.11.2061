.class Lcom/google/android/gms/internal/ahy$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ahy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ahy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahy$1;->a:Lcom/google/android/gms/internal/ahy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$1;->a:Lcom/google/android/gms/internal/ahy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ahy;->j()Z

    move-result v0

    return v0
.end method
