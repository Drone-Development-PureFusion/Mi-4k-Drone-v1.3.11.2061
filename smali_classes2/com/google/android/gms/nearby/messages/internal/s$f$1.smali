.class Lcom/google/android/gms/nearby/messages/internal/s$f$1;
.super Lcom/google/android/gms/nearby/messages/internal/s$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/s$f;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/s$d",
        "<",
        "Lcom/google/android/gms/nearby/messages/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/nearby/messages/internal/s$f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/s$f;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/s$f$1;->b:Lcom/google/android/gms/nearby/messages/internal/s$f;

    iput-boolean p2, p0, Lcom/google/android/gms/nearby/messages/internal/s$f$1;->a:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/s$d;-><init>(Lcom/google/android/gms/nearby/messages/internal/s$1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/nearby/messages/l;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$f$1;->a:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/nearby/messages/l;->a(Z)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/l;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s$f$1;->a(Lcom/google/android/gms/nearby/messages/l;)V

    return-void
.end method
