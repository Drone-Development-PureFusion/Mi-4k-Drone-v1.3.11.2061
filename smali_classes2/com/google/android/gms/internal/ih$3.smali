.class Lcom/google/android/gms/internal/ih$3;
.super Lcom/google/android/gms/internal/me;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ih;->b(Lcom/google/android/gms/internal/ic;)Lcom/google/android/gms/internal/ip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ks;

.field final synthetic b:Lcom/google/android/gms/internal/ih;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ih;Lcom/google/android/gms/internal/ks;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ih$3;->b:Lcom/google/android/gms/internal/ih;

    iput-object p2, p0, Lcom/google/android/gms/internal/ih$3;->a:Lcom/google/android/gms/internal/ks;

    invoke-direct {p0}, Lcom/google/android/gms/internal/me;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/concurrent/ThreadFactory;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ih;->b:Ljava/util/concurrent/ThreadFactory;

    return-object v0
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ih$3;->a:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Lcom/google/android/gms/internal/me;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected b()Lcom/google/android/gms/internal/iw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ih;->c:Lcom/google/android/gms/internal/iw;

    return-object v0
.end method
