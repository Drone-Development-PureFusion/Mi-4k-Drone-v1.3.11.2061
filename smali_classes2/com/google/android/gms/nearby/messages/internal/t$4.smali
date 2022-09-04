.class Lcom/google/android/gms/nearby/messages/internal/t$4;
.super Lcom/google/android/gms/nearby/messages/internal/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/t;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/k;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/nearby/messages/Message;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/k;

.field final synthetic c:Lcom/google/android/gms/nearby/messages/internal/t;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/t$4;->c:Lcom/google/android/gms/nearby/messages/internal/t;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/t$4;->a:Lcom/google/android/gms/nearby/messages/Message;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/t$4;->b:Lcom/google/android/gms/nearby/messages/k;

    invoke-direct {p0, p2}, Lcom/google/android/gms/nearby/messages/internal/t$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/internal/s;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/t$4;->a(Lcom/google/android/gms/nearby/messages/internal/s;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/nearby/messages/internal/s;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/t$4;->a:Lcom/google/android/gms/nearby/messages/Message;

    invoke-static {v0}, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->a(Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/t$4;->b:Lcom/google/android/gms/nearby/messages/k;

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Lcom/google/android/gms/nearby/messages/k;)V

    return-void
.end method
