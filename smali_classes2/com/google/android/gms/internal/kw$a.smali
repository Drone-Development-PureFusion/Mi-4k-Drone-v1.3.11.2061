.class public abstract Lcom/google/android/gms/internal/kw$a;
.super Lcom/google/android/gms/internal/he$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/kw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/he$b",
        "<",
        "Lcom/google/android/gms/internal/kv;",
        "Lcom/google/android/gms/internal/lh;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/he$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/kv;

    check-cast p2, Lcom/google/android/gms/internal/lh;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/kw$a;->b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/kw$a;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-void
.end method
