.class public abstract Lcom/google/android/gms/internal/oj;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/nx;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/internal/nx;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/pg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/pg;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pg;->a()Lcom/google/android/gms/internal/nx;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ny;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public abstract a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "TT;)V"
        }
    .end annotation
.end method

.method public abstract b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")TT;"
        }
    .end annotation
.end method
