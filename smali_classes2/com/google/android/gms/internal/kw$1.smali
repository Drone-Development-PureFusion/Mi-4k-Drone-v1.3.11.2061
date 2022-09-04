.class final Lcom/google/android/gms/internal/kw$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/kw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/kv;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;)I
    .locals 1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/kv;->a(Lcom/google/android/gms/internal/kv;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/kv;

    check-cast p2, Lcom/google/android/gms/internal/kv;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/kw$1;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;)I

    move-result v0

    return v0
.end method
