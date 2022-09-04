.class final Lcom/google/android/gms/internal/ft$l;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ge",
        "<",
        "Ljava/lang/Void;",
        "Lcom/google/android/gms/internal/gj;",
        ">;"
    }
.end annotation


# instance fields
.field private n:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    const-string v0, "email cannot be null or empty"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ft$l;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$l;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$l;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$l;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ga;->d(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ft$l;->c()V

    return-void
.end method
