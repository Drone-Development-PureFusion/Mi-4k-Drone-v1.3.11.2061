.class public final Lcom/google/android/gms/internal/oz;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/oz$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/google/android/gms/internal/pp;)Lcom/google/android/gms/internal/nx;
    .locals 2

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    const/4 v1, 0x0

    sget-object v0, Lcom/google/android/gms/internal/pn;->P:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/internal/pt; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    if-eqz v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ny;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Ljava/lang/Appendable;)Ljava/io/Writer;
    .locals 2

    instance-of v0, p0, Ljava/io/Writer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/Writer;

    :goto_0
    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/oz$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/oz$a;-><init>(Ljava/lang/Appendable;Lcom/google/android/gms/internal/oz$1;)V

    move-object p0, v0

    goto :goto_0
.end method

.method public static a(Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/ps;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/pn;->P:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1, p0}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    return-void
.end method
