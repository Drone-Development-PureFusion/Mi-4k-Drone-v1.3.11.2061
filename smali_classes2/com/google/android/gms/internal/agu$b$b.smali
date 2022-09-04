.class public final Lcom/google/android/gms/internal/agu$b$b;
.super Lcom/google/android/gms/internal/agu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agu$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/agu$b;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/agu$b;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/agu$b$b;->b:Lcom/google/android/gms/internal/agu$b;

    iget-object v0, p1, Lcom/google/android/gms/internal/agu$b;->c:Lcom/google/android/gms/internal/agu;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/agu$a;-><init>(Lcom/google/android/gms/internal/agu;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/agu;->a()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "onDisconnected"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agu$b$b;->b:Lcom/google/android/gms/internal/agu$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/agu$b;->c:Lcom/google/android/gms/internal/agu;

    invoke-static {v0}, Lcom/google/android/gms/internal/agu;->a(Lcom/google/android/gms/internal/agu;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agu$b$b;->b:Lcom/google/android/gms/internal/agu$b;

    new-instance v1, Lcom/google/android/gms/internal/agu$c;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/agu$c;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agu$b;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(I)V
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/agu;->a()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "onError: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agu$b$b;->b:Lcom/google/android/gms/internal/agu$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/agu$b;->c:Lcom/google/android/gms/internal/agu;

    invoke-static {v0}, Lcom/google/android/gms/internal/agu;->a(Lcom/google/android/gms/internal/agu;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agu$b$b;->b:Lcom/google/android/gms/internal/agu$b;

    new-instance v1, Lcom/google/android/gms/internal/agu$c;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/agu$c;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agu$b;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
