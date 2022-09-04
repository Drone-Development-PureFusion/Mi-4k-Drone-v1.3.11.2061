.class public abstract Lcom/google/android/gms/internal/agm$b;
.super Lcom/google/android/gms/cast/internal/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/cast/internal/b",
        "<TR;>;"
    }
.end annotation


# instance fields
.field protected f:Lcom/google/android/gms/cast/internal/p;

.field final synthetic g:Lcom/google/android/gms/internal/agm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/agm;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$b;->g:Lcom/google/android/gms/internal/agm;

    invoke-static {p1}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/common/api/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/internal/b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm$b;->b()V

    return-void
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agm$b;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method

.method public abstract b()V
.end method

.method public c()Lcom/google/android/gms/cast/internal/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$b;->f:Lcom/google/android/gms/cast/internal/p;

    return-object v0
.end method
