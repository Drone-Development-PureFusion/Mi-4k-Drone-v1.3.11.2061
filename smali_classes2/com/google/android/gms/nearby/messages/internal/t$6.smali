.class Lcom/google/android/gms/nearby/messages/internal/t$6;
.super Lcom/google/android/gms/nearby/messages/internal/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/t;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ail;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/e;

.field final synthetic c:Lcom/google/android/gms/nearby/messages/n;

.field final synthetic d:Lcom/google/android/gms/nearby/messages/internal/t;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->d:Lcom/google/android/gms/nearby/messages/internal/t;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->a:Lcom/google/android/gms/internal/ail;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->b:Lcom/google/android/gms/nearby/messages/e;

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->c:Lcom/google/android/gms/nearby/messages/n;

    invoke-direct {p0, p2}, Lcom/google/android/gms/nearby/messages/internal/t$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/internal/s;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/t$6;->a(Lcom/google/android/gms/nearby/messages/internal/s;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/nearby/messages/internal/s;)V
    .locals 6

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->a:Lcom/google/android/gms/internal/ail;

    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->b:Lcom/google/android/gms/nearby/messages/e;

    iget-object v4, p0, Lcom/google/android/gms/nearby/messages/internal/t$6;->c:Lcom/google/android/gms/nearby/messages/n;

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;[B)V

    return-void
.end method
