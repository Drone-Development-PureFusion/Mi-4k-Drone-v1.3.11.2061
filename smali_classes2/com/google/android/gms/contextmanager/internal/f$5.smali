.class Lcom/google/android/gms/contextmanager/internal/f$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/awareness/fence/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/contextmanager/internal/f;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;

.field final synthetic b:Lcom/google/android/gms/common/api/Status;

.field final synthetic c:Lcom/google/android/gms/contextmanager/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/contextmanager/internal/f$5;->c:Lcom/google/android/gms/contextmanager/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/f$5;->a:Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/f$5;->b:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$5;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/awareness/fence/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$5;->a:Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;

    return-object v0
.end method
