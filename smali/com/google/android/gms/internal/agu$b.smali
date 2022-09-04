.class abstract Lcom/google/android/gms/internal/agu$b;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/agu$b$b;,
        Lcom/google/android/gms/internal/agu$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahl$a",
        "<",
        "Lcom/google/android/gms/cast/d$c;",
        "Lcom/google/android/gms/internal/agv;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/android/gms/internal/agu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/agu;Lcom/google/android/gms/common/api/g;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/agu$b;->c:Lcom/google/android/gms/internal/agu;

    invoke-static {p1}, Lcom/google/android/gms/internal/agu;->c(Lcom/google/android/gms/internal/agu;)Lcom/google/android/gms/common/api/a;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/d$c;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/agu$c;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/agu$c;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/agv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agu$b;->a(Lcom/google/android/gms/internal/agv;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/agv;)V
    .locals 0

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agu$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/d$c;

    move-result-object v0

    return-object v0
.end method
