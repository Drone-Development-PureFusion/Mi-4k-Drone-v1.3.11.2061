.class abstract Lcom/google/android/gms/internal/aeh$b;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aeh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/internal/ahl$a",
        "<TT;",
        "Lcom/google/android/gms/internal/aee;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/appdatasearch/a;->b:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aee;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aeh$b;->a(Lcom/google/android/gms/internal/aee;)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/internal/aeb;)V
.end method

.method protected final a(Lcom/google/android/gms/internal/aee;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aee;->h()Lcom/google/android/gms/internal/aeb;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aeh$b;->a(Lcom/google/android/gms/internal/aeb;)V

    return-void
.end method
