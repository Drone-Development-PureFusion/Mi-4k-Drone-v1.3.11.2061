.class public Lcom/google/android/gms/internal/sx;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/sx$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L:Ljava/lang/Object;",
        "W::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Looper;

.field private final b:Lcom/google/android/gms/internal/sx$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/sx$a",
            "<T",
            "L;",
            "TW;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<T",
            "L;",
            "TW;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/google/android/gms/internal/sx$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/internal/sx$a",
            "<T",
            "L;",
            "TW;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/sx;->a:Landroid/os/Looper;

    iput-object p2, p0, Lcom/google/android/gms/internal/sx;->b:Lcom/google/android/gms/internal/sx$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/sx;->c:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Landroid/os/IInterface;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            ")TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/sx;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IInterface;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/sx;->b:Lcom/google/android/gms/internal/sx$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/sx;->a:Landroid/os/Looper;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/sx$a;->a(Ljava/lang/Object;Landroid/os/Looper;)Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/sx;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
