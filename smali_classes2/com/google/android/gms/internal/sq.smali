.class public abstract Lcom/google/android/gms/internal/sq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field protected final a:Ljava/lang/String;

.field protected final b:Lcom/google/android/gms/internal/rw;

.field protected final c:Ljava/lang/String;

.field protected final d:Ljava/lang/String;

.field protected final e:Lcom/google/android/gms/internal/df$a;

.field protected f:Ljava/lang/reflect/Method;

.field protected final g:I

.field protected final h:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/sq;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/sq;->b:Lcom/google/android/gms/internal/rw;

    iput-object p2, p0, Lcom/google/android/gms/internal/sq;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/sq;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/sq;->e:Lcom/google/android/gms/internal/df$a;

    iput p5, p0, Lcom/google/android/gms/internal/sq;->g:I

    iput p6, p0, Lcom/google/android/gms/internal/sq;->h:I

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public b()Ljava/lang/Void;
    .locals 8

    const/4 v5, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/sq;->b:Lcom/google/android/gms/internal/rw;

    iget-object v3, p0, Lcom/google/android/gms/internal/sq;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/sq;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/sq;->f:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lcom/google/android/gms/internal/sq;->f:Ljava/lang/reflect/Method;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-object v5

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/sq;->a()V

    iget-object v2, p0, Lcom/google/android/gms/internal/sq;->b:Lcom/google/android/gms/internal/rw;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/rw;->j()Lcom/google/android/gms/internal/np;

    move-result-object v2

    if-eqz v2, :cond_0

    iget v3, p0, Lcom/google/android/gms/internal/sq;->g:I

    const/high16 v4, -0x80000000

    if-eq v3, v4, :cond_0

    iget v3, p0, Lcom/google/android/gms/internal/sq;->h:I

    iget v4, p0, Lcom/google/android/gms/internal/sq;->g:I

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long v0, v6, v0

    const-wide/16 v6, 0x3e8

    div-long/2addr v0, v6

    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/google/android/gms/internal/np;->a(IIJ)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/sq;->b()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
