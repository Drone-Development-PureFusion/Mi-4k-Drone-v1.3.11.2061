.class final Lcom/google/android/gms/cast/framework/media/c$e$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/media/c$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
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
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/c$e;

.field private final b:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c$e;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$e$a;->a:Lcom/google/android/gms/cast/framework/media/c$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/google/android/gms/cast/framework/media/c$e$a;->b:J

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 4
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$e$a;->a:Lcom/google/android/gms/cast/framework/media/c$e;

    iget-object v0, v0, Lcom/google/android/gms/cast/framework/media/c$e;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->e(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/cast/framework/media/c$e$a;->b:J

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/cast/internal/n;->a(JI)V

    :cond_0
    return-void
.end method

.method public synthetic a(Lcom/google/android/gms/common/api/m;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/m;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/media/c$e$a;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
