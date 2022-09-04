.class Lcom/google/android/gms/internal/ii$1;
.super Lcom/google/android/gms/internal/me;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ii;->b(Lcom/google/android/gms/internal/ic;)Lcom/google/android/gms/internal/ip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ks;

.field final synthetic b:Lcom/google/android/gms/internal/ii;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ii;Lcom/google/android/gms/internal/ks;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ii$1;->b:Lcom/google/android/gms/internal/ii;

    iput-object p2, p0, Lcom/google/android/gms/internal/ii$1;->a:Lcom/google/android/gms/internal/ks;

    invoke-direct {p0}, Lcom/google/android/gms/internal/me;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ii$1;->a:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Lcom/google/android/gms/internal/me;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
