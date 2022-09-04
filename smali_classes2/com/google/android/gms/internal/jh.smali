.class public abstract Lcom/google/android/gms/internal/jh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/jh$a;
    }
.end annotation


# instance fields
.field protected final b:Lcom/google/android/gms/internal/jh$a;

.field protected final c:Lcom/google/android/gms/internal/ji;

.field protected final d:Lcom/google/android/gms/internal/ij;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/jh$a;Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/jh;->b:Lcom/google/android/gms/internal/jh$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/jh;->c:Lcom/google/android/gms/internal/ji;

    iput-object p3, p0, Lcom/google/android/gms/internal/jh;->d:Lcom/google/android/gms/internal/ij;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jh;
.end method

.method public c()Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jh;->d:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/ji;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jh;->c:Lcom/google/android/gms/internal/ji;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/internal/jh$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jh;->b:Lcom/google/android/gms/internal/jh$a;

    return-object v0
.end method
