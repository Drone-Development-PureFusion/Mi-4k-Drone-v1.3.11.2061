.class Lcom/google/android/gms/nearby/messages/internal/s$1;
.super Lcom/google/android/gms/nearby/messages/internal/s$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/s$h",
        "<",
        "Lcom/google/android/gms/nearby/messages/l;",
        "Lcom/google/android/gms/nearby/messages/internal/s$f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/nearby/messages/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/s;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/s$1;->a:Lcom/google/android/gms/nearby/messages/internal/s;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/s$h;-><init>(Lcom/google/android/gms/nearby/messages/internal/s$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/ail;)Lcom/google/android/gms/nearby/messages/internal/s$f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;)",
            "Lcom/google/android/gms/nearby/messages/internal/s$f;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/s$f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/nearby/messages/internal/s$f;-><init>(Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/internal/s$1;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/internal/ail;)Lcom/google/android/gms/nearby/messages/internal/s$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s$1;->a(Lcom/google/android/gms/internal/ail;)Lcom/google/android/gms/nearby/messages/internal/s$f;

    move-result-object v0

    return-object v0
.end method
