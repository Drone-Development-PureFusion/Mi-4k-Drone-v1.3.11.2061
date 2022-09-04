.class public abstract Lcom/google/android/gms/internal/ie;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# instance fields
.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Lcom/google/android/gms/internal/if;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ie;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/ie;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ie;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ie;->d:Z

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/ie;
.end method

.method public abstract a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kb;
.end method

.method public abstract a()Lcom/google/android/gms/internal/kg;
.end method

.method public a(Lcom/google/android/gms/internal/if;)V
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/ie;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ie;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/ie;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ie;->c:Lcom/google/android/gms/internal/if;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ie;->c:Lcom/google/android/gms/internal/if;

    return-void
.end method

.method public abstract a(Lcom/google/android/gms/internal/kb;)V
.end method

.method public abstract a(Lcom/google/firebase/database/c;)V
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ie;->d:Z

    return-void
.end method

.method public abstract a(Lcom/google/android/gms/internal/ie;)Z
.end method

.method public abstract a(Lcom/google/android/gms/internal/kc$a;)Z
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ie;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ie;->c:Lcom/google/android/gms/internal/if;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ie;->c:Lcom/google/android/gms/internal/if;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/if;->a(Lcom/google/android/gms/internal/ie;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ie;->c:Lcom/google/android/gms/internal/if;

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ie;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ie;->d:Z

    return v0
.end method
