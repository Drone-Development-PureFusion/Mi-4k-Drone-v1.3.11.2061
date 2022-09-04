.class Lcom/google/android/gms/contextmanager/fence/internal/c$2;
.super Lcom/google/android/gms/contextmanager/internal/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/contextmanager/fence/internal/c;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/awareness/fence/FenceQueryRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/awareness/fence/FenceQueryRequest;

.field final synthetic b:Lcom/google/android/gms/contextmanager/fence/internal/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/contextmanager/fence/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/awareness/fence/FenceQueryRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/c$2;->b:Lcom/google/android/gms/contextmanager/fence/internal/c;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/c$2;->a:Lcom/google/android/gms/awareness/fence/FenceQueryRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/contextmanager/internal/c$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/contextmanager/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/contextmanager/fence/internal/c$2;->a(Lcom/google/android/gms/contextmanager/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/contextmanager/internal/d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/c$2;->a:Lcom/google/android/gms/awareness/fence/FenceQueryRequest;

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/contextmanager/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;)V

    return-void
.end method
