.class final Lcom/google/android/gms/internal/aic$a;
.super Ljava/lang/ref/PhantomReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/PhantomReference",
        "<",
        "Lcom/google/android/gms/common/api/u",
        "<*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aic;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aic;Lcom/google/android/gms/common/api/u;ILjava/lang/ref/ReferenceQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/u;",
            "I",
            "Ljava/lang/ref/ReferenceQueue",
            "<",
            "Lcom/google/android/gms/common/api/u",
            "<*>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/aic$a;->a:Lcom/google/android/gms/internal/aic;

    invoke-direct {p0, p2, p4}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput p3, p0, Lcom/google/android/gms/internal/aic$a;->b:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aic$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/aic$a;->b:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v3, 0x2

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$a;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$a;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/aic$a;->b:I

    invoke-virtual {v1, v3, v2, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
