.class Lcom/google/android/gms/nearby/messages/internal/s$c$1;
.super Lcom/google/android/gms/nearby/messages/internal/s$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/s$c;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/s$d",
        "<",
        "Lcom/google/android/gms/nearby/messages/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/internal/s$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/s$c;Ljava/util/List;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/s$c$1;->b:Lcom/google/android/gms/nearby/messages/internal/s$c;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/s$c$1;->a:Ljava/util/List;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/s$d;-><init>(Lcom/google/android/gms/nearby/messages/internal/s$1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/nearby/messages/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$c$1;->a:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/google/android/gms/nearby/messages/internal/t;->a(Ljava/lang/Iterable;Lcom/google/android/gms/nearby/messages/e;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s$c$1;->a(Lcom/google/android/gms/nearby/messages/e;)V

    return-void
.end method
